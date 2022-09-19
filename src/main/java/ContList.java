public class ContList {
    private Node head=null ,tail=null;
    private int size=0;
    class Node {
        int data;
        Node next;

        Node(int d)
        {
            data=d;
            next=null;
        }
    }

    public int getSize()
    {
        return size;
    }
    public void contInsert( int data) {
        size++;

        Node newNode = new Node(data);
        newNode.next = null;

        if (head== null)
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
            tail.next=newNode;
            tail=newNode;
        }

    }
    public int contExtract(int ind)
    {
        if(ind<size) {
            Node pHead = head;
            for (int i = 0; i <ind; i++) {
                pHead = pHead.next;
            }
            return pHead.data;
        }
        else return 0;
    }

    public void contDelete(int ind)
    {
        if(ind<size)
        {
            size--;
            if(ind==0)
                head=head.next;
            else
            {
                Node pHead = head.next,pHeadPrev=head;
                for (int i = 1; i < ind; i++) {
                    pHead = pHead.next;
                    pHeadPrev=pHeadPrev.next;
                }
                if(pHead==tail)
                {
                    pHeadPrev.next=null;
                    tail=pHeadPrev;
                }
                else
                {
                    pHeadPrev.next= pHead.next;
                }
            }

        }
    }

}
