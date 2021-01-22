import java.util.Scanner;

public class OXquiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr;

        System.out.println("배열의 개수를 입력하세요");
        arr = new String[scan.nextInt()];

        System.out.println("맞은 문제는 O 틀린문제는 X 표시하세요");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.next();
        }

        scan.close();

        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;
            int sum = 0;

            for (int j = 0; j < arr[i].length(); j++) {

                if (arr[i].charAt(j) == 'O') {
                    cnt++;
                } else {
                    cnt = 0;
                }
                sum += cnt;
            }
            System.out.println("최종점수 : " + sum);
        }
    }
}

// char 타입은 정확히는 해당 문자에 해당하는 아스키값을 정수로 갖고있고,
// getBytes 또한 문자열의 문자들을 아스키값으로 된 byte배열을 반환하는 메소드라
// 정수 비교연산에서 특별한 캐스팅 없이 비교가능
// 물론 가장 작은 범위 타입인 byte인 경우
// 입력받는 문자가 0~127 범위밖에 있을 경우는 정상적인 비교연산이 불가능
