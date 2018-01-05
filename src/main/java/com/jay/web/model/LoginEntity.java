package com.jay.web.model;

/**
 * Created by jkushwaha on 1/5/18.
 */
/*model holds all the login related data..*/
public class LoginEntity {

    private int userId = 0;

    private String userPd = "";

    public int getUserId(){
        return userId;
    }

    public void setUserId(int userId){
        this.userId = userId;
    }

    public String getPassword(){
        return userPd;
    }

    public void setPassword(String pd){
        this.userPd = pd;
    }
}
