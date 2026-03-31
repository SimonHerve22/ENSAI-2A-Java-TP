package fr.ensai.mediaplayer;

import java.util.List;
import java.util.Collections;


public class Playlist {
    private String name;
    private List<Media> mediaList;
    private int totalDuration;

    /**
     * Constructs a new Playlist object.
     *
     * @param name The name of the playlist.
     * @param mediaList The list of media in the playlist.
     * @param totalDuration The total duration of the playlist. 
     */
    public Playlist(String name, List<Media> mediaList, int totalDuration) {
        this.name = name;
        this.mediaList = mediaList;
        this.totalDuration = totalDuration;
    }

    public void addMedia(Media media){
        this.mediaList.add(media);
    }

    public void removeMedia(Media media){
        if (this.mediaList.contains(media)){
            this.mediaList.remove(media);
        }
    }

    public void removeMedia(int index){
        this.mediaList.remove(index);
    }

    public List<Media> getMediaList(){
        return this.mediaList;
    }

    public void play(Boolean random){
        if (random){
            Collections.shuffle(this.mediaList);
            for (int i = 0; i < this.mediaList.size() ; i++){
                this.mediaList.get(i).play();
            }
        } else {
            for (int i = 0; i < this.mediaList.size() ; i++){
                this.mediaList.get(i).play();
            }
        }
    }
}
