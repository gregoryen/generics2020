package pl.p.lodz.zzpj2020.generics.pierwsze;

import org.w3c.dom.traversal.NodeIterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyGenericList<T> implements Iterable<T> {

    private Node<T> head;
    private Node<T> last;
    private int size = 0;

    public MyGenericList(){
        this.size = 0;
        this.head = null;
        this.last = null;
    }

    public MyGenericList(T value) {
        this.head = new Node<T>(value);
        this.last = this.head;
        this.size = 1;
    }

    public Node<T> getHead() {
        return head;
    }

    public Node<T> getLast() {
        return last;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty(){
        return this.head==null;
    }

    public void add(T value) {

        if (value != null) {
            Node<T> newInput = new Node<T>(value);

            if (head == null) {
                head = newInput;
                last = newInput;
            } else {
                this.last.setNext(newInput);
                this.last = newInput;
            }
            size += 1;
        }
    }

    public void addAll(MyGenericList<T> list) {
        this.last.setNext(list.getHead());
        this.last = list.getLast();
    }

    public void removeAll(){
        this.head = null;
        this.last = null;
        this.size = 0;
    }


    public T getByIndex(int index){

        if (index > this.size) {
            throw new NoSuchElementException();
        }

        int currentIndex = 0;

        boolean flag = head.hasNext();
        Node<T> currentNode = this.head;

        while (flag) {
            flag = currentNode.hasNext();
            if (index == currentIndex) {
                return currentNode.getValue();
            }
            currentIndex ++;
            currentNode = currentNode.getNext();
        }

        return null;
    }

    @Override
    public String toString() {

        StringBuilder listContent = new StringBuilder("");

        if (head != null) {
            Node<T> node = this.head;
            boolean flag = node.hasNext();
            while (flag) {
                flag = node.hasNext();
                listContent.append(node.getValue());
                node = node.getNext();
                listContent.append("\n");
            }
        }

        return listContent.toString();
    }

    public void print() {
        for (T t: this) {
            System.out.println(t);
        }
    }

    public void print(int index) {
        System.out.println(getByIndex(index));
    }

    @Override
    public Iterator<T> iterator() {
        return new NodeIterator<>(this);
    }

    private final static class NodeIterator<T> implements Iterator<T> {
        private Node<T> current;

        public NodeIterator(MyGenericList<T> list) {
            this.current = list.size == 0 ? null : list.head;
        }

        @Override
        public T next() {
            T t = current.getValue();
            this.current = current.getNext();
            return t;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

    }

}
