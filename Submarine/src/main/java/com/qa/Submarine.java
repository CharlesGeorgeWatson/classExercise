package com.qa;

public class Submarine extends Naval {
    public Submarine(){
        this("Unknown", 0, 0, OWNER.UNKNOWN, 0);
    }

    public Submarine(String name, int age, int killcount, OWNER owner, int numberOfLifeJackets) {
        super(name, age, killcount, owner, numberOfLifeJackets);
    }

    @Override
    public String toString(){
        return String.format("Name: %s, Age: %d, Kill-count: %d, Is it a military sub: %b, Owner: %s", this.name, this.age,this.killCount,this.isMilitary,this.owner.toString());
    }

    private double depth= 0.01;
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
    public void setKillCount(String pass, int killCount)
    {
        if(pass.equals("123submarIne")) {
            this.killCount = killCount;
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
