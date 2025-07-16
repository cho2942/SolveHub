package org.example.programmers;


import java.util.*;

public class BestAlbum {
    public int[] bestAlbum(String[] genres, int[] plays) {
        Map<String, Integer> genrePlayMap = new HashMap<>();
        Map<String, List<Music>> genreMusicMap = new HashMap<>();

        for(int i = 0; i < genres.length; i++) {
            genrePlayMap.put(genres[i], genrePlayMap.getOrDefault(genres[i],0) + plays[i]);
            genreMusicMap.computeIfAbsent(genres[i], k -> new ArrayList<>()).add(new Music(plays[i], i));
        }

        List<String> sortedGenres = new ArrayList<>(genreMusicMap.keySet());

        sortedGenres.sort((a,b) -> genrePlayMap.get(b) - genrePlayMap.get(a));

        List<Integer> result = new ArrayList<>();
        for(String genre : sortedGenres){
            List<Music> musicList = genreMusicMap.get(genre);
            musicList.sort((a,b)->a.plays != b.plays ? b.plays - a.plays : a.idx - b.idx);

            for(int i=0; i<Math.min(2, musicList.size()); i++){
                result.add(musicList.get(i).idx);
            }
        }


        return result.stream().mapToInt(i -> i).toArray();
    }

    public class Music {

        public int plays;
        public int idx;

        public Music(int plays, int idx) {
            this.plays = plays;
            this.idx = idx;
        }
    }
}


//속한 노래가 많이 재생된 장르를 먼저 수록합니다.
//장르 내에서 많이 재생된 노래를 먼저 수록합니다.
//장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.
//
//genres	plays	return
//["classic", "pop", "classic", "classic", "pop"]	[500, 600, 150, 800, 2500]	[4, 1, 3, 0]
