package level1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력받기
        while(true){  // 연산 반복
            // 첫 번째 숫자 입력받기
            int number1;
            while(true) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                number1 = scanner.nextInt();

                if (number1 < 0) {
                    System.out.print("0을 포함하지 않는 양수인 ");
                    continue;
                } break;
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

            // / 연산일 경우 number2가 0이면 입력 재요청
            if (operator == '/') {
                while (number2 <= 0) {
                    System.out.print("0이하가 아닌 두 번째 숫자를 입력하세요: ");
                    number2 = scanner.nextInt();
                }
            }

            // 사칙연산 + 출력
            // switch(operator) { case "+": case "-": case "*": case "/": default: }
            switch (operator) {
                case ('+'): // char 타입은 작은 따옴표로 표시해야함
                    System.out.println(number1 + number2);
                    break;
                case ('-'):
                    System.out.println(number1 - number2);
                    break;
                case ('*'):
                    System.out.println(number1 * number2);
                    break;
                case ('/'):
                    System.out.println(number1 / number2);
                    break;
                default:
                    System.out.println("+ , - , * , / 중에 입력하세요");
            }

            // 종료 물어보기
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String input = scanner.next(); //
            if (input.equals("exit"))
                break;
        }
    }
}
