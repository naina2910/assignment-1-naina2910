package linklist;

import person.Person;

import java.util.ArrayList;
import java.util.Collections;

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


    //to add a contact
    public void insert(Person data)
    {
        Node node = new Node(data);
        node.setNext(head);
        head = node;
    }

    //to view all contact
    public void view()
    {
        if(!isEmpty())
        {
            System.out.println("---Here are all your contacts---");
            ArrayList<String> nameList = new ArrayList<>();
            Node temp = head;
            while (temp != null)
            {
                nameList.add((temp.getData().getFname()+" "+temp.getData().getLname()));
                temp = temp.getNext();
            }
            Collections.sort(nameList);
            for (String s : nameList)
            {
                temp = head;
                while (temp != null)
                {
                    String name=temp.getData().getFname()+" "+temp.getData().getLname();
                    if (s.equals(name))
                    {
                        System.out.println("-------- * -------- * -------- * -------- * -------- * --------");
                        System.out.print(temp.getData());
                        System.out.println("-------- * -------- * -------- * -------- * -------- * --------");
                    }
                    temp = temp.getNext();
                }
            }
        }
        else
        {
            System.out.println("Contact list is empty");
        }
    }

    //to search a particular contact
    public void search(String name)
    {
        ArrayList<Person> arr=new ArrayList<>();
        Node temp=head;
        while(temp != null)
        {
            if(temp.getData().getFname().equals(name))
            {
                arr.add(temp.getData());
            }
            temp = temp.getNext();
        }
        if(arr.size() != 0)
        {
            System.out.println(arr.size()+" Match Found");
            for (Person p:arr)
            {
                System.out.println("-------- * -------- * -------- * -------- * -------- * --------");
                System.out.print(p);
                System.out.println("--------*--------*--------*--------*--------*--------");
            }
        }
        else
        {
            System.out.println("NO RESULTS FOUND!");
        }
    }
}
