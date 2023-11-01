import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(1000, 700, 1); // Ukuran dunia
        addObject(new Rocket(), getWidth() / 2, getHeight() - 50); // Tambahkan roket ke dunia
    }
    
    public void act() {
        // Tambahkan musuh secara teratur
        if (Greenfoot.getRandomNumber(100) < 2) {
            addObject(new Enemy(), Greenfoot.getRandomNumber(getWidth()), 0);
        }
    }
    
}
