package javapratice;
public class java2 {
    public static void main(String[] args) {
        
        int sum = 0;
        int totalSum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;            
            totalSum += i;
        }
        System.out.print("더해진 수: " + sum);
        System.out.println(" 전체 합계: " + totalSum);
    }
}
