package com.assignment10.utility;

public class SList<E> {
    Link<E> headLink = new Link<>(null);
    public SListIterator<E> iterator() {
        return new SListIterator<>(headLink);
    }
    public String toString() {
        if(headLink.next == null) return "SList: []";
        
        SListIterator<E> it = this.iterator();
        StringBuilder result = new StringBuilder();
        while(it.hasNext()) {
            result.append(it.next() + (it.hasNext() ? ", " : ""));
        }

        return "SList: [" + result + "]";
    }
}

