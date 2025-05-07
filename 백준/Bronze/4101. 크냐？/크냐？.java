import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Boolean isCaseEnd = true;

        while(isCaseEnd){

            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(a==0 && b==0){
                isCaseEnd = false;
            }else if(a>b){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }

    }
}