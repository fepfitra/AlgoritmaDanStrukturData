public class TestRectangle {
  public static void main(String[] args) {
    // Create two rectangles
    Rectangle r1 = new Rectangle(5, 10);
    Rectangle r2 = new Rectangle(7, 8);

    // Test isLargerThan method
    if (r1.isLargerThan(r2)) {
      System.out.println("Rectangle r1 is larger than rectangle r2");
    } else {
      System.out.println("Rectangle r2 is larger than rectangle r1");
    }

    // Test isIntersectWith method
    Rectangle r3 = new Rectangle(6, 7);
    if (r1.isIntersectWith(r3)) {
      System.out.println("Rectangle r1 intersects with rectangle r3");
    } else {
      System.out.println("Rectangle r1 does not intersect with rectangle r3");
    }
  }
}
