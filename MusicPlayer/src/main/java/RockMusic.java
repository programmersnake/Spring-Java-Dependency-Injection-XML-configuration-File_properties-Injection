public class RockMusic implements Music {

    private final String name= "rock";

    @Override
    public void play() {
        System.out.println("Play "+name+" music. "+getSong());
    }

    @Override
    public String getSong() {
        return "Король и Шут 'Король и шут'";
    }

}
