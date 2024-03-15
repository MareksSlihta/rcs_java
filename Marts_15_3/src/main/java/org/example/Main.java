package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        task24();
    }

    private static void task24() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sveiki, lūdzu, Ievadiet skaitli:");

        int input = sc.nextInt();

        if((input >= 10) || (input <= 5)){
            System.out.println("$$");
        }else {
            System.out.println("$");
        }
    }
}