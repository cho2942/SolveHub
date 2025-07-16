package org.example.graph;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CourseSchedule_re0617Test {

    CourseSchedule_re0617 courseSchedule = new CourseSchedule_re0617();

    @Test
    void canFinish() {
        Assertions.assertThat(courseSchedule.canFinish(4, new int[][]{{1,0},{3,1},{3,2},{0,2}})).isEqualTo(true);
        Assertions.assertThat(courseSchedule.canFinish(2, new int[][]{{1,0}})).isEqualTo(true);
        Assertions.assertThat(courseSchedule.canFinish(2, new int[][]{{1,0},{0,1}})).isEqualTo(false);
    }
}

//
//Example 1:
//
//Input: numCourses = 2, prerequisites = [[1,0]]
//Output: true
//Explanation: There are a total of 2 courses to take.
//To take course 1 you should have finished course 0. So it is possible.
//Example 2:
//
//Input: numCourses = 2, prerequisites = [[1,0],[0,1]]
//Output: false
//Explanation: There are a total of 2 courses to take.
//To take course 1 you should have finished course 0, and to take course 0 you should also have finished course 1. So it is impossible.
//