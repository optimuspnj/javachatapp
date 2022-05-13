/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaChatApp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author optimuspnj
 */
public class Message {
    private final String messageBody; 
    private final String messageUser;
    private final String messageTime;

    public Message(String messageBody, String messageUser) {
        this.messageBody = messageBody;
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");  
        LocalDateTime now = LocalDateTime.now();  
        //System.out.println(dtf.format(now)); 
        
        this.messageTime = dtf.format(now);
        this.messageUser = messageUser;
    }
   

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
