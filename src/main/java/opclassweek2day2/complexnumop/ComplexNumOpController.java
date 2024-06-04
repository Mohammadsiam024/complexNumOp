package opclassweek2day2.complexnumop;

public class ComplexNumOpController {
    int real,img;

    public ComplexNumOpController(int real, int img) {
        this.real = real;
        this.img = img;
    }

    public ComplexNumOpController() {
        this.real=0;
        this.img=0;
    }
    public ComplexNumOpController add(ComplexNumOpController c){
        ComplexNumOpController temp = new ComplexNumOpController();
        temp.real = this.real + c.real;
        temp.img = this.img + c.img;
        return temp;

    }
    public ComplexNumOpController subtract(ComplexNumOpController c){
        ComplexNumOpController temp = new ComplexNumOpController();
        temp.real = this.real - c.real;
        temp.img = this.img - c.img;
        return temp;

    }
    @Override
    public String toString() {
        return real+"+"+ img + "i";
    }
}
//gg
