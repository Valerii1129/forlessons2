package lesson3;

class Main {
    public void test(Animal animal){
        animal.say();
    }
    public static void main(String[] args) {
        Object[] obj = new Object[2];
        Cat cat = new Cat("Vasya", 3);
        Dog dog = new Dog("Sharik", 2);
        Main main = new Main();
        obj[0] = cat;
        try {
            obj[1] = dog;
            Cat cat1 = (Cat) obj[1];
            System.out.println("dog");
        } catch (ClassCastException e) {
            System.out.println("Incorrect data type\n");
        }
        main.test(cat);
        main.test(dog);
    }
}