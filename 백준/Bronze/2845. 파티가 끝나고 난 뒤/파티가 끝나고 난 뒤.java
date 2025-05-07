
import java.io.*;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int people = (Integer.parseInt(st.nextToken())) * (Integer.parseInt(st.nextToken()));

        int[] circulatedPeople = new int[5];
        for(int i = 0; i < 5; i++) {
            circulatedPeople[i] = Integer.parseInt(st2.nextToken()) - people;
            System.out.print(circulatedPeople[i] + " ");
        }

    }
}