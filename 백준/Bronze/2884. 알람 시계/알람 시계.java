import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	// h == 0, m<45 -> h=23, m+15
    	// 1. m<45면, h-1, m+15
    	// 2. m>45, m-45
    	String input = br.readLine();
    	StringTokenizer st = new StringTokenizer(input);
    	int h = Integer.parseInt(st.nextToken());
    	int m= Integer.parseInt(st.nextToken());
    	
    	
    	if(h==0 && m<45) {
    		System.out.println(23 + " "+ (m+15));
    	}else if(m<45) {
    		System.out.println((h-1) + " "+ (m+15));
    	}else {
    		System.out.println(h+" "+(m-45));
    	}
    	
    }
}