import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int avg = 0;
        int cnt = 0;

        System.out.println("몇개의 과목을 확인 할 건가요?");
        int a = scan.nextInt();
        int[] arr = new int[a];

        for (int i = 0; i < a; i++) {

            System.out.println("학생 수는 몇 명 인가요?");
            arr[i] = scan.nextInt();
            int[] arr2 = new int[arr[i]];

            System.out.println("점수를 입력하세요");
            for (int j = 0; j < arr[i]; j++) {
                arr2[j] = scan.nextInt();

                sum += arr2[j];
            }
            avg = sum / arr[i];
            System.out.println(avg);

            // 평균을 넘는 학생 비율
            for (int k = 0; k < arr[i]; k++) {
                if (arr2[k] > avg) {
                    cnt++;
                }
                int b = cnt / arr[i];
                System.out.println(b);
            }

        }

    }
}