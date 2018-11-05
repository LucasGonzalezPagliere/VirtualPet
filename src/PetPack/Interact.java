package PetPack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JButton;
//import com.sun.speech.freetts.*;




public class Interact implements ActionListener {
    private boolean isOpen = false;
	JFrame iFrame;
   // private static final String VOICENAME = "kevin16";
	//VoiceManager voiceManager = VoiceManager.getInstance();
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	if(!isOpen)
		GUIRun();
		
	}
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void GUIRun(){
		
		isOpen=true;
		iFrame = new JFrame();
		
		
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
		iFrame.setResizable(false);
		
		iFrame.setAlwaysOnTop(true);
		
		iFrame.setUndecorated(true);
		iFrame.getContentPane().setLayout(null);
		
		JButton btnPet = new JButton("PET");
		btnPet.setToolTipText("Note: Touching the pet will result in the destruction of his shirt or racial surgery momentarily");
		btnPet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GUIXlass.GOLD.setIcon(new ImageIcon(GUIXlass.class.getResource("/Images/ExcitedPET.png")));
				//Voice voice1 = voiceManager.getVoice(VOICENAME);
				//voice1.allocate();
				//voice1.speak("I like that.");
				
			}
		});
		btnPet.setBounds(0, 0, 100, 133);
		iFrame.getContentPane().add(btnPet);
		
		JButton btnCleanPoop = new JButton("CLEAN POOP");
		btnCleanPoop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GUIXlass.PoopLbl.setVisible(false);
			}
		});
		btnCleanPoop.setBounds(0, 132, 100, 133);
		iFrame.getContentPane().add(btnCleanPoop);
		
		JButton btnNewButton = new JButton("<html>MAKE ME</br> TALK!</html>");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Voice voice = voiceManager.getVoice(VOICENAME);
				//String wordsToSay = JOptionPane.showInputDialog("Input the text you want " + GUIXlass.name + " to say!");
				//voice.allocate();
				//voice.speak(wordsToSay);
			}
		});
		btnNewButton.setBounds(0, 265, 100, 135);
		iFrame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Close");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				GUIXlass.GOLD.setIcon(GUIXlass.Animal);
				iFrame.dispose();
				isOpen = false;
			}
		});
		btnNewButton_1.setBounds(0, 398, 100, 52);
		iFrame.getContentPane().add(btnNewButton_1);
		iFrame.setSize(100,450);
		
		
		
		
		
		
		
		
		iFrame.setVisible(true);
		}	
}