
package coba1;

class Covid{
    int ODP,PDP,Positif;
    public Covid(){
        ODP=PDP=Positif=0;
    }
    void updateData(int a,int b,int c){
      ODP+=a;PDP+=b;Positif+=c;  
    }
    void tampilData(int k){
        System.out.println("ODP="+ODP); 
        System.out.println("PDP="+PDP); 
        System.out.println("Positif="+Positif); 
    }
}

public class Coba1 {
    public static void main(String[] args) {
        Covid Bantul=new Covid();
        Bantul.updateData(2, 7, 1);
        Bantul.tampilData(2);
       System.out.println(); 
    }
    
}
