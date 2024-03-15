package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        task14();
    }

    public static void task14(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadi vārdu!");

        String input = sc.nextLine();
        String result = "programmesana";

        if(input.equals(result)){
            System.out.println("Uzvarēji!");
        }else if(input.length() == result.length()){
            System.out.println("Vienāds simbolu skaits");
        }else{
            System.out.println("Zaudēji!");
        }

        if(input.equals(result) || input.length() == result.length()){
                // && and
                // || or
            System.out.println("Uzvarēji!");
        } else{
            System.out.println("Zaudēji!");}
    }
}