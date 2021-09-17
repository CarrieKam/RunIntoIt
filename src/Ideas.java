import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JScrollPane;
import java.awt.Component;
import java.awt.Font;

public class Ideas extends JFrame {

	private JPanel contentPane;
	private JTextArea txtrIdeas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ideas frame = new Ideas();
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
	public Ideas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 320, 820);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 306, 783);
		contentPane.add(scrollPane);
		
		txtrIdeas = new JTextArea();
		txtrIdeas.setBorder(new EmptyBorder(10, 10, 10, 10));
		txtrIdeas.setWrapStyleWord(true);
		txtrIdeas.setLineWrap(true);
		txtrIdeas.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
		scrollPane.setViewportView(txtrIdeas);
		txtrIdeas.setBackground(new Color(240, 230, 140));
		txtrIdeas.setEditable(false);
		
		txtrIdeas.setText("1. 3 Good things that happened to you and WHY \r\n\r\n2. To do list \r\n\r\n3. What is the most beautiful thing you\u2019ve ever seen?\r\n\r\n4. Have you ever been in love?  How do you know?\r\n\r\n5. What is the hardest truth you\u2019ve ever learned?\r\n\r\n6. What is your greatest dream in life?\r\n\r\n7. Does history repeat itself?  Why or why not?\r\n\r\n8. If someone were to guess what kind of person you are based on your handwriting, what do you think they would predict?\r\n\r\n9. Make up an alter ego for yourself.  Give him or her a name, and then describe his or her qualities, looks, etc.\r\n\r\n10. If you could invent one thing to make your life easier, what would it be?\r\n\r\n11. Who is your hero?  What do you admire about him or her?\r\n\r\n12. What is the greatest lesson you\u2019ve ever learned?\r\n\r\n13. How would you feel if your best friend got something that you\u2019ve really wanted?  How would you respond?\r\n\r\n14. Do you prefer to donate time or money to those in need?  Why?\r\n\r\n15. Do you find it difficult to make new friends?  Why or why not?\r\n\r\n16. What is the best day of the year?  Why is it so special to you?\r\n\r\n17. What does your dream house look like?  Describe it in detail.");
		
		
	}
}
