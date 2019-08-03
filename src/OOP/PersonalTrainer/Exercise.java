package OOP.PersonalTrainer;

import java.util.Scanner;

public class Exercise {
        /*Create class Trainee, it should contain fields like: name, stamina, strength.
    You’ll simulate both sides – Trainer and Trainee. Within a while loop you will be asked for an exercise to be done.
    Every exercise should add/reduce stamina/strength.
    Take into account that stamina should not be reduced below 0.
    *Consider adding some supplements that will recover the stamina.
    Supplement  should be additional class.*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Trainee jean = new Trainee();
        Trainer doom = new Trainer();
        Suplements vitB = new Suplements();

        System.out.println("What's your name? ");
        jean.setName(in.nextLine());

        System.out.println("What's your weight " + jean.getName()+ "? ");
        jean.setStrength(in.nextDouble());

        System.out.println("PT: How are you feeling today "+ jean.getName()+ "? " );
        in.nextLine();
        String weight = in.nextLine();

        if (weight.equalsIgnoreCase("Superb")){
            jean.setStamina(100);
        }else if (weight.equalsIgnoreCase("Good")){
            jean.setStamina(80);
        }else if (weight.equalsIgnoreCase("Ok")){
            jean.setStamina(60);
        }else{
            jean.setStamina(40);
        }

        if (jean.getStamina()>=80){
            doom.setMultiplier(0.05);
            vitB.setMultiplier(jean.getStrength()/vitB.getVitamin());
            System.out.println("Good, let's start with some easy exercises and then hard ones.");
            jean.setStamina(jean.getStamina()/(jean.getStrength()*doom.getFatigue()*doom.getMultiplier()));
            System.out.println("Your stamina is now at: " + jean.getStamina()+ ".");
            jean.setStamina(jean.getStamina()+vitB.getMultiplier());
            System.out.println("After snack, your stamina is now at: " + jean.getStamina()+ ".");
        }else if (jean.getStamina()>=50){
            doom.setMultiplier(0.025);
            vitB.setMultiplier(jean.getStrength()/vitB.getVitamin());
            System.out.println("Good, let's start with some easy exercises and then medium ones.");
            jean.setStamina(jean.getStamina()/(jean.getStrength()*doom.getFatigue()*doom.getMultiplier()));
            System.out.println("Your stamina is now at: " + jean.getStamina()+ ".");
            jean.setStamina(jean.getStamina()+vitB.getMultiplier());
            System.out.println("After snack, your stamina is now at: " + jean.getStamina()+ ".");
        }else if (jean.getStamina()<=50){
            doom.setMultiplier(0.01);
            vitB.setMultiplier(jean.getStrength()/vitB.getVitamin());
            System.out.println("Good, let's start with some easy exercises and then take a snack.");
            jean.setStamina(jean.getStamina()/(jean.getStrength()*doom.getFatigue()*doom.getMultiplier()));
            System.out.println("Your stamina is low, now at: " + jean.getStamina()+ ". Let's take a snack");
            jean.setStamina(jean.getStamina()+vitB.getMultiplier());
            System.out.println("After snack, your stamina is now at: " + jean.getStamina()+ ".");
        }else{
            System.out.println("Your stamina is now at: " + jean.getStamina()+ ".");
        }

    }
}
