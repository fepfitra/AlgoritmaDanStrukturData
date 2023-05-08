package pmultiplelink;

class NodeC {
  String cabang;
  NodeC next;
  NodeP down;
}
class NodeP {
  String nama;
  NodeP next;
}

public class Mlist {
  NodeC head;
    boolean isEmpty(){
      return (head==null);
    }
    void insertPeserta(String key,NodeP input){
       if(isEmpty()) {
            NodeC temp=new NodeC();
            temp.cabang=key;temp.next=null;temp.down=input;
            head=temp;
        } else{
           NodeC temp = head;
  	   do {
   	    if (temp.cabang.compareToIgnoreCase(key) == 0){	
                input.next=temp.down;
                temp.down=input;
                break;
   		}
            else  
   	       temp = temp.next;
  	   }
  	   while (temp!=null);
           if (temp==null) { 
            NodeC C=new NodeC();C.cabang=key;C.down=input;
            C.next=head;head=C;
          }
      }
    }
    void display(){
     if(!isEmpty()) {
         NodeC temp=head;
         while (temp!=null){
             System.out.print(temp.cabang+" :");
             NodeP t=temp.down;
             while(t!=null){
              System.out.print(t.nama+",");
              t=t.next;   
             }
             System.out.println();
             temp=temp.next;
         }
     }
         
    }
    boolean findPemain(String key){
      if(!isEmpty()) {
         NodeC temp=head;
         while (temp!=null){
             NodeP t=temp.down;
             while(t!=null){
               if(t.nama.compareToIgnoreCase(key)==0) {
                   System.out.println(temp.cabang+":"+key);
                   return true;
               };
               t=t.next;   
             }
             temp=temp.next;
         }
         System.out.println("Data tidak ada");
         return false;
     } else return false;   
    }
    
}
