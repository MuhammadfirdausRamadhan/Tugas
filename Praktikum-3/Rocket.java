import greenfoot.*;

public class Rocket extends Actor {
    private int rocketSpeed = 2;
    private int cooldown = 0; // Counter untuk mengontrol penembakan
    private int fireRate = 15; // Tingkat tembakan (sesuaikan dengan kecepatan yang Anda inginkan)

    public void act() {
        // Mengendalikan pergerakan roket
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - rocketSpeed, getY());
        }
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + rocketSpeed, getY());
        }
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - rocketSpeed);
        }
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + rocketSpeed);
        }

        // Mengurangi cooldown
        if (cooldown > 0) {
            cooldown--;
        }
        
        // Menghadap ke atas
        setRotation(270);
        
        // Menembak peluru saat tombol space ditekan dan cooldown mencapai 0
        if (Greenfoot.isKeyDown("space") && cooldown == 0) {
            shoot();
            cooldown = fireRate; // Setel cooldown untuk pengulangan tembakan
        }
    }

    public void shoot() {
        Bullet bullet = new Bullet(getRotation()); // Menggunakan rotasi roket untuk mengatur arah peluru
        getWorld().addObject(bullet, getX(), getY()); // Tambahkan peluru ke dunia
    }
}

