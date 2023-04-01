public class TestRectangle { 
  public static void main(String[] args) { 
    Rectangle[] rects = new Rectangle[10]; 
  
    int indexWithHighestArea = 0; 
  
    for (int i = 0; i < rects.length; i++) { 
      rects[i] = new Rectangle( 
        Math.random(), 
        Math.random() 
      ); 
  
      indexWithHighestArea = rects[i].getArea() > rects[indexWithHighestArea].getArea() ? i : indexWithHighestArea; 
    } 
  
  System.out.println("The highest area is rect" + indexWithHighestArea); 
  rects[indexWithHighestArea].printInfo(); 
  } 
} 
