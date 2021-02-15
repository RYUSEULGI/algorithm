class Number {
    final int MAXNUMBER = 10000;
    int res = 0;
    Boolean[] arr;

    public Number() {
        arr = new Boolean[MAXNUMBER + 1];
    }

    public int SelfNum(int num) {
        res = num;

        while (num != 0) {
            res = res + (num % 10);
            num = num / 10;
        }
        return res;
    }

    public void CheckArrNum() {
        for (int i = 1; i <= MAXNUMBER; i++) {
            res = SelfNum(i);

            if (i < MAXNUMBER + 1) {
                arr[i] = true;
            }

            for (int j = 1; j <= MAXNUMBER; j++) {
                if (arr[j] == false) {
                    System.out.println(j);
                }
            }
        }
    }

}

public class SelfNumber {
    public static void main(String[] args) {
        Number num = new Number();
        num.CheckArrNum();
    }
}
