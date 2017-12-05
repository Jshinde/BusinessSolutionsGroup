package User;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class User implements Serializable
{
    private int userID;
    private String name;
    private String jobTitle;
    private int permissionLvl;
    
    public User()
    {
        userID = 0;
        name = "";
        jobTitle = "";
        permissionLvl = 0;
    }
    
    public User(int newUserID, String newName, String newJob, int newPerm)
    {
        this.userID = newUserID;
        this.name = newName;
        this.jobTitle = newJob;
        this.permissionLvl = newPerm; //so pretty
    }
    
    public void setUserID(int newUserID)
    {
        this.userID = newUserID;
    }
    
    public void setName(String newName)
    {
        this.name = newName;
    }
    
    public void setJob(String newJob)
    {
        this.jobTitle = newJob;
    }
    
    public void setPermissions(int newPerm)
    {
        this.permissionLvl = newPerm; //so pretty.
    }
    
    public int getUserID()
    {
        return this.userID;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String getJob()
    {
        return this.jobTitle;
    }
    
    public int getPermissions()
    {
        return this.permissionLvl;
    }
        
}