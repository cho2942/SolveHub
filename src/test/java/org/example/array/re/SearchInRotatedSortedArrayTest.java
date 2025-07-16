package org.example.array.re;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class SearchInRotatedSortedArrayTest {

    SearchInRotatedSortedArray search = new SearchInRotatedSortedArray();

    @Test
    void SearchInRotatedSortedArray_re0513Test() {
        int answer = 0;
        answer = search.search(new int[]{4,5,6,7,0,1,2}, 0);
        assertThat(answer).isEqualTo(4);

        answer = search.search(new int[]{4,5,6,7,0,1,2}, 3);
        assertThat(answer).isEqualTo(-1);

        answer = search.search(new int[]{1}, 0);
        assertThat(answer).isEqualTo(-1);

        answer = search.search(new int[]{1,3}, 0);
        assertThat(answer).isEqualTo(-1);

        answer = search.search(new int[]{1,3}, 3);
        assertThat(answer).isEqualTo(1);

        answer = search.search(new int[]{5,1,3}, 1);
        assertThat(answer).isEqualTo(1);
    }
}

//Example 1:
//Input: nums = [4,5,6,7,0,1,2], target = 0
//Output: 4
//Example 2:
//Input: nums = [4,5,6,7,0,1,2], target = 3
//Output: -1

//Example 3:
//Input: nums = [1], target = 0
//Output: -1