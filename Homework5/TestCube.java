public class TestCube {
    public static void main(String[] args) {
        Cube cube1 = new Cube(3);
        Cube cube2 = new Cube(2);
        
        System.out.println("Cube 1 volume: " + cube1.getVolume());
        System.out.println("Cube 2 volume: " + cube2.getVolume());
        System.out.println("Is cube 1 larger than cube 2? " + cube1.isLargerThan(cube2));
        
        Cube cube3 = new Cube(4, 4, 4);
        Cube cube4 = new Cube(3, 3, 3);
        
        System.out.println("Cube 3 volume: " + cube3.getVolume());
        System.out.println("Cube 4 volume: " + cube4.getVolume());
        System.out.println("Is cube 3 larger than cube 4? " + cube3.isLargerThan(cube4));
        System.out.println("Do cube 3 and cube 4 intersect? " + cube3.isIntersectWith(cube4));
        
        Cube cube5 = new Cube(1, 1, 1);
        Cube cube6 = new Cube(2, 2, 2);
        
        System.out.println("Cube 5 volume: " + cube5.getVolume());
        System.out.println("Cube 6 volume: " + cube6.getVolume());
        System.out.println("Is cube 5 larger than cube 6? " + cube5.isLargerThan(cube6));
        System.out.println("Do cube 5 and cube 6 intersect? " + cube5.isIntersectWith(cube6));
    }
}
