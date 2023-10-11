package com.core.learning.armstrong;

public class ArmstrongNumber {
    private boolean isArmStrongnumber(int number){
        boolean flag = false;
        double sum = 0;
        int temp = number;
        while (temp!= 0){
            int reminder = temp % 10;
            sum = sum + Math.pow(reminder,3);
            temp = temp /10;
        }
        if (number == sum) {
            flag = true;
        }
        return flag;
    }
    public static void main(String[] args) {
        ArmstrongNumber obj = new ArmstrongNumber();
        System.out.println(obj.isArmStrongnumber(153));
    }
}
