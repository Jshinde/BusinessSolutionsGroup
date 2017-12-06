/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author Cole Peaden
 */
public class readInUser 
{
    public void deserializeUser()
    {
        User user = null;
        try
        {
            FileInputStream fileIn = new FileInputStream("userdata.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            
            user = (User) in.readObject();
            in.close();
            fileIn.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException c)
        {
            System.out.println("User.java class not found");
            c.printStackTrace();
            return;
        }
    }
}
