import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class skenario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyScenario extends World {
    private Counter counter;

    public MyScenario() {
        super(600, 400, 1);
        counter = new Counter();
        addObject(counter, 100, 50); // Sesuaikan posisi sesuai kebutuhan
        prepare();
    }

    private void prepare() {
        // Tambahkan objek-objek permainan ke dunia ini
        // Misalnya, pemain, musuh, bullet, dan sebagainya
    }
}

