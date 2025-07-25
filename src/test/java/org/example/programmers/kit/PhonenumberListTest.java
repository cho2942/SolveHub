package org.example.programmers.kit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PhonenumberListTest {

    PhonenumberList phonenumberList = new PhonenumberList();

    @Test
    void solution() {
        Assertions.assertThat(phonenumberList.solution(new String[]{"123", "456", "789"})).isEqualTo(true);
        Assertions.assertThat(phonenumberList.solution(new String[]{"12","123","1235","567","88"})).isEqualTo(false);
    }
}