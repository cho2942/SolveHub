package org.example.string;

import org.example.string.re.GroupAnagrams;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class GroupAnagramsTest {

    GroupAnagrams groupAnagrams = new GroupAnagrams();

    @Test
    void groupAnagrams() {
        assertThat(groupAnagrams.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}))
                .isEqualTo(List.of(List.of("bat"),
                        List.of("nat","tan"),
                        List.of("ate","eat","tea")));

        assertThat(groupAnagrams.groupAnagrams(new String[]{""}))
                .isEqualTo(List.of(List.of("")));


        assertThat(groupAnagrams.groupAnagrams(new String[]{"a"}))
                .isEqualTo(List.of(List.of("a")));
    }
}