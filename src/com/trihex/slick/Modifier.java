package com.trihex.slick;

/**
 * Created by earmst207 on 1/8/18.
 */
public class Modifier {
    private int value;
    private Die die;

    public Modifier(int value, Die die)
    {
        this.value = value;
        this.die = die;
    }

    public int getModValue()
    {
        int value = 0;
        if(die != null)
            value = die.roll();

        return value + this.value;
    }
}
