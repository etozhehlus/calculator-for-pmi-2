package My;

import java.util.function.ToDoubleFunction;

public class MyClass {

    public static double calcIntegral(double a, double b, ToDoubleFunction<Double> function, double delta) {
        double result = 0;
        for (double pred = a; pred < b; pred = pred + delta) {
            result += function.applyAsDouble(pred);
        }
        return result * delta;
    }

}