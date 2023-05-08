
package arrayobjek;

public class ArrayObjek {

    public static void main(String[] args) {
        int maxSize = 20; // array size
        DataArray arr; // reference to array
        arr = new DataArray(maxSize); // create the array
        // insert 10 items
        Dlist dl=new Dlist();
        arr.insertD(dl,"Evans", "Patty", 24);
        arr.insertD(dl,"Smith", "Lorraine", 37);
        arr.insertD(dl,"Yee", "Tom", 43);
        arr.insertD(dl,"Adams", "Henry", 63);
        arr.insertD(dl,"Hashimoto", "Sato", 21);
        arr.insertD(dl,"Stimson", "Henry", 29);
        arr.insertD(dl,"Velasquez", "Jose", 72);
        arr.insertD(dl,"Lamarque", "Henry", 54);
        arr.insertD(dl,"Vang", "Minh", 22);
        arr.insertD(dl,"Creswell", "Lucinda", 18);
        dl.printNode();
        arr.copyToArray(dl);
        arr.displayA(); // display items
       String searchKey = "stimson"; // search for item
        Person found=arr.find(searchKey);
        if(found != null)
        {
            System.out.print("Found ");
            found.displayPerson();
        }
        else
            System.out.println("Can’t find " + searchKey);
     //   System.out.println("Deleting Smith, Yee, and Creswell");
     //   arr.delete("Smith"); // delete 3 items
       // arr.delete("Yee");
       // arr.delete("Creswell");
      //  arr.displayA(); 
    }
    
}
