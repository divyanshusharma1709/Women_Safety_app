package com.example.fgw.ighackuserr;

public class Users {
    String email;
    String UserId;
    String identitynum;

    public Users(String email, String userId, String identitynum) {
        this.email = email;
        UserId = userId;
        identitynum = identitynum;}

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdentitynum() {
        return identitynum;
    }

    public void setIdentitynum(String identitynum) {
        this.identitynum = identitynum;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }


}
