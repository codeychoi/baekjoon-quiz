import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Boolean isContinued = true;
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};


        while(isContinued) {

            String sentence = br.readLine();
            int sum = 0;

            if (sentence.equals("#")) {
                isContinued = false;
            } else {
                for (int i = 0; i < sentence.length(); i++) {
                    for (int j = 0; j < vowels.length; j++) {
                        if (sentence.charAt(i) == vowels[j]) {
                            sum++;
                        }
                    }

                }
                System.out.println(sum);
            }
        }

    }
}