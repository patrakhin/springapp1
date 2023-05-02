package ru.patrakhin.springcource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSpring {
    public static void main(String[] args) {
/*        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext_xml.txt"
        );*/

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );

        /*Music music = context.getBean("rockMusic", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();

        Music music1 = context.getBean("classicalMusic", Music.class);
        MusicPlayer classicalMusicPlayer = new MusicPlayer(music1);
        classicalMusicPlayer.playMusic();*/

        /*ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());*/

        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);

/*        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        boolean comparsion = firstMusicPlayer==secondMusicPlayer;
        System.out.println(comparsion);
        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);

        firstMusicPlayer.setVolume(10);
        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());*/

        /*System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());*/

        /*MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playMusic();*/

        /*Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);*/

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);


        context.close();
    }
}
