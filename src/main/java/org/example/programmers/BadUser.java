package org.example.programmers;

import java.util.HashSet;
import java.util.Set;

//불량 사용자
public class BadUser {
        Set<Set<String>> result = new HashSet<>();
    public int solution(String[] user_id, String[] banned_id) {
        dfs(new HashSet<>(), user_id, banned_id, 0);
        return result.size();
    }

    private void dfs(Set<String> path, String[] userId, String[] bannedId, int i) {
        if(i == bannedId.length){
            result.add(new HashSet<>(path));
            return;
        }

        String pattern = bannedId[i].replace("*", ".");

        for(String user : userId){
            if(path.contains(user)) continue;
            if(!user.matches(pattern)) continue;

            path.add(user);
            dfs(path, userId, bannedId, i+1);
            path.remove(user);
        }
    }
}


//user_id	banned_id	result
//["frodo", "fradi", "crodo", "abc123", "frodoc"]	["fr*d*", "abc1**"]	2
//["frodo", "fradi", "crodo", "abc123", "frodoc"]	["*rodo", "*rodo", "******"]	2
//["frodo", "fradi", "crodo", "abc123", "frodoc"]	["fr*d*", "*rodo", "******", "******"]	3

//제재 아이디
//frodo
//crodo
//abc123
//frodoc
//제재 아이디
//fradi
//crodo
//abc123
//frodoc
//제재 아이디
//fradi
//frodo
//abc123
//frodoc