package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.print("Calculator");

        System.out.print("Seleccione la operación que desea realizar:" +
                "\n 1. Suma" +
                "\n 2. Resta" +
                "\n 3. Multiplicación" +
                "\n 4. División\n");


        Scanner ingress = new Scanner(System.in);

        String selector = ingress.nextLine();

        System.out.print("Ingrese el primer valor: ");
        String myInputA = ingress.nextLine();
        System.out.print("Ingrese el segundo valor: ");
        String myInputB = ingress.nextLine();

        int mySelectorSwitch = Integer.parseInt(selector);
        double inputA = Double.parseDouble(myInputA);
        double inputB = Double.parseDouble(myInputB);

        switch (mySelectorSwitch){
            case 1:
                Suma sum = new Suma();
                sum.printSuma(inputA, inputB);
                break;

            case 2:
                Resta res = new Resta();
                res.printResta(inputA, inputB);
                break;

            case 3:
                Multiplica mult = new Multiplica();
                mult.printMulti(inputA, inputB);
                break;

            case 4:
                Divid div = new Divid();
                div.printDivide(inputA, inputB);
                break;

        }

    }
}
