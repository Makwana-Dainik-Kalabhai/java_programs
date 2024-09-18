package Shape;

public class Rectangle {
    float length, breadth;

    public float getValue() {
        return length*breadth;
    }
    public void setValue(float l, float b) {
        length = l;
        breadth = b;
    }
}

class Circle {
    float radius;
    
    double getValue() {
        return Math.PI*radius*radius;
    }
    void setValue(float r) {
        radius = r;
    }
}

class Cylinder {
    float radius;
    float height;
    
    double getValue() {
        return 2*Math.PI*radius*(radius+height);
    }
    void setValue(float r, float h) {
        radius = r;
        height = h;
    }
}
