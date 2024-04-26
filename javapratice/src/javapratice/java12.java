package javapratice;

import java.util.Scanner;

public class java12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRun = true;
        int money = 0;

        while (isRun) {
            System.out.println("=================");
            System.out.println("1.예금 | 2.출금 | 3.잔액확인 | 4.종료");
            System.out.println("=================");
            System.out.print("번호를 입력해 주세요(1~4): ");
            int selectNo = scanner.nextInt();

            switch (selectNo) {
                case 1:
                    System.out.print("예금액을 입력하세요: ");
                    int deposit = scanner.nextInt();
                    money += deposit;
                    System.out.println(deposit + "원이 예금되었습니다.");
                    break;
                case 2:
                    System.out.print("출금액을 입력하세요: ");
                    int withdraw = scanner.nextInt();
                    if (withdraw <= money) {
                        money -= withdraw;
                        System.out.println(withdraw + "원이 출금되었습니다.");
                    } else {
                        System.out.println("잔액이 부족합니다.");
                    }
                    break;
                case 3:
                    System.out.println("현재 잔액은 " + money + "원입니다.");
                    break;
                case 4:
                    isRun = false;
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                    break;
            }
        }
        System.out.println("프로그램을 종료합니다.");
        scanner.close();
    }
}