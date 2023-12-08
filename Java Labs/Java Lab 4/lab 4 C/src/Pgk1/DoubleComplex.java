package Pgk1;

public class DoubleComplex implements Complex<Double> {

    private Double real;
    private Double img;

    public DoubleComplex()
    {
        real= img =0.0;
    }

    public void setReal(double real) {
        this.real=real;
    }
    public void setImaginary(double img) {
        this.img =img;
    }
    @Override
    public Double getReal() {
        return real;
    }

    @Override
    public Double getImaginary() {
        return img;
    }

    @Override
    public Complex<Double> add(Complex<Double> z) {
        DoubleComplex obj = new DoubleComplex();
        obj.real =this.real + z.getReal();
        obj.img = this.img + z.getImaginary();
        return obj;
    }

    @Override
    public Complex<Double> subtract(Complex<Double> z) {
        DoubleComplex obj = new DoubleComplex();
        obj.real =this.real - z.getReal();
        obj.img = this.img - z.getImaginary();
        return obj;
    }

    @Override
    public Complex<Double> product(Complex<Double> z) {
        DoubleComplex obj = new DoubleComplex();
        obj.real =this.real * z.getReal();
        obj.img = this.img * z.getImaginary();
        return obj;
    }

    @Override
    public Complex<Double> div(Complex<Double> z) {
        DoubleComplex obj = new DoubleComplex();
        obj.real =this.real / z.getReal();
        obj.img = this.img / z.getImaginary();
        return obj;
    }

    @Override
    public void printComplex() {
        System.out.println("the Real num is : " + real );
        System.out.println("the Real num is : " + img);
    }
}