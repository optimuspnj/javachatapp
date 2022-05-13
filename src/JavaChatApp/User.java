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
public class User implements Observer {
    
    private final String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        
        ArrayList<Message> messageList = (ArrayList<Message>) arg;
        
        System.out.println("I am " + this.name + ". I'm updated! ");
        
        messageList.forEach((msg) -> {
            System.out.println(msg.getMessageBody() + " " + msg.getMessageTime());
        });
    }
    
}
