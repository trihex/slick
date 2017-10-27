package com.trihex.slick.enemies;

import org.newdawn.slick.Image;

/**
 * Created by earmst207 on 10/26/17.
 */
public class GiantAnt {
    private Image sprite;
    private int worldX;
    private int worldY;

    public Image getSprite() {
        return sprite;
    }

    public void setSprite(Image sprite) {
        this.sprite = sprite;
    }

    public int getWorldX() {
        return worldX;
    }

    public void setWorldX(int worldX) {
        this.worldX = worldX;
    }

    public int getWorldY() {
        return worldY;
    }

    public void setWorldY(int worldY) {
        this.worldY = worldY;
    }
}
