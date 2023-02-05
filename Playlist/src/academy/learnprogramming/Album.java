package academy.learnprogramming;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name, artist;
    private ArrayList <Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    private Song findSong(String title){
        Song song = null;
        for (int i = 0; i < songs.size(); i++){
            if(songs.get(i).getTitle().equals(title)){
                song = songs.get(i);
            }
        }
        return song;
    }

    public boolean addSong(String title, double duration){
        Song song = findSong(title);
        boolean songAdded = false;
        if(song == null){
            songAdded = true;
            songs.add(new Song(title,duration));
        }
        return songAdded;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList){
        Song song = findSong(title);
        if(song != null){
            if(!playList.contains(song)){
                playList.add(song);
                return true;
            }
        }
        return false;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
        if(trackNumber < songs.size() && trackNumber > 0){
            trackNumber--;
            Song song = songs.get(trackNumber);
            if(!playList.contains(song)){
                playList.add(song);
                return true;
            }
        }

        return false;
    }
}
