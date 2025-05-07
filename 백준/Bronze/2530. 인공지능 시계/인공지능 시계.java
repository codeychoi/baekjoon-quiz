import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cookTime = Integer.parseInt(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int currentTotalSec = 3600*h + 60*m + s;
        int cookCompletedSec = cookTime + currentTotalSec;

        int cookH = (cookCompletedSec/3600);
        int cookM = (cookCompletedSec - (cookH * 3600)) /60;
        int cookS = (cookCompletedSec - (cookH * 3600) - (cookM * 60));

        if(cookH >= 24  && cookM >= 60 ) {
            cookH = cookH % 24 + 1;
            cookM = cookM % 60;
        }else if(cookH < 23  && cookM >= 60 ) {
            cookH = cookH + 1;
            cookM = cookM % 60;
        }else if(cookH == 23  && cookM >= 60 ) {
            cookH = 0;
            cookM = cookM % 60;
        }else if(cookH >= 24  && cookM < 60 ) {
            cookH = cookH % 24;
        }
        System.out.println(cookH+" "+cookM+" "+cookS+" ");
    }
}