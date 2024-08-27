package myProject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackPro {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String[] command = br.readLine().split(" ");
            int op = Integer.parseInt(command[0]);

            switch (op) {
                case 1:
                    stack.push(Integer.parseInt(command[1]));
                    break;
                case 2:
                    if (!stack.isEmpty()) {
                        sb.append(stack.pop()).append("\n");
                    } else {
                        sb.append("-1").append("\n");
                    }
                    break;
                case 3:
                    sb.append(stack.size()).append("\n");
                    break;
                case 4:
                    sb.append(stack.isEmpty() ? "1" : "0").append("\n");
                    break;
                case 5:
                    if (!stack.isEmpty()) {
                        sb.append(stack.peek()).append("\n");
                    } else {
                        sb.append("-1").append("\n");
                    }
                    break;
            	}
        }

        System.out.println(sb.toString());
    }
}
