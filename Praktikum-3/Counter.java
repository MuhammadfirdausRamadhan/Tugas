import greenfoot.*; 

public class Counter extends Actor {
    private int score;

    public Counter() {
        score = 0;
        updateImage();
    }

    public void incrementScore() {
        score++;
        updateImage();
    }

    public int getScore() {
        return score;
    }

    private void updateImage() {
        GreenfootImage image = new GreenfootImage("Skor: " + score, 24, Color.WHITE, new Color(0, 0, 0, 0));
        setImage(image);
    }
}
