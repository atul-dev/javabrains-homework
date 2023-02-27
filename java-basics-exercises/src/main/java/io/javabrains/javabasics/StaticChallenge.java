package io.javabrains.javabasics;

/*
Create a class `Rectangle` with the following attributes: `width`, `height`, and a static variable `numOfRectangles` which will keep track of the number of rectangles created.

1.  Create a constructor that takes the width and height as arguments and sets the values of the `width` and `height` instance variables.
2.  Create a method `getArea` that calculates and returns the area of the rectangle.
3.  Create a method `getPerimeter` that calculates and returns the perimeter of the rectangle.
4.  Create a method `getNumOfRectangles` that returns the value of the `numOfRectangles` static variable.
5.  In this main method, create several `Rectangle` objects, calculate and print their area and perimeter, and finally print the number of rectangles created without keeping count in this class.
 */

public class StaticChallenge {

    public static void main(String[] args) {
         Rectangle r1 = new Rectangle(10,20);
        Rectangle r2 = new Rectangle(15,25);
        Rectangle r3 = new Rectangle(50,60);

        System.out.println("r1 area= "+r1.getArea()+"  perimeter= "+r1.getPerimeter()+" r2 area= "+r2.getArea()+" r2 perimeter= "+r2.getPerimeter()+" r3 area= "+ r3.getArea()+" r3 perimeter= "+r3.getPerimeter());
        System.out.println("num of rectangles= "+Rectangle.numOfRectangles);
    }
}
class Rectangle {
    int width,height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        numOfRectangles++;
    }

    public static int numOfRectangles=0;





    public int getArea(){
        return width*height;
    }
    public int getPerimeter(){
        return 2*(width+height);
    }
    public int getNumOfRectangles(){
        return numOfRectangles;
    }
}





