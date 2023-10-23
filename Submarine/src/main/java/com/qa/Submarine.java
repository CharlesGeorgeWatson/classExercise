package com.qa;

public class Submarine {

    private String name;

    private int age = 5, killCount = 100;
    private boolean isMilitary = false;
    private double depth = 0.01;
    private OWNER owner;

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

}
