package dpdev.dog_example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

public class Dog {
    private Logger log = LoggerFactory.getLogger(Dog.class);
    private int age;
    private String color;
    private String name;

    public Dog() {
    }

    public Dog(int age, String color, String name) {
        this.age = age;
        this.color = color;
        this.name = name;
    }

    public void voice(){
        System.out.println(this.getName() + " Голос!");
        System.out.println("Тяф-тяф!");
    }

    public void eat(){
        System.out.println(this.getName() + " Есть!");
        System.out.println("Хрум-хрум!");
    }

    public void sleep(){
        System.out.println(this.getName() + " Спать!");
        System.out.println("Х-п-п-п-х-п-п-п...");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && Objects.equals(color, dog.color) && Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, color, name);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
