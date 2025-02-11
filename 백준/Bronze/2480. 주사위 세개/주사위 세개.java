import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int a = Integer.parseInt(st.nextToken());
    	int b = Integer.parseInt(st.nextToken());
    	int c = Integer.parseInt(st.nextToken());
    	
    	if(a==b && b==c) { // 3개의 눈이 같으면
    		System.out.println(10000 + a * 1000);
    	}else if(a==b || a==c || b==c ) {
    		int num = 0;
    		if(a==b) {
    			 num = a;
    		}else if(a==c) {
    			num = a;
    		}else {
    			num = b;
    		}
    		System.out.println(1000 + num * 100);
    	}else {
    		if(a>b && a>c) {
    			System.out.println(a*100);
    		}else if(b>a && b>c) {
    			System.out.println(b*100);
    		}else {
    			System.out.println(c*100);
    		}
    	}
    }
}