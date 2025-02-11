class Node {
    String text;
    Node prev;
    Node next;

    public Node(String text) {
        this.text = text;
        this.prev = null;
        this.next = null;
    }
}

class HistoryManager {
    private Node head;
    private Node tail;
    private Node current;
    private int size;
    private final int MAX_SIZE;

    public HistoryManager(int maxSize) {
        this.head = null;
        this.tail = null;
        this.current = null;
        this.size = 0;
        this.MAX_SIZE = maxSize;
    }

    public void addState(String text) {
        Node newNode = new Node(text);

        if (size == 0) {
            head = tail = current = newNode;
        } else {
            if (current.next != null) {
                current.next = null;
            }
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            current = tail;
        }

        if (size == MAX_SIZE) {
            head = head.next;
            head.prev = null;
        } else {
            size++;
        }
    }

    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo: " + current.text);
        } else {
            System.out.println("No more undo history.");
        }
    }

    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo: " + current.text);
        } else {
            System.out.println("No more redo history.");
        }
    }

    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current state: " + current.text);
        } else {
            System.out.println("No text state available.");
        }
    }
}

public class TextEditor {
    public static void main(String[] args) {
        HistoryManager historyManager = new HistoryManager(5);
        historyManager.addState("Hello");
        historyManager.addState("Hello, World");
        historyManager.addState("Hello, World!");
        historyManager.addState("Hello, World!!");
        historyManager.addState("Hello, World!!!");
        historyManager.displayCurrentState();
        historyManager.undo();
        historyManager.undo();
        historyManager.displayCurrentState();
        historyManager.redo();
        historyManager.redo();
        historyManager.displayCurrentState();
    }
}

