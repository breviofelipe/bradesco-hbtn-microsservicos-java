package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SongRepository {


    private List<Song> list = new ArrayList<Song>();

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
