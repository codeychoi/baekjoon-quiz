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
    	StringTokenizer st2 = new StringTokenizer(br.readLine());
    	
    	int arr[] = new int[N]; // N개의 배열 생성
    	int count = 0; // 작은 수를 세는 배열 공간
    	for(int i=0; i<N; i++) {
    		arr[i] = Integer.parseInt(st2.nextToken());
    		if(arr[i] < X) {
    			count += 1; 
    		}
    	}
    	int j=0;
    	int smallArr[] = new int[count];
    	for(int i=0;i<N;i++) {
    		
    		if(arr[i]<X) {
    			smallArr[j] = arr[i];
    			j++;
    		}
    	}
    	
    	for(int i=0 ; i<count; i++) {
    		System.out.print(smallArr[i]+" ");
    	}
    	
    	
    	
    }	
}