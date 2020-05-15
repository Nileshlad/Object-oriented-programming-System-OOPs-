package com.object;

public class Home {
    //initial variable
    String Address;
    String colore;
    String Area;

    //open door
    public Home(String Address,String colore, String Area){
        this.Address=Address;
        this.Area=Area;
        this.colore=colore;
    }

    public static void main(String[] args) {
        //object
        Home home1 = new Home("pune","red","100m");
        //object call
        System.out.println(home1.Address);

        System.out.println(home1.colore);

        System.out.println(home1.Area);


    }
}
