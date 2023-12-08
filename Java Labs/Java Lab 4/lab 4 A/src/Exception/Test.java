package Exception;

public class Test {
    public static void divide(int x , int y){
        ThrowException thr = new ThrowException();
        try{
            int result = thr.divsion(x,y);
            System.out.println(result);
        }catch(DivideByZeroException ex){
            System.out.println(ex.getMessage());
        }finally {
            System.out.println("from finally");
            System.out.println("----------------------");
        }
    }
}
