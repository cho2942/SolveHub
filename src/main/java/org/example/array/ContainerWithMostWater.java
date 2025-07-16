package org.example.array;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int width = height.length - 1;
        int answer = 0;

        while(left < right){
            int area = Math.min(height[left], height[right]) * width;
            if(answer < area){
                answer = area;
            }

            if(height[left] > height[right]){
                right--;
            }else{
                left++;
            }
            width--;
        }
        return answer;
    }
}


//Input: height = [1,8,6,2,5,4,8,3,7]
//Output: 49
//Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
