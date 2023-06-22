package lesson5;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder("Iphone").setNumberOfModel(8).setColour("Red").Build();
        Phone phone1 = new Phone.Builder("Iphone").setNumberOfModel(8).setColour("Red").Build();

        Phone phone2 = new Phone.Builder("Iphone").setNumberOfModel(9).setColour("White").Build();
        Phone phone3 = new Phone.Builder("Iphone").setNumberOfModel(10).setColour("Blue").Build();

        System.out.println(phone.equals(phone1));
        System.out.println(phone2.equals(phone3));
    }
}
