public class SimpleObjLinkedList {
    static class Node {
        Object data;
        Node next;

        Node(Object d) {
            data = d;
            next = null;
        }

        Node getNext() {
            return next;
        }

        void setNext(Node node) {
            next = node;
        }

        Object getData() {
            return data;
        }
    }

    public String toString() {
        String delim = ",";
        StringBuffer stringBuf = new StringBuffer();
        if (head == null)
            return "LINKED LIST is empty";
        Node currentNode = head;
        while (currentNode != null) {
            stringBuf.append(currentNode.getData());
            currentNode = currentNode.getNext();
            if (currentNode != null)
                stringBuf.append(delim);
        }
        return stringBuf.toString();
    }

    // appends the specified element to the end of this list.
    public void add(Object element) {
        // create a new node
        Node newNode = new Node(element);
        // if head node is empty, create a new node and assign it to Head
        // increment index and return
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        // starting at the head node
        // move to last node
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        // set the new node as next node of current
        currentNode.setNext(newNode);
    }

    public Object get(int index) {
        // Implement the logic returns the element
        // at the specified position in this list.
        if (head == null || index < 0)
            return null;
        if (index == 0) {
            return head.getData();
        }
        Node currentNode = head.getNext();
        for (int pos = 0; pos < index; pos++) {
            currentNode = currentNode.getNext();
            if (currentNode == null)
                return null;
        }
        return currentNode.getData();
    }

    public boolean remove(int index) {
        if (index < 0)
            return false;
        if (index == 0) {
            head = null;
            return true;
        }
        Node currentNode = head;
        for (int pos = 0; pos < index - 1; pos++) {
            if (currentNode.getNext() == null)
                return false;
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(currentNode.getNext().getNext());
        return true;
    }

    Node head;

    public static void main(String[] args) {
        SimpleObjLinkedList list = new SimpleObjLinkedList();
        list.add("INPUT-1");
        list.add("INPUT-2");
        list.add("INPUT-3");
        list.add("INPUT-4");
        list.add("INPUT-5");
        System.out.println(list);
        System.out.println(list.get(2));
        list.remove(3);
        System.out.println(list);
    }
}