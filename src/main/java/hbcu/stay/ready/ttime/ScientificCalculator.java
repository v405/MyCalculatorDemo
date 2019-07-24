package hbcu.stay.ready.ttime;

public class ScientificCalculator extends Calculator {
    private double memory;

    public ScientificCalculator(){
        memory = 0;
    }

    public ScientificCalculator(double memory){
        this.memory = memory;
    }

    public double sine(){
        memory = Math.sin(memory);
        return memory;
    }

    public double cosine(){
        memory = Math.cos(memory);
        return memory;
    }

    public double tan(){
        memory = Math.tan(memory);
        return memory;
    }

    public double inverseSine(){
        memory = Math.asin(memory);
        return memory;
    }

    public double inverseCosine(){
        memory = Math.acos(memory);
        return memory;
    }


    public double inverseTangent(){
        memory = Math.atan(memory);
        return memory;
    }

    public double factorial(){

        int factorial = (int) Math.round(memory);
        for(int i = factorial - 1;i > 0; i--){
            factorial*= i;
        }

        memory = (double)factorial;
        return memory;

    }

    public double addToMemory(double x){

        memory += x;
        return memory;

    }

    public double recallCurrentValue (){
        return memory;
    }

    public double resetMemory(){
        memory = 0;
        return memory;

    }

    public double log(){
        memory = Math.log10(memory);
        return memory;

    }

    public double inverseLog(){
        memory = Math.exp(memory);
        return memory;

    }

    public double naturalLog() {
        memory = Math.log(memory);
        return memory;

    }
}