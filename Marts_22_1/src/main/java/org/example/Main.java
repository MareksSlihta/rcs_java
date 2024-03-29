import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exercise1();
    }

    public static void exercise1(){
        Scanner sc = new Scanner(System.in);
        String input = "";

        while(!input.equals("exit")){
            System.out.println("Hello world!");

            System.out.println("Ievadiet vārdu!");
            input = sc.nextln();
        }
    }
