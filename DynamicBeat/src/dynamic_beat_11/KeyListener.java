package dynamic_beat_11;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyListener extends KeyAdapter {
	
	@Override
	public void keyPressed(KeyEvent e) {
		if(DynamicBeat.game == null) {
			return;
		}
		if(e.getKeyCode() == KeyEvent.VK_S) {
			DynamicBeat.game.pressS();
		}
		else if(e.getKeyCode() == KeyEvent.VK_D) {
			DynamicBeat.game.pressS();		
			}
		else if(e.getKeyCode() == KeyEvent.VK_F) {
			DynamicBeat.game.pressS();		
			}
		else if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			DynamicBeat.game.pressS();		
			}
		else if(e.getKeyCode() == KeyEvent.VK_J) {
			DynamicBeat.game.pressS();		
			}
		else if(e.getKeyCode() == KeyEvent.VK_K) {
			DynamicBeat.game.pressS();		
			}
		else if(e.getKeyCode() == KeyEvent.VK_L) {
			DynamicBeat.game.pressS();	
			}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		if(DynamicBeat.game == null) {
			return;
		}
		if(e.getKeyCode() == KeyEvent.VK_S) {
			DynamicBeat.game.releaseS();
		}
		else if(e.getKeyCode() == KeyEvent.VK_D) {
			DynamicBeat.game.releaseD();
		}
		else if(e.getKeyCode() == KeyEvent.VK_F) {
			DynamicBeat.game.releaseF();
		}
		else if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			DynamicBeat.game.releaseSpace();
		}
		else if(e.getKeyCode() == KeyEvent.VK_J) {
			DynamicBeat.game.releaseJ();
		}
		else if(e.getKeyCode() == KeyEvent.VK_K) {
			DynamicBeat.game.releaseK();
		}
		else if(e.getKeyCode() == KeyEvent.VK_L) {
			DynamicBeat.game.releaseL();
		}
	}
}
