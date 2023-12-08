package Pgk1;

import java.math.BigDecimal;

public class ComplexNum<T extends BigDecimal>{

    private T real;
    private T img;

    public ComplexNum(T real, T img) {
        this.real = real;
        this.img = img;
    }

    public T getReal() {
        return real;
    }

    public T getImg() {
        return img;
    }

    public ComplexNum<T> addComplex(ComplexNum<T> number) {
        return new ComplexNum<T>((T) this.real.add(number.real),
                (T) this.img.add(number.img));
    }
    public ComplexNum<T> subtractComplex(ComplexNum<T> number) {
        return new ComplexNum<T>((T) this.real.subtract(number.real),
                (T) this.img.subtract(number.img));
    }

    public ComplexNum<T> divComplex(ComplexNum<T> number) {
        return new ComplexNum<T>((T) this.real.divide(number.real),
                (T) this.img.divide(number.img));
    }

    public ComplexNum<T> multiComplex(ComplexNum<T> number) {
        return new ComplexNum<T>((T) this.real.multiply(number.real),
                (T) this.img.multiply(number.img));
    }
}
