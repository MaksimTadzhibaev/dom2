package ru.MaksimTadzhibaev.lesson2;

public class Task2 {
    public static void main(String[] args) {
        int num [] = new int [8];
        int a = 0;
        for (int i=0; i<num.length; i++){
        num [i] = a;
        a = a+3;
        System.out.println(num[i]);
        }
    }
}
