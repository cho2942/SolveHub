package org.example.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CourseSchedule_re0617 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        int[] visited = new int[numCourses];
        int answer = 0;


        for(int i = 0; i < numCourses; i++) {
            arrayList.add(new ArrayList<>());
        }

        for (int[] prerequisite : prerequisites) {
            int ai = prerequisite[0];
            int bi = prerequisite[1];

            arrayList.get(ai).add(bi);
        }

        for (int i=0; i<numCourses; i++) {
            if(arrayList.get(i).isEmpty()){
                queue.add(i);
                visited[i] = 1;
            }
        }

        while(!queue.isEmpty()){
            int course = queue.poll();
            answer++;

            for (int i=0; i<numCourses; i++) {
                if(!arrayList.get(i).isEmpty()){ // 아직 안들어감
                    for(int j=0; j<arrayList.get(i).size(); j++){
                        if(arrayList.get(i).get(j) == course){
                            arrayList.get(i).remove((Integer) course);
                            if (arrayList.get(i).isEmpty()) {
                                queue.add(i);
                                visited[i] = 1;
                            }
                        }
                    }
                }
            }

        }

        return answer == numCourses;
    }
}

//        Assertions.assertThat(courseSchedule.canFinish(2, new int[][]{{1,0},{0,1}})).isEqualTo(false);

