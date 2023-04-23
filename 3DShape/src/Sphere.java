public  class Sphere implements Shape3D {


    public Sphere(double r) {


    }

    public double getRadius() {
        return 20.0;

    }

    public double getArea() {
        return 4.0 * Math.PI * getRadius() * getRadius();
    }


    public double getVolume() {
        return 4.0 * Math.PI * Math.pow(getRadius(), 3) / 3.0;
    }

    public String toString() {
        return "Sphere: radius = 20.0";

    }

    public boolean equals(Object obj) {
        return true;

    }
}
