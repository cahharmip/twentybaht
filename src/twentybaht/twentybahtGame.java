package twentybaht;

import org.newdawn.slick.Animation;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

public class twentybahtGame extends BasicGame{

	//////////////////// GAME_SCREEN //////////////////////	
	private final static int GAME_WIDTH = 1280;
	private final static int GAME_HEIGHT = 800;
	//___________________________________________________//
	
	/////////////// BLAA_FEILD ///////////////////////////
	Player player;
	//__________________________________________________ //
	
	public twentybahtGame(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render(GameContainer container, Graphics g) throws SlickException {
	//	charAnimation.draw(200,200);
		player.punchRender();
	}

	@Override
	public void init(GameContainer container) throws SlickException {
		Color background = new Color(255, 182, 193);
		container.getGraphics().setBackground(background);
	//	charSpriteSheet = new SpriteSheet("image/spritesheet.png", 209, 158);
	//	charAnimation = new Animation(charSpriteSheet,50);
		player = new Player(200,500);
	}

	@Override
	public void update(GameContainer container, int delta) throws SlickException {
	//	charAnimation.update(delta);
		player.updateAnimation(delta);
	}

	public static void main(String[]args){
		try {
      twentybahtGame game = new twentybahtGame("Let's get twenty baht!");
      AppGameContainer appgc = new AppGameContainer(game);
      appgc.setDisplayMode(GAME_WIDTH, GAME_HEIGHT, false);
      appgc.setMinimumLogicUpdateInterval(10);
      appgc.start();
    } catch (SlickException e) {
      e.printStackTrace();
    }
	}
}
