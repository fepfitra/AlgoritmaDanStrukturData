package pbstarray;

public class Bst {
    int index=0;
    int max_data = 10000;
    char[] data = new char[max_data];
    public Bst(){
      for(int i=0;i<max_data;i++) data[i] = ' ';  
    }
    public void insert(char input,int posisi){
      if(data[posisi]==' '){
        data[posisi]=input;
        if (posisi>index) index=posisi; //indexmax
      }
      else{
        if(input<data[posisi])
           insert(input,2*posisi);
        else if(input>data[posisi]) 
           insert(input,2*posisi+1);
      }    
    }
    
    public int findMin(int posisi){
       int i;
        if(data[posisi]!=' '){
           i=posisi;  
           while (data[2*i]!=' ') i=2*i;
           return i;
        } else return 0;  
    }
    public int findMax(int posisi){
       int i;
        if(data[posisi]!=' '){
           i=posisi;  
           while (data[2*i+1]!=' ') i=2*i+1;
           return i;
        } else return 0;  
    }
    public int findMaxKiri(int posisi){
       int i;
        if(data[posisi]!=' ' && data[2*posisi]!=' '){
           i=2*posisi;  
           while (data[2*i+1]!=' ') i=2*i+1;
           return i;
        } else return 0;  
    }
    public void removeRoot(int posisi){
       int i;
        if(data[posisi]!=' '){
           i=findMaxKiri(posisi);
           data[posisi]=data[i];
           if(data[2*i]==' ') data[i]=' ';
           else removeRoot(i);
        }  
    }

    public void preOrder(int posisi){
      if (data[posisi]!=' ') {
        System.out.print(data[posisi]+" ");
        preOrder(2*posisi);
        preOrder(2*posisi+1);
      }
    }
    public void inOrder(int posisi){
      if (data[posisi]!=' ') {
        inOrder(2*posisi);
        System.out.print(data[posisi]+" ");
        inOrder(2*posisi+1);
        } 
    }
    public void postOrder(int posisi){
      if (data[posisi]!=' ') {
        postOrder(2*posisi);
        postOrder(2*posisi+1);
        System.out.print(data[posisi]+" ");
      }
    }
    public void levelOrder(int posisi){
      for (int i=1;i<=index;i++)
        if (data[i]!=' ') 
            System.out.print(data[i]+" ");  
    }
 
}
