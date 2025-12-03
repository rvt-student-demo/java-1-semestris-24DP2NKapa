package rvt;

public class Counter {
    private int value;
 
    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        this.value = 0;
    }
    public int value() {
        return this.value;
    }

    public void increase() {
        this.value++;
    }

    public void decrease() {
        this.value--;
    }

    public void increase(int increaseBy) {
        if (increaseBy < 0) {
            //do not change
        } else {
            this.value += increaseBy;
        }
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy < 0) {
            //do not change
        } else {
            this.value -= decreaseBy;    
        }
    }
    
    public static void main(String[] args) {
        Counter count0 = new Counter();
        Counter count1 = new Counter(25);

        System.out.println(count0.value());
        System.out.println(count1.value());
        count0.increase();
        System.out.println(count0.value());
        count0.increase(67);
        System.out.println(count0.value());
        count0.decrease();
        System.out.println(count0.value());
        count0.decrease(255);
        System.out.println(count0.value());
        count0.increase(-647935);
        count0.decrease(-999);
        System.out.println(count0.value());


        count1.increase();
        System.out.println(count1.value());
        count1.increase(420);
        System.out.println(count1.value());
        count1.decrease();
        System.out.println(count1.value());
        count1.decrease(35);
        System.out.println(count1.value());
        count1.increase(-647935);
        count1.decrease(-999);
        System.out.println(count1.value());

    }
}
