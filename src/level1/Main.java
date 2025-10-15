package level1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력받기
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int number1 = scanner.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int number2 = scanner.nextInt();
        System.out.print("사칙연산 기호를 입력하세요: ");
        String operator = scanner.next();

    }
}

