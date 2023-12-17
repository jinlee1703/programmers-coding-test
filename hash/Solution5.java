import java.util.*;

class GenreVal {
    int play;
    List<Music> musics;

    GenreVal(int play) {
        this.play = play;
        this.musics = new ArrayList<>();
    }
}

class Music implements Comparable<Music> {
    int id;
    int play;

    Music(int id, int play) {
        this.id = id;
        this.play = play;
    }

    public int compareTo(Music o) {
        return o.play - this.play;
    }
}

class Solution {
    public List<Integer> solution(String[] genres, int[] plays) {
        Map<String, GenreVal> genreMap = new LinkedHashMap<>();
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            int play = plays[i];

            if (genreMap.containsKey(genre)) {
                genreMap.get(genre).play += play;
                genreMap.get(genre).musics.add(new Music(i, play));
            } else {
                genreMap.put(genre, new GenreVal(play));
                genreMap.get(genre).musics.add(new Music(i, play));
            }
        }

        List<Map.Entry<String, GenreVal>> entryList = new ArrayList<>(genreMap.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<String, GenreVal>>() {
            public int compare(Map.Entry<String, GenreVal> e1, Map.Entry<String, GenreVal> e2) {
                return e2.getValue().play - e1.getValue().play;
            }
        });

        for (Map.Entry<String, GenreVal> entry : entryList) {
            Collections.sort(entry.getValue().musics);
            for (int i = 0; i < Math.min(entry.getValue().musics.size(), 2); i++) {
                answer.add(entry.getValue().musics.get(i).id);
            }
        }

        return answer;
    }
}