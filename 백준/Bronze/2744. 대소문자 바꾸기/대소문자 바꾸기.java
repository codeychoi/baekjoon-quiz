import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        char[] chars = word.toCharArray();
        int[] ints = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            if( (int) chars[i] < 97 ){ //대문자면
                ints[i] = ((int) chars[i]) + 32 ;
            }else{
                ints[i] = ((int) chars[i]) - 32 ;
            }
        }

        char[] afterChars = new char[ints.length];
        for (int i = 0; i < ints.length; i++) {
            afterChars[i] = (char) ints[i];
            System.out.print(afterChars[i]);
        }

    }
}