package org.example.string;

import org.assertj.core.api.Assertions;
import org.example.string.re.LongestRepeatingCharacterReplacement;
import org.junit.jupiter.api.Test;

class LongestRepeatingCharacterReplacementTest {

    LongestRepeatingCharacterReplacement tester = new LongestRepeatingCharacterReplacement();
    @Test
    void characterReplacement() {
        int answer;
        answer = tester.characterReplacement("ABAB", 2);
        Assertions.assertThat(answer).isEqualTo(4);

        answer = tester.characterReplacement("AABABBA", 1);
        Assertions.assertThat(answer).isEqualTo(4);


        answer = tester.characterReplacement("", 1);
        Assertions.assertThat(answer).isEqualTo(0);
    }
}