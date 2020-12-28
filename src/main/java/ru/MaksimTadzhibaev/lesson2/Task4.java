package ru.MaksimTadzhibaev.lesson2;

public class Task4 {
    public static void main(String[] args) {
        int a = 1;
        int[][] table = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                table[i][j] = a;
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
