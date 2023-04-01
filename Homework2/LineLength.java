public class LineLength {
  public static void main(String[] args) {
    Line line = new Line(
      new Point(5, 4),
      new Point(13, 9)
    );

    double d = line.getLength();

    System.out.println("the length of the line is " + d);
  }
}
