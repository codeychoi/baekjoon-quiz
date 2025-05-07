import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i = 1;
        int sum = 0;
        while (i <= 5) {

            int grade = Integer.parseInt(br.readLine());
            sum += grade;
            i++;

        }
        System.out.println(sum);
    }
}