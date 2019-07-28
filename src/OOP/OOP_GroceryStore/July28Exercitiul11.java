package OOP.OOP_GroceryStore;

import java.util.Scanner;

public class July28Exercitiul11 {
    /*Grocery Shopping
    - Create class Product, it should contain at least two fields – name and price.
    - Create an empty array of Products – it’s size should be at least 5.
    - Fill it within while loop. Simulate the process of doing shopping:
        - ask for a product,
        - add it to the cart (array),
        - change index,
        - if index will be greater than 5 – finish shopping,
        - pay for the products. Station*/

    public static void main(String[] args) {
        Product [] produseMagazin = new Product[10];
        Product [] cosCumparaturi = new Product[5];

        Scanner in = new Scanner(System.in);
        System.out.println("Enter how many products you want in store: ");
        int nP=in.nextInt();
        int nPC=0;

        for (int i=0; i<nP;i++){
            Product p = new Product();
            System.out.println("Enter name of product: ");

            in.nextLine();
            p.setName(in.nextLine());
            System.out.println("Enter price of product: ");
            p.setPrice(in.nextDouble());

            produseMagazin[i]=p;
        }

        for (int j=0; j<nP; j++){
            System.out.println((j+1) + ". Product: " + produseMagazin[j].getName() + " | costs: " + produseMagazin[j].getPrice() + " Lions");
        }


        while (nPC<3){
            System.out.println("Enter the index of your product: ");
            int Prd = in.nextInt();
            cosCumparaturi[nPC]=produseMagazin[Prd-1];
            nPC++;
        }
        System.out.println("You have the following " + nPC + " products: ");

        for (int z=0; z<nPC; z++){
            System.out.println(z+1 + ". Product: " + cosCumparaturi[z].getName() + " | costs: " + cosCumparaturi[z].getPrice() + " Lions");
        }

        double sum =0;

        for (int i=0; i<nPC;i++){
            sum= sum + cosCumparaturi[i].getPrice();

        }

        System.out.println("---");

        System.out.println("Total cost is: " + sum + " Lions");
        System.out.println("---");

        System.out.println("Please pay " + sum + " Lions");

        double pay=in.nextDouble();

        while (pay!=sum){
            System.out.println("Please retry payment!");
            pay=in.nextDouble();
        }
        System.out.println("Thank you for your payment!");



    }
}
