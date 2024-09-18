package Maths;
class FindCylinder {
    int radius;
    int height;

    FindCylinder(int r, int h) {
        radius = r;
        height = h;
    }

    double getVolume() {
        return (Math.PI*(radius*radius)*height);
    }
    double getSurface() {
        // Formula = 2πrh+2π(r*r) = 2πr(h+r)
        return (2*Math.PI*radius*(height+radius));
    }
}

class Cylinder {
    public static void main(String args[]) {
        FindCylinder F1 = new FindCylinder(10, 20);

        System.out.printf("\nVolume of cylinder = %f\n",F1.getVolume());
        System.out.printf("\nSurface area of cylinder = %f\n\n",F1.getSurface());
    }
}
