package Exception;

public class ThrowException {


    public void div()throws DivideByZeroException {
        int x = 0,y = 0;
        divs(x ,y);

    }

    public void divs(int x , int y)throws DivideByZeroException {
        int a=0, b =0;
        divsion(a,b);
    }
    public int divsion(int x , int y ) throws DivideByZeroException {
        if(y==0){
            throw new DivideByZeroException("Divisor can't be zero");
        }
        return x/y;
    }
}
