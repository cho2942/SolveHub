package org.example.programmers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordTransformationTest {

    WordTransformation wordTransformation = new WordTransformation();

    @Test
    void wordTransformation() {
        Assertions.assertThat(wordTransformation.solution("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log", "cog"})).isEqualTo(4);
    }
}