package dpdev.animal;

public class Mammal extends Animal{
    protected int pawsQuantity;

    public Mammal(String name, int pawsQuantity) {
        super(name);
        this.pawsQuantity = pawsQuantity;
    }

    @Override
    protected void move() {

    }
}
