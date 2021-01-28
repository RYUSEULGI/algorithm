import java.util.Scanner;

public class HoneyComb {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("찾으려는 숫자는 몇 번인가요?");
        int input = scan.nextInt();
        int cnt = 1;

        if (input == 1) {
            System.out.println(1 + "번째 방");
        } else {
            for (int i = 2; i <= input; i++) {
                i = i + (6 * cnt);
                cnt++;
            }
            System.out.println(cnt + "번째 방");
        }
    }
}
