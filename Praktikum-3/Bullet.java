 import greenfoot.*;

public class Bullet extends Actor {
    private int bulletSpeed = 5;
    private int rocketSpeed = 2;
    private int delayCounter = 0;
    private int delayDuration = 30; // Durasi delay dalam act cycles (sesuaikan dengan kebutuhan)

    public Bullet(int direction) {
        setRotation(direction); // Mengatur rotasi peluru sesuai dengan arah roket
    }

    public void act() {
        // Menggerakkan peluru sesuai dengan arahnya
        move(bulletSpeed);

        // Hapus peluru jika mencapai tepi dunia
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }

    public void act(int direction) {
        if (isAtEdge() || isTouching(Enemy.class)) {
            if (isTouching(Enemy.class)) {
                // Bullet mengenai musuh
                getWorld().removeObject(this); // Hapus tembakan
                // Meningkatkan skor
                Counter counter = (Counter)getWorld().getObjects(Counter.class).get(0);
                counter.incrementScore();
            } else {
                getWorld().removeObject(this); // Hapus tembakan jika tidak mengenai musuh
            }
        } else {
            move(5);
        }
    }
}
