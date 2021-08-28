import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class AppRunIntoIt extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppRunIntoIt frame = new AppRunIntoIt();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AppRunIntoIt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1237, 723);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(255, 234, 236));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIntroPic = new JLabel(new ImageIcon("images/introPic.PNG"));
		lblIntroPic.setBounds(0, 0, 1232, 696);
		contentPane.add(lblIntroPic);
		
		JButton btnEnter = new JButton("ENTER");
		btnEnter.setBounds(700, 520, 300, 100);
		btnEnter.setBackground(new Color(243,154,157));
		contentPane.add(btnEnter);
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension ecranDimension = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(ecranDimension.width / 2 - getSize().width / 2, ecranDimension.height / 2 - getSize().height / 2);
		
		setTitle("Run Into It");
		

	}
}
