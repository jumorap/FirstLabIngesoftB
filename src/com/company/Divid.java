package com.company;

public class Divid {

    public Divid() {
    }

    

    public void printDivide(double inputA, double inputB) {
        if(inputB == 0){
            System.out.println("Error Division entre cero");
            return;            
        }
        double result = inputA / inputB;
        System.out.print(result);
    }

}