package PetPack;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;



public class CarKeys implements KeyListener {

	
	
	@Override
	
	public void keyPressed(KeyEvent e) {
		if(GUIXlass.bmwrun){
		if(e.getKeyCode() == KeyEvent.VK_LEFT){
			VehicleClass.CarAnimLeft = true;
			System.out.println("Left Click");
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT){
			VehicleClass.CarAnimRight = true;
			System.out.println("Right Click");

		}
		}
		if(GUIXlass.tankrun){	
			if(e.getKeyCode() == KeyEvent.VK_LEFT){
				VehicleClass.TankAnimLeft = true;
				System.out.println("Left Click");
			}
			if(e.getKeyCode() == KeyEvent.VK_RIGHT){
				VehicleClass.TankAnimRight = true;
				System.out.println("Right Click");

			}
			if(e.getKeyCode() == KeyEvent.VK_SPACE){
				VehicleClass.TankFiringAnim = true;
				System.out.println("FIRE");

			}
	
	
	}}
	

	@Override
	public void keyReleased(KeyEvent e) {
		if(GUIXlass.bmwrun){
		   if(e.getKeyCode() == KeyEvent.VK_LEFT){
			VehicleClass.x = 5;
			VehicleClass.CarAnimLeft = false;
		  }
		   if(e.getKeyCode() == KeyEvent.VK_RIGHT){
			VehicleClass.CarAnimRight = false;
		   }}
		if(GUIXlass.tankrun){
			if(e.getKeyCode() == KeyEvent.VK_LEFT){
				
				VehicleClass.TankAnimLeft = false;
			}
			if(e.getKeyCode() == KeyEvent.VK_RIGHT){
				VehicleClass.TankAnimRight = false;
			}
			if(e.getKeyCode() == KeyEvent.VK_SPACE){
				VehicleClass.TankFiringAnim = false;
				

			}
		}
		}
	

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
