import java.sql.Array;
import java.util.Arrays;

public class MyArrayListTest
{
    public static void main(String[] args)
    {
        MyArrayList <String> list = new MyArrayList<>();
        list.add("Java");
        list.add("C#");
        list.add("Python");
        list.add("Sql");

        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(0) = " + list.get(0));
        //list.clear();
        //System.out.println("list.size() = " + list.size());
        list.remove(1);
        System.out.println("list = " + list);


    }
}
