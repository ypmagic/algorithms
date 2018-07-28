public class Stack<Type> {

  private SingleLinkedList<Type> _list;

  public Stack() {
    _list = new SingleLinkedList<Type>();
  }

  public void push(Type el) {
    return _list.addFirst(el);
  }

  public void pop() {
    return _list.removeFirst();
  }

  public boolean isEmpty() {
    return _list.isEmpty();
  }

  public int size() {
    return _list.size();
  }
}
