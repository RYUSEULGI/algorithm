import java.util.Scanner;

public class Alram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("알람 설정 시간을 입력하세요");
        int h = scan.nextInt();
        int m = scan.nextInt();
        System.out.printf("%d시%d분", h, m);

        if (m < 45) {
            m += 60;
            h--;
            if (h < 0) {
                h = 23;
            }
        }
        System.out.printf("변경된 시간은 %d시%d분", h, m - 45);
    }
}
