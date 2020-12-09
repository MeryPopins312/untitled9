package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Douther douther=new Douther(33,"Anna","Cook");
        Granddaughter granddaughter=new Granddaughter(12,"Bell","GeekTech",Costum.TRAINERS, "high");
        Granddaughter granddaughter2=new Granddaughter(9,"Inna","GeekTech",Costum.SKIRT, "junior");
        System.out.println(douther.toString());
        System.out.println(granddaughter.toString());
        System.out.println(granddaughter2.toString());
        douther.cook("Soup",4);
        granddaughter.cook("Pancakes",3);
        granddaughter2.cook("chocolate",1);








    }
}
