package jessica;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void sumInteger() {
        Calculator<Integer> calc = new Calculator<>();

        Integer result = calc.sum(2,5);
        assertThat(result, is(7));
    }


    @org.junit.jupiter.api.Test
    void sumDouble() {
        Calculator<Double> calc = new Calculator<>();

        Double result = calc.sum(2.4,5.5);
        assertThat(result, is(7.9));
    }
    @org.junit.jupiter.api.Test
    void sumFloat() {
        Calculator<Float> calc = new Calculator<>();

        Float result = calc.sum(2f,5f);
        assertThat(result, is(7f));
    }
}