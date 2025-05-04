import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger money = new BigInteger(st.nextToken());
        BigInteger people = new BigInteger(st.nextToken());

        BigInteger moneyPerPerson = money.divide(people);
        BigInteger restMoney = money.remainder(people);

        System.out.println(moneyPerPerson);
        System.out.println(restMoney);
    }

}