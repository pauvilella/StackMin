import java.util.*;

public class Main {
    public static class StackMin extends Stack<Integer> {

        private Stack<Integer> mins = new Stack<>();

        public Integer pop() {
            int value = super.pop();
            if (value == min()) {
                mins.pop();
            }
            return value;
        }

        public void push(int item) {
            if(item < min()) {
                mins.push(item);
            }
            super.push(item);
        }

        public int min() {
            if (mins.empty()) {
                return Integer.MAX_VALUE;
            } else {
                return mins.peek();
            }
        }


    }
    public static void main(String[] args) {
        StackMin stack = new StackMin();
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(1);
        stack.push(5);
        stack.push(3);
        System.out.println(stack);
        System.out.println(stack.min());
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.min());
    }
}
