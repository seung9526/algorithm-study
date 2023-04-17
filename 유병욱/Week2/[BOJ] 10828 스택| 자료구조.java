import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(br.readLine());

        for(int i=0; i<a; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            switch(st.nextToken()){

                case "push" :
                    stack.push(Integer.parseInt(st.nextToken()));
                    break; 
                case "pop" :
                    if (stack.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else{
                    sb.append(stack.pop()).append('\n');
                    }
                    break;
                case "size" :
                    sb.append(stack.size()).append('\n');
                    break;
                case "empty" :
                    if(stack.isEmpty()){
                        sb.append(1).append('\n');
                    } else {
                        sb.append(0).append('\n');
                    }
                    break;
                case "top" :
                    if(stack.isEmpty()){
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(stack.peek()).append('\n');
                    }
                    break;
            }
        }
        System.out.println(sb);                

        }
       
    };
