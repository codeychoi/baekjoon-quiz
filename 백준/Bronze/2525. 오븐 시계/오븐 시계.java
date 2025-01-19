
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	//1. time을 시와 분으로 나눔 ( timeH = time/60 , timeM = time%60 )
    	//2. h와 m에 각각 더함
    	//3. h는 24로 나눠서 시간보정, m은 60으로 나눠서 시간보정
    	//4. m+timeM이 60이 넘으면 h+1, 더해진 h가 24면 0이 되게 수식 추가
    	
    	String input = br.readLine(); // 현재 시와 분
    	int time = Integer.parseInt(br.readLine()); // 요리 시간
    	
    	StringTokenizer st = new StringTokenizer(input);
    	int h = Integer.parseInt(st.nextToken());
    	int m= Integer.parseInt(st.nextToken());

    	int timeH = time/60; //1
    	int timeM = time%60;  //20
    	System.out.println( ((h+timeH)%24 + ((m+timeM)/60))%24 +" "+((m+timeM)%60));

    }
}