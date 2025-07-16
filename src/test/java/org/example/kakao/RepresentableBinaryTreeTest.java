package org.example.kakao;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepresentableBinaryTreeTest {

    RepresentableBinaryTree representableBinaryTree = new RepresentableBinaryTree();

    @Test
    void solution() {
        Assertions.assertThat(representableBinaryTree.solution(new long[]{7, 42, 5})).isEqualTo(new int[]{1,1,0});
        Assertions.assertThat(representableBinaryTree.solution(new long[]{63, 111, 95})).isEqualTo(new int[]{1,1,0});
        Assertions.assertThat(representableBinaryTree.solution(new long[]{44})).isEqualTo(new int[]{0});
        Assertions.assertThat(representableBinaryTree.solution(new long[]{686})).isEqualTo(new int[]{0});
    }
}

//numbers	result
//[7, 42, 5]	[1, 1, 0]
//[63, 111, 95]	[1, 1, 0]
