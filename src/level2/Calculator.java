package level2;

public class Calculator {

    // 속성
    int number1;
    int number2;
    char operator;

    // 생성자
    Calculator(int number1, int number2, char operator) {
        this.number1 = number1;
        this.number2 = number2;
        this.operator = operator;
    }

    // 기능 (메서드)
    // [접근제어자][리턴타입].[메서드명(매개변수)]{메서드 구현}
    // 연산(calculate()), 결과 조회(getResults()), 결과 삭제(delete()) + 수정(setResults())

    // 입력 메서드


    // 연산 메서드
    public int calculate(int number1, int number2, char operator) {  // 매개변수 적어주기!
        switch (operator) {
            case ('+'):
                return number1 + number2;
            case ('-'):
                return number1 - number2;
            case ('*'):
                return number1 * number2;
            case ('/'):
                if (number2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    return 0;
                } else {
                    return number1 / number2;
                }
            default:
                System.out.println("+ , - , * , / 중에 입력하세요");
                return 0;
        }
    }

    // 결과 조회 메서드



    // 결과 삭제 메서드


}
