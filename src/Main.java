public class Main {
    public static void main(String[] args){
        StackLinkedList stack = new StackLinkedList();
        stack.push(5);
        stack.push("it is string");
        stack.peek();
        System.out.println(stack.top.getItem());
        System.out.println(stack.top.getNext().getNext().getItem().);
        Stack stack = new StackArray();
        stack.push("String");
        stack.push(12);
        stack.peek();
        System.out.println("pop="+stack.pop());
        stack.peek();
        System.out.println("pop="+stack.pop());
        System.out.println("is empty"+stack.isEmpty());
        stack.peek();
        System.out.println("pop="+stack.pop());
    }


}
