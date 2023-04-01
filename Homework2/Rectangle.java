public class Rectangle {
  double width, height;

  Rectangle (double width, double height) {
    this.width  = width;
    this.height = height;
  }
  
  void printInfo() {
    System.out.println("width\t : " + this.width);
    System.out.println("height\t : " + this.height);
    System.out.println("area\t : " + this.getArea());
  }

  double getArea() {
    return this.height * this.width;
  }
}
