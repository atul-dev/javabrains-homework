package io.javabrains.javabasics;

/*
1.  Create a class called `Car` with member variables for the make, model, and year of the car.
2.  Create a constructor method for the `Car` class that initializes the member variables.
3.  Create getter methods for the make, model, and year.
4.  Create a `toString` method that returns a string representation of the car in the form "year make model".
5.  In the `main` method of this class, create a `Car` object with a make, model, and year of your choice.
6.  Use the member variables and methods of the `Car` class to print the make, model, and year of the car.
7.  The expected output of the program is:

```
Make: Toyota
Model: Camry
Year: 2020
Details: 2020 Toyota Camry
```

 */

import java.util.concurrent.Callable;

public class ClassesAndObjects {

    public static void main(String[] args) {
     Car c=new Car("Toyata","Camry",2020);
        System.out.println("Make : " + c.Make);
        System.out.println("Model : " + c.Model);
        System.out.println("Year : " + c.Year);
        System.out.println("Details : " +" "+c.Year+" "+ c.Make+" "+c.Model);

    }
}
class  Car{

    String Make;
    String Model;
    int Year;


    public Car(String make, String model,int year) {

        Make = make;
        Model = model;
        Year = year;
    }

    public String getMake() {
        return Make;
    }

    public String getModel() {
        return Model;
    }

    public int getYear() {
        return Year;
    }

    public void setMake(String make) {
        Make = make;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void setYear(int year) {
        Year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Make='" + Make + '\'' +
                ", Model='" + Model + '\'' +
                ", Year=" + Year +
                '}';
    }
}