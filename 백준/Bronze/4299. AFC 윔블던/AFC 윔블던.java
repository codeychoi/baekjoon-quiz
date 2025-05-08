import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = Integer.parseInt(st.nextToken());
        int sub = Integer.parseInt(st.nextToken());

        //1. sum >= sub 여야함 0:0일수도 있으니까
        //2. (sum+sub)%2 !=0 면 -1임
        //3. team1> team2 비교해야함 team1과 team2는 음이 아닌 정수

        int team1 = (sum+sub)/2;
        int team2 = sum - team1;

        if(sum<sub || (sum+sub)%2 !=0 || sum < 0 || sub < 0 || team1 <0 || team2< 0){
            System.out.println(-1);
            return;
        }else{
            if(team1>=team2){
                System.out.println(team1+ " " +team2);
            }else{
                System.out.println(team2+ " " +team1);
            }
        }
        
    }
}