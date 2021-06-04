package My;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyClassTest{

    @Test
    public void calcIntegral() {
        assertEquals( 1000.0 / 3.0, MyClass.calcIntegral(0, 10, x -> x * x, 1e-4), 1e-2);
        assertEquals( 50.0, MyClass.calcIntegral(0, 10, x -> x , 1e-4), 1e-2);
        assertEquals( 0.0, MyClass.calcIntegral(-10, 10, x -> x, 1e-4),1e-2);
        assertEquals( 2200.0, MyClass.calcIntegral(-10, 10, x -> 3 * x * x - 5 * x + 10, 1e-5),1e-2);
        assertEquals( 0, MyClass.calcIntegral(-Math.PI, Math.PI, Math::sin, 1e-5),1e-2);
        assertEquals( 60, MyClass.calcIntegral(-10, 10, x -> 3, 1e-5),1e-2);
        assertEquals( -1.08, MyClass.calcIntegral(-10, 10, Math::cos, 1e-6),1e-2);
        assertEquals( 20, MyClass.calcIntegral(-10, 10, x -> Math.sin(x) * Math.sin(x) + Math.cos(x) * Math.cos(x), 1e-4),1e-2);
    }
}