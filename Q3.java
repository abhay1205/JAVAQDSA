package QDSA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Q3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int arr[] = new int[n];
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st1.nextToken());
        }

        int k = Integer.parseInt(br.readLine());
//        MAX HEAP, POPING THE MAXIMUM VALUE TILL THE REQUIRED MAX VALUE IS ATTAINED
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int j = 0; j < n; j++) {
            pq.add(arr[j]);
        }
        System.out.println(pq);
        int max = 0;
        int i=1;
        while (!pq.isEmpty()){
            if(i==k){
                max = pq.peek();
                break;
            }
            i++;
            pq.remove();
        }

//        MIN HEAP, POPING THE MINIMUM VALUE TILL THE REQUIRED MIN VALUE IS ATTAINED
        PriorityQueue<Integer> pqMin = new PriorityQueue<Integer>();
        for (int j = 0; j < n; j++) {
            pqMin.add(arr[j]);
        }
        System.out.println(pqMin);
        int min = 0;
        i=1;
        while(!pqMin.isEmpty()){
            if(i==k){
                min = pqMin.peek();
                break;
            }
            i++;
            pqMin.remove();
        }

        System.out.println("MIN: " + min + " MAX: " + max);
    }
}
