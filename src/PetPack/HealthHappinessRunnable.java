package PetPack;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



public class HealthHappinessRunnable implements Runnable {

	
	
	
	boolean loop = true;
	boolean finish = true;
	boolean once = true;
	int i = 0;
	
	
	@Override
	public void run() {
		
		while(loop)
			while(finish){
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("penis");
					e.printStackTrace();
				}
				
				
				String Cash = "" + GUIXlass.Money;
				GUIXlass.MONEYlabel.setText(Cash);
				
				GUIXlass.Health -= GUIXlass.HealthMovement;
				GUIXlass.HealthBar.setValue(GUIXlass.Health);
				GUIXlass.Happieness -= GUIXlass.HappyMovement;
				System.out.println("Happiness: " + GUIXlass.Happieness);
				System.out.println("Health: " + GUIXlass.Health);
				GUIXlass.HappinessBar.setValue(GUIXlass.Happieness);
				
				if(GUIXlass.Health > 170){
					GUIXlass.HealthBar.setForeground(Color.GREEN);
				}
				if(GUIXlass.Health < 170){
					if(GUIXlass.Health< 170 && GUIXlass.Health > 70){
						GUIXlass.HealthBar.setForeground(Color.YELLOW);
					}
					else{
						GUIXlass.HealthBar.setForeground(Color.RED);
					}
				}
				if(GUIXlass.Happieness <=0){
					GUIXlass.Happieness =0;
				}
				if(GUIXlass.Happieness <= 0 && once){
					
					GUIXlass.HealthMovement *= 3;
					JOptionPane.showMessageDialog(null, "Your happiness is at zero, your health will now go down three times as fast");
					once = false;
					run();
					
					
				}
				if(GUIXlass.Happieness > 0 && !once){
					GUIXlass.HealthMovement /= 3;
					once = true;				
				}
				if(GUIXlass.Health <1){
					GUIXlass.GOLD.setIcon(new ImageIcon(GUIXlass.class.getResource("/Images/DeadPET.png")));
					JOptionPane.showMessageDialog(null, "you lose, " + GUIXlass.name + " is dead.");
					GUIXlass.frame.dispose();
					finish = false;
					
					
				}
				if(GUIXlass.Happieness > 300)
					GUIXlass.Happieness =300;
				
				
                 if(Store.isOpen){
                	 try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				Store.lblYourMoney.setText("Your Money: "   + GUIXlass.Money);
                 }
                 if(Life.isOpen){
                	 try {
 						Thread.sleep(500);
 					} catch (InterruptedException e) {
 						// TODO Auto-generated catch block
 						e.printStackTrace();
 					}
                 
				Life.lblYourMoney_1.setText("Your Money: " + GUIXlass.Money);
                 }
                 if(Work.isOpen){
                	 //checks if hui is closed
				//Work.lblMoney.setText("Money: " + GUIXlass.Money);
                 }
                 if(BettingGame.isOpen){
                	 try {
 						Thread.sleep(500);
 					} catch (InterruptedException e) {
 						// TODO Auto-generated catch block
 						e.printStackTrace();
 					}
                 
				BettingGame.lblYourMoney.setText("YOUR MONEY: " + GUIXlass.Money);
                 }
			}
		
	}

}
