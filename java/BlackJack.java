import java.util.Scanner;

class PlayGame {
    Scanner scan = new Scanner(System.in);
    int numOfCard;
    int standard;
    int[] arr;

    public PlayGame() {
        System.out.println("카드의 개수와 기준점이 되는 번호를 입력하세요");
        numOfCard = scan.nextInt();
        standard = scan.nextInt();
        arr = new int[numOfCard];
    }

    public void CardNum() {
        System.out.println("카드의 번호들을 입력하세요");
        for (int i = 0; i < numOfCard; i++) {
            arr[i] = scan.nextInt();
        }
    }

    public int Pick() {
        int res = 0;

        for (int i = 0; i < numOfCard - 2; i++) {
            for (int j = i + 1; j < numOfCard - 1; j++) {
                for (int k = 0; k < numOfCard; k++) {
                    int sum = arr[i] + arr[j] + arr[k];

                    if (standard == sum) {
                        return standard;
                    }

                    if (res < sum && sum < standard) {
                        standard = sum;
                        System.out.println(standard);
                    }
                }
            }
        }
        return res;
    }
}

public class BlackJack {
    public static void main(String[] args) {
        PlayGame pg = new PlayGame();
        pg.CardNum();
        pg.Pick();
    }
}
