package FlowControl;

import java.util.Scanner;

public class July27Exercitiul5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti numarul dorit: ");
        int n = input.nextInt();

        int i;
        int j;

        for (i=0;i<=n;i++){
            for (j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
