public class MyLinkedListTest
{
    public static void main(String[] args)
    {
        MyLinkedList list = new MyLinkedList();
        System.out.println("list.size() = " + list.size());
        list.add("Flower");
        list.add("Tree");
        list.add("Bush");
        list.add("Grass");
        System.out.println("list.size() = " + list.size());
        //list.remove(0);
       //System.out.println("list.size() = " + list.size());
        //list.remove(3);
        //System.out.println("list.size() = " + list.size());
        //System.out.println("list = " + list);
        //list.remove(5);
        //list.clear();
        //System.out.println("list.size() = " + list.size());

        System.out.println("first element = " + list.get(0));
        System.out.println("second element = " + list.get(1));
        System.out.println("last element = " + list.get(3));
        //System.out.println("some element = " + list.get(4)); //IndexOutOfBoundsException
    }
}
