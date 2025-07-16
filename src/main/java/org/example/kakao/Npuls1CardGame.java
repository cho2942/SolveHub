package org.example.kakao;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Npuls1CardGame {
    public int solution(int coin, int[] cards) {
        int answer = 0;

        // 1. 코인을 안쓰고 n+1을 만족하는 경우
        // 2. 코인 하나를 쓰고 n+1을 만족하는 경우
        // 3. 코인 두 개를 써야 n+1을 만족하는 경우
        // 4. n+1을 만족하지 않는 경우

        int n = cards.length;
        int idx = n/3;

        // 숫자 중복 X, 포함관계만 확인하면 됨.
        Set<Integer> myCard = new HashSet<>();
        Set<Integer> newCard = new HashSet<>();

        for(int i=0; i<idx; i++) {
            myCard.add(cards[i]);
        }

        int target = n+1;
        while(true) {

            answer++;

            if(idx >= n) {
                break;
            }

            newCard.add(cards[idx]);
            newCard.add(cards[idx+1]);
            idx += 2;

            boolean flag = false;
            for(int num : myCard) { // 내 손안에서 전부 처리
                if(myCard.contains(target - num)) {
                    myCard.remove(num);
                    myCard.remove(target - num);
                    flag = true;
                    break;
                }
            }

            if(!flag) { // 코인 한개 사용
                if(coin >= 1) {
                    for(int num : myCard) {
                        if(newCard.contains(target - num)) {
                            myCard.remove(num);
                            newCard.remove(target - num);
                            coin--;
                            flag = true;
                            break;
                        }
                    }
                }
            }

            if(!flag) { // 코인 두개 사용
                if(coin >= 2) {
                    for(int num : newCard) {
                        if(newCard.contains(target - num)) {
                            newCard.remove(num);
                            newCard.remove(target - num);
                            coin -= 2;
                            flag = true;
                            break;
                        }
                    }
                }
            }

            if(!flag) {
                break;
            }
        }
        return answer;
    }
}

// 3, 10 1
// 6, 7 0
// 1, 12 2
// 2, 11 0

// 3, 10 1
// 6, 7 0
// 4, 8 2
// 1, 12 2

//1라운드에서 뽑은 카드 1, 10을 동전 두 개를 소모해서 모두 가집니다. 카드 3, 10을 내고 다음 라운드로 진행합니다. 이때 손에 남은 카드는 1, 2, 6, 7이고 동전이 2개 남습니다.
//        2라운드에서 뽑은 카드 5, 9를 동전을 소모하지 않고 모두 버립니다. 카드 6, 7을 내고 다음 라운드로 진행합니다. 이때 손에 남은 카드는 1, 2고 동전이 2개 남습니다.
//        3라운드에서 뽑은 카드 8, 12 중 동전 한 개를 소모해서 카드 12를 가집니다. 카드 1, 12을 내고 다음 라운드로 진행합니다. 이때 손에 남은 카드는 2이고 동전이 1개 남습니다.
//        4라운드에서 뽑은 카드 11, 4 중 동전 한 개를 소모해서 카드 11을 가집니다. 카드 2, 11을 내고 다음 라운드로 진행합니다. 이때 손에 남은 카드와 동전은 없습니다.
//        5라운드에서 카드 뭉치에 남은 카드가 없으므로 게임을 종료합니다.
//
//coin	cards	result
//4	[3, 6, 7, 2,  1, 10,  5, 9,  8, 12, 11, 4]	5
//3	[1, 2, 3, 4, 5, 8, 6, 7, 9, 10, 11, 12]	2
//2	[5, 8, 1, 2, 9, 4, 12, 11, 3, 10, 6, 7]	4
//10	[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]	1