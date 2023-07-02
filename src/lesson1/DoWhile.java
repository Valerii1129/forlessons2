package lesson1;

public class DoWhile {
    public static void main(String[] args) {
        int counter = 10;
        do {
            System.out.print("Осталось " + counter + " сек.\n");
            if (counter == 1) {
                System.out.print("BOOM");
            }
        } while (--counter > 0);
    }
}
