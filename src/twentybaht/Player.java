package twentybaht;

import org.newdawn.slick.Animation;
import org.newdawn.slick.Color;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

public class Player {
	////////////PLAYER_POSITION///////////////
	private float playerX = 0;
	private float playerY = 0;
	private SpriteSheet playerSpriteSheet;
	private Animation playerAnimation;
	//Color filter = new Color(100,100,100);
	//______________________________________//
	
	
	
	public Player(float x,float y) throws SlickException{
		playerSpriteSheet = new SpriteSheet("image/spritesheet.png",209,158);
		playerAnimation = new Animation(playerSpriteSheet,100);
		playerX = x;
		playerY = y;
	}
	
	public void punchRender(){
		
		playerAnimation.start();
		playerAnimation.draw(200, 200);
		playerAnimation.stop();}
	
	public void updateAnimation(int delta){
		playerAnimation.update(delta);
	}
}
