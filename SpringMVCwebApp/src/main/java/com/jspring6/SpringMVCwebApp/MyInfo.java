package com.jspring6.SpringMVCwebApp;

public class MyInfo
{
    public String myName;
    public int myID;

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public int getMyID() {
        return myID;
    }

    public void setMyID(int myID) {
        this.myID = myID;
    }

    @Override
    public String toString() {
        return "MyInfo{" +
                "myName='" + myName + '\'' +
                ", myID=" + myID +
                '}';
    }
}
