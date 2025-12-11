
class CNode {

    int data;
    CNode next;

    CNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class qu_19 {

    CNode head = null;

// Insert at end 
    public void insert(int data) {
        CNode newNode = new CNode(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }

        CNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }

// Display data 
    public void display() {
        if (head == null) {
            return;
        }

        CNode temp = head;
        System.out.print("Circular List: ");
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);

        System.out.println();
    }

    public static void main(String[] args) {
        qu_19 cl = new qu_19();
        cl.insert(5);
        cl.insert(15);
        cl.insert(25);
        cl.display();
    }
}
