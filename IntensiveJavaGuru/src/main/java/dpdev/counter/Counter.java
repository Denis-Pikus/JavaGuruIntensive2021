package dpdev.counter;

public class Counter {
    private int value;
    private int step;

    public Counter() {
        this.value = 0;
        this.step = 1;
    }

    public void increment() {
        if ((this.value + this.step) > 100) return;
        else this.value += this.step;
    }

    public void decrement() {
        if ((this.value - this.step) < 0) return;
        else this.value -= this.step;
    }

    public void reset() {
        this.value = 0;
        this.step = 1;
    }

    public void setValue(int value) {
        if (value >= 0 && value <= 100)
            this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public void setStep(int step) {
        if (step >= 0 && step <= 10)
            this.step = step;
    }

    public int getStep() {
        return this.step;
    }
}
