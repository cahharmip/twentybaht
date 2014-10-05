package twentybaht;

import org.newdawn.slick.Animation;
import org.newdawn.slick.Color;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
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
	
	/////////////PLAYER_STATUS////////////////
	private float velocityX = 10;
	private float velocityY = 0;
	private float baseHP = 100;
	private float playerDamage = 10;
	private float cooldownNormalAttack = 0; //SET_DELAY
	private float playerSkillDamage = 20;
	private float cooldownSkillAttack = 0; //SET_DELAY
	private boolean IsAttacked = false;
	private float immuneTime = 0 ; //SET_DELAY
	//_______________________________________//
	
	public Player(float x,float y) throws SlickException{
		playerSpriteSheet = new SpriteSheet("image/spritesheet.png",209,158);
		playerAnimation = new Animation(playerSpriteSheet,100);
		playerX = x;
		playerY = y;
	}
	
	public void moveLeft(){
		this.playerX -= velocityX;
	}
	
	public void moveRight(){
		this.playerX += velocityX;
	}
	
	public void render(){
		playerAnimation.draw(playerX,playerY);
	}
	
	public void updateAnimation(int delta){
		playerAnimation.update(delta);
	}
	
	void updateMovement(Input input,int delta) {
		if (input.isKeyDown(Input.KEY_A)) { 
			moveLeft();
    }
    if (input.isKeyDown(Input.KEY_S)) {
    	moveRight();
    }
	}
}
