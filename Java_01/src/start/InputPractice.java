package start;

import java.util.Scanner;

public class InputPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 숫자: ");
        int f1 = sc.nextInt();

        System.out.print("두번째 숫자: ");
        int s2 = sc.nextInt();

        System.out.print("연산자(+,-,*,/): ");
        String op = sc.next();

        System.out.println("결과 : "+f1 +" "+ op +" "+ s2);

        sc.close();



    }
}
