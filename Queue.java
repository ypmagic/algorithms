public class Queue<Type> {

  private SingleLinkedList<Type> _list;

  public Queue() {
    _list = new SingleLinkedList<Type>();
  }

  public void enqueue(Type newNode) {
    _list.addLast(newNode);
  }

  public void dequeue() {
    _list.removeFirst();
  }

  public boolean isEmpty() {
    return _list.isEmpty();
  }

  public int size() {
    return _list.size();
  }

}
