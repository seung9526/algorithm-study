import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < a; i++) {
            int b = Integer.parseInt(br.readLine());

            if(b==0){
                if(!pq.isEmpty()){
                    System.out.println(pq.poll());
                }else{
                    System.out.println(0);
                }
            }else{
                pq.add(b);
            }
        }
    }
}
