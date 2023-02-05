package academy.learnprogramming;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name, artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public static class SongList{
        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<>();
        }
        private boolean add(Song song){
            if(!songs.contains(song)){
                songs.add(song);
                return true;
            }
            return false;
        }

        private Song findSong(String title){
            for (Song song: this.songs){
                if(song.getTitle().equals(title)){
                    return song;
                }
            }
            return null;
        }

        private Song findSong(int trackNumber){
            Song song = null;
            if(trackNumber <= songs.size() && trackNumber > 0){
                trackNumber--;
                song = songs.get(trackNumber);

            }
            return song;
        }

    }


    public boolean addSong(String title, double duration){
        Song song = this.songs.findSong(title);
        boolean songAdded = false;
        if(song == null){
            songAdded = true;
            songs.add(new Song(title,duration));
        }
        return songAdded;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList){
        Song song = this.songs.findSong(title);
        if(song != null){
            if(!playList.contains(song)){
                playList.add(song);
                return true;
            }
        }
        return false;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
        Song song = this.songs.findSong(trackNumber);
        if (song != null){
            if(!playList.contains(song)){
                playList.add(song);
                return true;
            }
        }
        return false;
    }
}
