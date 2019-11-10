//读入字符串，找出字符串中最长的一串数字。

import java.util.ArrayList;
import java.util.Scanner;

public class FindLongStr {

    private static int max;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String A = scanner.nextLine();
        String A = "12345";
        findNums(A);
    }

    private static String findNums(String A) {
        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list = new ArrayList<>();
        char[] array = A.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= '0' && array[i] <= '9') {
                while (array[i] >= '0' && array[i] <= '9') {
                        list1.add(array[i++]);
                }
                if (list1.size() > max) {
                    for (int x = 0; x < list1.size(); x++) {
                        list.add(list1.get(x));
                        max = list.size();
                    }
                }
            }
            list1.clear();
        }

        char[] array1 = new char[list.size()];
        for (int j = 0;j < list.size();j++){
            array1[j] = list.get(j);
        }
        //String str = String.valueOf(array1);
        System.out.println(String.valueOf(array1));
        return String.valueOf(array1);
    }
}
