package Structural.Composite;

// Leaf
public class Song implements IComponent{
    public String songName;
    public String artist;
    public float speed;

    Song(String songName, String artistName){
        this.songName = songName;
        this.artist = artistName;
    }

    @Override
    public void play() {
        System.out.println("Playing Song : "+ songName + " With Speed : "+ this.speed);
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        this.speed = speed;
    }

    @Override
    public String getName() {
        return this.songName;
    }
    
    public String getArtist(){
        return this.artist;
    }
}
