package wangxing;

import java.util.Scanner;

/**
 * Created by Administrator on 13-7-31.
 */

//输入三个整数x,y,z，请把这三个数由小到大输出

public class Test15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数 ：");
        int x = scanner.nextInt();
        System.out.println("请输入一个整数 ：");
        int y = scanner.nextInt();
        System.out.println("请输入一个整数 ：");
        int z= scanner.nextInt();
        int temp;
        if (x >= y){
            temp = y;
            y = x;
            x = temp;
        }
        if (z >= y){
            temp = y;
            y = z;
            z = temp;
        }
        if (x >= z){
            temp = z;
            z = x;
            x = temp;
        }
        System.out.println( " 这三个数由小到大的顺序是：" + x + "\t"+ z + "\t" + y);
    }
}
