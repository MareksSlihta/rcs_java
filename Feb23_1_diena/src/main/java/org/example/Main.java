package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//System.out.println("Hello world!");
//        System.out.println(3+2);
//        System.out.println("3 + 2");
//        System.out.println("3"+2);
//        System.out.println("3a" + "2x");
//        System.out.println("aaa"+"bbb");
//
//        System.out.println("----------");
//        int a = 6;
//        System.out.println(a);
//        a = 99;
//        System.out.println(a);
//        String c = "Mani sauc Mareks";
//        System.out.println(c);
            

            Scanner sc = new Scanner(System.in);
            System.out.println("Ievadiet SAVU VĀRDU!");
            String name = sc.nextLine();

            System.out.println("Ievadiet gadu kurā piedzimi!");
            int year = sc.nextInt();

            System.out.println("Lietotāju sauc " + name + ".Lietotājam ir " + (2024-year) + "gadi.");
        }
    }