package com.training;
public class Room {
    private int area;
    private String roomName;
    private String floor;

    public Room(){
        System.out.println("Default construtor of room is called");
        area=0;
        roomName="";
        floor="";
    }

    public Room(int area,String roomName,String floor){
        System.out.println("Parameterised construtor of room is called");
        this.area=area;
        this.roomName=roomName;
        this.floor=floor;
    }

    public String toString(){
        return "\nRoomName  "+roomName+"AREA "+area+"Room Floor "+floor;
    }
}

