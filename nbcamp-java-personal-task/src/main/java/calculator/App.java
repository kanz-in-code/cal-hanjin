package calculator;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;



public class App {
    public static void main(String[] args) {
        int[] results = new int[10];
        Scanner sc = new Scanner(System.in);
        List<Integer> resultList = new ArrayList<Integer>();
        while(true) {

            System.out.print("첫 번째 숫자를 입력하세요: ");
            int a = sc.nextInt();
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            System.out.print("두 번째 숫자를 입력하세요: ");
            int b = sc.nextInt();
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            System.out.print("사칙연산 기호를 입력하세요: ");
            char c = sc.next().charAt(0);
            // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
            int result;

            switch (c) { //c가 +,-,*,/일때
                case '+':
                    result = a + b;
                    System.out.println("결과: " + result);

                    resultList.add(result);
                    break;
                case '-':
                    result = a - b;
                    System.out.println("결과: " + result);

                    resultList.add(result);
                    break;
                case '*':
                    result = a * b;
                    System.out.println("결과: " + result);

                    resultList.add(result);
                    break;
                case '/':
                    if (b == 0) {
                        System.out.println("나눗셈의 분모는 0이 될 수 없습니다.");
                    }
                    result = a / b;
                    System.out.println("결과: " + result);
                    resultList.add(result);
                    break;


                default:
                    System.out.println("사칙연산 중 하나를 입력해주세요");

                    /* 제어문을 활용하여 위 요구사항을 만족할 수 있게 구현합니다.*/
            }


            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String str = sc.next();
            if (str.equals("remove")) {

                resultList.remove(resultList.size()-1);
                break;}

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String str1 = sc.next();
            if (str1.equals("exit")) {
                break;
            }





        }
    }
}
