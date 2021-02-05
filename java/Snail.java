import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("올라갈 수 있는 길이");
        int up = scan.nextInt();

        System.out.println("미끄러지는 길이");
        int down = scan.nextInt();

        System.out.println("총 막대 길이");
        int total = scan.nextInt();

        int day = (total - down) / (up - down);

        // 값이 0이 아닌게 아니라
        // 나머지가 0 이 아니어야 하기 때문에
        if ((total - down) % (up - down) != 0) {
            day++;
        }
        System.out.println(day + "일이 걸린다");
    }
}

// day 1 2 3 4
// num 2 1 3 2 4 3 5
// climb +2 -1 +2 -1 +2 -1 +2