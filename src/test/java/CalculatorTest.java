import org.junit.jupiter.api.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class CalculatorTest {

    @Test
    public void plus() {
        Calculator calc = new Calculator();
        int x = 4;
        int y = 2;
        int result = calc.plus.apply(x, y);

        assertThat(result, equalTo(6));
        assertThat(result, greaterThan(5));
    }

    @Test
    public void minus() {
        Calculator calc = new Calculator();
        int x = 4;
        int y = 2;
        int result = calc.minus.apply(x, y);

        assertThat(result, equalTo(2));
    }

    @Test
    public void devide() {
        Calculator calc = new Calculator();
        int x = 4;
        int y = 2;
        int result = calc.devide.apply(x, y);

        assertThat(result, equalTo(2));
    }

    @Test
    public void devideZero() {
        Calculator calc = new Calculator();
        int x = 4;
        int y = 0;
        int result = calc.devide.apply(x, y);

        assertThat(result, equalTo(0));
    }

    @Test
    public void multiply() {
        Calculator calc = new Calculator();
        int x = 4;
        int y = 8;
        int result = calc.multiply.apply(x, y);

        assertThat(result, equalTo(32));
    }
}