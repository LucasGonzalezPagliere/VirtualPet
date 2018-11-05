package PetPack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class BettingGame implements ActionListener {

	 static public boolean isOpen = false;
	JFrame betFrame;
	private JTextField BetAmount;
	static JLabel lblYourMoney;
	private JButton btnNewButton;
	private JButton btnx_2;
	private JButton btnx;
	private JButton btnx_3;
	private JButton btnx_1;
	private JButton btnx_4;
	private JButton btnExit;
	/**
	 * @wbp.parser.entryPoint
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		if(!isOpen){
			isOpen = true;
		betFrame = new JFrame();
		betFrame.setAlwaysOnTop(true);
		betFrame.setBounds(Work.workFrame.getX(), Work.workFrame.getY(), 200, 220);
		
		betFrame.setUndecorated(true);
		betFrame.getContentPane().setLayout(null);
		
		JLabel lblBettingAmount = new JLabel("Betting Amount:");
		lblBettingAmount.setBounds(10, 68, 85, 14);
		betFrame.getContentPane().add(lblBettingAmount);
		
		lblYourMoney = new JLabel("YOUR MONEY: " + GUIXlass.Money);
		lblYourMoney.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblYourMoney.setBounds(3, 11, 200, 31);
		betFrame.getContentPane().add(lblYourMoney);
		
		BetAmount = new JTextField();
		BetAmount.setBounds(105, 65, 86, 20);
		betFrame.getContentPane().add(BetAmount);
		BetAmount.setColumns(10);
		
		btnNewButton = new JButton("2x");
		btnNewButton.setToolTipText("1 in 3 Chance of winning");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(GUIXlass.Money >= Integer.parseInt(BetAmount.getText())){
				int rando1 = (int) (3*Math.random());
				if(rando1 ==1){
					GUIXlass.Money += 2*(Integer.parseInt(BetAmount.getText()));
				}else{
					GUIXlass.Money -= Integer.parseInt(BetAmount.getText());
				}
				lblYourMoney.setText("YOUR MONEY: " + GUIXlass.Money);
			}}
		});
		btnNewButton.setBounds(10, 103, 52, 36);
		betFrame.getContentPane().add(btnNewButton);
		
		btnx = new JButton("5x");
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(GUIXlass.Money >= Integer.parseInt(BetAmount.getText())){
				int rando2 = (int) (7*Math.random());
				if(rando2 ==5){
					GUIXlass.Money += 5*(Integer.parseInt(BetAmount.getText()));
				}
				else{
					GUIXlass.Money -= Integer.parseInt(BetAmount.getText());
				}
				lblYourMoney.setText("YOUR MONEY: " + GUIXlass.Money);
			}}}
		);
		btnx.setToolTipText("1 in 7 Chance of winning");
		btnx.setBounds(72, 103, 52, 36);
		betFrame.getContentPane().add(btnx);
		
		btnx_1 = new JButton("10x");
		btnx_1.setToolTipText("1 in 13 Chance of winning");
		btnx_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(GUIXlass.Money >= Integer.parseInt(BetAmount.getText())){
				int rando3 = (int) (13*Math.random());
				if(rando3 ==7){
					GUIXlass.Money += 10*(Integer.parseInt(BetAmount.getText()));
				}
				else{
					GUIXlass.Money -= Integer.parseInt(BetAmount.getText());
				}
				lblYourMoney.setText("YOUR MONEY: " + GUIXlass.Money);
				}}
		});
		btnx_1.setBounds(138, 103, 52, 36);
		betFrame.getContentPane().add(btnx_1);
		
		btnx_2 = new JButton("15x");
		btnx_2.setToolTipText("1 in 16 Chance of winning");
		btnx_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(GUIXlass.Money >= Integer.parseInt(BetAmount.getText())){
				int rando4 = (int) (16*Math.random());
				if(rando4 ==9){
					GUIXlass.Money += 15*(Integer.parseInt(BetAmount.getText()));
				}
				else{
					GUIXlass.Money -= Integer.parseInt(BetAmount.getText());
				}
				lblYourMoney.setText("YOUR MONEY: " + GUIXlass.Money);
			}}}
		);
		btnx_2.setBounds(10, 150, 52, 36);
		betFrame.getContentPane().add(btnx_2);
		
		btnx_3 = new JButton("50x");
		btnx_3.setToolTipText("1 in 30 Chance of winning");
		btnx_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(GUIXlass.Money >= Integer.parseInt(BetAmount.getText())){
				int rando5 = (int) (30*Math.random());
				if(rando5 ==7){
					GUIXlass.Money += 50*(Integer.parseInt(BetAmount.getText()));
				}
				else{
					GUIXlass.Money -= Integer.parseInt(BetAmount.getText());
				}
				lblYourMoney.setText("YOUR MONEY: " + GUIXlass.Money);
				
			}}
		});
		btnx_3.setBounds(72, 150, 52, 36);
		betFrame.getContentPane().add(btnx_3);
		
		btnx_4 = new JButton("99x");
		btnx_4.setToolTipText("1 in 75 Chance of winning");
		btnx_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(GUIXlass.Money >= Integer.parseInt(BetAmount.getText())){
				int rando6 = (int) (75*Math.random());
				if(rando6 ==7){
					GUIXlass.Money += 99*(Integer.parseInt(BetAmount.getText()));
				}
				else{
					GUIXlass.Money -= Integer.parseInt(BetAmount.getText());
				}
				lblYourMoney.setText("YOUR MONEY: " + GUIXlass.Money);
			}}
		});
		btnx_4.setBounds(139, 150, 52, 36);
		betFrame.getContentPane().add(btnx_4);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Work.lblMoney.setText("Money: " + GUIXlass.Money);
				betFrame.dispose();
				isOpen = false;
			}
		});
		btnExit.setBounds(52, 197, 89, 23);
		betFrame.getContentPane().add(btnExit);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		betFrame.setVisible(true);
	}
}
}