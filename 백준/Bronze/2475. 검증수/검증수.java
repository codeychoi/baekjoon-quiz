import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        int[] numbers = new int[5];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        int sumOfNumbers = 0;

        for(int i=0; i<numbers.length; i++) {
            sumOfNumbers += (int)(Math.pow(numbers[i],2));
        }

        System.out.println(sumOfNumbers%10);

    }
}