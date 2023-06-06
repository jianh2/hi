package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Typing {
private Sprite sprite;

    public Typing(Texture texture){
        sprite = new Sprite(texture);
    }

    public void draw(SpriteBatch batch){
        if(Ball.isKeyPressed()) {
            sprite.draw(batch);
            sprite.setScale(1f, 1f);
            sprite.setPosition(0, 0);

        }else{
            sprite.setPosition(1000, 1000);

        }
    }



}
