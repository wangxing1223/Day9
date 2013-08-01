package wangxing;

/**
 * Created by Administrator on 13-7-31.
 */

//一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
public class Test13 {

    public static void main(String[] args) {

        for (int i = 1; i < 10000; i++) {
            if ((Math.sqrt( (double)(i+100)) %1 == 0)){
                if ((Math.sqrt( (double)(i+168)) %1 == 0)){
                    System.out.println(i + " 加上100后是一个完全平方数，再加上168又是一个完全平方数");
                }
            }
        }
    }
}
