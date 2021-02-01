import java.util.Scanner;

public class Fountain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int cnt = 0;
        int line = 0;
        int top;
        int bottom;

        while (cnt < a) {
            line++;
            cnt = line * (line + 1) / 2; // 등차수열 공식 이용하기
        }

        // 짝수일 경우 홀수일 경우 나눠서 생각하기
        if (line % 2 == 0) {
            top = line - (cnt - a);
            bottom = 1 + (cnt - a);
            System.out.println(top + "/" + bottom);
        } else {
            top = 1 + (cnt - a);
            bottom = line - (cnt - a);
            System.out.println(top + "/" + bottom);
        }
    }
}

// 규칙
// 1번 1/1
// 2번 1/2 2/1
// 3번 1/3 2/2 3/1
// 4번 1/4 2/3 3/2 4/1
// 5번 1/5 2/4 3/3 4/2