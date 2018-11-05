package PetPack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;

public class Life implements ActionListener{

	 static boolean isOpen = false;
	JFrame lifeFrame;
	private JLabel lblYourMoney;
	static JLabel lblYourMoney_1;
	private JButton Marriage;
	private JButton Kids;
	private JButton House;
	private JButton btnBuyAMansion;
	private JButton btnBuyACar;
	private JButton btnBiggerVehicleCost;
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(!isOpen)
		GUIRun();
		
	}
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void GUIRun(){
		
		isOpen = true;
		lifeFrame = new JFrame();
		lifeFrame.getContentPane().setBackground(new Color(255, 255, 255));
		try {
			UIManager.setLookAndFeel(  UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lifeFrame.setResizable(false);
		
		lifeFrame.setAlwaysOnTop(true);
		
		lifeFrame.setUndecorated(true);
		lifeFrame.getContentPane().setLayout(null);
		
		Marriage = new JButton("<html>Get Married!<br/>Cost: $100</html>");
		Marriage.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
		Marriage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(GUIXlass.Money>=100){
					GUIXlass.Money-=100;
					GUIXlass.Happieness = 300;
					GUIXlass.Wife.setVisible(true);
					lblYourMoney_1.setText("Your Money: " + GUIXlass.Money);
					Marriage.setEnabled(false);
				}
			}
		});
		Marriage.setToolTipText("Instantly Refills your happiness one time");
		Marriage.setForeground(new Color(0, 0, 0));
		Marriage.setBackground(new Color(255, 0, 255));
		Marriage.setContentAreaFilled(false);
		Marriage.setOpaque(true);

		Marriage.setBounds(0, 0, 150, 100);
		lifeFrame.getContentPane().add(Marriage);
		
		Kids = new JButton("<html>Get a Kid!<br/>Cost: $250</html>");
		Kids.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(GUIXlass.Money>=250){
					GUIXlass.Money-=250;
					GUIXlass.Health -=75;
					GUIXlass.Happieness = 300;
					GUIXlass.kidGOLD.setVisible(true);
					lblYourMoney_1.setText("Your Money: " + GUIXlass.Money);
					Kids.setEnabled(false);
				
				}
			}
		});
		Kids.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
		Kids.setBackground(Color.CYAN);
		Kids.setToolTipText("Instantly Refills your happiness but Health -75");
		Kids.setBounds(150, 0, 150, 100);
		Kids.setContentAreaFilled(false);
		Kids.setOpaque(true);
		lifeFrame.getContentPane().add(Kids);
		
		House = new JButton("<html>Buy a House!<br/>Cost: $375</html>");
		House.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(GUIXlass.Money>=375){
					GUIXlass.Money-=375;
					GUIXlass.Health +=100;
					GUIXlass.Happieness += 100;
					
					
					GUIXlass.RegHouse.setVisible(true);
					lblYourMoney_1.setText("Your Money: " + GUIXlass.Money);
					House.setEnabled(false);
					GUIXlass.Mansion.setVisible(false);
				}
			}
		});
		House.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
		House.setBackground(Color.LIGHT_GRAY);
		House.setToolTipText("Happiness/Health +100");
		House.setBounds(0, 101, 150, 100);
		House.setContentAreaFilled(false);
		House.setOpaque(true);
		lifeFrame.getContentPane().add(House);
		
		btnBuyAMansion = new JButton("<html>Buy a Mansion!<br/>Cost: $500</html>");
		btnBuyAMansion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(GUIXlass.Money>=500){
					GUIXlass.Money-=500;
					GUIXlass.Health +=300;
					GUIXlass.Happieness += 300;
					GUIXlass.Mansion.setVisible(true);
					lblYourMoney_1.setText("Your Money: " + GUIXlass.Money);
					btnBuyAMansion.setEnabled(false);
					GUIXlass.RegHouse.setVisible(false);
				
				}
			}
		});
		btnBuyAMansion.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
		btnBuyAMansion.setBackground(Color.ORANGE);
		btnBuyAMansion.setToolTipText("Happiness/Health to max");
		btnBuyAMansion.setBounds(150, 101, 150, 100);
		btnBuyAMansion.setContentAreaFilled(false);
		btnBuyAMansion.setOpaque(true);
		lifeFrame.getContentPane().add(btnBuyAMansion);
		
		btnBuyACar = new JButton("<html>Buy a Car!<br/>Cost: $205</html>");
		btnBuyACar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(GUIXlass.Money>=205){
					GUIXlass.Money-=205;
					int randorun = (int) ((int)10*Math.random());
					   if(randorun == 7){
					GUIXlass.Health -=100;}
					
					GUIXlass.Happieness += 100;
					GUIXlass.RegCar.setVisible(true);
					lblYourMoney_1.setText("Your Money: " + GUIXlass.Money);
					btnBuyACar.setEnabled(false);
					GUIXlass.TANK.setVisible(false);
					GUIXlass.hasCar = true;
				}
			}
		});
		btnBuyACar.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
		btnBuyACar.setBackground(Color.BLUE);
		btnBuyACar.setToolTipText("Happiness +100 but 1 in 10 chance of Health -100");
		btnBuyACar.setBounds(0, 200, 150, 100);
		btnBuyACar.setContentAreaFilled(false);
		btnBuyACar.setOpaque(true);
		lifeFrame.getContentPane().add(btnBuyACar);
		
		btnBiggerVehicleCost = new JButton("<html>Bigger Vehicle!<br/>Cost: $1500</html>");
		btnBiggerVehicleCost.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(GUIXlass.Money>=1500){
					GUIXlass.Money-=1500;
					GUIXlass.Health = Integer.MAX_VALUE - 2000 ;
					GUIXlass.Happieness = 300;
					GUIXlass.TANK.setVisible(true);
					lblYourMoney_1.setText("Your Money: " + GUIXlass.Money);
					btnBiggerVehicleCost.setEnabled(false);
					GUIXlass.RegCar.setVisible(false);
					GUIXlass.hasCar = false;
				}
			}
		});
		btnBiggerVehicleCost.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
		btnBiggerVehicleCost.setBackground(new Color(0, 100, 0));
		btnBiggerVehicleCost.setToolTipText("Happiness -40 (Angry Wife)  Health forever max (almost)");
		btnBiggerVehicleCost.setBounds(150, 200, 150, 100);
		btnBiggerVehicleCost.setContentAreaFilled(false);
		btnBiggerVehicleCost.setOpaque(true);
		lifeFrame.getContentPane().add(btnBiggerVehicleCost);
		
		lblYourMoney_1 = new JLabel("Your Money: " + GUIXlass.Money);
		lblYourMoney_1.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
		lblYourMoney_1.setBounds(10, 325, 181, 14);
		lifeFrame.getContentPane().add(lblYourMoney_1);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lifeFrame.dispose();
				isOpen = false;
			}
		});
		btnClose.setBounds(201, 321, 89, 23);
		lifeFrame.getContentPane().add(btnClose);
		lifeFrame.setSize(300,350);
		
		
		
		
		
		
		
		
		
		
		lifeFrame.setVisible(true);
}
}