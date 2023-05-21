import java.util.StringJoiner;

public class  MyLinkedList
{
    private  Node head = null;
    private  Node tail = null;
    public boolean isEmpty()
    {
        return (head == null && tail == null);
    }

    public void add (Object value)
    {
        Node node = new Node();
        node.setValue(value);
        if (this.isEmpty())
        {
            this.head = node;
        }
        else
        {
            tail.setNext(node);
            node.setPrev(tail);
        }
        tail = node;
    }
    public int size()
    {
        if (head == null)
        {
            return 0;
        }
        int count = 1;
        Node last = head;
        while (last.getNext() != null)
        {
            last = last.getNext();
            count++;
        }
        return count;
    }
    public void remove(int index)
    {
        int size = size();
        if (index == 0 && !isEmpty())
        {
            Node q = head;
            head = q.getNext();
            head.setPrev(null);
        }
        else if (index >= size || index < 0)
        {
          throw new ArrayIndexOutOfBoundsException();
        }
        else if (index == size - 1)

        {    Node currNode = tail;
             tail = tail.getPrev();
             tail.setNext(null);
        } else
        {
            Node currNode = head;
            for (int i = 0; i < index; i++)
            {
                currNode = currNode.getNext();
            }
            Node temp = currNode;
            Node nextNode = temp.getNext();
            Node prevNode = temp.getPrev();
            prevNode.setNext(nextNode);
            nextNode.setPrev(prevNode);
        }
    }
    @Override
    public String toString()
    {
        StringJoiner result = new StringJoiner(", ");
        Node last = head;
        while (last != null)
        {
            result.add(last.getValue().toString());
            last = last.getNext();
        }
        return "[" + result + "]";
    }
    public void clear()
    {
        this.head = null;
        this.tail = null;
    }
    public Object get(int index)
    {

        if (index >= size() || index < 0)
        {
            throw new IndexOutOfBoundsException("Index out of range of LinkedList");
        }
        else
        {
            Node currentNode = this.head;
            for (int i = 0; i <= index; i++)
            {
                if (i == index)
                {
                    return currentNode.getValue();
                }
                else
                {
                    currentNode = currentNode.getNext();
                }
            }
        }
        return null;
    }
}

