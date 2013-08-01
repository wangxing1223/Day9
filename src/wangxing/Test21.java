package wangxing;

/**
 * Created by Administrator on 13-7-31.
 */

//求1+2!+3!+…+20!的和

public class Test21 {

    public long factorial(int n){//阶乘
        long f = 1;
        if (n == 1){
            f  = 1;
        }else {
            f = n * factorial( n-1);
        }
        return f ;
    }

    public long sum(int n){
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + factorial(i + 1);

        }
        return sum;
    }

    public static void main(String[] args) {
        Test21 test21 = new Test21();
        System.out.println("1+2!+3!+…+20! = " + test21.sum(20));
    }
}
