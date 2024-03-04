package org.example;

import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ievadiet SAVU VĀRDU!");
        String name = sc.nextLine();

        System.out.println("Ievadiet gadu kurā piedzimi!");
        int year = sc.nextInt();

        System.out.println("Lietotāju sauc " + name + ".Lietotājam ir " + (2024-year) + "gadi.");
    }
}
