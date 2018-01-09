package com.trihex.slick;

/**
 * Created by earmst207 on 1/8/18.
 */
public class DieRoller {
    public static int roll(int number, Die die, Modifier mod)
    {
        int total = 0;
        for(int x = 0; x < number; x++)
        {
            int roll = die.roll();
            total += roll;
        }

        if(mod != null)
            total += mod.getModValue();

        return total;
    }
}
