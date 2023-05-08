package arrayobjek;

class Node {
    String lastName;
    String firstName;
    int age;
    Node next,prev;
}
public class Dlist {
  Node head;
  Node tail;
    boolean isEmpty(){
      return (head==null);
    }    
  void addFirst(Node input){
  		if (isEmpty()){	//Jika linked list masih kosong,
   			head = input;	//maka head dan tail sama dengan node input
   			tail = input;
  		}
  		else {
   			input.next = head;	//Jika linked list sudah berisi,
   			head.prev = input;
                        head = input;	//maka input akan di depan dan menjadi head
  		}
 	}
    void addLast(Node input){
		if (isEmpty()){	//Jika linked list masih kosong,
			head = input;	//maka head dan tail sama dengan node input
			tail = input;
		}
		else {
			tail.next = input;	//Jika linked list sudah berisi,
			input.prev = tail;
                        tail = input;	//maka input akan di belakang dan menjadi tail
		}
	}

     void insertSorted(Node input){
         if (isEmpty()){	//Jika linked list masih kosong,
            head = input;	//maka head dan tail sama dengan node input
            tail = input;
	}
	else {
          if(input.lastName.compareTo(head.lastName)<0) 
              this.addFirst(input);
          else 
            if(input.lastName.compareTo(tail.lastName)>0) 
                 this.addLast(input);
            else{
              Node t=head;
              while(t.lastName.compareTo(input.lastName)<0) t=t.next;
              if(t.lastName.compareTo(input.lastName)==0){
                  System.out.println("Data sudah ada");
              } else {
                  input.next=t;
                  t.prev.next = input;
                  input.prev = t.prev;
                  t.prev=input;
              }
            }
	}
        }
      void printNode(){
  		Node temp;
  		temp = head;
  		while (temp != null){
                    System.out.println(temp.lastName+" "+temp.firstName+" "+temp.age);
                    temp = temp.next;
  		}
                System.out.println();
 	}
   
}
