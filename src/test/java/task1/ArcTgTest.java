package task1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArcTgTest {
    double accurate = 0.001;

    @ParameterizedTest
    @ValueSource(doubles = {-1, -0.9, -0.6, 0.6, 0.9, 1})
    void checkInArea(double x){
        assertAll(
                () -> assertEquals(Math.atan(x), ArcTg.arctg(x), accurate)
        );
    }

    @Test
    void checkZero(){
        assertEquals(0, ArcTg.arctg(0), accurate);
    }

    @ParameterizedTest
    @ValueSource(doubles = {-10000, -10, -1.00000001, 1.0000001, 10, 10000})
    void checkNotInArea(double x){
        assertAll(
                () -> assertEquals(Double.NaN, ArcTg.arctg(x))
        );
    }
}
