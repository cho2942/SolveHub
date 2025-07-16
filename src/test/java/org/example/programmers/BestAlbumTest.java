package org.example.programmers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestAlbumTest {

    BestAlbum bestAlbum = new BestAlbum();

    @Test
    void bestAlbum() {
        Assertions.assertThat(bestAlbum.bestAlbum(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500})).isEqualTo(new int[]{4, 1, 3, 0});
    }
}