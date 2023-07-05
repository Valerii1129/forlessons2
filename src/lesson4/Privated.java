package lesson4;

import java.util.Arrays;

public class Privated {
    private String[] names;
    private char[] symvol;

    public Privated(String[] names) {
        this.names = names;
    }

    public Privated(char[] symvol) {
        this.symvol = symvol;
    }

    @Override
    public String toString() {
        return "Privated{" +
                "names=" + Arrays.toString(names) +
                ", symvol=" + Arrays.toString(symvol) +
                '}';
    }
}
