package OOP.OOP_Petrol;

import java.util.Scanner;

public class Benzinarie {

    public static void main(String[] args) {
        double qMaxima=1000;
        double pret = 4;
        double qPetrol=1;

        Scanner in = new Scanner(System.in);

        System.out.println("How much petrol do you have?: ");
        Client q = new Client();
        q.setPetrol(in.nextDouble());
        double init = q.getPetrol();

        in.nextLine();


        System.out.println("Continue pumping petrol?: ");
        String comand = in.nextLine();

        /*in.nextLine();*/


        while (comand.equalsIgnoreCase("continue")){
            q.setPetrol(q.getPetrol()+qPetrol);
            System.out.println("Aveti " + q.getPetrol() + " litri");
            System.out.println("Aveti de plata: " + (q.getPetrol()-init)*pret);
            System.out.println("Continue?: ");
            comand=in.nextLine();
        }

        double sum = (q.getPetrol()-init)*pret;

        System.out.println("---");

        System.out.println("Total cost is: " + sum + " Lions");
        System.out.println("---");

        System.out.println("Please pay " + sum + " Lions");

        double pay=in.nextDouble();
        double rest = pay-sum;


        while(pay<sum) {
            System.out.println("Please pay the rest of " + (sum - pay));
            pay += in.nextDouble();
            continue;
        }

        if (pay>sum){
            rest = pay-sum;
            System.out.println("Please take the rest of " + Math.abs(rest));
        } else{
            System.out.println("Thank you for your payment!");
        }










    }


}
