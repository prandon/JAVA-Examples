package com.training;
public class Building {
    private String buildingName;
    private String address;
    private Room r1[];

    public Building(){
        System.out.println("Default constructor of Building is called");
        buildingName="";
        address="";
        r1=new Room[]{new Room(),new Room(),new Room(),new Room(),new Room()};
    }

    public Building(String buildingName,String address,Room r1[]){
        System.out.println("Parameterised constructor of Building is called");
        this.buildingName=buildingName;
        this.address=address;
        this.r1=r1;
    }

    public String toString(){
        String details="";
        details=details+"\n BuildingName "+buildingName+" Address "+address+" Room Details are ";
        for(int i=0;i<r1.length;i++){
            details=details+r1[i];
        }
       return details;
    }
}
