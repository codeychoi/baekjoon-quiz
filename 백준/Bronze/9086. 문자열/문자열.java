import java.awt.*;
import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        int i=0;
        while(i<t){

            String sentence = br.readLine();
            char[] chars = new char[sentence.length()];

            for(int j=0; j<sentence.length(); j++){
                chars[j] = sentence.charAt(j);
            }

            System.out.print(chars[0]);
            System.out.println(chars[sentence.length()-1]);

            i++;

        }


    }
}