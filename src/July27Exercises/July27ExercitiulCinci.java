package July27Exercises;

public class July27ExercitiulCinci {
    public static void main (String[] args){
        /*Sum two integer variables initialized with maximal values for that type*/
        int b=Integer.MAX_VALUE;
        int a=Integer.MAX_VALUE;
        int c=Integer.MIN_VALUE;

        System.out.println("numarul a este " + a);
        System.out.println("numarul b este " + b);
        System.out.println("numarul c este " + c);

        System.out.println("suma este " + (a+b));

        System.out.println("Suma este: ");
        System.out.println((long)a + (long)b);


        System.out.println();
        System.out.println("---------");
        Integer t=3;
        //autoboxing - am declarat o var de tip int si am dat valoarea 3
        Integer u=new Integer(3);
        //echivalenta - am folosit constructorul

        String str ="123";
        System.out.println(t+u);

        int suma;
        suma = t+u+Integer.parseInt(str);
        System.out.println(Integer.parseInt(str));
        System.out.println(suma);

        char d;
        d=str.charAt(0);
        System.out.println();
        System.out.println("-----");
        System.out.println(d);
        System.out.println((int)d);


    }
}
