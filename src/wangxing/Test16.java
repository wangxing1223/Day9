package wangxing;

/**
 * Created by Administrator on 13-7-31.
 */

//输出9*9口诀

public class Test16 {

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i + "*" + j + "=" + i*j + "\t");
            }
            System.out.println();
        }
    }
}