/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaChatApp;

import hibernateconnection.Connector;
import hibernatepojos.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author optimuspnj
 */
public class HibernateCheckDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        char[] JavaCharArray = {'a', 'b', 'c', 'd', 'e'}; 
        
        User user = new User();
        user.setUserUsername("yaka");
        user.setUserNickname("Yaka Bro");
        user.setUserPassword("hhh");
        user.setUserEmail("yaka@gmail.com");
        user.setUserProfilepic("yakapath");
        user.setUserType("user");
        
        addUser(user);
    }

    private static void addUser(User user) {
        Session mySession = Connector.getSessionFactory().openSession();
        Transaction myTransaction = mySession.beginTransaction();
        
        mySession.save(user);
        myTransaction.commit();
        System.out.println("Inserted");
        mySession.close();
    }
    
    
    
}
