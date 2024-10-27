import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // 1. 제외 단 입력받기
//        Scanner sc = new Scanner(System.in);
//        System.out.print("제외할 단을 입력하세요: ");
//        int except = sc.nextInt();

        // 2. 원하는 단 출력하기
        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 단을 입력하세요: ");
        int except = sc.nextInt();

        for (int i = except; i < 10; i++) {
            System.out.println("-----" + i + "단-----");
            for (int j = 1; j < 10; j++) {
                int result = i * j;
                System.out.println(i + " * " + j + " = " + result);
            }
            break;
        }
    }
}