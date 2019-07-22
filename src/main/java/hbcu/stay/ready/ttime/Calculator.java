package hbcu.stay.ready.ttime;

public class Calculator {
    private double memory;

    public Calculator(){
        memory = 0;
    }

    public Calculator(double memory){
        this.memory = memory;
    }

    public double add(double x){
        memory += x;
        return memory;
    }

    public double add(double x, double y){
        return 0;
    }

    public double subtract(double x){
        memory -= x;
        return memory;
    }
}
