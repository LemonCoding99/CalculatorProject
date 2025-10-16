package practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("계산기를 시작합니다. exit 입력 시 종료됩니다.");

        while (true) { // 반복 시작
            int number1 = -1;
            int number2 = -1;
            char operator = ' ';

            // 첫 번째 숫자 입력
            while (true) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                String input = scanner.next();
                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("계산기를 종료합니다.");
                    return;
                }
                try {
                    number1 = Integer.parseInt(input);
                    if (number1 < 0) {
                        System.out.println("0 포함 양의 정수만 입력 가능합니다.");
                        continue;
                    }
                    break; // 올바른 값 입력 시 탈출
                } catch (NumberFormatException e) {
                    System.out.println("숫자만 입력 가능합니다.");
                }
            }

            // 두 번째 숫자 입력
            while (true) {
                System.out.print("두 번째 숫자를 입력하세요: ");
                String input = scanner.next();
                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("계산기를 종료합니다.");
                    return;
                }
                try {
                    number2 = Integer.parseInt(input);
                    if (number2 < 0) {
                        System.out.println("0 포함 양의 정수만 입력 가능합니다.");
                        continue;
                    }
                    break; // 올바른 값 입력 시 탈출
                } catch (NumberFormatException e) {
                    System.out.println("숫자만 입력 가능합니다.");
                }
            }

            // 사칙연산 기호 입력
            while (true) {
                System.out.print("사칙연산 기호를 입력하세요 (+, -, *, /): ");
                String input = scanner.next();
                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("계산기를 종료합니다.");
                    return;
                }
                if (input.length() == 1 && "+-*/".contains(input)) {
                    operator = input.charAt(0);
                    break; // 올바른 기호 입력
                } else {
                    System.out.println("+, -, *, / 중에 입력하세요.");
                }
            }

            // 연산 처리
            int result = 0;
            boolean validOperation = true;

            switch (operator) {
                case '+':
                    result = number1 + number2;
                    break;
                case '-':
                    result = number1 - number2;
                    break;
                case '*':
                    result = number1 * number2;
                    break;
                case '/':
                    if (number2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                        validOperation = false;
                    } else {
                        result = number1 / number2;
                    }
                    break;
                default:
                    validOperation = false; // 사실 이미 입력 단계에서 걸러짐
            }

            // 결과 출력
            if (validOperation) {
                System.out.println("결과: " + result);
            }

            System.out.println("계속 계산하시려면 Enter, 종료하려면 exit 입력");
            String cont = scanner.next();
            if (cont.equalsIgnoreCase("exit")) {
                System.out.println("계산기를 종료합니다.");
                break;
            }
        }

        scanner.close();



    }
}


