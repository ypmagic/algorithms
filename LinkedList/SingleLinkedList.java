public class SingleLinkedList<Type extends Comparable<Type>> {

  private Node<Type> _head;
  private Node<Type> _tail;
  private int _size;

  public SingleLinkedList() {
    _head = null;
    _tail = null;
    _size = 0;
  }

  public Node<Type> addFirst(Type el) {
    _size++;
    Node<Type> n = new Node<Type>(el);
    n.setNext(_head);
    _head = n;
    if (size == 1) {
      _tail = n;
    }
    return n;
  }

  public Node<Type> addLast(Type el) {
    Node<Type> n = new Node<Type>(el);
    if (size == 0) {
      _head = n;
      _tail = n;
    } else {
      _tail.setNext(n);
      _tail = n;
    }
    _size++;
    return n;
  }

  public Node<Type> removeFirst() {
    if (_size == 0) {
      System.out.println("List is empty");
      return null;
    }

    Type removed = _head.getElement();
    _head = _head.getNext();
    _size--;
    if (_size == 0) {
      _tail = null;
    }
    return removed;
  }

  public Node<Type> removeLast() {
    Type removed = null;
    if (_size == 0) {
      System.out.println("List is empty");
    } else if (_size == 1) {
      removed = _head.getElement();
      _head = null;
      _tail = null;
      _size = 0;
    } else { // search through list until tail is found
      Node curr = _head;
      Node prev = null;
      while (curr.getNext() != null) {
        prev = curr;
        curr = curr.getNext();
      }
      removed = curr;
      _tail = prev;
      prev.setNext(null);
      _size--;
    }
    return removed;
  }

  public Node<Type> remove(Type el) {
    if (this.isEmpty()) {
      System.out.println("List is empty");
      return null;
    }

    if (el.compareTo(_head.getElement()) == 0) {
      return this.removeFirst();
    }

    if (el.compareTo(_tail.getElement()) == 0) {
      return this.removeLast();
    }

    Node<Type> curr = _head.getNext();
    Node<Type> prev = _head;

    while (curr != null) {
      if (el.compareTo(curr.getElement()) == 0) {
        curr.setNext(null);
        prev.setNext(curr.getNext());
        _size--;
        return curr.getElement();
      }
      prev = curr;
      curr = curr.getNext();
    }
    return null;
  }

  public Node<Type> search(Type el) {
    Node<Type> curr = _head;
    while (curr != null) {
      if (curr.getElement().compareTo(el) == 0) {
        return curr;
      }
      curr = curr.getNext();
    }
    return null;
  }

  public int size() {
    return _size;
  }

  public boolean isEmpty() {
    return _size == 0;
  }

  public Node<Type> getHead() {
    return _head;
  }

  public Node<Type> getTail() {
    return _tail;
  }
}
