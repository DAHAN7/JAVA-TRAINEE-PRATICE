package javapratice;

import java.util.Scanner;

public class java8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0; // 합을 저장할 변수
        
        // 5개의 정수 입력 받기
        for (int i = 1; i <= 5; i++) {
            System.out.print("정수를 입력하세요: ");
            int num = scanner.nextInt();
            sum += num; // 입력된 정수를 sum에 더하기
        }
        
        // 평균 구하기 (sum / 5)
        int average = sum / 5;
        
        // 평균 출력
        System.out.println("평균: " + average);
        
        scanner.close();
    }
}
