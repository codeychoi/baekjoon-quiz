import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	// 현재시간을 분으로 바꿈
    	// 현재시간 + 요리시간 더한 후 시간과 분 단위로 변경
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int h = Integer.parseInt(st.nextToken());
    	int m= Integer.parseInt(st.nextToken());
    	int time = Integer.parseInt(br.readLine()); //요리 시간
    	
    	int totalMinutes = h*60 + m + time;
    	System.out.println((totalMinutes/60)%24 +" "+(totalMinutes%60));
    	
    
    }
}