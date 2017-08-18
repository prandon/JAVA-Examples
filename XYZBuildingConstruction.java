package com.training;

public class XYZBuildingConstruction {
    public static void main(String[] args) {
//        Building b1=new Building();
//        System.out.println(b1);

        Room r1[]=new Room[]{new Room(3000,"Rose","5th"),new Room(4000,"ABC","6th"),new Room(5000,"XYZ","7th")};

        Building b2=new Building("WoodLand","Baner",r1);
        System.out.println(b2);
    }
}


