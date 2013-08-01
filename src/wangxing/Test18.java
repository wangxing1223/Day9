package wangxing;

/**
 * Created by Administrator on 13-7-31.
 */
//
//两个乒乓球队进行比赛，各出三人。甲队为a,b,c三人，乙队为x,y,z三人。已抽签决定比赛名单。有人向队
// 员打听比赛的名单。a说他不和x比，c说他不和x,z比，请编程序找出三队赛手的名单。

public class Test18 {

    private static char[] chars1 = {'a','b','c'};
    private static char[] chars2 = {'x','y','z'};

    public static void main(String[] args) {

        for (int i = 0; i < chars1.length; i++) {
            for (int j = 0; j < chars2.length; j++) {
                if (((chars1[i]=='a') && (chars2[j]=='x'))||((chars1[i]=='a') && (chars2[j]=='y'))){
                    continue;
                }
                if ((chars1[i]=='c') && (chars2[j]=='x')||(chars1[i]=='c') && (chars2[j]=='z')){
                    continue;
                }
                if (((chars1[i]=='b') && (chars2[j]=='y'))||((chars1[i]=='b') && (chars2[j]=='z')))
                {
                    continue;
                }
                System.out.println(chars1[i] + "  vs  " + chars2[j]);
            }
        }


    }
}
