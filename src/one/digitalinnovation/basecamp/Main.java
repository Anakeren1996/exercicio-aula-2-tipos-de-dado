package one.digitalinnovation.basecamp;

/**
 * Exerício aula 2
 */
public class Main {

    public static void main(String[] args) {

        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        // ultrapassa o limite máximo do short
        //short s2 = 40000;

        // fere o limite inferior
        //int i1 = -10000000000;
        int i2 = 28500;

        long l1 = 1000000000000000000L;
        long l2 = 2004005000500055000L;

        //float f1 = 4.5;
        float f2 = 10.68F;

        double d1 = 85.69;
        double d2 = 99.04D;

        char c1 = 'W';
        //  passa o limite de caracter
        //char c2 = 'Tw';
        char c3 = '\u0057';

        String st1 = "Fulano";
        String st2 = "Cicrano";
        String st3 = "ag dgb se  se et t KNBJBJBB &*¨&%& 75894389";

        // existe um tipo de dado específico para data
        //String dt1 = "09/02/1981";

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(b1);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(bo1);
        System.out.println(bo2);

    }
}