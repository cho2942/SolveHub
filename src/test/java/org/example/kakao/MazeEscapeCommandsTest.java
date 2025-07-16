package org.example.kakao;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MazeEscapeCommandsTest {

    MazeEscapeCommands commands = new MazeEscapeCommands();

    @Test
    void solution() {
        Assertions.assertThat(commands.solution(3,4,2,3,3,1,5)).isEqualTo("dllrl");
        Assertions.assertThat(commands.solution(2,2,1,1,2,2,2)).isEqualTo("dr");
        Assertions.assertThat(commands.solution(3,3,1,2,3,3,4)).isEqualTo("impossible");
    }
}


//n	m	x	y	r	c	k	result
//3	4	2	3	3	1	5	"dllrl"
//2	2	1	1	2	2	2	"dr"
//3	3	1	2	3	3	4	"impossible"