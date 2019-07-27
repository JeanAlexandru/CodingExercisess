package FlowControl;

import java.util.Scanner;

public class July27Exercitiul1 {
    public static void main(String[] args) {
        /*Write an application that will show if entered value is greater, equal or lower than 30.*/
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti un numar: ");
        int a = input.nextInt();

        if (a>30){
            System.out.println(a + " is greater than 30");
        }else if(a==30){
            System.out.println(a + " is equal to 30");
        }else{
            System.out.println(a + " is lower than 30");
        }

    }
}
