import org.example.Scanner;

public class Main {
    public static void main(String[] args) {
        homework1();
    }

    public static void homework1(){
            Scanner sc = new Scanner(System.in);

            System.out.println("Ievadiet simbolu virkni!");
            String input = sc.nextLine();

            int count = input.lenght();
            if(count > 5){
                System.out.println("Programmēt ir forši!");

            }
    }
}