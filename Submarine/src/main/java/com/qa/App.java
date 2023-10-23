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
    }
}
