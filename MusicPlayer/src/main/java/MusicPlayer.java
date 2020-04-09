public class MusicPlayer {
    private Music music;
    private String name;
    private int volume;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setMusic(Music music){
        this.music=music;
    }

    public void play(){
        music.play();
    }
}
