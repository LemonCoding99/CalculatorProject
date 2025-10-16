package level2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력받기
        while (true) {  // 연산 반복
            // 첫 번째 숫자 입력받기
            int number1;
            while (true) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                number1 = scanner.nextInt();

                if (number1 < 0) {
                    System.out.print("0을 포함하지 않는 양수인 ");
                    continue;
                }
                break;
            }

            // 두 번째 숫자 입력받기
            int number2;
            while (true) {
                System.out.print("두 번째 숫자를 입력하세요: ");
                number2 = scanner.nextInt();

                if (number2 < 0) {
                    System.out.print("0을 포함하지 않는 양수인 ");
                    continue;
                }
                break;
            }

            // 사칙연산 기호 입력받기
            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = scanner.next().charAt(0); // scanner.next(): 첫 공백 전까지만 읽음

            // 사칙연산



        }
    }
}