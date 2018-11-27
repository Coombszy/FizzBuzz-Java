import org.junit.Test;
import org.junit.Before;
import org.junit.Rule;
import static org.junit.Assert.assertEquals;

public class JunitFizzBuzz {
    protected FizzBuzz testFB;

    @Before
    public void setUp() {
        testFB = new FizzBuzz();
    }

    @Test
    public void convertTest1EQ_1() {
        String converted = testFB.convert(1);
        assertEquals("1",converted);
    }
    @Test
    public void convertTest2_EQ_2() {
        String converted = testFB.convert(2);
        assertEquals("2",converted);
    }
    @Test
    public void convertTest3_EQ_FIZZ() {
        String converted = testFB.convert(3);
        assertEquals("Fizz",converted);
    }
    @Test
    public void convertTest5_EQ_BUZZ() {
        String converted = testFB.convert(5);
        assertEquals("Buzz",converted);
    }
    @Test
    public void convertTest15_EQ_FIZZBUZZ() {
        String converted = testFB.convert(15);
        assertEquals("FizzBuzz",converted);
    }
    @Test
    public void countToXTest(){
        testFB.countToX(5);
        assertEquals("1\n2\nFizz\n5\n", );
    }

}
