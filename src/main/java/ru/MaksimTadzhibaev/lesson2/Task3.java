package ru.MaksimTadzhibaev.lesson2;

public class Task3 {
    public static void main(String[] args) {
        int [] nums = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i<nums.length; i++){
            int a = 1;
            if (nums[i] <6) {
                a=nums[i] * 2;
                System.out.println(a);}
                else {
                System.out.println(nums[i]);
            }
        }
    }
}
