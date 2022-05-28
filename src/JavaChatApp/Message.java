/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaChatApp;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author optimuspnj
 */
//This class is for Message
public class Message implements Serializable {
    //For storing message body
    private final String messageBody; 
    //For storing the user who send the message
    private final String messageUser;
    //For storing message sent time
    private final String messageTime;

    //Constructor for saving info while creating anew message
    public Message(String messageBody, String messageUser) {
        //Saving message body
        this.messageBody = messageBody;
        //Format of the date and time
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");  
        //Getting local date and time
        LocalDateTime now = LocalDateTime.now();  
        //Saving current local date and time
        this.messageTime = dtf.format(now);
        //Saving message user
        this.messageUser = messageUser;
    }
   
    //Getters for variables
    public String getMessageBody() {
        return messageBody;
    }

    public String getMessageTime() {
        return messageTime;
    }
    
    public String getMessageUser() {
        return messageUser;
    }
}
