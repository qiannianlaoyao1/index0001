package beibao;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int mod = 1000000007;
        int[][] c1 = new int[122][122];

        c1[0][0] = 1;
        for (int i = 1; i <= 101; i++) {
            c1[i][0] = 1;
            for (int j = 1; j <= 101; j++) {
                c1[i][j] = (c1[i - 1][j - 1] + c1[i - 1][j]) % mod;
            }
        }
        int x = in.nextInt();
        int a, b, c, d;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();
        long sum = 0;
        for (int i = 0; i <= b; i++) {
            if (i * a <= x && (x - (i * a)) % c == 0 && (x - (i * a)) / c <= d) {
                sum = (sum + (c1[b][i] * c1[d][(x - (i * a)) / c]) % mod) % mod;
            }
        }
        System.out.println(sum);

    }
}
