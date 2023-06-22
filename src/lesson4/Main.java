package lesson4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Privated mas = new Privated(new String[]{"Dima", " Tanya", "Casha"});
        Privated mas2 = new Privated(new char[]{'a', 'b', 'c', 'd'});
        String[] names2 = new String[]{"Tolya", "Vladic", "Kolya"};
        char[] symvol2 = new char[]{'e', 'f', 'g', 'h'};
        System.out.println(mas);
        System.out.println(mas2);
        System.out.println(Arrays.toString(names2));
        System.out.println(Arrays.toString(symvol2));
    }
}
