import java.util.Scanner;

public class SmallThanX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("정수 2개를 입력하세요");

        int a = scan.nextInt();
        int b = scan.nextInt();
        int[] arr = new int[a];

        if (a < b) {
            System.out.println("error");
        } else {
            System.out.println("배열의 길이: " + a);
            System.out.printf("%d보다 작은 수 구하기 %d개의 숫자를 입력하세요", b, a);

            for (int i = 0; i < a; i++) {
                arr[i] = scan.nextInt();
            }
            for (int i = 0; i < a; i++) {
                if (arr[i] < b) {
                    System.out.print(arr[i] + "");
                }
            }
        }
    }
}
