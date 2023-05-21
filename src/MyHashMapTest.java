public class MyHashMapTest
{
    public static void main(String[] args)
    {
        MyHashMap hashMap = new MyHashMap();
        System.out.println("hashMap.size() = " + hashMap.size());
        hashMap.put("Masha", 20);
        hashMap.put("Ira", 15);
        hashMap.put("Dima", 28);
        hashMap.put("Sasha", 34);
        hashMap.put("Nina", 23);
        System.out.println("hashMap.size() = " + hashMap.size());
        System.out.println("hashMap.get(\"Dima\") = " + hashMap.get("Dima"));
        hashMap.put("Dima", 31);
        System.out.println("hashMap.get(\"Dima\") = " + hashMap.get("Dima"));
        System.out.println("hashMap.size() = " + hashMap.size());
        hashMap.remove("Ira");
        System.out.println("hashMap.size() = " + hashMap.size());
        System.out.println("hashMap.get(\"Ira\") = " + hashMap.get("Ira"));
        hashMap.clear();
        System.out.println("hashMap.size() = " + hashMap.size());
        System.out.println("hashMap.get(\"Masha\") = " + hashMap.get("Masha"));
    }
}
