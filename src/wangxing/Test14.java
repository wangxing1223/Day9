package wangxing;

import java.util.Scanner;

/**
 * Created by Administrator on 13-7-31.
 */

//输入某年某月某日，判断这一天是这一年的第几天？

public class Test14 {

    private static int year = 0;
    private static int month = 0;
    private static int day = 0;


    public boolean isLeapYear(int n){
        boolean b;
        if((n%400 == 0)||((n%4 == 0)&&(n%100 != 0))){
            b = true;
        }else {
            b = false;
        }
        return b;
    }

    public int days(int n ){
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if(i == 2 ){
                if (isLeapYear(year) == true){
                    sum +=29;
                }else {
                    sum =28;
                }
            }else if (( i == 4)||(i == 6)||(i == 9)||(i == 11)){
                sum +=30;
            }else {
                sum +=31;
            }

        }
        return sum;
    }

    public static void main(String[] args) {

        Test14 test14 = new Test14();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请入年份: ");
        year = scanner.nextInt();
        System.out.println("请入月份: ");
        month = scanner.nextInt();
        System.out.println("请入日: ");
        day = scanner.nextInt();
        System.out.println("这一天是这一年的第 "+(test14.days(month) + day) +" 天");



    }

}
