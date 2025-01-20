import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	String arr[] = br.readLine().split(" ");
    	long intArr[] = Arrays.stream(arr).mapToLong(Long::parseLong).toArray();
    	
    	long sum = 0;
    	for(int i=0;i<intArr.length;i++) {
    		sum += intArr[i];
    	}
    	
    	System.out.println(sum);
    }	
}