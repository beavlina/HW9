public class MyStackTest
{
    public static void main(String[] args)
    {
        MyStack stack = new MyStack();
        System.out.println("stack.size() = " + stack.size());
        for (int i = 0; i < 10; i++)
        {
            stack.push(i * -1);
        }
        System.out.println("stack.size() = " + stack.size());
        System.out.println("stack.toString() = " + stack.toString());
        System.out.println("stack.peek() = " + stack.peek());
        System.out.println("stack.remove(9);");
        stack.remove(9);
        System.out.println("stack.size() = " + stack.size());
        System.out.println("stack.toString() = " + stack.toString());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.size() = " + stack.size());
        System.out.println("stack.toString() = " + stack.toString());
        System.out.println("Stack.clear();");
        stack.clear();
        System.out.println("stack.size() = " + stack.size());
        System.out.println("stack.toString() = " + stack.toString());
    }

}
