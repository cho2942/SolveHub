package org.example.string;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    ValidAnagram validAnagram = new ValidAnagram();

    @Test
    void isAnagram() {

        assertThat(validAnagram.isAnagram("anagram", "nagaram")).isEqualTo(true);
        assertThat(validAnagram.isAnagram("rat", "car")).isEqualTo(false);
    }
}