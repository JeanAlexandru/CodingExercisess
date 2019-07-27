package FlowControl;

import java.util.Scanner;

public class July27Exercitiul6 {
    public static void main(String[] args) {
        /*Write a simple application that will simulate a shopping. Use only if-else flow control.
        Consider following cases:
            If you would like to buy a bottle of milk – cashier will ask you for a specific amount of money.
        You have to enter that value and verify if it is same as the cashier asked.
            If you would like to buy a bottle of wine – cashier will ask you if you are an adult and for positive
        answer ask for a specific amount of money.*/
        int milkPrice = 5;
        int winePrice = 45;
        int buyersAge;
        int pay;

        Scanner input = new Scanner(System.in);

        System.out.println("What do you want to buy?");
        String c= input.nextLine();



        if (c.equalsIgnoreCase("milk")){
            System.out.println(milkPrice + " lei please!");
            pay=input.nextInt();
            if(pay==milkPrice){
                System.out.println("Thanks!");
            }else{
                System.out.println("Wrong payment!");
            }
        } else if (c.equalsIgnoreCase("wine")){
            System.out.println("How old are you?");
            buyersAge=input.nextInt();
            if (buyersAge >= 18){
                System.out.println(winePrice+ " lei please!");
            } else {
                System.out.println("Nu aveti varsta necesara");
            }

        }




    }
}
