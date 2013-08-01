package wangxing;

/**
 * Created by Administrator on 13-7-31.
 */

//利用递归方法求5!

public class Test22 {

    public int factorial(int n){
        int m = 1;
        if (n == 1){
            m = 1;
        }else {
            m = n * factorial(n-1);
        }
        return m;
    }

    public static void main(String[] args) {
        Test22 test22 = new Test22();
        System.out.println( "5! = " + test22.factorial(5));
    }
}
