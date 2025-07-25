package org.example.programmers.kit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateBigNumberTest {

    CreateBigNumber createBigNumber = new CreateBigNumber();

    @Test
    void solution() {
        Assertions.assertThat(createBigNumber.solution("1924", 2)).isEqualTo("94");
        Assertions.assertThat(createBigNumber.solution("4177252841", 4)).isEqualTo("775841");
    }
}