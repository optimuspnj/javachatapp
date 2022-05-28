/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaChatApp;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Observer;

/**
 *
 * @author optimuspnj
 */
//Implementation calss for MessageListHelper
public class MessageListHelperImpl extends UnicastRemoteObject implements MessageListHelper{
    
    //For store the message list
    MessageList messageList = new MessageList();

    //Contructor for helping UnicastRemoteObject
    public MessageListHelperImpl() throws RemoteException {
        super();
    }
    
    //Helper methods to MessageList class which are with remoteexception handling
    @Override
    public void addMessage(Message message) throws RemoteException {
        messageList.addMessage(message);
    }

    @Override
    public ArrayList<Message> getMessageList() throws RemoteException {
        return messageList.getMessageList();
    }

    @Override
    public synchronized void addObserver(Observer o) throws RemoteException {
        messageList.addObserver(o);
    }
    
    
}
