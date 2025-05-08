import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = Integer.parseInt(st.nextToken());
        int sub = Integer.parseInt(st.nextToken());

        // 조건 1, 2 검사
        if (sum < sub || (sum + sub) % 2 != 0) {
            System.out.println(-1);
            return;
        }

        int team1 = (sum + sub) / 2;
        int team2 = sum - team1;

        // 조건 3 검사
        if (team1 < 0 || team2 < 0) {
            System.out.println(-1);
            return;
        }

        // 큰 점수 먼저 출력
        if (team1 > team2) {
            System.out.println(team1 + " " + team2);
        } else {
            System.out.println(team2 + " " + team1);
        }
    }
}