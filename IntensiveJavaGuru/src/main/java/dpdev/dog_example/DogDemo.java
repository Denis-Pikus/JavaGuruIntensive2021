package dpdev.dog_example;

public class DogDemo {
    public static void main(String[] args) {
        Dog doggi = new Dog();
        doggi.setAge(2);
        doggi.setColor("White");
        doggi.setName("Tuzik");
        doggi.voice();
        doggi.eat();
        doggi.sleep();
    }
}
