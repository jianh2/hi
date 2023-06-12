package com.mygdx.game;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

import java.util.Scanner;

import static com.mygdx.game.MyGdxGame.equal;

public class Ball  {
    Scanner scan = new Scanner(System.in);
    private Sprite sprite;
    float x = 0f;

    String letter = "";

    float y = 0f;

    int ySpeed;

    int xSpeed;

    static boolean keyPressed = true;

    String userText = "";






    public Ball(Texture texture){
    sprite = new Sprite(texture);
    }






    public void update() {

        if(equal()){
            y += -2;
        }else{
            y += 3;
        }

        if (y < -500 || y > 500){
            y = 0;
        }













    }

    public float xGetter()
    {
        return x;
    }

    public float yGetter()
    {
        return y;
    }

    public void draw(SpriteBatch batch){
        sprite.draw(batch);
        sprite.setScale(0.1f,0.1f);
        sprite.setPosition(x,y);


    }


    public static boolean isKeyPressed(){
        return keyPressed;
    }


}
