import java.util.ArrayList;
import java.util.Scanner;

//买苹果，只有6、8装，输入苹果数，返回袋子数。不符合条件返回-1；
//如：输入20，输出3  (6*2+8*1)
public class BuyApple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int n = scanner.nextInt();
        int n = 2;
        howBuy(n);
    }

    private static int howBuy(int n) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int x = 0;
        int count = 0;
        if (n % 8 == 0){
            count = n / 8;
            System.out.println(count);
            return count;
        }
        if (n % 6 == 0){
            count = n / 6;
            System.out.println(count);
            return count;
        }
        if (1 <= n && n <=100){
            for (int i = 1;i < 13;i++){
                for (int j = 1;j < 17;j++){
                    if (8*i+6*j == n){
                        list1.add(i);
                        list2.add(j);
                        x++;
                    }
                }
            }
            while (x>0) {
                int min = list1.get(0) + list2.get(0);
                for (int m = 0; m < x; m++) {
                    if (list1.get(m) + list2.get(m) < min) {
                        min = list1.get(m) + list2.get(m);
                    }
                }
            System.out.println(min);
            return min;
            }
            System.out.println(-1);
        }
        return count;
    }
}
