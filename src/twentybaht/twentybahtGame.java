package twentybaht;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

public class twentybahtGame extends BasicGame{

	//////////////////// GAME_SCREEN //////////////////////	
	private final static int GAME_WIDTH = 800;
	private final static int GAME_HEIGHT = 800;
	//__________________________________________________//
	
	
	
	
	public twentybahtGame(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void render(GameContainer arg0, Graphics arg1) throws SlickException {
	
	}

	@Override
	public void init(GameContainer arg0) throws SlickException {
		
	}

	@Override
	public void update(GameContainer arg0, int arg1) throws SlickException {
		
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
