public class QueueNode
{
    private QueueNode next;
    private QueueNode prev;
    private Object value;
    public QueueNode(QueueNode next, QueueNode prev, Object value)
    {
        this.next = next;
        this.prev = prev;
        this.value = value;
    }
    public Object getValue()
    {
        return this.value;
    }

    public void setNext(QueueNode next)
    {
        this.next = next;
    }

    public void setPrev(QueueNode prev)
    {
        this.prev = prev;
    }

    public QueueNode getNext()
    {
        return this.next;
    }

    public QueueNode getPrev()
    {
        return this.prev;
    }
}
