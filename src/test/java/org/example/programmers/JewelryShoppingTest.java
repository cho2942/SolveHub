package org.example.programmers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JewelryShoppingTest {

    JewelryShopping jewelryShopping = new JewelryShopping();

    @Test
    void solution() {
        Assertions.assertThat(jewelryShopping.solution(new String[]{"DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA"})).isEqualTo(new int[]{3,7});
        Assertions.assertThat(jewelryShopping.solution(new String[]{"AA", "AB", "AC", "AA", "AC"})).isEqualTo(new int[]{1,3});
        Assertions.assertThat(jewelryShopping.solution(new String[]{"XYZ", "XYZ", "XYZ"})).isEqualTo(new int[]{1,1});
        Assertions.assertThat(jewelryShopping.solution(new String[]{"ZZZ", "YYY", "NNNN", "YYY", "BBB"})).isEqualTo(new int[]{1,5});
    }
}

//["DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA"]	[3, 7]
//        ["AA", "AB", "AC", "AA", "AC"]	[1, 3]
//        ["XYZ", "XYZ", "XYZ"]	[1, 1]
//        ["ZZZ", "YYY", "NNNN", "YYY", "BBB"]	[1, 5]