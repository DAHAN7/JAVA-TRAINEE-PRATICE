package javapratice;

import java.util.Scanner;

public class java7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 첫 번째 정수 입력 받기
        System.out.print("첫 번째 정수를 입력하세요: ");
        int num1 = scanner.nextInt();
        
        // 두 번째 정수 입력 받기
        System.out.print("두 번째 정수를 입력하세요: ");
        int num2 = scanner.nextInt();
        
        // 두 정수 중에서 큰 값을 출력
        if (num1 > num2) {
            System.out.println("큰 값: " + num1);
        } else if (num1 < num2) {
            System.out.println("큰 값: " + num2);
        } else {
            System.out.println("두 값은 같습니다.");
        }
        
        scanner.close();
    }
}

