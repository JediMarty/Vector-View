package vector_view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Viewer {

	public Viewer() {
		start();
	}
	
	public void start() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label_map = new JLabel();
		JLabel label_tittle = new JLabel();
		ImageIcon map = new ImageIcon("map.png");
		JButton button1 = new JButton();
		JButton button2 = new JButton();
		
		label_map.setIcon(map); 
		panel.add(label_map);
		panel.setBounds(200,160,1000,836);
		
		label_tittle.setText("VECTOR VIEW - Neighborhood Analysis");
		label_tittle.setFont(new Font("",Font.PLAIN,50));
		label_tittle.setBounds(250, 50, 1000,60);
		label_tittle.setForeground(new Color(0x0000FF));
		
		button1.setText("Analysis");
		button1.setBounds(50, 300, 100, 50);
		button1.setFocusable(false);
		
		button2.setText("Locate");
		button2.setBounds(50, 400, 100, 50);
		button2.setFocusable(false);
		
		frame.setName("VV-Vector View");
		frame.setSize(1400,1030);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.black);
		frame.setLayout(null);
		frame.add(button2);
		frame.add(button1);
		frame.add(label_tittle);
		frame.add(panel);
		frame.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Viewer();

	}

}
