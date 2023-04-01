public class Book {
  String judul, penulis;
  int harga, hargaTotal;

  Book(String judul, String penulis, int harga) {
    this.judul    = judul;
    this.penulis  = penulis;
    this.harga    = harga;
    this.hargaTotal = (int)(harga * 1.1);
  }
  
  void getInfo() {
    System.out.println(
      "Judul Buku\t:"   + this.judul    + "\n" +
      "Penulis\t\t:"      + this.penulis  + "\n" +
      "Harga total\t:"  + this.hargaTotal
    );
  }
}
