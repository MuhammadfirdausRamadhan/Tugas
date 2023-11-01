import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * @author semarsoft.com
 * @version 1
 */
public class MyWorld extends World
{

    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // membuat ukuran kanvas 600x400 pixels.
        super(600, 400, 1);
        
        //memanggil method persiapan
        persiapan();
    }

//metode persiapan
    private void persiapan() {
        
        //membuat objek Pesawat dengan nama noe
         pesawat noe = new pesawat();
        
        //menepatkan objek pesawat dengan nama noe pada posisi X : 97 dan Y:105
         addObject(noe, 97, 105);
        
    }
}
