import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class TheMain {

    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.tld");
        MusicPlayer player = context.getBean("MusicPlayerBean", MusicPlayer.class);
        player.play();
        System.out.println(player.getName());
        context.close();
    }

}
