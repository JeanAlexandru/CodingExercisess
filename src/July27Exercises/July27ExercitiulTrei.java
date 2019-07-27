package July27Exercises;

public class July27ExercitiulTrei {

    public static void main (String[] args){
        /*Display any three strings of characters on one line so that they are aligned
        to the right edge of the 15-character blocks. How to align strings to the left edge?*/
        //"%."

        String str="Ana";
        String str1="are";
        String str2="mere";
        System.out.printf("%15s",str+" "+str1+" "+str2);
        System.out.println();
        System.out.printf("%15s %15s %15s",str, str1, str2);

    }
}
