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
public class ChatListDeserialization {
    public ArrayList<Message> deSerializeMsg() {
        
        ArrayList<Message> decMessageList= new ArrayList<Message>();
        
        try {
            FileInputStream fis = new FileInputStream("/home/optimuspnj/NetBeansProjects/JavaChatApp/src/SerializedObjects/msgList.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            decMessageList = (ArrayList) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException Ex) {
            System.out.println("IO Exception" + Ex);
        } catch (ClassNotFoundException Ex) {
            System.out.println("Class not found" + Ex);
        }
        
        return decMessageList;
    }
}
