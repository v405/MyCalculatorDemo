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

    public double subtract(double x){
        memory -= x;
        return memory;
    }

    public double multiply(double x){
        memory *= x;
        return memory;
    }


    public double divide(double x) throws ArithmeticException{
        if(x == 0.0) throw new ArithmeticException();
        memory = (memory / x);
        return memory;
    }

    public double square(){
        memory = (memory*memory);
        return memory;
    }

    public double squareRoot(){
        memory = (Math.sqrt(memory));
        return memory;
    }

    public double exponentiation(double x){
        memory = (Math.pow(memory, x));
        return memory;

    }

    public double inverse(){
        memory = (1/memory);
        return memory;
    }

    public double invert(){
        if (memory > 0){
            memory = (0-memory);
        }else if(memory < 0)
            memory = Math.abs(memory);
        return memory;
    }

}
