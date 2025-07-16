package org.example.kakao;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Npuls1CardGameTest {

    Npuls1CardGame npuls1CardGame = new Npuls1CardGame();

    @Test
    void solution() {
        assertThat(npuls1CardGame.solution(4, new int[]{3, 6, 7, 2, 1, 10, 5, 9, 8, 12, 11, 4})).isEqualTo(5);
        assertThat(npuls1CardGame.solution(3, new int[]{1, 2, 3, 4, 5, 8, 6, 7, 9, 10, 11, 12})).isEqualTo(2);
        assertThat(npuls1CardGame.solution(2, new int[]{5, 8, 1, 2, 9, 4, 12, 11, 3, 10, 6, 7})).isEqualTo(4);
        assertThat(npuls1CardGame.solution(10, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18})).isEqualTo(1);
    }

    //
//coin	cards	result
//4	[3, 6, 7, 2, 1, 10, 5, 9, 8, 12, 11, 4]	5
//        3	[1, 2, 3, 4, 5, 8, 6, 7, 9, 10, 11, 12]	2
//        2	[5, 8, 1, 2, 9, 4, 12, 11, 3, 10, 6, 7]	4
//        10	[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]	1
}