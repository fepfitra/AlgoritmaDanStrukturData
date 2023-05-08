package pbstlinkedlist;

  class Node {
     char data;
     Node left,right;
   }
 
public class Bst {
    Node root;
    public Bst(){
      root=null;  
    }
    Node insertR(char input, Node T){
      if(T==null){
        Node b=new Node();
        b.data=input;
        b.left=null;b.right=null;
        T=b;
      }
      else
        if(input<T.data)
           T.left=insertR(input,T.left);
        else if(input>T.data) 
           T.right=insertR(input,T.right);
      return T;
    }
    public void insert(char input){
        Node baru=new Node();
        baru.data=input;
        baru.left=null;baru.right=null;
        if(root==null)root=baru;
        else{
           Node q=root;
           Node p=root;
           while (q!=null){
             p=q;  
             if(input<p.data) q=p.left;
             else if(input>p.data) q=p.right;else q=null;
           }
           if(input<p.data) p.left=baru;else
           if(input>p.data) p.right=baru;
        }  
    }

    void preOrder(Node lroot){
      if (lroot!=null) {
        System.out.print(lroot.data+" ");
        preOrder(lroot.left);
        preOrder(lroot.right);
      }
     }
    void inOrder(Node lroot){
      if (lroot!=null) {
        inOrder(lroot.left);
        System.out.print(lroot.data+" ");
        inOrder(lroot.right);
      }
    }
    void postOrder(Node lroot){
      if (lroot!=null) {
        postOrder(lroot.left);
        postOrder(lroot.right);
        System.out.print(lroot.data+" ");
       }
     }

    public boolean find(char x){
      if(root!=null) {
         Node q=root; Node p;
         while (q!=null && q.data!=x) {
            p=q;     
            if(x<p.data) q=p.left;
            else if(x>p.data) q=p.right;
         }           
          return q != null;
     }
     return false;
    }
    
    public char findMin()
    {
     if(root!=null) {
        Node q=root;
        while (q.left!=null) q=q.left;
        return q.data;
       }
     else return 0;
    }
    public char findMax()
    {
     if(root!=null) {
        Node q=root;
        while (q.right!=null) q=q.right;
        return q.data;
       }
     else return 0;
    }
    public void delLeaf(char x){
    if(root!=null) {
       Node q=root,p=q,r=p;
       while (q!=null && x!=p.data) {
          r=p;p=q;     
          if(x<p.data) q=p.left;else if(x>p.data) q=p.right;else q=null;
        }           
        if ((x==p.data) && (p.left==null && p.right==null)){ 
           if (x<r.data) r.left=null; else r.right=null;
        }  
         else System.out.println("bukan daun atau data tidak ada");      
      }
    }
    
    Node carimaxkiri(Node roots){
      if(roots!=null) {
        Node q=roots.left;
        while (q.right!=null) q=q.right;
        return q;
      }
      else return null;
    }
    void removemax(Node T){
	if(T.right.right==null)                   
           T.right=T.right.left;
	 else 
	    removemax(T.right);
    }

    public void removemaxkiri(){
      if (root.left!=null) removemax(root.left); 
    }

    public void removeRootA(){
     if (root!=null){
       Node temp=carimaxkiri(root);
       root.data=temp.data;
       removemaxkiri();
      } 
    }
  public void removeRoot(){
    if (root!=null) {
     Node temp;   
     if(root.left!=null){
       temp=root.left;
       if(temp.right==null) {
          root.data=temp.data;root.left=temp.left;}
       else {
          while (temp.right.right!=null) temp=temp.right;
          root.data=temp.right.data;
          temp.right=temp.right.left;
        }
     }else
        if(root.right!=null) {
          temp=root.right;
          if(temp.left==null) {
            root.data=temp.data;
            root.right=temp.right;}
          else {
            while (temp.left.left!=null) temp=temp.left;
            root.data=temp.left.data;
            temp.left=temp.left.right;
           }
          } else root=null;
        }
    }
    
}
