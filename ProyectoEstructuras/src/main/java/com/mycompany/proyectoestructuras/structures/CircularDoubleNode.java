package com.mycompany.proyectoestructuras.structures;


public class CircularDoubleNode<T> {
    T data;                        // Dato almacenado en el nodo
    CircularDoubleNode<T> next; // Referencia al siguiente nodo
    CircularDoubleNode<T> previous;  // Referencia al nodo anterior

    // Constructor para inicializar un nodo con un dato
    public CircularDoubleNode(T data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public CircularDoubleNode<T> getNext() {
        return next;
    }

    public void setNext(CircularDoubleNode<T> next) {
        this.next = next;
    }

    public CircularDoubleNode<T> getPrevious() {
        return previous;
    }

    public void setPrevious(CircularDoubleNode<T> previous) {
        this.previous = previous;
    }
    
}
