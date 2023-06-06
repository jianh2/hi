package com.mygdx.game;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Ball {
    private Sprite sprite;
    float x = 0f;

    float y = 0f;

    int ySpeed;

    int xSpeed;

    static boolean keyPressed;

    public Ball(Texture texture){
    sprite = new Sprite(texture);
    }

    public void update() {

        y += ySpeed;
        x += xSpeed;
        if (Gdx.input.isKeyPressed(Input.Keys.W)) {
            keyPressed = true;
            ySpeed = 20;

            // your actions
        } else if (Gdx.input.isKeyPressed(Input.Keys.S)) {
            keyPressed = true;
            ySpeed = -20;

        }else{
            keyPressed = false;
            ySpeed = 0;
        }
        
        if (Gdx.input.isKeyPressed(Input.Keys.A)) {
          keyPressed = true;
            xSpeed = -30;
            // your actions
        } else if (Gdx.input.isKeyPressed(Input.Keys.D)) {

            xSpeed = 30;
            keyPressed = true;
        }else{
            keyPressed = false;
            xSpeed = 0;

        }


        if(y>800 && Gdx.input.isKeyPressed(Input.Keys.W)){
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
