import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int N = Integer.parseInt(br.readLine()); // 배열에 들어갈 정수의 개수
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int V = Integer.parseInt(br.readLine());
    	int[] arr = new int[N]; // 배열생성
    	int sum = 0;
    	for(int i=0; i<N; i++) {
    		arr[i] = Integer.parseInt(st.nextToken());
    		if(V == arr[i]) {
    			sum+=1;
    		}
    	}
    	System.out.println(sum);


    }	
}