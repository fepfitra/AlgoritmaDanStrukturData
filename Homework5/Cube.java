public class Cube extends Rectangle {
  double height;
  double z0;

  Cube(double width, double length, double height) {
    super(width, length);
    this.height = height;
  }

  Cube(double size) {
    super(size);
    this.height = size;
  }

  public double getArea() {
      return 2*(height*width + width*length + length*height);
  }

  public double getVolume() {
    return height*width*length;
  }

  public boolean isLaregerThan(Cube c) {
    return getVolume()>c.getVolume();
  }

  public boolean isIntersectWith(Cube c) {
    double x1 = this.x0;
    double y1 = this.y0;
    double z1 = this.z0;
    double x2 = this.x0 + this.width;
    double y2 = this.y0 + this.height;
    double z2 = this.z0 + this.length;

    double x3 = c.x0;
    double y3 = c.y0;
    double z3 = c.z0;
    double x4 = c.x0 + c.width;
    double y4 = c.y0 + c.height;
    double z4 = c.z0 + c.length;

    // Check if any corner of this cube is inside c
    if ((x1 >= x3 && x1 <= x4 && y1 >= y3 && y1 <= y4 && z1 >= z3 && z1 <= z4) ||
        (x2 >= x3 && x2 <= x4 && y1 >= y3 && y1 <= y4 && z1 >= z3 && z1 <= z4) ||
        (x1 >= x3 && x1 <= x4 && y2 >= y3 && y2 <= y4 && z1 >= z3 && z1 <= z4) ||
        (x2 >= x3 && x2 <= x4 && y2 >= y3 && y2 <= y4 && z1 >= z3 && z1 <= z4) ||
        (x1 >= x3 && x1 <= x4 && y1 >= y3 && y1 <= y4 && z2 >= z3 && z2 <= z4) ||
        (x2 >= x3 && x2 <= x4 && y1 >= y3 && y1 <= y4 && z2 >= z3 && z2 <= z4) ||
        (x1 >= x3 && x1 <= x4 && y2 >= y3 && y2 <= y4 && z2 >= z3 && z2 <= z4) ||
        (x2 >= x3 && x2 <= x4 && y2 >= y3 && y2 <= y4 && z2 >= z3 && z2 <= z4)) {
      return true;
    }

    // Check if any corner of c is inside this cube
    if ((x3 >= x1 && x3 <= x2 && y3 >= y1 && y3 <= y2 && z3 >= z1 && z3 <= z2) ||
        (x4 >= x1 && x4 <= x2 && y3 >= y1 && y3 <= y2 && z3 >= z1 && z3 <= z2) ||
        (x3 >= x1 && x3 <= x2 && y4 >= y1 && y4 <= y2 && z3 >= z1 && z3 <= z2) ||
        (x4 >= x1 && x4 <= x2 && y4 >= y1 && y4 <= y2 && z3 >= z1 && z3 <= z2) ||
        (x3 >= x1 && x3 <= x2 && y3 >= y1 && y3 <= y2 && z4 >= z1 && z4 <= z2) ||
        (x4 >= x1 && x4 <= x2 && y3 >= y1 && y3 <= y2 && z4 >= z1 && z4 <= z2) ||
        (x3 >= x1 && x3 <= x2 && y4 >= y1 && y4 <= y2 && z4 >= z1 && z4 <= z2) ||
        (x4 >= x1 && x4 <= x2 && y4 >= y1 && y4 <= y2 && z4 >= z1 && z4 <= z2)) {
      return true;
    }
    return false;
  }
}
