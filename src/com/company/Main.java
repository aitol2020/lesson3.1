package com.company;

public class Main {

    public static void main(String[] args) {
        double[] number = {-8.6, 60.0, 54.7, 40.3, -12.0, 68.9, -50.0, 10.5, 20.1, -13.4, 42.7, 89.3,
                -18.4, 10.7, -8.8};
        boolean isStart = false;


        double pozitiv = 0;
        double summa = 0;
        int counter = 0;


        for (double i: number) {
            if (!isStart && i< 0){
                isStart = true;
                continue;
            }
            else if(isStart && i>0){
            pozitiv +=i;
            counter++;
            }
            summa = pozitiv / counter;
        }
        System.out.println("__________");
        System.out.println("number");
        for (double i = 0; i < number.length ; i++) {
            if (number[(int)i] <0){
                continue;
            }else System.out.println( number[(int)i]);
        }
        System.out.println("Общий элемент " + number.length + ":"+ " Результат: "+pozitiv + " Разделим на: " + counter);
        System.out.println("Результат: "+ summa);
        System.out.println("__________");


    }
}