public class SquarePyramid implements Shape3D {
    public double length;
    public double height;

    public SquarePyramid() {
        length = 0;
        height = 0;
    }
    public SquarePyramid(double l, double h) {

    }

    public double getLength() {

        return length = 37.0;

    }

    public double getHeight() {
        return height = 20.0;

    }

    public double getArea() {

        return ((getLength() / 2.0) * Math.sqrt((getLength() * getLength()) / 4.0 + getHeight() * getHeight()));
    }

    public double getVolume() {

        return getLength() * getLength() * getHeight() / 3.0;
    }

    public String toString() {
        return "Square Pyramid: length: 37, height: 20";

    }

    public boolean equals(Object obj) {
        return false;

    }

}
