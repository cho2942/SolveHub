package org.example.graph;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfIslandsTest {

    NumberOfIslands numberOfIslands = new NumberOfIslands();

    @Test
    void numIslands() {
        Assertions.assertThat(numberOfIslands.numIslands(new char[][]{{1,1,1,1,0},{1,1,0,1,0},{1,1,0,0,0},{0,0,0,0,0}})).isEqualTo(1);
        Assertions.assertThat(numberOfIslands.numIslands(new char[][]{{1,1,0,0,0},{1,1,0,0,0},{0,0,1,0,0},{0,0,0,1,1}})).isEqualTo(3);
    }
}

//
//Example 1:
//
//Input: grid = [
//        ["1","1","1","1","0"],
//        ["1","1","0","1","0"],
//        ["1","1","0","0","0"],
//        ["0","0","0","0","0"]
//        ]
//Output: 1
//Example 2:
//
//Input: grid = [
//        ["1","1","0","0","0"],
//        ["1","1","0","0","0"],
//        ["0","0","1","0","0"],
//        ["0","0","0","1","1"]
//        ]
//Output: 3