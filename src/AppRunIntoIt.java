import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
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

public class Journal extends JFrame {

	private JPanel contentPane;
	private JLabel lblJournalTitle;
	private JComboBox comboBoxFont;
	private JSpinner spnSize;
	private JTextArea textArea;
	private String fontName[];
	private Integer array[];
	private JScrollPane scrollPane;
	private ArrayList<JLabel> templateList = new <JLabel>ArrayList();
	private JLabel lblNoteTaking;
	private JLabel lblNoteTaking_1;
	private JLabel lblNoteTakingWLink;
	private JLabel lblCloud;
	private JLabel lblCloud_1;
	private JLabel lblBird;
	private JLabel lblWritingJournal;
	private JLabel lblIdea;
	private JLabel lblRelaxedBird;
	private JLabel lblBird_1;
	private JLabel lblDeskLamp;
	private JLabel lblDogGlasses;
	private JLabel lblPencil;
	private JLabel lblSettings;
	private JLabel lblOutsideBox;
	private JLabel lblPencilGreen;
	private JLabel lblPaint;

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

		comboBoxFont.setBounds(232, 91, 153, 34);
		contentPane.add(comboBoxFont);
		comboBoxFont.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Font font = new Font((String) (comboBoxFont.getSelectedItem() + ""), Font.PLAIN,
						(int) spnSize.getValue());
				textArea.setFont(font);
			}
		});

		spnSize = new JSpinner();

		spnSize.setModel(new SpinnerNumberModel(new Integer(12), new Integer(1), null, new Integer(1)));
		spnSize.setBounds(438, 91, 60, 34);
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

		int randomNumber = (int) (Math.random() * 3);

		switch (randomNumber) {
		
		case 0:
			lblNoteTaking = new JLabel(new ImageIcon("images/note-taking.png"));
			lblNoteTaking.setBounds(10, 75, 88, 108);
			contentPane.add(lblNoteTaking);
			templateList.add(lblNoteTaking);

			lblNoteTakingWLink = new JLabel(new ImageIcon("images/note-taking-w-link.png"));
			lblNoteTakingWLink.setBounds(1106, 233, 50, 65);
			contentPane.add(lblNoteTakingWLink);
			templateList.add(lblNoteTakingWLink);

			lblCloud = new JLabel(new ImageIcon("images/cloud.png"));
			lblCloud.setBounds(835, 10, 79, 42);
			contentPane.add(lblCloud);
			templateList.add(lblCloud);

			lblCloud_1 = new JLabel(new ImageIcon("images/cloud.png"));
			lblCloud_1.setBounds(319, 10, 79, 42);
			contentPane.add(lblCloud_1);
			templateList.add(lblCloud_1);

			lblBird = new JLabel(new ImageIcon("images/flying-bird.png"));
			lblBird.setBounds(92, 233, 60, 52);
			contentPane.add(lblBird);
			templateList.add(lblBird);

			lblWritingJournal = new JLabel(new ImageIcon("images/writing-journal.png"));
			lblWritingJournal.setBounds(44, 388, 71, 65);
			contentPane.add(lblWritingJournal);
			templateList.add(lblWritingJournal);

			lblIdea = new JLabel(new ImageIcon("images/idea.png"));
			lblIdea.setBounds(1042, 441, 158, 143);
			contentPane.add(lblIdea);
			templateList.add(lblIdea);

			lblRelaxedBird = new JLabel(new ImageIcon("images/relaxed-bird.png"));
			lblRelaxedBird.setBounds(36, 516, 127, 134);
			contentPane.add(lblRelaxedBird);
			templateList.add(lblRelaxedBird);

			lblBird_1 = new JLabel(new ImageIcon("images/flying-bird.png"));
			lblBird_1.setBounds(1065, 39, 60, 52);
			contentPane.add(lblBird_1);
			templateList.add(lblBird_1);
			break;

		case 1:

			lblDeskLamp = new JLabel(new ImageIcon("images/desk-lamp.png"));
			lblDeskLamp.setBounds(10, 41, 207, 173);
			contentPane.add(lblDeskLamp);

			lblDogGlasses = new JLabel(new ImageIcon("images/doggieGlassesComputer.jpg"));
			lblDogGlasses.setBounds(1037, 210, 174, 173);
			contentPane.add(lblDogGlasses);

			lblPencil = new JLabel(new ImageIcon("images/pencil.png"));
			lblPencil.setBounds(879, 10, 112, 126);
			contentPane.add(lblPencil);

			lblSettings = new JLabel(new ImageIcon("images/settings.png"));
			lblSettings.setBounds(24, 329, 144, 139);
			contentPane.add(lblSettings);

			lblOutsideBox = new JLabel(new ImageIcon("images/think-outside-the-box.png"));
			lblOutsideBox.setBounds(1054, 457, 124, 126);
			contentPane.add(lblOutsideBox);

			lblBird = new JLabel(new ImageIcon("images/flying-bird.png"));
			lblBird.setBounds(1092, 73, 60, 52);
			contentPane.add(lblBird);

			lblCloud = new JLabel(new ImageIcon("images/cloud.png"));
			lblCloud.setBounds(62, 554, 79, 42);
			contentPane.add(lblCloud);

			lblCloud_1 = new JLabel(new ImageIcon("images/cloud.png"));
			lblCloud_1.setBounds(89, 554, 79, 42);
			contentPane.add(lblCloud_1);
			break;

		case 2:

			contentPane.setBackground(new Color(48, 26, 75));

			lblPencilGreen = new JLabel(new ImageIcon("images/pencil-green.png"));
			lblPencilGreen.setBounds(861, 10, 89, 115);
			contentPane.add(lblPencilGreen);

			lblPaint = new JLabel(new ImageIcon("images/paint-palette.png"));
			lblPaint.setBounds(1041, 165, 153, 121);
			contentPane.add(lblPaint);

			lblRelaxedBird = new JLabel(new ImageIcon("images/relaxed-bird.png"));
			lblRelaxedBird.setBounds(42, 82, 127, 134);
			contentPane.add(lblRelaxedBird);

			lblJournalTitle.setForeground(Color.PINK);

			lblNoteTaking = new JLabel(new ImageIcon("images/note-taking.png"));
			lblNoteTaking.setBounds(135, 112, 67, 78);
			contentPane.add(lblNoteTaking);

			lblNoteTakingWLink = new JLabel(new ImageIcon("images/note-taking-w-link.png"));
			lblNoteTakingWLink.setBounds(1126, 350, 50, 65);
			contentPane.add(lblNoteTakingWLink);

			lblWritingJournal = new JLabel(new ImageIcon("images/writing-journal.png"));
			lblWritingJournal.setBounds(1063, 516, 71, 65);
			contentPane.add(lblWritingJournal);

			lblIdea = new JLabel(new ImageIcon("images/idea.png"));
			lblIdea.setBounds(63, 514, 158, 143);
			contentPane.add(lblIdea);

			lblDeskLamp = new JLabel(new ImageIcon("images/desk-lamp.png"));
			lblDeskLamp.setBounds(-17, 276, 207, 173);
			contentPane.add(lblDeskLamp);
			break;
		}

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
