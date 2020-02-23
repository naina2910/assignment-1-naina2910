package linklist;

public class ContactList {
    private Node head;

    public ContactList()
    {
        head = null;
    }

    public Node getHead()
    {
        return head;
    }

    public void setHead(Node head)
    {
        this.head = head;
    }

    private boolean isEmpty() {
        boolean response=false;
        if(head == null)
        {
            response=true;
        }
        return response;
    }
}
