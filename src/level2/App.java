package level2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 숫자, 사칙연산 기호 입력받기
        while (true) {
            // 첫 번째 숫자 입력받기
            int number1;
            while (true) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                number1 = scanner.nextInt();

                // 0보다 작은 수가 입력될 경우 재입력 요청
                if (number1 < 0) {
                    System.out.print("0이상의 양수인 ");
                    continue;
                }
                break;
            }

            // 두 번째 숫자 입력받기
            int number2;
            while (true) {
                System.out.print("두 번째 숫자를 입력하세요: ");
                number2 = scanner.nextInt();
                // 0보다 작은 수가 입력될 경우 재입력 요청
                if (number2 < 0) {
                    System.out.print("0 이상의 양수인 ");
                    continue;
                }
                break;
            }

            // 사칙연산 기호 입력받기
            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = scanner.next().charAt(0); // scanner.next(): 첫 공백 전까지만 읽음


            // calculator 객체 생성(계산기 객체를 생성하고 입력값을 전달)
            Calculator calculator = new Calculator(number1, number2, operator);

            // 현재 계산된 결과 출력하기
            int result = calculator.calculate(scanner);
            System.out.println("현재 계산 결과: " + result);

            // 전체 결과 조회하기
            System.out.println(calculator.getResultList());

            // 첫 번째 값 삭제하기
            System.out.println("가장 먼저 저장된 결과를 삭제하시겠습니까? (yes/no) ");
            String deleteResult = scanner.next();
            if (deleteResult.equals("yes")) {
                calculator.delete();
                System.out.println("남은 결과 리스트: " + calculator.getResultList());
            }

            // 종료 물어보기
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String input = scanner.next(); //
            if (input.equals("exit"))
                break;

        }
    }
}