package com.trihex.slick;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.InputListener;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

/**
 * Created by earmst207 on 1/8/18.
 */
public class CharacterGen extends BasicGameState implements InputListener {

    public static final int ID = 0;

    private enum GenerationStates{
        STRENGTH,
        CONSTITUTION,
        DEXTERITY,
        POWER,
        APPEARANCE,
        EDUCTION,
        SIZE,
        INTELLIGENCE
    }

    private String statLabel;
    private GenerationStates currentState;
    private Character character;

    public static int rollStrength()
    {
        return DieRoller.roll(3, Die.D6, null) * 5;
    }

    @Override
    public int getID() {
        return CharacterGen.ID;
    }

    @Override
    public void init(GameContainer gameContainer, StateBasedGame stateBasedGame) throws SlickException {
        character = new Character();
        currentState = GenerationStates.STRENGTH;
        statLabel = "Strength";
    }

    @Override
    public void render(GameContainer gameContainer, StateBasedGame stateBasedGame, Graphics graphics) throws SlickException {
        graphics.drawString(statLabel, 100, 100);
        graphics.drawString("Roll", 100, 150);
        graphics.drawString("Next", 150, 150);

        graphics.drawString("Strength", 300, 100);
        graphics.drawString(""+character.getStrength(), 425, 100);
        graphics.drawString(""+character.getStrHalf(), 445, 90);
        graphics.drawString(""+character.getStrFifth(), 445, 110);

        graphics.drawString("Constitution", 300, 125);
        graphics.drawString(""+character.getConstitution(), 425, 125);
    }

    @Override
    public void update(GameContainer gameContainer, StateBasedGame stateBasedGame, int i) throws SlickException {

    }

    @Override
    public void mousePressed(int button, int x, int y)
    {
        if(x > 99 && x < 200)
        {
            if(x < 150 && y > 99 && y < 200) {
                switch (currentState){
                    case STRENGTH:
                        character.setStrength(CharacterGen.rollStrength());
                        character.setStrHalf(character.getStrength()/2);
                        character.setStrFifth(character.getStrength()/5);
                        break;
                    case CONSTITUTION:
                        break;
                    case DEXTERITY:
                        break;
                    case POWER:
                        break;
                    case APPEARANCE:
                        break;
                    case EDUCTION:
                        break;
                    case SIZE:
                        break;
                    case INTELLIGENCE:
                        break;
                }
            }
            else if (x < 200 && y > 99 && y < 200) {
                switch (currentState) {
                    case STRENGTH:
                        currentState = GenerationStates.CONSTITUTION;
                        statLabel = "Constitution";
                        break;
                    case CONSTITUTION:
                        break;
                    case DEXTERITY:
                        break;
                    case POWER:
                        break;
                    case APPEARANCE:
                        break;
                    case EDUCTION:
                        break;
                    case SIZE:
                        break;
                    case INTELLIGENCE:
                        break;
                }
            }
        }
    }
}
