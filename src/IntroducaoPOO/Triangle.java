package IntroducaoPOO;

public class Triangle {
    public double a;
    public double b;
    public double c;


    //region Setters
    public void setA(double a){
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }
    //endregion

    //region Getters
    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getArea(){
        double p = (this.a + this.b + this.c)/2;
        double area = Math.sqrt(p * (p-this.a) * (p-this.b) * (p-this.c));
        return area;
    }
    //endregion

}
