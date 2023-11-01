import greenfoot.*;

public class Enemy extends Actor {
    public void act() {
        // Memindahkan musuh ke bawah
        setLocation(getX(), getY() + 2);
        
        // Hapus musuh jika mencapai batas bawah layar
        if (getY() >= getWorld().getHeight() - 1) {
            getWorld().removeObject(this);
        }
        
        // Cek tabrakan dengan peluru
        checkCollision();
    }
    
    public void checkCollision() {
        Actor bullet = getOneIntersectingObject(Bullet.class);
        if (bullet != null) {
            getWorld().removeObject(bullet); // Hapus peluru
            getWorld().removeObject(this); // Hapus musuh
            // Tambahan: Lakukan sesuatu ketika musuh mati (misalnya, tambah skor)
        }
    }
}
