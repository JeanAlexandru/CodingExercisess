package FlowControl;

import java.util.Scanner;

public class July27Exercitiul2 {
    /*As above but compare two values at the same time.
    Verify if first value is greater than 30 and second value is greater than 30, and so on.*/
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti un numar: ");
        int a = input.nextInt();
        System.out.println("---");
        System.out.println("Introduceti un numar: ");
        int b = input.nextInt();

        if (a>30 && b>30){
            System.out.println("numerele sunt mai mari decat 30");
        }else if (a<30 && b<30){
            System.out.println("numerele sunt mai mici decat 30");
        }else if (a==30 && b==30){
            System.out.println("numerele sunt egale 30");
        }else if (a>30 && b<30){
            System.out.println("a este mai mare decat 30 si b este mai mic decat 30");
        }else if (a<30 && b>30){
            System.out.println("a este mai mic decat 30 si b este mai mare decat 30");
        }else if (a>30 && b==30){
            System.out.println("a este mai mare decat 30 si b este egal cu 30");
        }else if (a==30 && b>30){
            System.out.println("a este egal cu 30 si b este mai mare decat 30");
        }else if (a<30 && b==30){
            System.out.println("a este mai mic decat 30 si b este egal cu 30");
        }else if (a==30 && b<30){
            System.out.println("a este egal cu 30 si b este mai mic decat 30");
        }

        boolean ab;
        ab=a<30 && b>30;

        if(ab){
            System.out.println("a<30 si b>30");
        }
    }
}
