package javapratice;

import java.util.Scanner;

public class java1 {
    public static void main(String[] args) {
        String str = "HELLO JAVA";
        System.out.println(str);
        double radius;
        double area;
        Scanner scanner = new Scanner(System.in);
        System.out.print("반지름을 입력하세요: ");
        radius = scanner.nextDouble();
        area = radius * radius * Math.PI;
        System.out.printf("원의 면적:%.1f ", area);
       
        scanner.close();
    }
}
 