package pheap;
public class Heap {
    private int nElemen;
    private int[] data; 
    public Heap(int n){
      data = new int[n];nElemen=n;
      for(int i=0;i<nElemen;i++) data[i] =0;  
    }
    public void insert(int input,int i){
        if(i==0) {data[0]=input;}
        else {
            data[i]=input;   
            while (i>0 && data[(i-1)/2] < data[i]){
              tukar(i, (i-1)/2);
              i = (i-1)/2;
            }
        }
    }
    public void insert(int[] x){
        data=x;
    }
    public void tukar(int i, int j){
        int t=data[i];
        data[i]=data[j];
        data[j]=t; 
        }
    
    public void removeMax()
     {int x,i;
        data[0]=data[nElemen-1];data[nElemen-1]=0;
        x=0;
        while ((x<nElemen-1) && (data[x]<data[2*x+1]||data[x]<data[2*x+2])){
          i=x;
          if(data[2*x+1]>data[2*x+2]) x=2*x+1;
          else x=2*x+2;
          tukar(i,x);
        }   
    }
    
    public void removeMaxS(int n)
     {int x,j;
        if(data[0]>data[n-1]) tukar(0,n-1);
        x=0;
        while ((x<n/2-1) && (data[x]<data[2*x+1]||data[x]<data[2*x+2])){
          j=x;
          if(data[2*x+1]>data[2*x+2]) x=2*x+1;
          else x=2*x+2;
          tukar(j,x);
        }   
     }
     
    public void maxheap(int i){
     int left,right,largest;      
        left=2*i+1;
        right=2*i+2;
        if(left <nElemen && data[left] > data[i]) largest=left; else largest=i;
        if(right <nElemen && data[right] > data[largest]) largest=right;
        if(largest!=i){
            tukar(i,largest);
            maxheap(largest);
        }
     
    }    
   
   public void minheap(int i){
     int left,right,smallest;
        left=2*i+1;
        right=2*i+2;
        if(left < nElemen && data[left] < data[i])
              smallest=left; else smallest=i;
        if(right < nElemen && data[right] < data[smallest])
               smallest=right;
        if(smallest!=i){
            tukar(i,smallest);
            minheap(smallest);
        }
    }
    
    public void cetak(){
        System.out.println();
        for(int i=0;i<nElemen;i++) {
          System.out.print(data[i]+" ");
          if ((i+1)%20==0) System.out.println();
      }   
        System.out.println();
    }

}
