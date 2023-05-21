import java.util.StringJoiner;

public class MyArrayList <T>
{
    private static final int INIT_SIZE = 8;
    private Object[] data;
    private int index;


    public  MyArrayList()
    {
        this.data = new Object[INIT_SIZE];
    }
    public void add (Object value)
    {
        if(this.index == this.data.length)
        {
            int newSize = data.length * 2;
            Object[] newData = new Object[newSize];
            System.arraycopy(this.data, 0, newData, 0, this.data.length);
            this.data = newData;
        }
        this.data[index] = value;
        this.index++;
    }
    public Object get (int index)
    {
        return this.data[index];
    }
    public int size()
    {
        return this.index;
    }
    @Override
    public String toString()
    {
        StringJoiner result = new StringJoiner(", ");
        for (int i = 0; i < this.index; i++)
        {
            result.add(data[i].toString());
        }
        return "[" + result + "]";
    }
    public void clear()
    {
        for (int i = 0; i < size(); i++)
        {
            this.data[i] = null;
        }
        this.index = 0;
    }
    public void remove(int index)
    {
        Object[] newData = new Object[this.data.length];
        if(index == 0)
        {
            System.arraycopy(this.data, 1, newData, 0, newData.length);
            this.data = newData;
        }
        else if(index == this.index - 1)
        {
            System.arraycopy(this.data, 0, newData, 0, newData.length);
            this.data = newData;
        }
        else
        {
            System.arraycopy(this.data, 0, newData, 0, index);
            System.arraycopy(this.data, index + 1, newData, index, this.data.length - (index + 1));
            this.data = newData;
        }
        this.index = this.index - 1;
    }
}
