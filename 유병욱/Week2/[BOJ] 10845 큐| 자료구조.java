import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException { 
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Queue<Integer> queue = new LinkedList<>();
            StringBuilder sb = new StringBuilder();
            int a = Integer.parseInt(br.readLine());
            int b = 0;
            for(int i=0; i<a; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
            
                switch(st.nextToken()){

                    case "push" :
                        b = Integer.parseInt(st.nextToken());
                        queue.offer(b);
                        break; 
                    case "pop" :
                        if (queue.isEmpty()) {
                            sb.append(-1).append('\n');
                        } else{
                        sb.append(queue.poll()).append('\n');
                        }
                        break;
                    case "size" :
                        sb.append(queue.size()).append('\n');
                        break;
                    case "empty" :
                        if(queue.isEmpty()){
                            sb.append(1).append('\n');
                        } else {
                            sb.append(0).append('\n');
                        }
                        break;
                    case "front" :
                        if(queue.isEmpty()){
                            sb.append(-1).append('\n');
                        } else {
                            sb.append(queue.peek()).append('\n');
                        }
                        break;
                    case "back" :
                        if(queue.isEmpty()){
                            sb.append(-1).append('\n');
                        } else {
                            sb.append(b).append('\n');
                        }
                }
            }
            System.out.println(sb);                
    
    
            }
            
        };ㄴㅇㄹ
