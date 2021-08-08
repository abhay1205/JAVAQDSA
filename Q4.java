package QDSA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count0 = 0, count1 = 0, count2 = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i]==0){
                count0++;
            }
            if(arr[i]==1){
                count1++;
            }
            if(arr[i]==2){
                count2++;
            }
        }
        for (int i = 0; i < count0; i++) {
            System.out.print(0 + " ");
        }
        for (int i = 0; i < count1; i++) {
            System.out.print(1 + " ");
        }
        for (int i = 0; i < count2; i++) {
            System.out.print(2 + " ");
        }

    }
}
