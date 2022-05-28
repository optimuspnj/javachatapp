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
//This class is for saving the messages list as an array list thus also a observable
public class MessageList extends Observable{
    
    //Creating ChatHistorySerialization type object for serializing the chat
    ChatHistorySerialization chatHistorySerialization = new ChatHistorySerialization();
    //Creating ChatHistoryDeserialization type object to deserialize the chat history
    ChatHistoryDeserialization chatHistoryDeserialization = new ChatHistoryDeserialization();
    //Getting and saving chat history to decMessageList variable
    ArrayList<Message> decMessageList = chatHistoryDeserialization.deSerializeMsg();
    //An array list for saving message list
    public ArrayList<Message> messageList;
    
    //Class constructor
    public MessageList() {
        //Saving previously deserialized chat history to the current session's chat history
        this.messageList = decMessageList;
    }
    
    //Method for adding a message to the message list
    public void addMessage(Message message) {
        //Adding new message to list
        messageList.add(message);
        //Serialize message list
        chatHistorySerialization.serializeMsg(messageList);
        //Set as changed an notifying observers
        setChanged();
        notifyObservers(messageList);
    }

    //Method for getting full message list
    public ArrayList<Message> getMessageList() {
        return messageList;
    }
}
