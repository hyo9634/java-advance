package collectionEx.list;

public class SingleLinkedListEx {

  public static void main(String[] args) {
    Node<Integer> node1 = new Node<Integer>(1);
    Node<Integer> node2 = new Node<Integer>(2);
    node1.next = node2;
    Node<Integer> head = node1;

    SingleLinkedList<Integer> mylist = new SingleLinkedList<>();
    mylist.addNode(1);
    mylist.addNode(2);
    mylist.addNode(3);
    //System.out.println(mylist.head.next.data);
    //mylist.addNodeInside(5, 1);
    mylist.printAll();
    mylist.delNode2(1);
   mylist.delNode2(3);



    mylist.printAll();
  }

}
