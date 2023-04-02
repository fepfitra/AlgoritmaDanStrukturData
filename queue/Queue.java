public class Queue {
  private int maxSize;
  private int nItems;
  private int front;
  private int rear;
  private int[] queArray;

  public Queue(int size) {
    maxSize = size;
    queArray = new int[maxSize];
    front = 0;
    rear = -1;
    nItems = 0;
  }

  public void enqueue(int data) {
    if (rear == maxSize -1) {
      rear = -1;
    }
    queArray[++rear] = data;
    nItems++;
  }

  public int dequeue() {
    int temp = queArray[front++];
    if(front == maxSize) {
      front = 0;
    }
    nItems--;
    return temp;
  }

  public boolean isEmpty() {
    return nItems == 0;
  }

  public boolean isFull() {
    return nItems == maxSize;
  }
}
