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
    
    ChatListSerialization chatListSerialization = new ChatListSerialization();
    ChatListDeserialization chatListDeserialization = new ChatListDeserialization();
    
    ArrayList<Message> decMessageList = chatListDeserialization.deSerializeMsg();
    
    public ArrayList<Message> messageList;
    
    public MessageList() {
        //this.messageList = new ArrayList<>();
        this.messageList = decMessageList;
    }
    
    public void addMessage(Message message) {
        messageList.add(message);
        chatListSerialization.serializeMsg(messageList);
        setChanged();
        notifyObservers(messageList);
    }

    public ArrayList<Message> getMessageList() {
        return messageList;
    }
}