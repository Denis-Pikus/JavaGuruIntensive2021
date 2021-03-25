package dpdev.animal;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    protected abstract void move();

    public void eat(){
        System.out.println("ням-ням!!!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
