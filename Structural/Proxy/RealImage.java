package Structural.Proxy;

public class RealImage implements Image {
    private String fileName;

    RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk(){
        System.out.println("Loading : "+ fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying : "+ fileName);
    }
    
}
