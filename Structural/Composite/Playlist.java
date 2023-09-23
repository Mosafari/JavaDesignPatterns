package Structural.Composite;

import java.util.ArrayList;

// Composite
public class Playlist implements IComponent {
    public String playlistName;
    public ArrayList<IComponent> playlist = new ArrayList<>();

    Playlist(String playlistName){
        this.playlistName = playlistName;
    }
    
    @Override
    public void play() {
        System.out.println("Playing Playlist : "+ playlistName);
        for(IComponent component : playlist) {
			component.play();
	    	}
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        for(IComponent component : this.playlist){
            component.setPlaybackSpeed(speed);
            }
    }

    @Override
    public String getName() {
        return this.playlistName;
    }

    public void add(IComponent component){
        playlist.add(component);
    }

    public void remove(IComponent component){
        playlist.remove(component);
    }
    
}
