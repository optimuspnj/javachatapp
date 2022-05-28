/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaChatApp;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author optimuspnj
 */
//This class is for decerialize the chat history
public class ChatHistoryDeserialization {
    
    //Deserializing method
    public ArrayList<Message> deSerializeMsg() {
        
        //Let's create an array list to store message list
        ArrayList<Message> decMessageList= new ArrayList<Message>();
        
        //Let's create error handling for IO exception and for class not found exception
        try {
            //Open file for Input stream
            FileInputStream fis = new FileInputStream("/home/optimuspnj/NetBeansProjects/JavaChatApp/src/SerializedObjects/msgList.ser");
            //Get the decerialized object
            ObjectInputStream ois = new ObjectInputStream(fis);
            //Save the deserialized object after casting into the class variable which we have previously created
            decMessageList = (ArrayList) ois.readObject();
            //Close input stream
            ois.close();
            //Close file
            fis.close();
        } catch (IOException Ex) {
            //Runs if IO Exception occurs
            //Basically those will handle Decerilization errors
            System.out.println("IO Exception" + Ex);
        } catch (ClassNotFoundException Ex) {
            //Runs if class not found error occurs
            System.out.println("Class not found" + Ex);
        }
        //Finally, Let's return the decerialized message list
        return decMessageList;
    }
}
