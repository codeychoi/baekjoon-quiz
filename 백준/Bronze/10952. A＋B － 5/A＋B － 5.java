import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int sum = 1;
    	while(sum != 0) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int A = Integer.parseInt(st.nextToken());
    		int B = Integer.parseInt(st.nextToken());
    		sum = A+B;
    		if(sum == 0) {
    			break;
    		}
    		System.out.println(sum);
    	}
    }	
}