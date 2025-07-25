package org.example.programmers.kit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JoystickTest {

    Joystick joystick = new Joystick();

    @Test
    void solution() {
        Assertions.assertThat(joystick.solution("JAZ")).isEqualTo(11);
        Assertions.assertThat(joystick.solution("JAN")).isEqualTo(23);
        Assertions.assertThat(joystick.solution("JEROEN")).isEqualTo(56);
        Assertions.assertThat(joystick.solution("BBAAAAB")).isEqualTo(6);
    }
}