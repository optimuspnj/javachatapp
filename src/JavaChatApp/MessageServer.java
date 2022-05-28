/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaChatApp;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author optimuspnj
 */
//Message server intiation class
public class MessageServer {
    public static void main(String[] args) {
        try {
            //Create remote object
            MessageListHelperImpl messageListHelperImpl = new MessageListHelperImpl();

            //Create a remote registry
            Registry reg = LocateRegistry.createRegistry(3456);

            //Register the remote objects to the registry and advertise
            reg.rebind("messageService", (Remote) messageListHelperImpl);

            System.out.println("Server is connected and running.....");
        } catch (RemoteException ex) {
            System.out.println("Server is not connected....." + ex.getMessage());
        }
    }
}
