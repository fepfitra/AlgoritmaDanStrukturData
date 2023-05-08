package urutkanstring;
public class UrutkanString {
    public static void sort(String[] nama){
        String temp;
        for (int i=0; i<(nama.length-1); i++)
          for (int j=i+1; j<(nama.length); j++)
             if (nama[i].compareTo(nama[j])>0){
                temp=nama[i];
                nama[i]=nama[j];
                nama[j]=temp;    
            }
        
    }
  public static int merge(String[] A, String[] B, String[] C){
    // String[] C=new String[A.length+B.length];
      int i=0,j=0,k=0,l;
  do {
    if(A[i].compareTo(B[j])<0) {
        C[k]=A[i];i++;}
    else  if(A[i].compareTo(B[j])>0){C[k]=B[j];j++;}
         else {C[k]=A[i];i++;j++;}
    k++;}
  while ((i<A.length) && (j< B.length));
  if (i>=A.length) for (l=j;l<B.length;l++) {C[k]=B[l];k++;}
  else for (l=i;l<A.length;l++) {C[k]=A[l];k++;}
  return k;
 }

    
    public static void main(String[] args) {
        String[] nama1={"Mangga","Anggur","Apel","Jeruk","Nanas","Pepaya","Durian"};
        String[] nama2={"Melon","Kesemek","Sirsat","Nanas","Salak","Apel"};
        String[] hasil=new String[100];
        int i,j,n;
        sort(nama1);
        for (i=0; i<nama1.length; i++)
            System.out.print(nama1[i]+" ");
        System.out.println();
        sort(nama2);
        for (i=0; i<nama2.length; i++){
          System.out.print(nama2[i]+" ");
        }
        System.out.println();
        n=merge(nama1,nama2,hasil);
        for (i=0; i<n; i++){
          System.out.print(hasil[i]+" ");
        }

    }
    
}
