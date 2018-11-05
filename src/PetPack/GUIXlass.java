package PetPack;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SpringLayout;
import javax.swing.SwingUtilities;

import java.awt.Font;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;





import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GUIXlass {
	
	static JFrame frame;
	static public JLabel GOLD;
	static JLabel MONEYlabel;
	static JProgressBar HealthBar;
	static JProgressBar HappinessBar;
	private JButton LIFEBTN;
	private JButton STOREBTN;
	private JButton WORKBTN;
	private JButton INTERACTBTN;
	static JLabel RegHouse;
	static JLabel Mansion;
	static JLabel RegCar;
	static JLabel TANK;
	static JLabel kidGOLD;
	static JLabel Wife;
	static String name = "tom";
	public static ImageIcon Animal;
	public static int UnhappinessRate = 3;
	static int time = 1;
	int xpress=0;
	int ypress=0;
	static boolean hasCar = false;
    static boolean bmwrun = false;
    static boolean tankrun = false;
	
	//Timer stopwatch = new Timer(null);
	
    //IMPORTANT VARIABLES
	public static int Health = 300;
	public static int Happieness = 300;
	public static int HappyMovement = 1;
	public static int HealthMovement = 1;
	public static int Money = 15000;
	Thread BMW =new Thread(new VehicleClass());
	Thread PhysicsEng = new Thread(new PhysicsThread());
	Thread MovementCalc = new Thread(new MovementThread());
	Thread t = new Thread(new HealthHappinessRunnable());
	public static JLabel PoopLbl;
	private JLabel namelbl;
	private JButton btnNewButton;
	private JButton btnExitVehicle;
	
	
	public GUIXlass(){
		
		name = JOptionPane.showInputDialog("Type a name for your pet: ");
		
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(GUIXlass.class.getResource("/Images/BACKGROUND.png")));
		
		
		//frame.setUndecorated(true);
		
		frame.setResizable(false);
		
		
		frame.setAlwaysOnTop(false);
		
		Animal = new ImageIcon(GUIXlass.class.getResource("/Images/StockPET.png"));
		frame.setSize(1000, 500);
		frame.getContentPane().setLayout(null);
		
		INTERACTBTN = new JButton("");
		INTERACTBTN.addActionListener(new Interact());
		INTERACTBTN.setIcon(new ImageIcon(GUIXlass.class.getResource("/Images/InteractBUTTON.png")));
		INTERACTBTN.setBounds(690, 11, 142, 170);
		frame.getContentPane().add(INTERACTBTN);
		
		WORKBTN = new JButton("");
		WORKBTN.addActionListener(new Work());
		WORKBTN.setIcon(new ImageIcon(GUIXlass.class.getResource("/Images/WorkBUTTON.png")));
		WORKBTN.setBounds(534, 11, 142, 170);
		frame.getContentPane().add(WORKBTN);
		
		STOREBTN = new JButton("");
		STOREBTN.addActionListener(new Store());
		STOREBTN.setIcon(new ImageIcon(GUIXlass.class.getResource("/Images/StoreBUTTON.png")));
		STOREBTN.setBounds(382, 11, 142, 170);
		frame.getContentPane().add(STOREBTN);
		
		LIFEBTN = new JButton("");
		LIFEBTN.addActionListener(new Life());
		LIFEBTN.setIcon(new ImageIcon(GUIXlass.class.getResource("/Images/LifeBUTTON.png")));
		LIFEBTN.setBounds(842, 11, 142, 170);
		
		frame.getContentPane().add(LIFEBTN);
		
		GOLD = new JLabel("");
		
		GOLD.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				/*SwingUtilities.convertPointFromScreen(MouseInfo.getPointerInfo().getLocation(), frame);
				Point y = MouseInfo.getPointerInfo().getLocation() - frame.getLocation();
				GOLD.setLocation((int)y.getX(), (int)y.getY());
				*/
				MovementThread.runner = true;
				xpress=e.getX();
				ypress=e.getY();
				//stopwatch.start();
			}
			@Override
			public void mouseReleased(MouseEvent arg0) {
				//REVIEW, ALMOST WORKS
				int whereY = GOLD.getY();
				int whereX = GOLD.getX();
				MovementThread.runner = false;
				//stopwatch.stop();
				//time = (int) stopwatch.getCurrentTime();
				//stopwatch.reset();
				MovementThread.Ychange = 0;
				PhysicsThread.finish = true;
				System.out.println(PhysicsThread.finish);
				System.out.println("X: "+MouseInfo.getPointerInfo().getLocation().x);
				//while(GOLD.getY()<282){
				//GOLD.setLocation(whereX,whereY + 20);}
			}
		});
		GOLD.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent x) {
				GOLD.setLocation(x.getXOnScreen()-xpress, x.getYOnScreen()-ypress);
			}
		});
		GOLD.setIcon(new ImageIcon(GUIXlass.class.getResource("/Images/StockPET.png")));
		GOLD.setBounds(405, 287, 131, 150);
		frame.getContentPane().add(GOLD);
		
		JLabel lblHappiness = new JLabel("Happiness:");
		lblHappiness.setFont(new Font("Trebuchet MS", Font.BOLD, 27));
		lblHappiness.setBounds(10, 48, 160, 33);
		frame.getContentPane().add(lblHappiness);
		
		JLabel lblHealth = new JLabel("Health:");
		lblHealth.setFont(new Font("Trebuchet MS", Font.BOLD, 27));
		lblHealth.setBounds(10, 85, 109, 33);
		frame.getContentPane().add(lblHealth);
		
		HappinessBar = new JProgressBar();
		HappinessBar.setMaximum(300);
		HappinessBar.setForeground(Color.GREEN);
		HappinessBar.setBounds(162, 55, 165, 26);
		HappinessBar.setValue(Happieness);
		frame.getContentPane().add(HappinessBar);
		
		HealthBar = new JProgressBar();
		HealthBar.setValue(300);
		HealthBar.setForeground(Color.GREEN);
		HealthBar.setMaximum(300);
		HealthBar.setBounds(162, 92, 165, 26);
		HealthBar.setValue(Health);
		frame.getContentPane().add(HealthBar);
		
		JLabel lblMoney = new JLabel("Money:");
		lblMoney.setFont(new Font("Trebuchet MS", Font.BOLD, 27));
		lblMoney.setBounds(10, 119, 109, 33);
		frame.getContentPane().add(lblMoney);
		
		
		String Cash = "" + Money;
		MONEYlabel = new JLabel(Cash);
		MONEYlabel.setHorizontalAlignment(SwingConstants.TRAILING);
		MONEYlabel.setFont(new Font("Trebuchet MS", Font.BOLD, 27));
		MONEYlabel.setBounds(218, 119, 109, 33);
		frame.getContentPane().add(MONEYlabel);
		
		RegHouse = new JLabel("");
		RegHouse.setIcon(new ImageIcon(GUIXlass.class.getResource("/Images/RegularHouse.png")));
		RegHouse.setBounds(0, 163, 299, 297);
		
		//MAKES INVISIBLE
		RegHouse.setVisible(false);
		
		Mansion = new JLabel("");
		Mansion.setIcon(new ImageIcon(GUIXlass.class.getResource("/Images/MainsionHouse.png")));
		Mansion.setBounds(-13, 156, 467, 287);
		
		//MAKES INVISIBLE
	    Mansion.setVisible(false);
		
		RegCar = new JLabel("");
		
		RegCar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnNewButton.setVisible(true);
				btnExitVehicle.setVisible(true);
			}
		});
		RegCar.setIcon(new ImageIcon(GUIXlass.class.getResource("/Images/4seriessmall.png")));
		RegCar.setBounds(672, 332, 299, 90);
		//MAKES INVISIBEL
		RegCar.setVisible(false);
		
		PoopLbl = new JLabel("");
		PoopLbl.setIcon(new ImageIcon(GUIXlass.class.getResource("/Images/POOP.png")));
		PoopLbl.setBounds(451, 324, 142, 136);
		PoopLbl.setVisible(false);
		//ADDING THE KEYLISTENER
		frame.addKeyListener(new CarKeys());
		GOLD.addKeyListener(new CarKeys());
		RegCar.addKeyListener(new CarKeys());
		
		
		
		btnNewButton = new JButton("Enter Vehicle");
		btnNewButton.setVisible(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GOLD.setVisible(false);
				if(hasCar){
					System.out.println("CAR CONFIRMED");
					bmwrun = true;
					BMW.start();
				}
				else{
					System.out.println("Tank CONFIRMED");
					tankrun = true;
					//same thing 
					BMW.start();
				}
				
			}
		});
		btnNewButton.setBounds(647, 437, 109, 23);
		frame.getContentPane().add(btnNewButton);
		frame.getContentPane().add(PoopLbl);
		
		
		frame.getContentPane().add(RegCar);
		
		btnExitVehicle = new JButton("Exit Vehicle");
		btnExitVehicle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GOLD.setVisible(true);
				btnNewButton.setVisible(false);
				btnExitVehicle.setVisible(false);
				RegCar.setLocation(672, 332);
				TANK.setLocation(502, 232);
			}
		});
		
		
		btnNewButton.addKeyListener(new CarKeys());
		btnExitVehicle.addKeyListener(new CarKeys());
		
		
		btnExitVehicle.setVisible(false);
		btnExitVehicle.setBounds(842, 437, 109, 23);
		frame.getContentPane().add(btnExitVehicle);
		
		frame.getContentPane().add(Mansion);
		
		frame.getContentPane().add(RegHouse);
		
		TANK = new JLabel("");
		TANK.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btnNewButton.setVisible(true);
				btnExitVehicle.setVisible(true);
			}
		});
		TANK.setIcon(new ImageIcon(GUIXlass.class.getResource("/Images/tanksmall.png")));
		TANK.setBounds(485, 231, 531, 171);
		//MAKE INVISIBLE
		TANK.setVisible(false);
		
		Wife = new JLabel("");
		Wife.setIcon(new ImageIcon(GUIXlass.class.getResource("/Images/WifePET.png")));
		Wife.setBounds(507, 268, 73, 162);
		Wife.setVisible(false);
		frame.getContentPane().add(Wife);
		
		frame.getContentPane().add(TANK);
		
		kidGOLD = new JLabel("");
		kidGOLD.setIcon(new ImageIcon(GUIXlass.class.getResource("/Images/KidPet.png")));
		kidGOLD.setBounds(324, 268, 124, 160);
		kidGOLD.setVisible(false);
		frame.getContentPane().add(kidGOLD);
		
		namelbl = new JLabel(name);
		namelbl.setHorizontalAlignment(SwingConstants.CENTER);
		namelbl.setFont(new Font("Trebuchet MS", Font.BOLD, 27));
		namelbl.setBounds(10, 11, 317, 26);
		frame.getContentPane().add(namelbl);
		
		
		JLabel contentPane_1 = new JLabel();
		contentPane_1.setBounds(0, 0, 1000, 500);
	//	contentPane_1.setHorizontalAlignment(0);
		contentPane_1.setIcon(new ImageIcon(GUIXlass.class.getResource("/Images/BACKGROUND.png")));
		contentPane_1.setLayout(new SpringLayout());
		frame.getContentPane().add(contentPane_1);
		//frame.setBackground(new ImageIcon(GUIXlass.class.getResource("/Images/BACKGROUND.png")));
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		t.start();
		MovementCalc.start();
		PhysicsEng.start();
	}
}
