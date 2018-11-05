package PetPack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Shape;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Work implements ActionListener {
	 static public boolean isOpen = false;
	static JFrame workFrame;
	private JButton ExitBTN;
	private JButton Work;
boolean OnlyOnce = true;
	
	int x = 1;
	static JLabel lblMoney;
	private JButton BettingGame;
	private JLabel lblNewLabel;
	double TotalHoursWorked = 8;
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(!isOpen)
		GUIRun();
		
	}
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void GUIRun(){
		TotalHoursWorked = 8;
		isOpen = true;
		if(OnlyOnce){
			JOptionPane.showMessageDialog(null, "By clicking on 'Work', you will gain about 4 dollars. After working for 8 hours straight you will receive an 100 dollar bonus" + "\n"+"but the hours will then increase. Your happiness also goes down everytime you click 'Work'" + "\n" + "Click on the computer screen to enter a betting game." + "\n" + "Hint: Hover over buttons for odds");
			OnlyOnce = false;
		}
		
		Shape shape = new Ellipse2D.Double(25,22,450,452);
		GUIXlass.Animal = new ImageIcon(GUIXlass.class.getResource("/Images/StockPET.png"));
		workFrame = new JFrame();
		
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
		workFrame.setResizable(false);
		
		workFrame.setAlwaysOnTop(true);
		
		workFrame.setUndecorated(true);
		workFrame.getContentPane().setLayout(null);
		workFrame.setBounds(300,200,500,500);
		
		ExitBTN = new JButton("");
		ExitBTN.setOpaque(false);
	     ExitBTN.setContentAreaFilled(false);
	     ExitBTN.setBorderPainted(false);
		ExitBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				workFrame.dispose();
				isOpen = false;
			}
		});
		ExitBTN.setBounds(343, 233, 89, 76);
		workFrame.getContentPane().add(ExitBTN);
		
		Work = new JButton("");
		Work.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				TotalHoursWorked -= 0.3;
				GUIXlass.Happieness -= GUIXlass.UnhappinessRate;
				GUIXlass.Money += 4;
				if(TotalHoursWorked<=0){
					x++;
					GUIXlass.Money += 100;
					
					
					TotalHoursWorked = 8*x;
				}
				lblNewLabel.setText(""+TotalHoursWorked);
				lblMoney.setText("Money: " + GUIXlass.Money);
			}
		});
		Work.setOpaque(false);
		Work.setContentAreaFilled(false);
		Work.setBorderPainted(false);
		Work.setBounds(329, 146, 103, 76);
		workFrame.getContentPane().add(Work);
		
		lblMoney = new JLabel("Money: " + GUIXlass.Money);
		lblMoney.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 30));
		lblMoney.setBounds(47, 157, 247, 41);
		workFrame.getContentPane().add(lblMoney);
		
		BettingGame = new JButton("Betting Game");
		BettingGame.setForeground(Color.GREEN);
		BettingGame.setVerticalAlignment(SwingConstants.TOP);
		BettingGame.setHorizontalAlignment(SwingConstants.LEFT);
		BettingGame.addActionListener(new BettingGame());
		
		lblNewLabel = new JLabel(""+TotalHoursWorked);
		lblNewLabel.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 43));
		lblNewLabel.setBounds(287, 82, 112, 53);
		workFrame.getContentPane().add(lblNewLabel);
		BettingGame.setOpaque(false);
		BettingGame.setContentAreaFilled(false);
		BettingGame.setBorderPainted(false);
		BettingGame.setBounds(150, 222, 123, 128);
		workFrame.getContentPane().add(BettingGame);
		

		JLabel contentPane_1 = new JLabel();
		contentPane_1.setSize(500,500);
	//	contentPane_1.setHorizontalAlignment(0);
		contentPane_1.setIcon(new ImageIcon(GUIXlass.class.getResource("/Images/WorkGUI.png")));
		//contentPane_1.setLayout(new SpringLayout());
		workFrame.getContentPane().add(contentPane_1);
		//frame.setBackground(new ImageIcon(GUIXlass.class.getResource("/Images/BACKGROUND.png")));
		
		workFrame.setShape(shape);
		workFrame.setVisible(true);

}	
}
