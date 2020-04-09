public class ClassicalMusic implements Music{

    private final String name= "classical";

    @Override
    public void play() {
        System.out.println("Play "+name+" music. "+getSong());
    }

    @Override
    public String getSong() {
        return "Bethoven 'Hungarian Rhapsody'";
    }

}
