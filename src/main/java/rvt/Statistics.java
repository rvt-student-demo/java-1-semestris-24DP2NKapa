package rvt;

import java.util.*;

public class Statistics {
    private int count;
    private int sum;
    ArrayList<Integer> numbers = new ArrayList<>();

    public String toString() {
        return "Count: " + count + "\n" +
               "Sum: " + sum + "\n" +
               "Average: " + average();
    }

    public Statistics() {
        //int numberCount = 0;
        this.sum = 0;
        this.count = 0;
        
    }
    public void addNumber(int number) {
        this.count++;
        numbers.add(number);
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        for (int i = 0; i < numbers.size(); i++) {
            int num = numbers.get(i);
            this.sum += num;
        }
        return this.sum;
    }

    public double average() {
        double aver = sum * 1.0 / count;
        return aver;
    }
}
    /*public int sumOfEven() {
        int sumEv = 0;
        for (int i = 0; i < numbers.size(); i++) {
            int num = numbers.get(i);
            if (num % 2 == 0) {
                sumEv += num;
            }
        }
        return sumEv;
    }

    public int sumOfOdd() {
        int sumOd = 0;
        for (int i = 0; i < numbers.size(); i++) {
            int num = numbers.get(i);
            if (num % 2 != 0) {
                sumOd += num;
            }
        }
        return sumOd;
    }
}*/
