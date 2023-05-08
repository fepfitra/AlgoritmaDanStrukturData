package pheap;
public class Heap {
   // int index=0;
    int max_data = 100000000;
    public int[] data = new int[max_data];
    public Heap(){
      for(int i=0;i<max_data;i++) data[i] =0;  
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
    public void tukar(int i, int j){
        int t=data[i];
        data[i]=data[j];
        data[j]=t; 
        }
    
    public void removeMax(int n)
     {int x,i;
        data[0]=data[n-1];data[n-1]=0;
        x=0;
        while ((x<n-1) && (data[x]<data[2*x+1]||data[x]<data[2*x+2])){
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
     
    public void maxheap(int i,int n){
     int left,right,largest;      
        left=2*i+1;
        right=2*i+2;
        if(left <n && data[left] > data[i]) largest=left; else largest=i;
        if(right <n && data[right] > data[largest]) largest=right;
        if(largest!=i){
            tukar(i,largest);
            maxheap(largest,n);
        }
     
    }    
   
   public void minheap(int i,int n){
     int left,right,largest;
        left=2*i+1;
        right=2*i+2;
        if(left < n && data[left] < data[i]) largest=left; else largest=i;
        if(right < n && data[right] < data[largest]) largest=right;
        if(largest!=i){
            tukar(i,largest);
            minheap(largest,n);
        }
    }
    
    public void cetak(int n){
        System.out.println();
        for(int i=0;i<n;i++) {
          System.out.print(data[i]+" ");
          if ((i+1)%20==0) System.out.println();
      }   
        System.out.println();
    }

}
