package July27Exercises;

import java.util.Scanner;

import static java.lang.Math.ceil;
import static java.lang.Math.floor;

public class July27ExercitiulPatru {
    /*Enter two values of type int. Display their division casted
    to the double type and rounded to the third decimal point.*/
    public static void main (String[] args){
        Scanner input= new Scanner(System.in);
        int a=15;
        int b=7;
        double c=(double)a/b;

        System.out.printf("%.4f",c);
        System.out.println();
        System.out.printf("%.4f",floor (c));
        System.out.println();
        System.out.printf("%.4f",ceil (c));



    }
}
