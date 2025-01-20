import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    	StringTokenizer st1 = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st1.nextToken()); // 정수의 개수
    	int X = Integer.parseInt(st1.nextToken()); // 비교할 정수
    	
    	StringTokenizer st2 = new StringTokenizer(br.readLine()); // 숫자 입력
    	StringBuilder sb = new StringBuilder();
    	
    	for(int i=0; i<N; i++) {
    		int num = Integer.parseInt(st2.nextToken());
    		if(num < X) {
    			sb.append(num).append(" ");
    		}
    	}
    	System.out.println(sb.toString().trim());
    }	
}