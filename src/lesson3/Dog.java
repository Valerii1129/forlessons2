package lesson3;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void say() {
        System.out.println("ГАВ");
    }
}
