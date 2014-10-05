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
	//Color filter = new Color(100,100,100);
	//______________________________________//
	
	////////////PICTURE_VARIABLE//////////////
	private SpriteSheet playerPunchSpriteSheet;
	private SpriteSheet playerWalkSpriteSheet;
	private SpriteSheet playerIdleSpriteSheet;
	private Animation playerPunchAnimation;
	private Animation playerWalkAnimation;
	private Animation playerIdleAnimation;
	private static final int PLAYERPUNCHSPRITE_WIDTH = 209;
	private static final int PLAYERPUNCHSPRITE_HEIGHT = 158;
	//______________________________________//
	
	/////////////PLAYER_STATUS////////////////
	private float velocityX = 10;
	private float velocityY = 0;
	private boolean direction = false;
	private float baseHP = 100;
	private float playerDamage = 10;
	private float cooldownNormalAttack = 0; //SET_DELAY
	private float playerSkillDamage = 20;
	private float cooldownSkillAttack = 0; //SET_DELAY
	private boolean IsAttacking = false;
	private boolean IsAttacked = false;
	private float immuneTime = 0 ; //SET_DELAY
	//_______________________________________//
	
	public Player(float x,float y) throws SlickException{
		playerPunchSpriteSheet = new SpriteSheet("image/spritesheet.png",PLAYERPUNCHSPRITE_WIDTH,PLAYERPUNCHSPRITE_HEIGHT);
		playerWalkSpriteSheet = new SpriteSheet("image/walkspritesheet.png",PLAYERPUNCHSPRITE_WIDTH,PLAYERPUNCHSPRITE_HEIGHT);
		playerIdleSpriteSheet = new SpriteSheet("image/test_char_still.png,",205,154);
		playerPunchAnimation = new Animation(playerPunchSpriteSheet,100);
		playerWalkAnimation = new Animation(playerWalkSpriteSheet,100);
		playerIdleAnimation = new Animation(playerIdleSpriteSheet,0);
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
		playerPunchAnimation.getCurrentFrame().getFlippedCopy(direction, false).draw(playerX,playerY);
	}
	
	public void updateAnimation(int delta){	
		playerPunchAnimation.update(delta);
	}
	
	void updateMovement(Input input,int delta) {
		if (input.isKeyDown(Input.KEY_A)) { 
			moveLeft();
			this.direction = true;
    }
    if (input.isKeyDown(Input.KEY_S)) {
    	moveRight();
    	this.direction = false;
    }
	}
}
