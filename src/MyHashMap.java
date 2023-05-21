public class MyHashMap
{
    private static final int CAPACITY = 16;
    private HashNode[] nodeArray;
    private int size;

    public MyHashMap()
    {
        this.size = 0;
        this.nodeArray = new HashNode[CAPACITY];
    }

    private int getIndex(HashNode node)
    {
        return (int)(node.getHashcode() % CAPACITY);
    }
    private int getIndex(Object key)
    {
        return this.getIndex(new HashNode(key, null));
    }

    public void put(Object key, Object value)
    {
        HashNode newNode = new HashNode(key,value);
        int index = this.getIndex(newNode);
        if (this.nodeArray[index] == null)
        {
            this.nodeArray[index] = newNode;
            this.size++;
        }
        else
        {
            HashNode currentNode = this.nodeArray[index];
            while (currentNode.getNext() != null && currentNode.getKey().equals(key))
            {
                currentNode = currentNode.getNext();
            }

            if (currentNode.getKey().equals(key))
            {
                currentNode.setValue(value);
            }
            else
            {
                currentNode.setNext(newNode);
                this.size++;
            }
        }
    }

    public void remove(Object key)
    {
        int index = getIndex(key);
        if (this.nodeArray[index] == null)
        {
            return;
        }
        HashNode currentNode = this.nodeArray[index];
        HashNode prevNode = null;
        while (currentNode.getNext() != null && !currentNode.getKey().equals(key))
        {
            prevNode = currentNode;
            currentNode = currentNode.getNext();
        }
        if (currentNode.getKey().equals(key))
        {
            if (prevNode == null)
            {
                this.nodeArray[index] = currentNode.getNext();
            }
            else
            {
                prevNode.setNext(currentNode.getNext());
            }
            this.size--;
        }
    }

    public void clear()
    {
        for (int i = 0; i < this.nodeArray.length; i++)
        {
            this.nodeArray[i] = null;
        }
        this.size = 0;
    }

    public Object get(Object key)
    {
        int index = this.getIndex(key);
        if (this.nodeArray[index] == null)
        {
            return null;
        }
        HashNode currentNode = nodeArray[index];
        while (currentNode.getNext() != null && !currentNode.getKey().equals(key))
        {
            currentNode = currentNode.getNext();
        }
        if (currentNode.getKey().equals(key))
        {
            return currentNode.getValue();
        }
        return null;
    }

    public int size()
    {
        return this.size;
    }
}
