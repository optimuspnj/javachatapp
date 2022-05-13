/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaChatApp;

import java.util.ArrayList;
import java.util.Observable;

/**
 *
 * @author optimuspnj
 */
public class MessageList extends Observable{
    private final ArrayList<Message> messageList;

    private MessageList() {
        this.messageList = new ArrayList<>();
    }
    
    private static final MessageList instance = new MessageList();
    
    public static MessageList getInstance() {
        return instance;
    }
    
    
    public void addMessage(Message message) {
        messageList.add(message);
        setChanged();
        notifyObservers(messageList);
    }

    public ArrayList<Message> getMessageList() {
        return messageList;
    }
}
