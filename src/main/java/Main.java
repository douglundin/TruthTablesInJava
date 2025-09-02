package com.example;

public class Main {
    public static void main(String[] args) {

        boolean p = true;
        System.out.println("Truth table for ! (logical not)");
        System.out.println("\t" + "p" + "\t\t" + "!p");
        System.out.println("\t" + p + "\t" + !p);

        boolean p1 = true;
        boolean p2 = true;
        System.out.println("\nTruth table for && (logical and)");
        System.out.println("\t" + "p1" + "\t\t" + "p2" + "\t\t" + "p1 && p2");
        p1 = false; p2 = false;
        System.out.println("\t" + p1 + "\t" + p2 + "\t" + (p1 && p2) );
        p1 = false; p2 = true;
        System.out.println("\t" + p1 + "\t" + p2 + "\t" + (p1 && p2) );
        p1 = true; p2 = false;
        System.out.println("\t" + p1 + "\t" + p2 + "\t" + (p1 && p2) );
        p1 = true; p2 = true;
        System.out.println("\t" + p1 + "\t" + p2 + "\t" + (p1 && p2) );

        System.out.println("\nTruth table for !! (logical or)");
        System.out.println("\t" + "p1" + "\t\t" + "p2" + "\t\t" + "p1 || p2");
        p1 = false; p2 = false;
        System.out.println("\t" + p1 + "\t" + p2 + "\t" + (p1 || p2) );
        p1 = false; p2 = true;
        System.out.println("\t" + p1 + "\t" + p2 + "\t" + (p1 || p2) );
        p1 = true; p2 = false;
        System.out.println("\t" + p1 + "\t" + p2 + "\t" + (p1 || p2) );
        p1 = true; p2 = true;
        System.out.println("\t" + p1 + "\t" + p2 + "\t" + (p1 || p2) );

        System.out.println("\nTruth table for ^ (logical exclusive or)");
        System.out.println("\t" + "p1" + "\t\t" + "p2" + "\t\t" + "p1 ^ p2");
        p1 = false; p2 = false;
        System.out.println("\t" + p1 + "\t" + p2 + "\t" + (p1 ^ p2) );
        p1 = false; p2 = true;
        System.out.println("\t" + p1 + "\t" + p2 + "\t" + (p1 ^ p2) );
        p1 = true; p2 = false;
        System.out.println("\t" + p1 + "\t" + p2 + "\t" + (p1 ^ p2) );
        p1 = true; p2 = true;
        System.out.println("\t" + p1 + "\t" + p2 + "\t" + (p1 ^ p2) );
    }
}