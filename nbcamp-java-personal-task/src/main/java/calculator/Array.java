package calculator;
import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedList;

public class Array {
    public static void main(String[] args) {
        int[] results = new int[10];
        Scanner sc = new Scanner(System.in);

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

            int[] arr = new int[10];
            int count = 0;
            switch (c) { //c가 +,-,*,/일때
                case '+':
                    result = a + b;
                    System.out.println("결과: " + result);

                    // Arrays.toString(arr);
                    if (count <= 9) {
                        results[count] = result;
                    } else {
                        for (int i = 0; i <= 8; i++) {
                            arr[i] = arr[i+1];
                        }

                        arr[9] = result;
                    }
                    count+=1;
                    break;
                case '-':
                    result = a - b;
                    System.out.println("결과: " + result);
                    if (count <= 9) {
                        results[count] = result;
                    } else {
                        for (int i = 0; i <= 8; i++) {
                            arr[i] = arr[i+1];
                        }

                        arr[9] = result;
                    }
                    count+=1;

                    break;
                case '*':
                    result = a * b;
                    System.out.println("결과: " + result);
                    if (count <= 9) {
                        results[count] = result;
                    } else {
                        for (int i = 0; i <= 8; i++) {
                            arr[i] = arr[i+1];
                        }

                        arr[9] = result;
                    }
                    count+=1;

                    break;
                case '/':
                    if (b == 0) {
                        System.out.println("나눗셈의 분모는 0이 될 수 없습니다.");
                    }
                    result = a / b;
                    System.out.println("결과: " + result);
                    if (count <= 9) {
                        results[count] = result;
                    } else {
                        for (int i = 0; i <= 8; i++) {
                            arr[i] = arr[i+1];
                        }

                        arr[9] = result;
                    }
                    count+=1;
                    break;


                default:
                    System.out.println("사칙연산 중 하나를 입력해주세요");

                    /* 제어문을 활용하여 위 요구사항을 만족할 수 있게 구현합니다.*/
            }
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");


            String str = sc.next();
            if (str.equals("exit")) {
                break;
            }


        }
    }
}
