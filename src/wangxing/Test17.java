package wangxing;

/**
 * Created by Administrator on 13-7-31.
 */

//猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个第二天早上又将剩下的桃子
//吃掉一半，又多吃了一个。以后每天早上都吃了前一天剩下的一半零一个。到第10天早上想再吃时，见只剩下一
//个桃子了。求第一天共摘了多少。

public class Test17 {

    public int peach(int n){
        int sum = 0;
        if (n == 1){
            sum = 1;
        }else {
            sum = (peach(n-1)+1)*2;
        }
        return sum;
    }

    public static void main(String[] args) {
        Test17 test17 = new Test17();
        System.out.println( "猴子第一天共摘了 " + test17.peach(10) +" 个桃子。");
    }
}
