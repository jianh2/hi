package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

import java.awt.event.KeyEvent;


public class MyGdxGame extends ApplicationAdapter implements InputProcessor {


	SpriteBatch batch;
	Texture img;

	Ball ball1;
	Texture Forest;
	Texture Planet;

	Texture bongo;

	Typing type;

	Texture Text;

	static String userText = "";


	static String text = "thefitnessgrampacertestisamultistageaerobiccapacitytestthatprogressivelygetsmoredifficultasitcontinuesThe20meterpacertestwillbeginin30secondsLineupatthestartTherunningspeedstartsslowlybutgetsfastereachminuteafteryouhearthissignalbodeboop.Asinglapshouldbecompletedevery time you hear this sound. ding Remember to run in a straight line and run as long as possible. The second time you fail to complete a lap before the sound, your test is over. The test will begin on the word start. On your mark. Get ready!";
	static String currentText = "";
	String t = "";
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		Planet = new Texture("planet09.png");
		ball1 = new Ball(Planet);
		Forest = new Texture("colored_forest.png");
		Text = new Texture("Text.png");


		Gdx.input.setInputProcessor(this);



	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		ball1.update();
		batch.draw(Forest,0,0);
		batch.draw(Text,100,0);
		ball1.draw(batch);


		batch.end();




	}
	
	@Override
	public void dispose () {
		batch.dispose();
		Planet.dispose();
		Forest.dispose();
		Text.dispose();

	}

	@Override
	public boolean keyDown(int keycode) {

		return false;
	}

	@Override
	public boolean keyUp(int keycode) {

		return false;
	}
	public String toString(){
		return "";
	}
	@Override
	public boolean keyTyped(char character) {


		if (String.valueOf(character).equals("\b")) {
			userText = userText.substring(0,userText.length()-1);
			System.out.println(userText);

			currentText = currentText.substring(0,currentText.length()-1);
			System.out.println("C" + currentText);
			System.out.println("backspace");
			return false;
		} else {
			if(userText.indexOf("\b") > 0){
				userText = userText.substring(0,userText.indexOf("\b"));
			}
			userText += String.valueOf(character);
			System.out.println(userText);

			currentText = text.substring(0, userText.length());
			System.out.println("C" + currentText);
			return false;
		}

	}



	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		return false;
	}

	@Override
	public boolean scrolled(float amountX, float amountY) {
		return false;
	}

	public static String getUserText(){
		return userText;
	}

	public static boolean equal(){
		if(currentText.equals(userText)){
			return true;
		}else{
			return false;
		}
	}
}
