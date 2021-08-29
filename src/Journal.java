import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class Preview extends JFrame {

	private JPanel contentPane;
	private ArrayList<EntryListener> entryListener = new ArrayList<EntryListener>();
	private Journal journal = new Journal();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Preview frame = new Preview();
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
	public Preview() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 948, 607);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(10, 10, 910, 559);
		contentPane.add(textArea);

		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension ecranDimension = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(ecranDimension.width / 2 - getSize().width / 2, ecranDimension.height / 2 - getSize().height / 2);

		setTitle("Preview");

		journal.addEntryListener(new EntryListener() {
			@Override
			public void modePreview(boolean modePreview) {
				if (modePreview) {
					windowPreview();
					System.out.println("sad");
				}
			}

			@Override
			public void setEntry(ArrayList<String> entryList) {
				for (int i = 0; i < entryList.size(); i++) {
					textArea.setText(entryList.get(i));
				}

			}
		});

	}

	private void windowPreview() {
		journal.setVisible(false);
		setVisible(true);
		System.out.println("cry");

	}

}
