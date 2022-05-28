/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaChatApp;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author optimuspnj
 */
//This class is for getting remote objects from the Unicast server
public class MessageClient {
    
    //Method for getting remote object
    public MessageListHelper getRemoteObject() {
        
        MessageListHelper messageListHelper = null;
        
        try {
            //Get the registry
            Registry reg = LocateRegistry.getRegistry("localhost", 3456);
            
            //lookup for the remote objects
             messageListHelper = (MessageListHelper) reg.lookup("messageService");
            
            //Invoke methods using remote objects
           
        } catch (RemoteException | NotBoundException ex) {
            Logger.getLogger(MessageClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        return messageListHelper;
    }
}
