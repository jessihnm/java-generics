package jessica;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void sum() {
        Calculator<Integer> calc = new Calculator<>();

        Integer result = calc.sum(2,5);
        assertThat(result, is(7));
    }
}