public class MyLinkedList {
    Node head;
    static int count = 0;
    public static void main(String[] args){
        MyLinkedList obj = new MyLinkedList();
        obj.createNode(1,"First Node");
        obj.createNode(2,"Second Node");
        obj.createNode(3,"Third Node");
        System.out.println("-----------------------------");

        obj.traverse();
        System.out.println(count);
    }
    void createNode(int id,String name){
        if(head == null){
            //there is no node in linked list
            head = new Node(id,name);
            System.out.println(head);
        }else{
            //there can be nodes in liked list
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new Node(id,name);
            System.out.println(temp.next);
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
