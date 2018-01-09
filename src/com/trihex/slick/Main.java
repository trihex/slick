package com.trihex.slick;

import org.newdawn.slick.*;
import org.newdawn.slick.state.StateBasedGame;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by earmst207 on 10/26/17.
 */
public class Main extends StateBasedGame {
    private Image original;
    private SpriteSheet bigSheet;
    private AssetLoader loader;

    public Main(String gamename)
    {
        super(gamename);
        loader = new AssetLoader();
    }

    // Initialize your game states (calls init method of each gamestate, and set's the state ID)
    public void initStatesList(GameContainer gc) throws SlickException {
        // The first state added will be the one that is loaded first, when the application is launched
        this.addState(new CharacterGen());
        //this.addState(new MainMenu());
        //this.addState(new Game());

        this.enterState(CharacterGen.ID);
    }

    /*@Override
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
    }*/

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
