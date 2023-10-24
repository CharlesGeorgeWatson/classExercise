package com.qa;

public class Submarine {

    public Submarine(){
        this("Unknown Sub",0,0,false,OWNER.United_States);
    }

    public Submarine(String name,int age, OWNER owner){
        this(name, age, 0,false,owner);
    }

    public Submarine(String name,int age, int killCount, boolean isMilitary, OWNER owner){
        this.setName(name);
        this.setAge(age);
        this.killCount=killCount;
        this.isMilitary=isMilitary;
        this.setOwner(owner);
    }


    //    @Override
//    public String toString(){
//        return String.format("Name: %s, Age: %d, Kill-count: %d, Is it a military sub: %b, Owner: %s", this.name, this.age,this.killCount,this.isMilitary,this.owner.toString());
//    }

    private String name;
    private int age = 5, killCount = 100;
    private boolean isMilitary = false;
    private double depth= 0.01;

    private OWNER owner;

    private String[] weaponry={"Machine Fun","Canon","Nuke"};



    public String[] getWeaponry() {
        return weaponry;
    }

    public void setWeaponry(String[] weaponry) {
        this.weaponry = weaponry;
    }

    public void printWeaponry(String[] weaponry){
        for (String item : weaponry){
            System.out.println(item);
        }
    }



    private static String buildingMaterial = "Stainless Steel";

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getAge(){return age;}
    public void setAge(int age){this.age = age;}
    public int getKillCount(String pass)
    {
        if(pass.equals("123submarIne")) {
            return this.killCount;
        }
        else return 0;
    }
    public void setKillCount(String pass)
    {
        if(pass.equals("123submarIne")) {

        }
    }
    public void setOwner(OWNER owner)
    {
        this.owner = owner;
    }

    public OWNER getOwner()
    {
        return this.owner;
    }

    public static String getBuildingMaterial() {return buildingMaterial;}
    public static void setBuildingMaterial(String buildingMaterial) {Submarine.buildingMaterial = buildingMaterial;}


}
