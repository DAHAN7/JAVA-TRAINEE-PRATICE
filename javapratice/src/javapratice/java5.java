package javapratice;

import java.util.Scanner;

public class java5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 입력 받음
        String employeeName = "홍길동"; // 초기값으로 홍길동 설정
        int hourlyRate = 9000; // 초기값으로 9000 설정
        int workingHours = 60; // 초기값으로 60 설정

        int salaryAmount = hourlyRate * workingHours;
        int deductionTotal = (int) (salaryAmount * 0.03);
        int netPayment = salaryAmount - deductionTotal;

        // 급여명세서 출력
        System.out.println("\n급여명세서");
        System.out.println("사원명: " + employeeName);
        System.out.println("급여금액: " + salaryAmount + "원");
        System.out.println("공제합계: " + deductionTotal + "원");
        System.out.println("실지급액: " + netPayment + "원");

        scanner.close();
    }
}