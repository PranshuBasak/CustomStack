package StackPractice;

public class MainFromArray {
    public static void main(String[] args) {
        CustomStackFromArray stack = new CustomStackFromArray(5);
        stack.customPop();
        stack.customPush(1);
        stack.customPush(2);
        stack.customPush(3);
        stack.customPush(4);
        stack.customPush(5);
        stack.customPush(1);
        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.customPop());
        System.out.println(stack);
        System.out.println(stack.customPeek());
        System.out.println(stack);
    }
}
