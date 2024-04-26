package javapratice;

import java.util.Scanner;

public class java10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("정수 값을 입력하세요: ");
            int score = scanner.nextInt();

            if (score >= 90 && score <= 100) {
                System.out.println("A학점");
            } else if (score >= 80 && score <= 89) {
                System.out.println("B학점");
            } else if (score >= 70 && score <= 79) {
                System.out.println("C학점");
            } else if (score >= 60 && score <= 69) {
                System.out.println("D학점");
            } else if (score < 60) {
                System.out.println("F학점");
            } else {
                System.out.println("올바른 점수를 입력하세요.");
            }

            System.out.println();
        }
    }
}
