public class Line {
  Point p0, p1;

  Line( Point p0, Point p1) {
    this.p0 = p0;
    this.p1 = p1;
  }

  double getLength() {
    int x = this.p0.x - this.p1.x;
    int y = this.p0.y - this.p1.y;

    return Math.sqrt(x*x + y*y);
  }
}
