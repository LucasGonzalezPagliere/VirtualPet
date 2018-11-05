package PetPack;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class VehicleClass implements Runnable {

	boolean loop = true;
	static boolean CarAnimLeft = false;
	static boolean CarAnimRight = false;
	static boolean TankAnimLeft = false;
	static boolean TankAnimRight = false;
	static boolean TankFiringAnim = false;
	static int x = 6;
	static int tanksp = 7;
	static int y =4;
	
	@Override
	public void run() {
		while(loop){
			
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			if(CarAnimLeft){
				
				GUIXlass.RegCar.setLocation(GUIXlass.RegCar.getX() - x, GUIXlass.RegCar.getY());
				System.out.println("Car Moving Left");
				x++;
			}
			if(CarAnimRight){
				x=0;
				GUIXlass.RegCar.setLocation(GUIXlass.RegCar.getX() + y , GUIXlass.RegCar.getY());
				System.out.println("Car Moving Right");
				

			}
              if(TankAnimLeft){
				
				GUIXlass.TANK.setLocation(GUIXlass.TANK.getX() - tanksp, GUIXlass.TANK.getY());
				System.out.println("TANK Moving Left");
				
			}
			if(TankAnimRight){
				
				GUIXlass.TANK.setLocation(GUIXlass.TANK.getX() + y , GUIXlass.TANK.getY());
				System.out.println("TANK Moving Right");
				

			}
			
			if(TankFiringAnim){
				GUIXlass.TANK.setIcon(new ImageIcon(GUIXlass.class.getResource("/Images/tankfirereal1.png")));
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				GUIXlass.TANK.setLocation(GUIXlass.TANK.getX() + 2 , GUIXlass.TANK.getY());
				GUIXlass.TANK.setIcon(new ImageIcon(GUIXlass.class.getResource("/Images/tankfire1.5.png")));
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				GUIXlass.TANK.setLocation(GUIXlass.TANK.getX() + 2 , GUIXlass.TANK.getY());
				GUIXlass.TANK.setIcon(new ImageIcon(GUIXlass.class.getResource("/Images/tankfire2.png")));
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				GUIXlass.TANK.setLocation(GUIXlass.TANK.getX() + 2 , GUIXlass.TANK.getY());
				GUIXlass.TANK.setIcon(new ImageIcon(GUIXlass.class.getResource("/Images/tankfire3.png")));
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				GUIXlass.TANK.setLocation(GUIXlass.TANK.getX() + 2 , GUIXlass.TANK.getY());
				GUIXlass.TANK.setIcon(new ImageIcon(GUIXlass.class.getResource("/Images/tankfire5.png")));
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				GUIXlass.TANK.setLocation(GUIXlass.TANK.getX() + 2 , GUIXlass.TANK.getY());
				
				GUIXlass.TANK.setIcon(new ImageIcon(GUIXlass.class.getResource("/Images/tankfire6.png")));
				
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				GUIXlass.TANK.setLocation(GUIXlass.TANK.getX() + 2 , GUIXlass.TANK.getY());
               GUIXlass.TANK.setIcon(new ImageIcon(GUIXlass.class.getResource("/Images/tankfire7.png")));
				
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				GUIXlass.TANK.setIcon(new ImageIcon(GUIXlass.class.getResource("/Images/tanksmall.png")));
				TankFiringAnim = false;
			}
			
		
	}}
	
	
	
	

}
