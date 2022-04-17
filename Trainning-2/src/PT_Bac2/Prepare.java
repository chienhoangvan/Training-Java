package PT_Bac2;

public class Prepare {
    private double a, b, c;
    public double delta, r1, r2;

    public Prepare() {
    }

    public Prepare(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getterA() {
        return a;
    }
    public double getterB() {
        return b;
    }
    public double getterC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }
    public void setC(double c) {
        this.c = c;
    }

    //Lay ra gia tri delta
    public double getDelta(double a, double b, double c) {
        return delta = b * b - 4 * a * c;
    }

    //Lay ra nghiem thu nhat
    public double getRoot1(double a, double b, double delta) {
        double tmp = Math.pow(delta, 0.5);
        return r1 = (- b + tmp) /(2 * a);
    }

    //Lay ra nghiem thua hai
    public double getRoot2(double a, double b, double delta) {
        double tmp = Math.pow(delta, 0.5);
        return r2 = (- b - tmp) /(2 * a);
    }
}
