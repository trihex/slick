package com.trihex.slick;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by earmst207 on 1/8/18.
 */
public enum Die {
    D4,
    D6,
    D8,
    D10,
    D12,
    D20,
    D100;

    public int roll()
    {
        switch(this){
            case D4:
                return ThreadLocalRandom.current().nextInt(1, 5);
            case D6:
                return ThreadLocalRandom.current().nextInt(1, 7);
            case D8:
                return ThreadLocalRandom.current().nextInt(1, 9);
            case D10:
                return ThreadLocalRandom.current().nextInt(0, 10);
            case D12:
                return ThreadLocalRandom.current().nextInt(1, 13);
            case D20:
                return ThreadLocalRandom.current().nextInt(1, 21);
            case D100:
                return ThreadLocalRandom.current().nextInt(0, 100);
        }

        return 0;
    }
}
