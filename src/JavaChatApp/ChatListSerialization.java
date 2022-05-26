/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaChatApp;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author optimuspnj
 */
public class ChatListSerialization {
    public void serializeMsg(ArrayList msgList) {
        try {
            FileOutputStream fos = new FileOutputStream("/home/optimuspnj/NetBeansProjects/JavaChatApp/src/SerializedObjects/msgList.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(msgList);
            oos.close();
            fos.close();
        } catch (IOException Ex) {
            System.out.println("IO Exception" + Ex);
        }
    }
}
