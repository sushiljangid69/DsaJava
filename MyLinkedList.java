import java.util.LinkedList;

public class MyLinkedList {
    Node head;
    static float f = 44.123450f;
    static int count = 0;
    public static void main(String[] args){
//        System.out.printf("%f",f);

        MyLinkedList obj = new MyLinkedList();
        obj.createNodeAtStart(1,"First Node");
        obj.createNodeAtEnd(2,"Second Node");
        obj.createNodeAtEnd(3,"Third");
        obj.createNodeAtEnd(4,"");
        obj.createNodeAtStart(5,"Fifth");
        obj.createNodeAtRandom(6,"Random 6",2);
        obj.createNodeAtEnd(7,"End 7");
        obj.createNodeAtRandom(8,"Rand 3",3);
        System.out.println("-----------------------------");

        obj.traverse();
        System.out.println("Total Nodes are = "+count);
        obj.deleteNodeFromEnd();
        obj.traverse();

    }
    void createNodeAtEnd(int id, String name){
        if(head == null){
            //there is no node in linked list
            head = new Node(id,name);
            //System.out.println(head);
        }else{
            //there can be nodes in liked list
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new Node(id,name);
            //System.out.println(temp.next);
        }
        count++;
    }
    void createNodeAtRandom(int id,String name,int pos){
        if(pos > 0 && pos <= count + 1){
            if(pos == 1){
                createNodeAtStart(id,name);
            }else if(pos == count+1){
                createNodeAtEnd(id,name);
            }else{
                Node temp = head; //copy of head
                for(int i = 1;i < pos-1;i++){
                    temp = temp.next;
                }
                Node temp1 = new Node(id,name);
                temp1.next = temp.next;
                temp.next = temp1;
                count++;
            }
        }
    }
    void createNodeAtStart(int id,String name){
        if(head == null){
            //there is no node in linked list
            head = new Node(id,name);
            //System.out.println(head);
        }else{
            Node temp = new Node(id,name);
            temp.next = head;
            head = temp;
            //System.out.println(head);
        }
        count++;
    }
    void traverse(){
        Node temp = head;
        while(temp.next!=null) {
            System.out.println(temp);
            System.out.println(temp.getNo());
            temp = temp.next;
        }
        System.out.println(temp);
        System.out.println(temp.getNo());
    }

    void deleteNodeFromEnd(){
        if(head == null){
            System.out.println("Nothing to delete");
        }else{
            Node temp = head;
            Node prev = head;
            while(temp.next!=null) {
                prev = temp;
                temp = temp.next;
            }
            temp = null;
            prev.next = null;
            System.gc();
            finalize();
            count--;
        }
    }
    @Override
    protected void finalize(){
        System.out.println("Node is deleted");
    }
}
class Node{
    //data part
    String name;
    int no;

    //reference to the next node
    Node next;

    Node(int no,String name){
        this.no = no;
        this.name = name;
    }



    public int getNo() {
        return no;
    }


}
