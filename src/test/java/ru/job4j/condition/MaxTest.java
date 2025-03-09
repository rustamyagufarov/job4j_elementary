package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void when3And6Then6() {
        int result = Max.max(3, 6);
        int excepted = 6;
        assertThat(result).isEqualTo(excepted);
    }

    @Test
    void when3And2And5Then5() {
        int result = Max.max(3, 2, 5);
        int excepted = 5;
        assertThat(result).isEqualTo(excepted);
    }

    @Test
    void when3And6And4And1Then6() {
        int result = Max.max(3, 6, 4, 1);
        int excepted = 6;
        assertThat(result).isEqualTo(excepted);
    }
}