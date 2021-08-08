package QDSA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int arr[] = new int[n];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st1.nextToken());
        }
        int min = arr[0];
        int max = arr[1];
        for(int i=2; i<n-1; i = i+2){
            if(arr[i]>arr[i+1]){
                if(arr[i]>max){
                    max = arr[i];
                }
                if(arr[i+1]<min){
                    min = arr[i+1];
                }
            }else{
                if(arr[i+1]>max){
                    max = arr[i+1];
                }
                if(arr[i]<min){
                    min = arr[i];
                }
            }
        }
        System.out.println("Min: " + min + " Max: " + max);
    }
}
