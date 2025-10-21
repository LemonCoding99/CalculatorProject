# Calculator Project

## 1.  프로젝트 소개(Overview)
이 프로젝트는 java 17을 사용하여 Lv1 > Lv2 > Lv3로 기능을 확장하며 발전시킨 콘솔 기반 계산기 프로그램입니다.  
현재 문서는 Lv2 기준으로 작성되었으며 클래스를 활용하여 제작되었습니다.
Lv1은 클래스 없이 제작되었으며 기본적인 연산을 수행할 수 있습니다.  
사용자가 숫자와 사칙연산 부호를 입력하면 사칙연산 기능을 수행하여 그에 맞는 계산결과를 출력합니다.


## 2. 개발 기간
2025.10.15~2025.10.20


## 3. 개발 환경(Environment)
- 개발 언어: Java
- JDK 버전: 17
- 개발 툴: IntelliJ IDEA


## 4. 구현한 기능 목록(Features)
- 사용자 입력기능: 콘솔에서 숫자 2개와 사칙연산 부호 입력받습니다.
- 사칙연산 계산: 덧셈(+), 뺼셈(-), 곱셈(*), 나눗셈(/)을 수행합니다.
- 저장 기능: 계산한 결과값 리스트에 저장합니다.
- 삭제 기능: 리스트에 저장 된 계산결과 중 가장 처음에 추가된 결과값을 삭제합니다.
- 예외처리: 0으로 나누는 경우, 공백을 입력한 경우에 대한 예외처리할 수 있습니다.
- 종료기능: 'exit' 입력 시 프로그램 종료합니다.


## 5. 프로젝트 구조(Project Structure)
<img width="322" height="213" alt="image" src="https://github.com/user-attachments/assets/acdaa0c7-c788-47b3-ae1d-af99067d3694" />



## 6. 사용 방법(Usage)
1) IntelliJ IDEA를 실행합니다.
2) 이 프로젝트폴더('calculator')를 엽니다.
3) 왼쪽 프로젝트 창에서 'App.java' 파일을 선택하고 우측 상단의 'Run' 버튼을 클릭합니다.
4) 하단 콘솔 창이 열리면 숫자와 사칙연산 기호를 입력하여 사용할 수 있습니다.



## 7. 구현 예시(Example)
- 덧셈(+), 뺄셈(-)
- 리스트에 값 저장하기
<img width="571" height="492" alt="image" src="https://github.com/user-attachments/assets/b964f214-fa78-4ae7-bf9c-8000ec85016e" />  

- 곱셈(*), 나눗셈(/)
<img width="478" height="488" alt="image" src="https://github.com/user-attachments/assets/f821b9fa-eba8-434f-9928-f16b60bc6de4" />  

- 나눗셈일 때 0으로 나누는 경우 예외처리하기
<img width="457" height="246" alt="image" src="https://github.com/user-attachments/assets/26b15fed-448d-4673-8858-72dd0b139ff7" />  

- 가장 오래된 결과값 삭제하기
<img width="512" height="102" alt="image" src="https://github.com/user-attachments/assets/cc719c58-3ed7-4c6c-a86f-7e34cbfdb5c5" />  

- 계산기 종료하기
<img width="437" height="113" alt="image" src="https://github.com/user-attachments/assets/c829e672-f0ca-4a44-84f9-fbff33d55899" />  


## 8. 향후 개선 계획(Future Improvements)
- Lv2에 문자가 입력되는 경우를 개선할 예정입니다.
- Enum, 제네릭, 람다, 스트림을 사용한 계산기 Lv3를 제작예정입니다.

