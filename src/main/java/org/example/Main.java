package org.example;

public class Main {
    public static void main(String[] args) {
        //Задача № 1, Пример использования этого класса:
        Calculator calc = new Calculator();
        System.out.println(
                calc.newFormula()
                        .addOperand(5)
                        .addOperand(15)
                        .calculate(Calculator.Operation.MULT)
                        .result()
        );

        Ints intsCalc = new IntsCalculator();
        // демонстраций
        System.out.println(intsCalc.sum(2, 2)); //сложение
        System.out.println(intsCalc.mult(10, 22)); // умножение
        System.out.println(intsCalc.pow(2, 10)); // возведение в степень


    }
}