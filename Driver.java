class Node {
    public int data;
    public Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    public Node head;

    public LinkedList(Node head) {
        this.head = head;
    }
}

class mergeSort {
    void split(Node head, Node a, Node b) {
        Node temp = head;

        if(temp == null || temp.next == null){
            return;
        }
        else{
            while(temp.next.next != null){
                temp = temp.next.next;
                b = b.next;
            }
        }
    }

    Node merge(Node a, Node b) {
        Node sortedList, tempSort, tempA = a, tempB = b;

        if (a.data < b.data) {
            sortedList = a;
            tempA = a.next;
        }
        else {
            sortedList = b;
            tempB = b.next;
        }

        tempSort = sortedList;

        while(tempA != null && tempB != null) {
            if(tempA.data < tempB.data) {
                tempSort.next = tempA;
                tempA = tempA.next;
            }
            else {
                tempSort.next = tempB;
                tempB = tempB.next;
            }
            tempSort = tempSort.next;
        }

        while(tempA != null) {
            tempSort.next = tempA;
            tempA = tempA.next;
        }
        while(tempB != null) {
            tempSort.next = tempB;
            tempB = tempB.next;
        }

        return sortedList;
    }

    Node mergeSort(Node head) {
        Node a, b = split(head, a, b), c;
        if(head == null || head.next == null) {
            return head;
        }
        a = mergeSort(a);
        b = mergeSort(b);
        c = merge(a,b);

        return (c);
    }
}

public class Driver {
    public static void main(String[] args) {

    }
}
