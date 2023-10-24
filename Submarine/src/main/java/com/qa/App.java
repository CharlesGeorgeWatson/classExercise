package com.qa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Submarine subbyMcSubface = new Submarine();
        System.out.println(subbyMcSubface.getAge());
        subbyMcSubface.setAge(40);
        System.out.println(subbyMcSubface.getAge());
        subbyMcSubface.setName("SubbyMcSubFace");
        System.out.println(subbyMcSubface.getName());
        subbyMcSubface.setOwner(OWNER.United_Kingdom);
        System.out.println(subbyMcSubface.getOwner());

        Submarine USSGun = new Submarine("USSGun",2,OWNER.United_States);
        Submarine NorthKorea1= new Submarine ("Kimmy",10,6000,true,OWNER.China);

        System.out.println(subbyMcSubface);
        System.out.println(USSGun);
        System.out.println(NorthKorea1);
    }
}
