package lesson3;

class Main {
    public static void main(String[] args) {
        Object[] obj = new Object[2];
        Cat cat = new Cat("Vasya", 3);
        Dog dog = new Dog("Sharik", 2);
        obj[0] = cat;
        try {
            obj[1] = dog;
            Cat cat1 = (Cat) obj[1];
            System.out.println("dog");
        } catch (ClassCastException e) {
            System.out.println("Incorrect data type\n");
        }
        cat.say();//МЯУ
        dog.say();//ГАВ
    }
}