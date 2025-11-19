package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SongRepository {

    private final List<Song> list = new ArrayList<>();

    public SongRepository() {

        Song song = new Song(1, "Bohemian Rhapsody", "Queen", "A Night at the Opera", "1975");
        list.add(song);
        Song song2 = new Song(2, "Imagine", "John Lennon", "Imagine", "1971");
        list.add(song2);
    }

    public List<Song> getAllSongs() {
        return list;
    }

    public Song getSongById(Integer id) {
        for (Song s : list) {
            if (s.getId().equals(id)) {
                return s;
            }
        }
        return null;
    }

    public void addSong(Song s) {
        list.add(s);
    }

    public void updateSong(Song s) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(s.getId())) {
                list.set(i, s);
                return;
            }
        }
    }

    public void removeSong(Song s) {
        list.removeIf(song -> song.getId().equals(s.getId()));
    }
}
