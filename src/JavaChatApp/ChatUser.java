/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaChatApp;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author optimuspnj
 */
//This class is for handling the users who are in Chat
public class ChatUser implements Observer {
    //A variable to store the name of the user
    private final String name;

    //Constructor for setting the user's name on object creation
    public ChatUser(String name) {
        this.name = name;
    }

    //Overided Method for Observer which is using for update about changes in the chat
    @Override
    public void update(Observable o, Object arg) {
        
        //Arraylist for storing message list
        ArrayList<Message> messageList = (ArrayList<Message>) arg;
        
        //Get a test output when Observable is changed
        messageList.forEach((msg) -> {
            //System.out.println(msg.getMessageTime() + " " +  msg.getMessageBody());
        });
    }
    
}
