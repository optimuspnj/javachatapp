/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaChatApp;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Observer;

/**
 *
 * @author optimuspnj
 */
//This interface will act as a intermidiate class for handing over remote objects to the current chat interface (Admin chat/User chat)
public interface MessageListHelper extends Remote{
    //Abstract methods which will be implemented in MessageListHelperImpl
    public void addMessage(Message message) throws RemoteException;
    public ArrayList<Message> getMessageList() throws RemoteException;
    public void addObserver(Observer o) throws RemoteException;
}
