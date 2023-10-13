package StackPractice;

public class CustomStackFromArray {
    private int[] item;
    private int top, size;

    CustomStackFromArray(int size){
        this.size = size;
        this.top = 0;
        this.item = new int[size];
    }

    public void customPush(int value){
        if(this.top == this.size){
            System.out.println("StackOverflow `" + value + "` Can't be place in stack");
            return;
        }
        this.item[top] = value;
        this.top++;
    }

    public int size(){
        return top;
    }

    public int customPop(){
        if(isEmpty()) return -1;
        this.top--;
        int value = this.item[top];
        this.item[top] = 0;
        return value;
    }

    public boolean isEmpty(){
        if (this.top == 0){
            System.out.println("Stack UnderFlow");
            return true;
        }else return false;
    }

    public int customPeek(){
        if(isEmpty()) return -1;
        return this.item[top-1];
    }

    public String toString(){
        StringBuilder stack = new StringBuilder();
        stack.append("[");
        for (int i = top-1; i >= 0; i--) {
            stack.append(item[i]).append(" ");
        }
        stack.append("]");

        return stack.toString();
    }
}
