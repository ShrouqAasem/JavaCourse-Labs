import Pgk1.Complex;
import Pgk1.DoubleComplex;

public class Main {
    public static void main(String[] args) {
//        BigDecimal real1 = new BigDecimal(10);
//        BigDecimal real2 = new BigDecimal(2);
//
//        BigDecimal img1 = new BigDecimal(3);
//        BigDecimal img2 = new BigDecimal(4);
//
//        ComplexNum<BigDecimal> complex1 = new ComplexNum<>(real1,img1);
//        ComplexNum<BigDecimal> complex2 = new ComplexNum<>(real2,img2);
//
//        ComplexNum<BigDecimal> result1 = complex1.addComplex(complex2);
//        ComplexNum<BigDecimal> result2 = complex1.subtractComplex(complex2);
//        ComplexNum<BigDecimal> result3 = complex1.multiComplex(complex2);
//        ComplexNum<BigDecimal> result4 = complex1.divComplex(complex2);
//
//        System.out.println("Add = Real(" + result1.getReal() + ") + Img(" + result1.getImg() + ")");
//        System.out.println("Sub = Real(" + result2.getReal() + ") - Img(" + result2.getImg() + ")");
//        System.out.println("Multi = Real(" + result3.getReal() + ") * Img(" + result3.getImg() + ")");
//        System.out.println("Div = Real(" + result4.getReal() + ") / Img(" + result4.getImg() + ")");


//        DoubleComplex complex1 = new DoubleComplex();
//        DoubleComplex complex2 = new DoubleComplex();
//
//        complex1.setReal(24);
//        complex1.setImaginary(2);
//
//        complex2.setReal(3);
//        complex2.setImaginary(4);
//
//
//        DoubleComplex result1 = (DoubleComplex) complex1.add(complex2);
//        DoubleComplex result2 = (DoubleComplex) complex1.substract(complex2);
//
//
//        result1.printComplex();
//        result2.printComplex();

        DoubleComplex com1 = new DoubleComplex();
        com1.setReal(3.1);
        com1.setImaginary(2.2);

        DoubleComplex com2 = new DoubleComplex();
        com2.setReal(4.1);
        com2.setImaginary(5.2);

        DoubleComplex result1 ;
        DoubleComplex result2 ;
        Complex<Double> result3 ;
        DoubleComplex result4 ;


        result1  = (DoubleComplex) com1.add(com2);
        System.out.println(result1.getReal());
        System.out.println(result1.getImaginary());
        result1.printComplex();

        result2  = (DoubleComplex) com1.subtract(com2);
        result3 = (DoubleComplex) com1.product(com2);
        result4 = (DoubleComplex) com1.div(com2);


        result2.printComplex();
        result3.printComplex();
        result4.printComplex();




    }
}