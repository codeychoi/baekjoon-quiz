import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int X = Integer.parseInt(br.readLine()); // 총 구매 금액
    	int N = Integer.parseInt(br.readLine()); // 구매한 물건의 개수
    	int sum = 0; // X과 비교할 계산 총 금액
    	
    	// 총액 계산
    	for(int i=1; i<=N; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int a = Integer.parseInt(st.nextToken());
    		int b = Integer.parseInt(st.nextToken());
    		sum += a*b;
    	}
    	
    	// 값 비교
    	if(X == sum) {
    		System.out.println("Yes");
    	}else {
    		System.out.println("No");
    	}
    }
}