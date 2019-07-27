package July27Exercises;

import java.util.Scanner;

public class July27ExercitiulSase {

    public static void main (String[] args){
        /*Create three variables, one for each type: float, byte and char.
        Enter values corresponding to those types using Scanner. What values are you able to enter for each type?*/
        float a;
        byte b;
        char c;
        int d;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a float: ");
        a=input.nextFloat();
        System.out.println();
        System.out.println("-----");

        System.out.print("Enter a byte: ");
        b=input.nextByte();
        System.out.println();
        System.out.println("-----");

        System.out.print("Enter a character: ");
        c=input.next().charAt(0);

        System.out.print("Enter an int: ");
        d=input.nextInt();
        System.out.println((char)d);
        System.out.println("-----");

        System.out.println(a + "  |  " + b + "  |  " + c + "  |  " + d);




    }

}
