import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.ListCellRenderer;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Journal extends JFrame {

	private JPanel contentPane;
	private JLabel lblJournalTitle;
	private JComboBox comboBoxFont;
	private JSpinner spnSize;
	private JTextArea textArea;
	private String fontName[];
	private Integer array[];
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Journal frame = new Journal();
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
	public Journal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1237, 723);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(new Color(255, 234, 236));
		contentPane.setLayout(null);
		setTitle("Journal");
		contentPane.setLayout(null);

		lblJournalTitle = new JLabel("Journal New Entry");
		lblJournalTitle.setFont(new Font("UD Digi Kyokasho NK-B", Font.PLAIN, 44));
		lblJournalTitle.setBounds(408, 10, 417, 52);
		contentPane.add(lblJournalTitle);

		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		fontName = ge.getAvailableFontFamilyNames();
		array = new Integer[fontName.length];
		for (int i = 1; i <= fontName.length; i++) {
			array[i - 1] = i;
		}

		comboBoxFont = new JComboBox(array);
	
		ComboBoxRenderar renderar = new ComboBoxRenderar();
		comboBoxFont.setRenderer(renderar);
		getContentPane().add(comboBoxFont);

		comboBoxFont.setBounds(232, 91, 196, 19);
		contentPane.add(comboBoxFont);
	comboBoxFont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Font font = new Font((String)(comboBoxFont.getSelectedItem()+""), Font.PLAIN, (int) spnSize.getValue());
				textArea.setFont(font);
			}
		});
	
	
		spnSize = new JSpinner();

		spnSize.setModel(new SpinnerNumberModel(new Integer(12), new Integer(1), null, new Integer(1)));
		spnSize.setBounds(438, 91, 60, 20);
		contentPane.add(spnSize);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(212, 135, 808, 501);
		contentPane.add(scrollPane);

		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setLineWrap(true);
		spnSize.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				Font font = new Font(comboBoxFont.getFont().getName(), Font.PLAIN, (int) spnSize.getValue());
				textArea.setFont(font);
			}
		});

		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension ecranDimension = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation(ecranDimension.width / 2 - getSize().width / 2, ecranDimension.height / 2 - getSize().height / 2);

	}

	private class ComboBoxRenderar extends JLabel implements ListCellRenderer {
		@Override
		public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected,
				boolean cellHasFocus) {
			int offset = ((Integer) value).intValue() - 1;
			String name = fontName[offset];
			setText(name);
			setFont(new Font(name, Font.PLAIN, 20));
			return this;
		}
	}

}
