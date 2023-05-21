import java.util.Objects;

public class HashNode
{
    private Object key;
    private Object value;
    private HashNode next;
    private long hashcode;

    public HashNode(Object key, Object value)
    {
        this.key = key;
        this.value = value;
        this.hashcode = Objects.hashCode(key);
    }

    public Object getKey()
    {
        return key;
    }

    public Object getValue()
    {
        return value;
    }

    public void setValue(Object value)
    {
        this.value = value;
    }

    public HashNode getNext()
    {
        return next;
    }

    public void setNext(HashNode next)
    {
        this.next = next;
    }

    public long getHashcode()
    {
        return hashcode;
    }
}
