public class Node<Type> {

  private Node<Type> _next;
  private Type _element;

  public Node(Type element) {
      _next = null;
      _element = element;
  }

  public Node<Type> getNext() { 
      return _next; 
  }

  public void setNext(Node<Type> next) {
      _next = next;
  }
   
  public Type getElement() { 
      return _element; 
  }

  public void setElement(Type element) {
      _element = element;
  }

}
