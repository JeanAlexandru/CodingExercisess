package FlowControl;

import java.util.Scanner;

public class July27Exercitiul5Patrat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introduceti dimensiunea patratului: ");
        int n = input.nextInt();

        int l;
        int c;

        for (l=0;l<=n;l++){
            for (c=0;c<=n;c++){
                if(c==0 || c==n){
                    System.out.print("+");
                }else if (l==0 || l==n){
                    System.out.print("+");
                }else if (l==c){
                    System.out.print("+");
                }else if (l+c==n-1){
                    System.out.print("+");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
