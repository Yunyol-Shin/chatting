package com.example.q.chat;

/**
 * Created by q on 2017-01-03.
 */

public class ChatData {
    private String userName="";
    private String message="";
    private String time="";
    public ChatData() { }

    public ChatData(String userName, String message, String time) {
        this.userName = userName;
        this.message = message;
        this.time=time;
    }

    public String getUserName() {
        return userName;
    }

    public String getTime(){
        return time;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}