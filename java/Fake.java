import java.util.Scanner;

public class Fake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("과목 개수를 입력해주세요");
        int a = scan.nextInt();
        double[] arr = new double[a];
        double[] arr2 = new double[a];

        double max = arr[0];
        double sum = 0;

        System.out.println("점수를 입력해주세요");
        for (int i = 0; i < a; i++) {
            arr[i] = scan.nextDouble();

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("최대" + max);

        for (int i = 0; i < a; i++) {
            arr2[i] = arr[i] / max * 100;
            sum += arr2[i];
        }

        double newAvg = sum / a;
        System.out.println("새로운 평균 : " + newAvg);
    }
}
