import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int arr[] = new int[9];

    	int max = Integer.MIN_VALUE;
    	int i= 0, order = 0;
    	while(i<9) { 
    		arr[i] = Integer.parseInt(br.readLine());
    		if(arr[i] > max) {
    			max = arr[i]; 
    			order = i+1;
    		}
    		i++;
    	}
    	
    	System.out.println(max);
    	System.out.println(order);
    	
    }	
}