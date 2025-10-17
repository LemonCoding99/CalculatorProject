package level2;

import java.util.Scanner;
import java.util.ArrayList;

public class Calculator {

    // 속성
    int number1;
    int number2;
    char operator;

    // 결과 저장하기
    private ArrayList<Integer> results = new ArrayList<>();

    // 생성자
    Calculator(int number1, int number2, char operator) {
        this.number1 = number1;
        this.number2 = number2;
        this.operator = operator;
    }

    // 기능 (메서드)
    // [접근제어자][리턴타입].[메서드명(매개변수)]{메서드 구현}
    // 연산(calculate()), 결과 조회(getResults()), 결과 삭제(delete()) + 수정(setResults())

    // 연산 메서드
    // Scanner 객체를 calculate() 메서드에 전달하여 number2 지속적으로 재입력받기
    public int calculate(Scanner scanner) {  // 매개변수 적어주기
        int result = 0; // 결과값 받을 변수 설정

        // 나누기가 0이하가 아닌 값을 입력받는 코드
        if (operator == '/') {
            while (number2 <= 0) {
                System.out.println("0이하가 아닌 두 번째 숫자를 입력하세요: ");
                number2 = scanner.nextInt();
            }
        }

        switch (operator) {
            case ('+'):
                result = number1 + number2;
                break;
            case ('-'):
                result =  number1 - number2;
                break;
            case ('*'):
                result = number1 * number2;
                break;
            case ('/'):
                result = number1 / number2;
                break;
            default:
                System.out.println("+ , - , * , / 중에 입력하세요");
                return 0;
        }
        // 연산 결과값 리스트에 저장
        results.add(result);

        // 연산 결과 반환
        return result;
    }

    // 전체 결과 조회 게터
    // arr에 추가되는 기능 넣어야 함
    ArrayList<Integer> getResults() {
        return new ArrayList<>(results); // 업데이트 된 array를 가져와야 하므로 this 말고 new 써주기
    }

    // 현재 계산된 결과 조회 게터
    public int getCurrentResult() {
        return calculate(new Scanner(System.in)); // 입력받은 값을 기반으로
    }

    // 결과 삭제 메서드
    // 가장 먼저 저장된 결과 삭제하기

    // 결과 수정 메서드
    // 잘 모르겠다😭



}
