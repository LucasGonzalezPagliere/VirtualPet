package PetPack;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Font;
import javax.swing.JButton;

public class Store implements ActionListener {
	 static boolean isOpen = false;
	JFrame storeFrame;
	static JLabel lblYourMoney;
	boolean DidHeEat = false;
	
	
	
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
		GUIXlass.Animal = new ImageIcon(GUIXlass.class.getResource("/Images/StockPET.png"));
		storeFrame = new JFrame();
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
		storeFrame.setResizable(false);
		
		storeFrame.setAlwaysOnTop(true);
		
		storeFrame.setUndecorated(true);
		storeFrame.getContentPane().setLayout(null);
		storeFrame.setSize(400,400);
		JLabel label = new JLabel("$10");
		label.setFont(new Font("Eras Bold ITC", Font.BOLD, 30));
		label.setBounds(10, 48, 76, 59);
		storeFrame.getContentPane().add(label);
		
		JButton RedShirt = new JButton("Red Shirt");
		RedShirt.setToolTipText("Note: Touching the pet will result in the destruction of his shirt or racial surgery momentarily");
		RedShirt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(GUIXlass.Money >= 10){
					GUIXlass.Animal = new ImageIcon(GUIXlass.class.getResource("/Images/RedPet.png"));
				GUIXlass.GOLD.setIcon(GUIXlass.Animal);
				GUIXlass.Money -=10;
				lblYourMoney.setText("Your Money: "   + GUIXlass.Money);
			}}
		});
		RedShirt.setFont(new Font("Eras Bold ITC", Font.PLAIN, 12));
		RedShirt.setBounds(0, 118, 100, 70);
		storeFrame.getContentPane().add(RedShirt);
		
		JLabel label_1 = new JLabel("$20");
		label_1.setFont(new Font("Eras Bold ITC", Font.BOLD, 30));
		label_1.setBounds(104, 48, 76, 59);
		storeFrame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("$50");
		label_2.setFont(new Font("Eras Bold ITC", Font.BOLD, 30));
		label_2.setBounds(202, 48, 76, 59);
		storeFrame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("$100");
		label_3.setFont(new Font("Eras Bold ITC", Font.BOLD, 30));
		label_3.setBounds(301, 48, 89, 59);
		storeFrame.getContentPane().add(label_3);
		
		JButton BlueShirt = new JButton("Blue Shirt");
		BlueShirt.setToolTipText("Note: Touching the pet will result in the destruction of his shirt or racial surgery momentarily");
		BlueShirt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(GUIXlass.Money >= 20){
					GUIXlass.Animal = new ImageIcon(GUIXlass.class.getResource("/Images/BluePet.png"));
					GUIXlass.GOLD.setIcon(GUIXlass.Animal);
				GUIXlass.Money -=20;
				lblYourMoney.setText("Your Money: "   + GUIXlass.Money);
			}}
		});
		BlueShirt.setFont(new Font("Eras Bold ITC", Font.PLAIN, 12));
		BlueShirt.setBounds(99, 118, 100, 70);
		storeFrame.getContentPane().add(BlueShirt);
		
		JButton PurpleShirt = new JButton("Purple Shirt");
		PurpleShirt.setToolTipText("Note: Touching the pet will result in the destruction of his shirt or racial surgery momentarily");
		PurpleShirt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(GUIXlass.Money >= 50){
					GUIXlass.Animal = new ImageIcon(GUIXlass.class.getResource("/Images/PurplePet.png"));
					GUIXlass.GOLD.setIcon(GUIXlass.Animal);
				GUIXlass.Money -=50;
				lblYourMoney.setText("Your Money: "   + GUIXlass.Money);
				}
			}
		});
		PurpleShirt.setFont(new Font("Eras Bold ITC", Font.PLAIN, 11));
		PurpleShirt.setBounds(198, 118, 100, 70);
		storeFrame.getContentPane().add(PurpleShirt);
		
		JButton RacialSwap = new JButton("Racial Swap");
		RacialSwap.setToolTipText("Note: Touching the pet will result in the destruction of his shirt or racial surgery momentarily");
		RacialSwap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(GUIXlass.Money >= 100){
					GUIXlass.Animal = new ImageIcon(GUIXlass.class.getResource("/Images/BlackPet.png"));
					GUIXlass.GOLD.setIcon(GUIXlass.Animal);
				GUIXlass.Money -=100;
				lblYourMoney.setText("Your Money: "   + GUIXlass.Money);
			}}
		});
		RacialSwap.setFont(new Font("Eras Bold ITC", Font.PLAIN, 11));
		RacialSwap.setBounds(298, 118, 100, 70);
		storeFrame.getContentPane().add(RacialSwap);
		
		JButton candy = new JButton("Candy");
		candy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(GUIXlass.Money >= 10){
				GUIXlass.Money -= 10;
				GUIXlass.Health -=5;
				GUIXlass.Happieness +=10;
				lblYourMoney.setText("Your Money: "   + GUIXlass.Money);
				GUIXlass.GOLD.setIcon(new ImageIcon(GUIXlass.class.getResource("/Images/PetThatAte.png")));
				 DidHeEat = true;
			}}
		});
		candy.setToolTipText("Health -5 \r\n Happiness + 10");
		candy.setFont(new Font("Eras Bold ITC", Font.PLAIN, 12));
		candy.setBounds(0, 238, 100, 70);
		storeFrame.getContentPane().add(candy);
		
		JButton cake = new JButton("Cake");
		cake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(GUIXlass.Money >= 20){
					GUIXlass.Money -= 20;
				GUIXlass.Health -=10;
				GUIXlass.Happieness +=15;
				GUIXlass.GOLD.setIcon(new ImageIcon(GUIXlass.class.getResource("/Images/PetThatAte.png")));
				lblYourMoney.setText("Your Money: "   + GUIXlass.Money);
				DidHeEat = true;
			}}
		});
		cake.setToolTipText("Health -10  Happiness +15");
		cake.setFont(new Font("Eras Bold ITC", Font.PLAIN, 12));
		cake.setBounds(99, 238, 100, 70);
		storeFrame.getContentPane().add(cake);
		
		JButton coke = new JButton("Coke");
		coke.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(GUIXlass.Money >= 50){
					GUIXlass.Money -= 50;
				GUIXlass.Health -=25;
				GUIXlass.Happieness +=40;
				GUIXlass.GOLD.setIcon(new ImageIcon(GUIXlass.class.getResource("/Images/PetThatAte.png")));
				lblYourMoney.setText("Your Money: "   + GUIXlass.Money);
				DidHeEat = true;
				}}
		});
		coke.setToolTipText("Health -25  Happiness + 40");
		coke.setFont(new Font("Eras Bold ITC", Font.PLAIN, 12));
		coke.setBounds(198, 238, 100, 70);
		storeFrame.getContentPane().add(coke);
		
		JButton btnDonuts = new JButton("Donuts");
		btnDonuts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(GUIXlass.Money >= 100){
					GUIXlass.Money -= 100;
				GUIXlass.Health -=20;
				GUIXlass.Happieness +=50;
				GUIXlass.GOLD.setIcon(new ImageIcon(GUIXlass.class.getResource("/Images/PetThatAte.png")));
				lblYourMoney.setText("Your Money: "   + GUIXlass.Money);
				DidHeEat = true;
				}}
		});
		btnDonuts.setToolTipText("Health -20  Happiness + 50");
		btnDonuts.setFont(new Font("Eras Bold ITC", Font.PLAIN, 12));
		btnDonuts.setBounds(298, 238, 100, 70);
		storeFrame.getContentPane().add(btnDonuts);
		
		JButton Brocoli = new JButton("Broccoli");
		Brocoli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(GUIXlass.Money >= 10){
					GUIXlass.Money -= 10;
				GUIXlass.Health +=15;
				GUIXlass.Happieness -=25;
				GUIXlass.GOLD.setIcon(new ImageIcon(GUIXlass.class.getResource("/Images/PetThatAte.png")));
				lblYourMoney.setText("Your Money: "   + GUIXlass.Money);
				DidHeEat = true;
			}}
		});
		Brocoli.setToolTipText("Health +15  Happiness -25");
		Brocoli.setFont(new Font("Eras Bold ITC", Font.PLAIN, 12));
		Brocoli.setBounds(0, 319, 100, 70);
		storeFrame.getContentPane().add(Brocoli);
		
		JButton Oatmeal = new JButton("Oatmeal");
		Oatmeal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(GUIXlass.Money >= 20){
					GUIXlass.Money -= 20;
				GUIXlass.Health +=25;
				GUIXlass.Happieness -=30;
				GUIXlass.GOLD.setIcon(new ImageIcon(GUIXlass.class.getResource("/Images/PetThatAte.png")));
				lblYourMoney.setText("Your Money: "   + GUIXlass.Money);
				DidHeEat = true;
			}}
		});
		Oatmeal.setToolTipText("Health + 25  Happiness -30");
		Oatmeal.setFont(new Font("Eras Bold ITC", Font.PLAIN, 12));
		Oatmeal.setBounds(99, 319, 100, 70);
		storeFrame.getContentPane().add(Oatmeal);
		
		JButton Fruits = new JButton("Fruits");
		Fruits.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(GUIXlass.Money >= 50){
					GUIXlass.Money -= 50;
				GUIXlass.Health +=15;
				GUIXlass.Happieness +=5;
				GUIXlass.GOLD.setIcon(new ImageIcon(GUIXlass.class.getResource("/Images/PetThatAte.png")));
				lblYourMoney.setText("Your Money: "   + GUIXlass.Money);
				DidHeEat = true;
			}}
		});
		Fruits.setToolTipText("Health + 15  Happiness +5");
		Fruits.setFont(new Font("Eras Bold ITC", Font.PLAIN, 12));
		Fruits.setBounds(198, 319, 100, 70);
		storeFrame.getContentPane().add(Fruits);
		
		JButton Salmon = new JButton("Whey Protein");
		Salmon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(GUIXlass.Money >= 100){
					GUIXlass.Money -= 100;
				GUIXlass.Health +=75;
				GUIXlass.Happieness -=25;
				GUIXlass.GOLD.setIcon(new ImageIcon(GUIXlass.class.getResource("/Images/PetThatAte.png")));
				lblYourMoney.setText("Your Money: "   + GUIXlass.Money);
				DidHeEat = true;
			}}
		});
		Salmon.setToolTipText("Health +75  Happiness -25");
		Salmon.setFont(new Font("Eras Bold ITC", Font.PLAIN, 9));
		Salmon.setBounds(298, 319, 100, 70);
		storeFrame.getContentPane().add(Salmon);
		
		JLabel lblStore = new JLabel("STORE");
		lblStore.setFont(new Font("Eras Bold ITC", Font.BOLD, 30));
		lblStore.setBounds(10, 5, 121, 36);
		storeFrame.getContentPane().add(lblStore);
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				GUIXlass.GOLD.setIcon(GUIXlass.Animal);
				
				if(DidHeEat){
					DidHeEat=false;
					GUIXlass.PoopLbl.setVisible(true);
				}
				isOpen = false;
				storeFrame.dispose();
			}
		});
		btnClose.setFont(new Font("Eras Bold ITC", Font.PLAIN, 13));
		btnClose.setBounds(301, 18, 89, 23);
		storeFrame.getContentPane().add(btnClose);
		
		lblYourMoney = new JLabel("Your Money: "   + GUIXlass.Money);
		lblYourMoney.setFont(new Font("Eras Bold ITC", Font.PLAIN, 12));
		lblYourMoney.setBounds(129, 18, 169, 19);
		storeFrame.getContentPane().add(lblYourMoney);
		
		JLabel lblFeed = new JLabel("Feed");
		lblFeed.setFont(new Font("Eras Bold ITC", Font.BOLD, 18));
		lblFeed.setBounds(173, 208, 58, 19);
		storeFrame.getContentPane().add(lblFeed);
		
		
		storeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		storeFrame.setVisible(true);
	}
}
