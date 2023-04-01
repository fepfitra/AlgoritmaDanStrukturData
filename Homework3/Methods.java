public class Methods {
  static String arrayToString(int[] array) {
    String string = "";
    for (int i = 0; i < array.length; i++) {
      string += array[i] + (i != array.length -1 ? ", " : "");
    }
    return "[" + string + "]";
  }

  static int getRandomNumber() {
    return (int)(Math.random()*100);
  }
  
  static double getAbsoluteValue(double value) {
    return value < 0 ? -value : value;
  }

  static int getFactorial(int n) {
    return n == 1 ? n : n*getFactorial(n-1);
  }

  static String getWatherForecast() {
    String[] day = {
      "today",
      "tomorrow",
      "the day after tomorrow"
    };

    String[] weather = {
      "sunny",
      "cloudy",
      "rainy",
      "snowy"
    };

    return day[getRandomNumber() % 3] + " will be " + weather[getRandomNumber() % 4];
  } 

  static String getRandomMessage(String name) {
    String[] day = {
      "morning",
      "afternoon",
      "night"
    };

    return "Good " + day[getRandomNumber() % 3] + " "+ name;
  }

  static boolean isEvenNumber(int value) {
    return value % 2 == 0;
  }

  static double getMinValue(double a, double b) {
    return a < b ? a : b;
  }

  static boolean isSameAbsoluteValue(double a, double b) {
    return getAbsoluteValue(a) == getAbsoluteValue(b);
  }

  static void getMessage(String name, boolean isKid) {
    String call = isKid ? "Dek" : "Pak";
    System.out.println("Halo " + call + " " + name);
  }

  static double getSum(double a, double b, double c) {
    return a + b + c;
  }

  static double getAverage(double a, double b, double c) {
    return getSum(a, b, c)/3;
  }

  static double getSum(double[] array) {
    double sum = 0;
    for (double item : array) {
      sum += item;
    }
    return sum;
  }

  static double getAverage(double[] array) {
    return getSum(array)/array.length;
  }

  static int getValueOfLastElement(int[] array) {
    return array[array.length - 1];
  }

  static int getMinValue(int[] array) {
    int min = array[0];
    for (int  item : array) {
      min = min < item ? min : item;
    }
    return min;
  }

  static int getMaxValue(int[] array) {
    int max = array[0];
    for (int  item : array) {
      max = max > item ? max : item;
    }
    return max;
  }

  static int[] getMinMaxValue(int[] array) {
    return new int[]{getMinValue(array), getMaxValue(array)};
  }

  static String getLongestString(String[] array) {
    String longestString = "";
    for (String string : array) {
      longestString = longestString.length() > string.length() ? longestString : string;
    }
    return longestString;
  }

  static int[] getInversedArray(int[] array) {
    for (int front = 0; front < array.length/2; front++) {
      int back = array.length - front - 1;
      int temp = array[front];
      array[front] = array[back];
      array[back] = temp;
    }
    return array;
  }

  static void printStudentInfo(Student s) {
    System.out.println("Name\t: " + s.name);
    System.out.println("Age\t: " + s.age);
  }

  static boolean isSameAge(Student s0, Student s1) {
    return s0.age == s1.age;
  }

  static Student getYoungestStudent(Student[] students) {
    Student youngest = students[0];
    for (Student student : students) {
      youngest = youngest.age < student.age ? youngest : student; 
    }
    return youngest;
  }

  static double getRectangleArea(Rectangle r) {
    return r.width * r.height;
  }

  static Rectangle getSquare(double d) {
    return new Rectangle(d, d);
  }

  public static void main(String[] args) {
    System.out.println("Method without array");
    System.out.println("getRandomNumber\t\t: "  + getRandomNumber());
    System.out.println("getAbsoluteValue\t: "   + getAbsoluteValue(-15.5));
    System.out.println("getAbsoluteValue\t: "   + getAbsoluteValue(15.5));
    System.out.println("getFactorial\t\t: "     + getFactorial(5));
    System.out.println("getWeatherForecast\t: " + getWatherForecast());
    System.out.println("getRandomMessage\t: "   + getRandomMessage("Yanto Kopling"));
    System.out.println("isEvenNumber\t\t: "     + isEvenNumber(19));
    System.out.println("isEvenNumber\t\t: "     + isEvenNumber(18));
    System.out.println("getMinValue\t\t: "      + getMinValue(17, 18));
    System.out.println("isSameAbsoluteValue\t: "+ isSameAbsoluteValue(17, 17));
    System.out.println("isSameAbsoluteValue\t: "+ isSameAbsoluteValue(-17, 17));
    System.out.println("isSameAbsoluteValue\t: "+ isSameAbsoluteValue(17, 18));
    System.out.println("isSameAbsoluteValue\t: "+ isSameAbsoluteValue(-17, 18));
    System.out.print  ("getMessage\t\t: ");       getMessage("Alul", true);
    System.out.print  ("getMessage\t\t: ");       getMessage("Yanto", false);
    System.out.println("getSum\t\t\t: "         + getSum(17, 88, 95.8));
    System.out.println("getAverage\t\t: "       + getAverage(17, 88, 99));
    System.out.println();

    System.out.println("method with array");
    System.out.println("getSum\t\t\t: "             + getSum(new double[]{14, 15.6, 77}));
    System.out.println("getAverage\t\t: "           + getAverage(new double[]{14, 15.6, 77}));
    System.out.println("getValueOfLastElement\t: "  + getValueOfLastElement(new int[]{14, 15, 16}));
    System.out.println("getMinValue\t\t: "          + getMinValue(new int[]{19, 14, 15}));
    System.out.println("getMaxValue\t\t: "          + getMaxValue(new int[]{19, 14, 15}));
    System.out.println("getMinMaxValue\t\t: "       + arrayToString(getMinMaxValue(new int[]{19, 14, 15})));

    System.out.println("getLongestString\t: "       + getLongestString(new String[] {
      "aaaaaaaaaaaaa",
      "bbbbbbbbbbbbbbbbbbb",
      "lorem ipsum dolor sit amet"
    }));
    
    System.out.println("getInversedArray\t: "       + arrayToString(getInversedArray(new int[]{15, 26, 17})));
    System.out.println();

    System.out.println("method with custom type");
    System.out.println();
    printStudentInfo(new Student("Yanto Kopling", 19));
    System.out.println();

    System.out.println("isSameAge\t: " + isSameAge(
      new Student("Yanto Kopling", 19),
      new Student("Dadang Shockbreaker", 19)
    ));
    System.out.println();

    System.out.println("getYoungestStudent : ");
    printStudentInfo(getYoungestStudent(new Student[]{
      new Student("Yanto Kopling", 19),
      new Student("Dadang Shockbreaker", 19),
      new Student("Lord Alul", 17)
    }));
    System.out.println();

    System.out.println("getRectangleArea\t: " + getRectangleArea(new Rectangle(5.5, 6.6)));
    System.out.println();

    Rectangle square = getSquare(6.6);
    System.out.println(
      "getSquare:" +
      "\nwidth = " + square.width +
      "\nheight = " + square.height
    );
  }
}
