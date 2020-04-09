public class PopMusic implements Music {

    private final String name= "pop";

    @Override
    public void play() {
        System.out.println("Play "+name+" music. "+getSong());
    }

    @Override
    public String getSong() {
        return "Время и Стекло 'Троль'";
    }

}
