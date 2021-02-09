import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[];

        System.out.println("카드의 개수와 기준점이 되는 번호를 입력하세요");
        int numOfCard = scan.nextInt();
        int standard = scan.nextInt();

        arr = new int[numOfCard];
        System.out.println("카드의 번호들을 입력하세요");
        for (int i = 0; i < numOfCard; i++) {
            arr[i] = scan.nextInt();
        }

        // numOfCard에서 3장을 뽑는 것이 게임의 룰
        // numOfCard 값의 합이 standard 보다 작지만 가장 가까운 카드의 합을 출력하기

        // 3개의 카드를 고르기 때문에
        // 3중for문 돌면서 체크하기
        for (int i = 0; i < numOfCard - 2; i++) {
            for (int j = i + 1; j < numOfCard - 1; j++) {
                for (int k = 0; k < numOfCard; k++) {
                    int sum = arr[i] + arr[j] + arr[k];

                    if (sum < standard) {
                        standard = sum;
                        System.out.println(standard);
                    }
                }
            }
        }

    }
}
