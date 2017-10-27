package com.trihex.slick;

import org.newdawn.slick.*;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by earmst207 on 10/26/17.
 */
public class Main extends BasicGame {
    private Image original;
    private SpriteSheet bigSheet;
    private AssetLoader loader;

    public Main(String gamename)
    {
        super(gamename);
        loader = new AssetLoader();
    }

    @Override
    public void init(GameContainer gc) throws SlickException {
        original = new BigImage("com/trihex/slick/assets/DawnHack32.bmp", Image.FILTER_NEAREST, 256);
        bigSheet = new SpriteSheet(original, 32, 32);
        loader.loadAssets();
    }

    @Override
    public void update(GameContainer gc, int i) throws SlickException {}

    @Override
    public void render(GameContainer gc, Graphics g) throws SlickException
    {
        g.drawImage(bigSheet.getSprite(0, 0), 320 - 16, 240 - 16);
    }

    public static void main(String[] args)
    {
        try
        {
            AppGameContainer appgc;
            appgc = new AppGameContainer(new Main("Simple Slick Game"));
            appgc.setDisplayMode(640, 480, false);
            appgc.start();
        }
        catch (SlickException ex)
        {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
