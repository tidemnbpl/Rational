import org.junit.Assert;
import org.junit.Test;

public class RationalTest {
    @Test
    public void testAdd() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.add(y);
        Assert.assertEquals(3, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }

    @Test
    public void testSubtract(){
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 3;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.subtract(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(12, x.denominator);
    }

    @Test
    public void TestMultiply() {
        Rational x = new Rational();
        x.numerator = 2;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 2;
        y.denominator = 5;
        x.multiply(y);
        Assert.assertEquals(2, x.numerator);
        Assert.assertEquals(5, x.denominator);
    }

    @Test
    public void TestDivide() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 5;
        Rational y = new Rational();
        y.numerator = 3;
        y.denominator = 4;
        x.divide(y);
        Assert.assertEquals(4, x.numerator);
        Assert.assertEquals(15, x.denominator);
    }

    @Test
    public void TestEquals() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 5;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 6;
        x.equals(y);
        Assert.assertEquals(false, x.equals(y));
    }

    @Test
    public void TestCompareTo() {
        Rational x = new Rational();
        x.numerator = 10;
        x.denominator = 5;
        Rational y = new Rational();
        y.numerator = 4;
        y.denominator = 8;
        x.compareTo(y);
        Assert.assertEquals(-1, x.compareTo(y));
    }

    @Test
    public void TestToString() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 5;
        Assert.assertEquals(x.numerator+"/"+x.denominator,x.toString());
    }
}