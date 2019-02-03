/**
 * @author atticus
 * @version 1.0
 */
public class Circulate {
    public static void main(String[] args) {
        //for循环
        int a = 0;
        for (int b = 0; b <= 100; b += 2) {
            a = a + b;
        }
        System.out.println("a的数值为:" + a);
        //while循环
        int c = 0;
        int d = 0;
        while (d <= 100) {
            c = c + d;
            d += 3;
            if(c > 1000){
                break;
            }
        }
        System.out.println("c的数值为:" + c);
    }
}
