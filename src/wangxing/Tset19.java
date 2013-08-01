package wangxing;

import java.util.Scanner;

/**
 * Created by Administrator on 13-7-31.
 */

//题目：打印出如下图案（菱形）
//        *
//       ***
//      *****
//     *******
//      *****
//       ***
//        *

public class Tset19 {

    public void draw(int n){

        for (int i = 1; i <= (n+1)/2; i++) {
            for (int k = 1; k <= (n+1)/2-i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*(i-1) ; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
        for (int i = 1; i <= (n-1)/2; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*((n-1)/2-i) ; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }

    }

    public static void main(String[] args) {
        Tset19 tset19 = new Tset19();
        Scanner scanner = new Scanner(System.in);
        System.out.println("input n :");
        int n = scanner.nextInt();
        boolean b =true;
        while (b){
            if ((n > 0) && (n%2 != 0 )){
                System.out.println("The shape is :");
                tset19.draw(n);
                b = false;
            }else {
                System.out.println("ERROR! input new number:");
                n = scanner.nextInt();
            }
        }



    }
}
