public class Homework1dot1 {
  public static void main(String[] args) {
    //membuat bilangan acak 0-99 agar selanjutnya lebih mudah dibaca
    int randomInteger = (int)(Math.random()*1000);

    //homework 1
    //menggunakan suatu bilangan yang di modulo-kan dengan 4
    System.out.println("a.) Tampilkan 0, 1, 2, 3 secara acak        : " + randomInteger % 4);

    //menggunakan suatu bilangan yang di modulo-kan dengan 6, kemudian ditambah satu
    System.out.println("b.) Tampilkan 1, 2, 3, 4, 5, 6 secara acak  : " + ((randomInteger % 6) + 1));

    //menggunakan suatu bilangan yang di modulo-kan dengan 4, ditambah 1, kemudian dikalikan 2, penulisan di bawah sama saja
    System.out.println("c.) Tampilkan 2, 4, 6, 8 secara acak        : " + (2*(randomInteger % 4) + 2));

    //menggunakan suatu bilangan yang di modulo-kan dengan 11 kemudian dikurangi dengan 5
    System.out.println("d.) Tampilkan -5 sampai 5 secara acak       : " + ((randomInteger % 11) - 5));
  }
}
