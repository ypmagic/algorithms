public class SingleLinkedList<Type> {

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
       
  }

  public Node<Type> remove(Type e1) {

  }

  public Node<Type> search(Type e1) {

  }

  public int size() {
      return _size;
  }

  public boolean isEmpty() {
      return _size == 0;
  }

  public Node<Type> getHead() {

  }

  public Node<Type> getTail() {

  }


}
