import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max;
        int min;
        int[] arr;

        System.out.println(" 몇 개의 수가 있나요?");
        int a = scan.nextInt();
        arr = new int[a];

        System.out.printf("정수 %d개를 입력하세요.\n", a);
        for (int i = 0; i < a; i++) {
            arr[i] = scan.nextInt();
        }

        min = arr[0];
        max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            } else if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("최댓값 : " + max);
        System.out.println("최소값 : " + min);
    }
}