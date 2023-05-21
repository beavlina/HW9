import java.util.Arrays;
import java.util.StringJoiner;

public class MyStack
{
    private int length;
    private int capacity;
    private Object[] data;
    MyStack()
    {
        this.length = 0;
        this.capacity = 10;
        this.data = new Object[this.capacity];
    }

    public void push(Object value)
    {
        if (this.length != this.capacity)
        {
            this.data[this.length] = value;
            this.length++;
        }
        else
        {
            Object[] newArr = new Object[capacity * 2];
            System.arraycopy(this.data,0,newArr,0, this.capacity);
            this.data = newArr;
            this.capacity = this.capacity * 2;
            this.push(value);
        }
    }

    public void remove(int index)
    {
        int shift = 0;
        for (int i = 0; i < this.length - 1; i++)
        {
            if (i == index)
            {
                shift++;
            }
            this.data[i] = this.data[i + shift];
        }
        this.length--;
    }

    public void clear()
    {
        this.length = 0;
    }

    public int size()
    {
        return this.length;
    }
    public Object peek()
    {
        return data[this.length -1];
    }

    public Object pop()
    {
        this.length--;
        return data[length];
    }

    @Override
    public String toString()
    {
        StringJoiner result = new StringJoiner(", ");
        for (int i = 0; i < this.length; i++)
        {
            result.add(this.data[i].toString());
        }
        return "[" + result + "]";
    }
}
