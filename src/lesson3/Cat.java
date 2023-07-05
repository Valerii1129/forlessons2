package lesson3;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void say() {
        System.out.println("МЯУ");
    }
}
