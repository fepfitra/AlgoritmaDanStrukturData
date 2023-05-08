public class Rectangle {
  double width;
  double length;
  double x0;
  double y0;

  Rectangle(double width, double length) {
    this.width = width;
    this.length = length;
  }

  Rectangle(double size) {
    this.width = size;
    this.length = size;
  }

  public double getArea() {
    return width*length;
  }

  public boolean isLargerThan(Rectangle r) {
    return getArea()>r.getArea();
  }

  public boolean isIntersectWith(Rectangle r) {
    double x1 = this.x0;
    double y1 = this.y0;
    double x2 = this.x0 + this.width;
    double y2 = this.y0 + this.length;

    double x3 = r.x0;
    double y3 = r.y0;
    double x4 = r.x0 + r.width;
    double y4 = r.y0 + r.length;

    if ((x1 >= x3 && x1 <= x4 && y1 >= y3 && y1 <= y4) ||
        (x2 >= x3 && x2 <= x4 && y1 >= y3 && y1 <= y4) ||
        (x1 >= x3 && x1 <= x4 && y2 >= y3 && y2 <= y4) ||
        (x2 >= x3 && x2 <= x4 && y2 >= y3 && y2 <= y4)) {
      return true;
    }

    if ((x3 >= x1 && x3 <= x2 && y3 >= y1 && y3 <= y2) ||
        (x4 >= x1 && x4 <= x2 && y3 >= y1 && y3 <= y2) ||
        (x3 >= x1 && x3 <= x2 && y4 >= y1 && y4 <= y2) ||
        (x4 >= x1 && x4 <= x2 && y4 >= y1 && y4 <= y2)) {
      return true;
    }

    if (x1 < x4 && x2 > x3 && y1 < y4 && y2 > y3) {
      return true;
    }

    return false;
  }
}
