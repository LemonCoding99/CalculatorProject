package level2;

import java.util.Scanner;
import java.util.ArrayList;

public class Calculator {

    // 속성
    private int number1;
    private int number2;
    private char operator;

    // 결과 저장하기 (컬렉션)
    // 모든 calculator 객체가 같은 results를 공유하도록 static으로 변경
    private static ArrayList<Integer> resultList = new ArrayList<>(); // 캡슐화(private)


    // 생성자
    Calculator(int number1, int number2, char operator) {
        this.number1 = number1;
        this.number2 = number2;
        this.operator = operator;
    }

    // 기능
    // 연산(calculate()), 결과 조회(getResults()), 결과 삭제(delete()) + 수정(setResults())

    // 연산 메서드
    // Scanner 객체를 calculate() 메서드에 전달하여 number2 지속적으로 재입력받기
    public int calculate(Scanner scanner) {
        int result; // 결과값 받을 변수 설정하기

        // 나눗셈일 때 두 번째 숫자가 0일 경우 예외처리하기
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

        // 연산 결과값 리스트에 저장하기
        resultList.add(result);

        // 연산 결과 반환하기
        return result;
    }

    // 결과 삭제하는 메서드(FIFO)
    public void delete() {
        if (!resultList.isEmpty()) {  // results가 비어있는지 확인하기
            resultList.remove(0);
            System.out.println("삭제 완료");
        } else {
            System.out.println("삭제할 값이 없습니다.");
        }
    }

    // 현재 계산된 결과 조회하는 게터
    public int getCurrentResult() {
        if(resultList.isEmpty()) return 0;
        return resultList.get(resultList.size() - 1); // getLast(): 버전 안맞음
    }

    // 전체 결과 조회하는 게터
    ArrayList<Integer> getResultList() {
        return resultList;
    }

}
