package July27Exercises;

import java.util.Scanner;

public class July27ExercitiulDoi {

    public static void main (String[] args){
        /*Enter any value with several digits after the decimal point and assign it to
         variable of type double. Display the given value rounded to two decimal places.*/
        Scanner x = new Scanner(System.in);
        System.out.println("Introdu un numar:");
        double a=x.nextDouble();
        double b=a%0.01;
        a-=b;
        System.out.println(a);

        System.out.printf("%.5f\n", a);
    }
}
