package OOPS.Introduction;

import org.w3c.dom.css.Rect;
//Class is a blueprint or template for creating the objects
//Object is a instance, where the actual details of the class contain
class Rectangle{
    public int length;
    public int breadth;

    public int area(){
        return this.length*this.breadth;
    }

    public int perimeter(){
        return 2*(this.length+this.breadth);

    }
}
public class ClassAndObject {
    public static void main(String[] args) {

        Rectangle r=new Rectangle();
        r.length=10;
        r.breadth=20;
        System.out.println(r.area());
        System.out.println(r.perimeter());
    }
}
