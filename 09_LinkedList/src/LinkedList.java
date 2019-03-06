public class LinkedList<E> {

    private static class Entry<E> {
        E element;
        Entry<E> next;
        Entry<E> prev;

        Entry (E element, Entry<E> next, Entry<E> prev){
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }

    private boolean isEmpty;
    private int size;
    private Entry<E> head;
    private Entry<E> tail;

    public LinkedList() {
        this.size = 0;
        this.head = new Entry<>(null, tail, null);
        this.tail = this.head;
        this.isEmpty = true;
    }

    public void add(E element) {
        Entry<E> newEntry = new Entry<>(element, tail.next, tail);
        if (isEmpty) {
            head = tail = newEntry;
            isEmpty = false;
        }
        else {
            tail.next = newEntry;
            tail = newEntry;
        }
        size++;
    }

    public void addFront(E element) {
        Entry<E> newEntry = new Entry<>(element, head, head.prev);
        if (isEmpty) {
            head = tail = newEntry;
            isEmpty = false;
        }
        else {
            head.prev = newEntry;
            head = newEntry;
            head.prev = null;
        }
        size++;
    }

    public void addBack(E element) {
        add(element);
    }

    public void addIndex(int index, E element) {
        Entry<E> tmp;
        if (index > size / 2) {
            tmp = tail;
            for(int i = size - 1; i > index; i--){
                tmp = tmp.prev;
            }
        }
        else {
            tmp = head;
            for(int i = 0; i < index; i++){
                tmp = tmp.next;
            }
        }
        Entry<E> newEntry = new Entry<>(element, tmp.next, tmp.prev);
        tmp.prev.next = newEntry;
        tmp.next.prev = newEntry;
    }

    public void removeFront() {
        head = head.next;
        head.prev.next = null;
        head.prev = null;
        size--;
    }

    public void removeBack() {
        tail = tail.prev;
        tail.next.prev = null;
        tail.next = null;
        size--;
    }

    public void removeIndex(int index) {
        if(index == 0) {removeFront();}
        else if (index == size - 1) {removeBack();}
        else {
            Entry<E> tmp;
            if (index > size / 2) {
                tmp = tail;
                for (int i = size - 1; i > index; i--) {
                    tmp = tmp.prev;
                }
            } else {
                tmp = head;
                for (int i = 0; i < index; i++) {
                    tmp = tmp.next;
                }
            }
            tmp.prev.next = tmp.next;
            tmp.next.prev = tmp.prev;
            size--;
        }
    }

    public E get(int index) {
        Entry<E> temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp.element;
    }

    public int size() {
        return this.size;
    }
}
