package function;
import java.util.function.Function;

public class calculateRoot implements Function<Double [],Void> {
    private double root1, root2, det;

    @Override
    public Void apply(Double [] arr ) {

        det = arr[1] * arr[1] - 4.0 * arr[0] * arr[2];
        if (det > 0.0) {
            root1 = (- arr[1] + Math.pow(det, 0.5)) / (2.0 *  arr[0]);
            root2 = (- arr[1] - Math.pow(det, 0.5)) / (2.0 *  arr[0]);
            System.out.println("The roots are " + root1 + " and " + root2);
        }

        else if (det == 0.0) {
            root1 = - arr[1] / (2.0 *  arr[0]);
            System.out.println("The root is " + root1);
        }

        else {
            System.out.println("Roots are not real.");
        }
        return null;

    }

}
