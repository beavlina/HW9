import java.util.StringJoiner;

public class MyQueue
{
    QueueNode head;
    QueueNode tail;
    int length;

    public MyQueue()
    {
        this.length = 0;
    }

    public void add(Object value)
    {
        if (this.length == 0)
        {
            QueueNode newNode = new QueueNode(null, null, value);
            this.head = newNode;
            this.tail = newNode;
        }
        else
        {
            QueueNode newNode = new QueueNode(null, this.tail, value);
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
        this.length++;
    }

    public void clear()
    {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public int size()
    {
        return this.length;
    }

    public Object peek()
    {
        return this.head.getValue();
    }

    public Object poll()
    {
        if (this.length == 0)
        {
            return null;
        }

        Object result = this.head.getValue();
        if (this.head == this.tail)
        {
            this.head = null;
            this.tail = null;
        }
        else
        {
            QueueNode newHead = head.getNext();
            newHead.setPrev(null);
            this.head = newHead;
        }
        this.length--;
        return result;
    }

    @Override
    public String toString()
    {
        StringJoiner result = new StringJoiner(", ");
        QueueNode currentNode = this.head;
        while (currentNode != null)
        {
            result.add(currentNode.getValue().toString());
            currentNode = currentNode.getNext();
        }
        return "[" + result + "]";
    }
}
