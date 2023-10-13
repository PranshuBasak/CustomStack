package StackPractice;

public class MainList {
    public static void main(String[] args) {
        CustomStackFromLinkedList stack = new CustomStackFromLinkedList();
        System.out.println("----------------------");
        System.out.println(stack.customPop());
        stack.customPush(1);
        stack.customPush(2);
        stack.customPush(3);
        stack.customPush(4);
        stack.customPush(5);
        stack.customPush(6);
        System.out.println(stack);
        System.out.println(stack.customPop());
        System.out.println(stack);
        System.out.println(stack.size());
    }
}
