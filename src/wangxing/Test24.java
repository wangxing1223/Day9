package wangxing;

import java.util.Scanner;

/**
 * Created by Administrator on 13-7-31.
 */

//给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。

public class Test24 {

    public static void main(String[] args) {

        int m = 0;
        int k;

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个不多于5位的正整数 ： ");
        int n = scanner.nextInt();
        for (int i = 4; i >=0; i--) {
            if ((int)(n/Math.pow(10,(double)i)) != 0){
                m = i+1 ;
                System.out.println(n + " 是 " + m+" 位数.");
                break;
            }
        }

        System.out.print("逆序打印各位数字是 :");
        for (int i = 1; i <= m; i++) {
            k = n%(int)(Math.pow(10,(double)i))/(int)(Math.pow(10,(double)(i-1)));
            System.out.print(k + "\t");

        }
    }
}
