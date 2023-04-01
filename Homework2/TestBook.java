public class TestBook {
  public static void main(String[] args) {

    Book[] books = {
      new Book(
        "Introduction to Java Programming and Data Structures", 
        "Daniel Liang",
        344000
      ),

      new Book(
        "Advanced Java Programming", 
        "Uttam Roy", 
        236250
      ),

      new Book(
        "Practival Java Programming",
        "Perry Xiao",
        95000
      )
    };

    for (Book book : books) {
      book.getInfo();
      System.out.println();
    }
  }
}
