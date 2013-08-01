package wangxing;

/**
 * Created by Administrator on 13-7-31.
 */

//有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13…求出这个数列的前20项之和。


public class Test20 {

    public static void main(String[] args) {
        int x = 1,y = 2,z;
        double sum = 0 ;
        for (int i = 0; i < 20; i++) {
            sum += ((double)(y))/x;
            z =x;
            x = y ;
            y = y +z;

        }
        System.out.println(" 这个数列的前20项之和: " + sum);
    }

}
