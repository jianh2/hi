package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;

	Ball ball1;
	Texture Forest;
	Texture Planet;

	Texture bongo;

	Typing type;


	
	@Override
	public void create () {
		batch = new SpriteBatch();
		Planet = new Texture("planet09.png");
		ball1 = new Ball(Planet);
		Forest = new Texture("colored_forest.png");
		bongo = new Texture("Bongo.png");
		 type = new Typing(bongo);



	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		ball1.update();
		batch.draw(Forest,0,0);
		ball1.draw(batch);
		type.draw(batch);
		batch.end();




	}
	
	@Override
	public void dispose () {
		batch.dispose();
		Planet.dispose();
		Forest.dispose();

	}
}
