package PetPack;

import java.awt.MouseInfo;

public class PhysicsThread implements Runnable {

	
	
	MovementThread Handler = new MovementThread();
	
	static boolean loop = true;
	boolean dead = true;
	boolean deadForX = true;
	static boolean finish = false;
	static int vertical_speed = 0;
	static int horizontal_speed = 0;
	static int air_resistance = 1;
	static int terminal_speed = 14;
	static int gravity = 1;
	boolean didItHitAWall = false;
	int speed = 25;
	int newspeed = 10000;
	@Override
	public void run() {
		
		while(loop){
			//System.out.println(finish);
			//JUST SO IT CHECK THE BOOLEAN "FINISH"
			try {
				Thread.sleep(10);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			//WHERE THE REAL SHIT BEGINS
			
			while(finish){
				
				
				
				
				//System.out.println("The change in the Y: "+Handler.changeY());
				
			//	System.out.println("The change in the Y (Real?):" +Handler.changeY(MovementThread.yInitial, MovementThread.yFinal));
				System.out.println("HANDLER Y CALL: " + Handler.changeY());
	if((Handler.changeY()>-50 && (Handler.changeY()<0) && dead)){
		vertical_speed = -5;
		dead = false;
		System.out.println("/////////////MOVING UP////////////////");
	}
	else if((Handler.changeY()<=-50)&& (Handler.changeY()>70) && dead){
		vertical_speed = -10;
		dead = false;
		System.out.println("///////////////MOVING UP FAST/////////////");
	}
	else if((Handler.changeY()<=-70)&& (Handler.changeY()>150) && dead){
		vertical_speed = -15;
		dead = false;
		System.out.println("///////////////MOVING UP FASTER/////////////");
	}
	else if((Handler.changeY()<=-150)&& (Handler.changeY()>200) && dead){
		vertical_speed = -20;
		dead = false;
		System.out.println("///////////////MOVING UP FASTEST/////////////");
	}
	else if((Handler.changeY()<=-200)&& (Handler.changeY()>250) && dead){
		vertical_speed = -25;
		dead = false;
		System.out.println("///////////////MOVING UP ULTRAFAST/////////////");
	}else if((Handler.changeY()<=-250)&& (Handler.changeY()>300) && dead){
		vertical_speed = -28;
		dead = false;
		System.out.println("///////////////MOVING UP ULTRAFAST2/////////////");
	}
	else if((Handler.changeY()<=-300)&& (Handler.changeY()>350) && dead){
		vertical_speed = -31;
		dead = false;
		System.out.println("///////////////MOVING UP ULTRAFAST3/////////////");
	}
	else if((Handler.changeY()<=-350)&& (Handler.changeY()>400) && dead){
		vertical_speed = -33;
		dead = false;
		System.out.println("///////////////MOVING UP ULTRAFASt4/////////////");
	}
	else if((Handler.changeY()<=-400)&& dead){
		vertical_speed = -35;
		dead = false;
		System.out.println("///////////////MOVING UP ULTRAFAST5/////////////");
	}
	
	
	
	
	
	if(Handler.changeX()>30 && Handler.changeX()<65 &&deadForX){
		horizontal_speed = 15;
		deadForX = false;
		System.out.println("MOVING RIGHT: " + Handler.changeX());
	}	
	else if(Handler.changeX()>=65&& Handler.changeX()<75 && deadForX){
		horizontal_speed = 20;
		deadForX = false;
		System.out.println("MOVING RIGHT FAST: " + Handler.changeX());
	}	
	else if(Handler.changeX()>=75&& Handler.changeX()<100 && deadForX){
		horizontal_speed = 30;
		deadForX = false;
		System.out.println("MOVING RIGHT FASTER: " + Handler.changeX());
	}	
	else if(Handler.changeX()>=100 && deadForX){
		horizontal_speed = 40;
		deadForX = false;
		System.out.println("MOVING RIGHT FASTEST: " + Handler.changeX());
	}	
	else if(((Handler.changeX()<-30)&& ((Handler.changeX()>-65) && deadForX))){
		horizontal_speed = -15;
		deadForX = false;
		System.out.println("MOVING LEFT");
	}
	else if(((Handler.changeX()<=-65)&& ((Handler.changeX()>-70) && deadForX))){
		horizontal_speed = -20;
		deadForX = false;
		System.out.println("MOVING LEFT FAST");
	}
	else if(((Handler.changeX()<=-75)&& ((Handler.changeX()>-100) && deadForX))){
		horizontal_speed = -30;
		deadForX = false;
		System.out.println("MOVING LEFT FASTER");
	}
	else if(((Handler.changeX()<=-100) && deadForX)){
		horizontal_speed = -40;
		deadForX = false;
		System.out.println("MOVING LEFT FASTEST");
	}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				if(GUIXlass.GOLD.getY() >= 286){
					vertical_speed = 0;
					horizontal_speed = 0;
					dead = true;
					deadForX = true;
					finish = false;
					
				}
				
				if(GUIXlass.GOLD.getX()>=880){
					
				
					didItHitAWall = true;
					System.out.println("HIIIITTT A WALLLL");
					GUIXlass.GOLD.setLocation(880, GUIXlass.GOLD.getY());
					horizontal_speed = -(horizontal_speed);
					//deadForX = true;
					//finish = false;
				}
				if(GUIXlass.GOLD.getX()<=-33){
				
					didItHitAWall = true;
					System.out.println("HIIIITTT A WALLLL");
					GUIXlass.GOLD.setLocation(-33, GUIXlass.GOLD.getY());
					horizontal_speed = -(horizontal_speed);
					//deadForX = true;
					//finish = false;
				
				}
				
				
				//int x_1 = MouseInfo.getPointerInfo().getLocation().x;
				try {
					Thread.sleep(speed);
				} catch (InterruptedException e) {
					System.out.println("penis");
					e.printStackTrace();
				}
				/*
				int x_2 = MouseInfo.getPointerInfo().getLocation().x;
		     	//System.out.println(x_1 + " " +x_2);	
				
				int divisor = x_1 - x_2;
				
				String devisor = "" + divisor;
				if(devisor.length() > 1){
				devisor.substring(0, 2);}
				Integer.parseInt(devisor);
				
				System.out.println("Divisor: "+devisor);
				
				if(divisor != 0){
					newspeed/= Integer.parseInt(devisor);
					speed = newspeed;
					if(speed<0)
						speed = -speed;
					
				}
				//speed /= Integer.parseInt(devisor);
				System.out.println("Speed: "+speed);
		     	
				*/
				//if(divisor <0)
				System.out.println("HORIZONTAL SPEED: " + horizontal_speed);
				System.out.println("VERTICAL SPEED: " + vertical_speed);
		     	GUIXlass.GOLD.setLocation(GUIXlass.GOLD.getX() + horizontal_speed,GUIXlass.GOLD.getY() + vertical_speed);
		     	
				//else if(divisor>0)
			    //GUIXlass.GOLD.setLocation(GUIXlass.GOLD.getX() -5,GUIXlass.GOLD.getY() + vertical_speed);
		     	
		     	if(horizontal_speed > 10)
					horizontal_speed -= air_resistance;
		     	
		     	if(horizontal_speed < -10)
					horizontal_speed += air_resistance;
				
				
                if(vertical_speed < terminal_speed)
				vertical_speed += gravity;
				//double velocity = -(x_2 - x_1)/5;
			
				
				//int YGravity = GUIXlass.GOLD.getY(); 
				
				//if(GUIXlass.GOLD.getY() < 286){
				//	YGravity = GUIXlass.GOLD.getY() + 5;
				//}
				
				//GUIXlass.GOLD.setLocation((int) (GUIXlass.GOLD.getX() + velocity), YGravity);
				
				
				
			   //  System.out.println("velocity: " + velocity);
			
			
			
			
			
			
			
			
			
			
				
				
				
				
				
				
}
}}}