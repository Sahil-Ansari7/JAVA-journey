import java.util.*;
public class Basics {
    public static class Student{
        String name;
        int rolNum;
        double percent;
    }
    public static class Car{
        String name;
        int price;
        String color;
    }
    public static void main(String[] args) {
        Student x = new Student();
        x.name = "Akshay Kumar";
        x.rolNum = 5;
        x.percent = 93.98;
        System.out.println(x.name);
        System.out.println(x.rolNum);
        System.out.println(x.percent);
        

        Car c1 = new Car();
        c1.name = "alto";
        c1.price = 498230987;
        c1.color = "Black.";

        System.out.println(c1.color);
        System.out.println(c1.name);
        System.out.println(c1.price);



    }
}
