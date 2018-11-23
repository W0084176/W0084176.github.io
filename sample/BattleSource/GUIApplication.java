import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.Canvas;
import java.awt.Label;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JEditorPane;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.TextArea;
import java.awt.List;
import java.util.Timer;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class GUIApplication {
	Random rand = new Random();
	
	//All the objects are declared here
	private Human currentHuman;

	private Footman myFootman = new Footman(100, "Attacker", "Human", null, null, 10, 5, 3, 4, "Footman",5);
	private Footman myArcher = new Footman(100, "Attacker", "Human", null, null, 10, 5, 3, 4, "Archer",5);
	
	//Defenses
	private Shield myShield = new Shield(10, 10, 30,"Shield");
	private Sword mySword = new Sword(10,10, 15,"Sword");
	private Arrows myArrow = new Arrows(10,10,12,"Arrows");
	private SteelVest mySteelVest = new SteelVest(10,10,12,"Steel Vest");
	
	//Weapons
	private RustyShield myRustyShield = new RustyShield(10,10,21, "Rusty Shield");
	private LeatherVest myLeatherVest = new LeatherVest(11,11,11,"Leather Vest");
	private Dagger myDagger = new Dagger(11,11,23,"Dagger");
	private Axe myAxe = new Axe(9,9,9,"Axe"); 
	
	private Orc currentOrc;
	private Grunt myGrunt = new Grunt(100, "Attacker", "Orc", null, null, 10, 5, 3, 4, "Grunt",5);
	private AxeThrower myAxeThrower = new AxeThrower(100, "Attacker", "Orc", null, null, 10, 5, 3, 4, "AxeThrower",5);
	
	//Character array list
	ArrayList<Human>HumansBattle = new ArrayList<Human>();
	ArrayList<Orc>OrcBattle = new ArrayList<Orc>();
	int count =0;
	int canvasvar = 0;
	int canvasvar2 = 0;
	int exitvar = 0;
	private JFrame frame;
	
	//JTextFields
	private JTextField textFieldHumanSummary;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField txtClock;
	private JTextField txtStrength;
	private JTextField txtSpeed;
	private JTextField txtAgility;
	private JTextField txtInteligence;
	private JTextField txtDamage;
	private JTextField txtDefense;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JTextField textField_7;
	private JTextField textField_6;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Application myApp = new Application();
		myApp.start();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIApplication window = new GUIApplication();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUIApplication() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	//Container with labels
	private void setLabels(JPanel BattleMain, JPanel SelectHuman, JPanel SelectOrc, JPanel BeginBattle, JPanel Armory)
	{
		this.lblNewLabel = new JLabel("Welcome to the Human Orc Battle!!!!!");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(130, 53, 278, 64);
		BattleMain.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Human Selected");
		lblNewLabel_1.setBounds(38, 293, 118, 24);
		BattleMain.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Orc Selected");
		lblNewLabel_2.setBounds(372, 294, 118, 23);
		BattleMain.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Ready to Begin Battle");
		lblNewLabel_3.setBounds(209, 266, 118, 19);
		BattleMain.add(lblNewLabel_3);
		
		JLabel lblWelcomeToThe = new JLabel("Welcome to the Human Barracks where you will select your fighter and equipment");
		lblWelcomeToThe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblWelcomeToThe.setBounds(10, 11, 517, 51);
		SelectHuman.add(lblWelcomeToThe);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("F:\\PROG1400\\code\\prog1400-dba-dp\\Assignment3-GUI-2\\src\\images\\sword.png"));
		lblNewLabel_5.setBounds(56, 131, 59, 44);
		SelectHuman.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("F:\\PROG1400\\code\\prog1400-dba-dp\\Assignment3-GUI-2\\src\\images\\shield.jpg"));
		lblNewLabel_6.setBounds(56, 222, 59, 82);
		SelectHuman.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("F:\\PROG1400\\code\\prog1400-dba-dp\\Assignment3-GUI-2\\src\\images\\arrows.png"));
		lblNewLabel_7.setBounds(336, 131, 93, 44);
		SelectHuman.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon("F:\\PROG1400\\code\\prog1400-dba-dp\\Assignment3-GUI-2\\src\\images\\vest.jpg"));
		lblNewLabel_8.setBounds(351, 218, 78, 91);
		SelectHuman.add(lblNewLabel_8);
		
		JLabel lblSword = new JLabel("Sword");
		lblSword.setBounds(66, 186, 46, 14);
		SelectHuman.add(lblSword);
		
		JLabel lblShield = new JLabel("Shield");
		lblShield.setBounds(66, 315, 46, 14);
		SelectHuman.add(lblShield);
		
		JLabel lblArrow = new JLabel("Arrow");
		lblArrow.setBounds(373, 186, 46, 14);
		SelectHuman.add(lblArrow);
		
		JLabel lblSteelVest = new JLabel("Steel Vest");
		lblSteelVest.setBounds(361, 320, 65, 14);
		SelectHuman.add(lblSteelVest);
		
		JLabel lblWelcomeToThe_1 = new JLabel("Welcome to the Orc Barracks where you will select your fighter and equipment");
		lblWelcomeToThe_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblWelcomeToThe_1.setBounds(10, 11, 517, 51);
		SelectOrc.add(lblWelcomeToThe_1);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon("F:\\PROG1400\\code\\prog1400-dba-dp\\Assignment3-GUI-2\\src\\images\\axe.png"));
		lblNewLabel_9.setBounds(335, 124, 95, 72);
		SelectOrc.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setIcon(new ImageIcon("F:\\PROG1400\\code\\prog1400-dba-dp\\Assignment3-GUI-2\\src\\images\\dagger.png"));
		lblNewLabel_10.setBounds(33, 114, 95, 72);
		SelectOrc.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setIcon(new ImageIcon("F:\\PROG1400\\code\\prog1400-dba-dp\\Assignment3-GUI-2\\src\\images\\orcshield.jpg"));
		lblNewLabel_11.setBounds(33, 219, 109, 93);
		SelectOrc.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setIcon(new ImageIcon("F:\\PROG1400\\code\\prog1400-dba-dp\\Assignment3-GUI-2\\src\\images\\armour.jpg"));
		lblNewLabel_12.setBounds(335, 229, 109, 72);
		SelectOrc.add(lblNewLabel_12);
		
		JLabel lblDagger = new JLabel("Dagger");
		lblDagger.setBounds(63, 194, 46, 14);
		SelectOrc.add(lblDagger);
		
		JLabel lblRustyShield = new JLabel("Rusty Shield");
		lblRustyShield.setBounds(53, 323, 68, 14);
		SelectOrc.add(lblRustyShield);
		
		JLabel lblAxe = new JLabel("Axe");
		lblAxe.setBounds(364, 207, 46, 14);
		SelectOrc.add(lblAxe);
		
		JLabel lblLeatherVest = new JLabel("Leather Vest");
		lblLeatherVest.setBounds(359, 312, 85, 14);
		SelectOrc.add(lblLeatherVest);
		
		JLabel lblHealthRemaining = new JLabel("Health Remaining");
		lblHealthRemaining.setBounds(12, 149, 115, 14);
		BeginBattle.add(lblHealthRemaining);
		
		JLabel label = new JLabel("Health Remaining");
		label.setBounds(408, 149, 115, 14);
		BeginBattle.add(label);
		
		JLabel lblDiceRoll = new JLabel("Dice Roll");
		lblDiceRoll.setBounds(129, 64, 67, 14);
		BeginBattle.add(lblDiceRoll);
		
		JLabel lblDiceRoll_1 = new JLabel("Dice Roll");
		lblDiceRoll_1.setBounds(341, 64, 69, 14);
		BeginBattle.add(lblDiceRoll_1);
		
		JLabel lblTimer = new JLabel("Timer");
		lblTimer.setBounds(248, 83, 46, 14);
		BeginBattle.add(lblTimer);
		
		JLabel lblPlayByPlay = new JLabel("Play By Play");
		lblPlayByPlay.setBounds(218, 265, 69, 14);
		BeginBattle.add(lblPlayByPlay);
		
		JLabel lblNewLabel_13 = new JLabel("Strength");
		lblNewLabel_13.setBounds(170, 144, 46, 14);
		SelectOrc.add(lblNewLabel_13);
		
		JLabel lblSpeed_1 = new JLabel("Speed");
		lblSpeed_1.setBounds(170, 179, 46, 14);
		SelectOrc.add(lblSpeed_1);
		
		JLabel lblAgility_1 = new JLabel("Agility");
		lblAgility_1.setBounds(172, 222, 46, 14);
		SelectOrc.add(lblAgility_1);
		
		JLabel lblIntelligence_1 = new JLabel("Intelligence");
		lblIntelligence_1.setBounds(152, 258, 77, 14);
		SelectOrc.add(lblIntelligence_1);
		
		JLabel lblDamage_1 = new JLabel("Damage");
		lblDamage_1.setBounds(152, 289, 64, 14);
		SelectOrc.add(lblDamage_1);
		
		JLabel lblDefense_1 = new JLabel("Defense");
		lblDefense_1.setBounds(152, 323, 64, 14);
		SelectOrc.add(lblDefense_1);
		
		JLabel lblStrength = new JLabel("Strength");
		lblStrength.setBounds(152, 146, 59, 14);
		SelectHuman.add(lblStrength);
		
		JLabel lblSpeed = new JLabel("Speed");
		lblSpeed.setBounds(152, 186, 59, 14);
		SelectHuman.add(lblSpeed);
		
		JLabel lblAgility = new JLabel("Agility");
		lblAgility.setBounds(152, 225, 59, 14);
		SelectHuman.add(lblAgility);
		
		JLabel lblIntelligence = new JLabel("Intelligence");
		lblIntelligence.setBounds(125, 256, 86, 14);
		SelectHuman.add(lblIntelligence);
		
		JLabel lblDamage = new JLabel("Damage");
		lblDamage.setBounds(125, 287, 73, 14);
		SelectHuman.add(lblDamage);
		
		JLabel lblDefense = new JLabel("Defense");
		lblDefense.setBounds(135, 335, 76, 14);
		SelectHuman.add(lblDefense);
		
		JLabel lblNewLabel_17 = new JLabel("Purchase Strength ");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_17.setBounds(25, 120, 126, 23);
		Armory.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Purchase Inteligence");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_18.setBounds(295, 126, 136, 14);
		Armory.add(lblNewLabel_18);

		JLabel lblTest = new JLabel("Welcome to the armory");
		lblTest.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTest.setBounds(188, 33, 197, 44);
		Armory.add(lblTest);
		

	}
	
	
	//Container that sets all the text boxes
	private void setTextBoxesHuman(JPanel BattleMain, JPanel SelectHuman, JPanel SelectOrc, JPanel BeginBattle)
	{
		txtStrength = new JTextField();
		//txtStrength.setText("10");
		txtStrength.setBounds(221, 143, 86, 20);
		SelectHuman.add(txtStrength);
		txtStrength.setColumns(10);
		
		txtSpeed = new JTextField();
		//txtSpeed.setText("10");
		txtSpeed.setBounds(221, 183, 86, 20);
		SelectHuman.add(txtSpeed);
		txtSpeed.setColumns(10);
		
		txtAgility = new JTextField();
		//txtAgility.setText("10");
		txtAgility.setBounds(221, 222, 86, 20);
		SelectHuman.add(txtAgility);
		txtAgility.setColumns(10);
		
		txtInteligence = new JTextField();
		//txtInteligence.setText("10");
		txtInteligence.setBounds(221, 253, 86, 20);
		SelectHuman.add(txtInteligence);
		txtInteligence.setColumns(10);
		
		txtDamage = new JTextField();
		//txtDamage.setText("10");
		txtDamage.setBounds(221, 284, 86, 20);
		SelectHuman.add(txtDamage);
		txtDamage.setColumns(10);
		
		txtDefense = new JTextField();
		//txtDefense.setText("10");
		txtDefense.setBounds(221, 332, 86, 20);
		SelectHuman.add(txtDefense);
		txtDefense.setColumns(10);
	}
	
	//container that sets the canvas
	private void setCanvas(JPanel BattleMain, JPanel SelectHuman, JPanel SelectOrc, JPanel BeginBattle) {
		Canvas canvas = new Canvas();
		canvas.setBackground(Color.RED);
		canvas.setBounds(236, 316, 41, 40);
		BattleMain.add(canvas);
		if(canvasvar>0 && canvasvar2>0) {
			canvas.setBackground(Color.GREEN);
		}
		
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 637, 505);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		//Function that changes the canvas color
		JPanel BattleMain = new JPanel();
		BattleMain.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent arg0) {				
				if(canvasvar>0 && canvasvar2>0) {					
//					Canvas canvas = new Canvas();
//					canvas.setBackground(Color.GREEN);
//					canvas.setBounds(236, 316, 41, 40);
//					BattleMain.add(canvas);
					Canvas canvas = (Canvas)BattleMain.getComponent(0);
					canvas.setBackground(Color.GREEN);
				}else if(exitvar>0) {
					Canvas canvas = (Canvas)BattleMain.getComponent(0);
					canvas.setBackground(Color.RED);
				}
			}
		});
		frame.getContentPane().add(BattleMain, "name_161986818859357");
		BattleMain.setLayout(null);
		
		//JPannels
		JPanel SelectHuman = new JPanel();
		frame.getContentPane().add(SelectHuman, "name_163712985813278");
		SelectHuman.setLayout(null);
		
		JPanel SelectOrc = new JPanel();
		frame.getContentPane().add(SelectOrc, "name_165767872570827");
		SelectOrc.setLayout(null);
		
		JPanel Armory = new JPanel();
		frame.getContentPane().add(Armory, "name_324600128537097");
		Armory.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Archer");
		rdbtnNewRadioButton_1.setBounds(338, 92, 109, 23);
		SelectHuman.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Footman");
		rdbtnNewRadioButton.setBounds(56, 92, 109, 23);
		SelectHuman.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Grunt");
		rdbtnNewRadioButton_2.setBounds(53, 84, 109, 23);
		SelectOrc.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Axe Thrower");
		rdbtnNewRadioButton_3.setBounds(335, 94, 109, 23);
		SelectOrc.add(rdbtnNewRadioButton_3);
		
		JRadioButton Armory1_radio = new JRadioButton("Receive +5 attack bonus");
		Armory1_radio.setBounds(25, 343, 171, 23);
		Armory.add(Armory1_radio);
		
		JPanel OrcArmory = new JPanel();
		frame.getContentPane().add(OrcArmory, "name_520531929531308");
		OrcArmory.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Receive +5 attack bonus");
		rdbtnNewRadioButton_4.setBounds(38, 331, 165, 23);
		OrcArmory.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Receive +5 defense bonus");
		rdbtnNewRadioButton_5.setBounds(327, 331, 231, 23);
		OrcArmory.add(rdbtnNewRadioButton_5);
		
		JRadioButton Armory2_radio = new JRadioButton("Receive +5 defense bonus");
		Armory2_radio.setBounds(291, 343, 229, 23);
		Armory.add(Armory2_radio);
		
		JPanel BeginBattle = new JPanel();
		frame.getContentPane().add(BeginBattle, "name_165931493864367");
		BeginBattle.setLayout(null);
		
		//Block of code that runs when the purchase button at the armory is presses for ORC
		JButton btnNewButton_10 = new JButton("Purchase");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame f =new JFrame();
				int count2=0;
				BeginBattle.setVisible(true);
				OrcArmory.setVisible(false);
				if(rdbtnNewRadioButton_4.isSelected()) {
					int score = currentOrc.getPoints();
					int damage = currentOrc.getWeapon().getTotalDamageDealt();
					currentOrc.getWeapon().setTotalDamageDealt(damage+5);
					currentOrc.setPoints(score-10);
					System.out.println("Orcdamage"+score);

					textField_8.setText(""+currentOrc.getPoints());
					
				}else if(rdbtnNewRadioButton_5.isSelected()) {
					int score = currentOrc.getPoints();
					int defense = currentOrc.getDefense().getTotalDamageBlocked();
					currentOrc.getDefense().setTotalDamageBlocked(defense+5);
					currentOrc.setPoints(score-10);
					System.out.println("Orcspeed"+score);
					
					textField_8.setText(""+currentOrc.getPoints());
				}
				if(rdbtnNewRadioButton_4.isSelected()||rdbtnNewRadioButton_5.isSelected()){
					count2+=1;
				}
				if(count2>=1) {
					OrcArmory.setVisible(false);
					BeginBattle.setVisible(true);
				}else if(count2<1) {
					OrcArmory.setVisible(true);
					BeginBattle.setVisible(false);
					JOptionPane.showMessageDialog(f,"You must make a selection!!!!");
				}
			}
		});
		btnNewButton_10.setBounds(209, 71, 89, 23);
		OrcArmory.add(btnNewButton_10);
	
		JLabel lblNewLabel_23 = new JLabel("Welcome to the Orc Armory");
		lblNewLabel_23.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_23.setBounds(150, 27, 262, 33);
		OrcArmory.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("Purchase Damage");
		lblNewLabel_24.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_24.setBounds(38, 132, 149, 23);
		OrcArmory.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("Purchase Speed");
		lblNewLabel_25.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_25.setBounds(291, 129, 182, 23);
		OrcArmory.add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("New label");
		lblNewLabel_26.setIcon(new ImageIcon("F:\\PROG1400\\code\\prog1400-dba-dp\\Assignment3-GUI-2\\src\\images\\damage.jpg"));
		lblNewLabel_26.setBounds(48, 188, 114, 103);
		OrcArmory.add(lblNewLabel_26);
		
		JLabel lblNewLabel_27 = new JLabel("New label");
		lblNewLabel_27.setIcon(new ImageIcon("F:\\PROG1400\\code\\prog1400-dba-dp\\Assignment3-GUI-2\\src\\images\\speed.jpg"));
		lblNewLabel_27.setBounds(312, 191, 100, 100);
		OrcArmory.add(lblNewLabel_27);
				
		ButtonGroup group3 = new ButtonGroup();
		group3.add(Armory1_radio);
		group3.add(Armory2_radio);
		
		//Block of code that runs when the purchase button at the armory is pressed for human
		JButton btnNewButton_4 = new JButton("Purchase");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int count2=0;
				JFrame f =new JFrame();
				BeginBattle.setVisible(true);
				Armory.setVisible(false);
				System.out.println("before:" + currentHuman.getWeapon().getTotalDamageDealt());
				if(Armory1_radio.isSelected()) {
					int score = currentHuman.getPoints();
					int damage = currentHuman.getWeapon().getTotalDamageDealt();
					currentHuman.getWeapon().setTotalDamageDealt(damage+5);
					//int damage2 = currentHuman.getWeapon().getTotalDamageDealt();
					currentHuman.setPoints(score-10);
					System.out.println("Testttttt"+score);
					
					textField_6.setText(""+currentHuman.getPoints());
					
				}else if(Armory2_radio.isSelected()) {
					int score = currentHuman.getPoints();
					int defense = currentHuman.getDefense().getTotalDamageBlocked();
					currentHuman.getDefense().setTotalDamageBlocked(defense+5);
					currentHuman.setPoints(score-10);
					//int defense2 = currentHumanDefense.getTotalDamageBlocked();
					System.out.println("Testttttt2");
					
					textField_6.setText(""+currentHuman.getPoints());
					
				}
				System.out.println("after:" + currentHuman.getWeapon().getTotalDamageDealt());
				
				if(Armory1_radio.isSelected()||Armory2_radio.isSelected()){
					count2+=1;
				}
				if(count2>=1) {
					Armory.setVisible(false);
					BeginBattle.setVisible(true);
				}else if(count2<1){
					Armory.setVisible(true);
					BeginBattle.setVisible(false);
					JOptionPane.showMessageDialog(f,"You must make a selection!!!!");
				}
			}
		});
		btnNewButton_4.setBounds(182, 88, 89, 23);
		Armory.add(btnNewButton_4);
		
		
		//-----------------------------------------
		setCanvas(BattleMain, SelectHuman, SelectOrc, BeginBattle);
		setLabels(BattleMain, SelectHuman, SelectOrc, BeginBattle,Armory);
		setTextBoxesHuman(BattleMain, SelectHuman, SelectOrc, BeginBattle);

		//Displays the card layout when a human is selected
		JButton btnNewButton = new JButton("Select Human");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BattleMain.setVisible(false);
				SelectHuman.setVisible(true);
			}
		});
		btnNewButton.setBounds(38, 222, 118, 23);
		BattleMain.add(btnNewButton);
		
		//Button that checks if two characters are selected and proceeds to battle screen
		JButton btnNewButton_1 = new JButton("Go To Battle Screen");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				JFrame f =new JFrame();
				int count2=0;
				
				if(rdbtnNewRadioButton.isSelected()||rdbtnNewRadioButton_1.isSelected()){
					count2+=1;
				}
				if(rdbtnNewRadioButton_2.isSelected()||rdbtnNewRadioButton_3.isSelected()) {
					count2+=1;
				}
				if(count2==2) {
					BattleMain.setVisible(false);
					BeginBattle.setVisible(true);
					
				}else {
					 JOptionPane.showMessageDialog(f,"Two characters must be selected to begin battle!!!!");
					BattleMain.setVisible(true);
					BeginBattle.setVisible(false);
				}	
			}
		});
		btnNewButton_1.setBounds(180, 222, 174, 23);
		BattleMain.add(btnNewButton_1);
		
		//Button that updates the card layout when an orc is selected
		JButton btnNewButton_2 = new JButton("Select Orc");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BattleMain.setVisible(false);
				SelectOrc.setVisible(true);
				
			}
		});
		btnNewButton_2.setBounds(372, 222, 118, 23);
		BattleMain.add(btnNewButton_2);
		
		JLabel lblNewLabel_4 = new JLabel("Human Role");
		lblNewLabel_4.setBounds(12, 194, 105, 14);
		BeginBattle.add(lblNewLabel_4);
		
		JLabel lblNewLabel_14 = new JLabel("Orc Role");
		lblNewLabel_14.setBounds(416, 194, 107, 14);
		BeginBattle.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("");
		lblNewLabel_15.setIcon(new ImageIcon("F:\\PROG1400\\code\\prog1400-dba-dp\\Assignment3-GUI-2\\src\\images\\human.jpg"));
		lblNewLabel_15.setBounds(20, 56, 105, 111);
		BeginBattle.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("New label");
		lblNewLabel_16.setIcon(new ImageIcon("F:\\PROG1400\\code\\prog1400-dba-dp\\Assignment3-GUI-2\\src\\images\\orc.jpg"));
		lblNewLabel_16.setBounds(430, 64, 83, 75);
		BeginBattle.add(lblNewLabel_16);
		
		JLabel lblHeroName = new JLabel("Hero Name");
		lblHeroName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblHeroName.setBounds(27, 11, 98, 42);
		BeginBattle.add(lblHeroName);
		
		JLabel lblMonsterName = new JLabel("Monster Name");
		lblMonsterName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMonsterName.setBounds(420, 11, 107, 42);
		BeginBattle.add(lblMonsterName);
		
		JLabel lblAnounceWinner = new JLabel("Winner");
		lblAnounceWinner.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAnounceWinner.setForeground(Color.RED);
		lblAnounceWinner.setBounds(182, 139, 164, 30);
		BeginBattle.add(lblAnounceWinner);
		
		textFieldHumanSummary = new JTextField();
		textFieldHumanSummary.setBounds(32, 328, 118, 20);
		BattleMain.add(textFieldHumanSummary);
		textFieldHumanSummary.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(372, 328, 118, 20);
		BattleMain.add(textField_1);
		textField_1.setColumns(10);
		
		
		//radio button action listener that dispalys the stats of the selected character
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvasvar+=1;
				myFootman.setStrength(8);
				int strength = myFootman.getStrength();
				myFootman.setAgility(6);
				int agility = myFootman.getAgility();
				myFootman.setSpeed(7);
				int speed = myFootman.getSpeed();
				myFootman.setIntelligence(6);
				int intelligence = myFootman.getIntelligence();
				mySword.setTotalDamageDealt(25);
				int totalDamage = mySword.getTotalDamageDealt();
				myShield.setTotalDamageBlocked(5);
				int damageBlocked = myShield.getTotalDamageBlocked();
			
				String sstrength = Integer.toString(strength);
				String sagility = Integer.toString(agility);
				String sspeed = Integer.toString(speed);
				String sintelligence = Integer.toString(intelligence);
				String stotalDamage = Integer.toString(totalDamage);
				String sdamageBlocked = Integer.toString(damageBlocked);
				
		
				txtStrength.setText(sstrength);
				txtSpeed.setText(sspeed);
				txtAgility.setText(sagility);
				txtInteligence.setText(sintelligence);
				txtDamage.setText(stotalDamage);
				txtDefense.setText(sdamageBlocked);
			}
		});
		
		//radio button action listener that dispalys the stats of the selected character
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvasvar+=1;
				myArcher.setStrength(6);
				int strength = myArcher.getStrength();
				myArcher.setAgility(8);
				int agility = myArcher.getAgility();
				myArcher.setSpeed(8);
				int speed = myArcher.getSpeed();
				myArcher.setIntelligence(9);
				int intelligence = myArcher.getIntelligence();
				myArrow.setTotalDamageDealt(25);
				int totalDamage = myArrow.getTotalDamageDealt();
				mySteelVest.setTotalDamageBlocked(5);
				int damageBlocked = mySteelVest.getTotalDamageBlocked();
			
				String sstrength = Integer.toString(strength);
				String sagility = Integer.toString(agility);
				String sspeed = Integer.toString(speed);
				String sintelligence = Integer.toString(intelligence);
				String stotalDamage = Integer.toString(totalDamage);
				String sdamageBlocked = Integer.toString(damageBlocked);
		
				txtStrength.setText(sstrength);
				txtSpeed.setText(sspeed);
				txtAgility.setText(sagility);
				txtInteligence.setText(sintelligence);
				txtDamage.setText(stotalDamage);
				txtDefense.setText(sdamageBlocked);
			}
		});
		
		//radio button action listener that dispalys the stats of the selected character
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvasvar2+=1;
				myGrunt.setStrength(9);
				int strength = myGrunt.getStrength();
				myGrunt.setAgility(6);
				int agility = myGrunt.getAgility();
				myGrunt.setSpeed(6);
				int speed = myGrunt.getSpeed();
				myGrunt.setIntelligence(7);
				int intelligence = myGrunt.getIntelligence();
				myDagger.setTotalDamageDealt(25);
				int totalDamage = myDagger.getTotalDamageDealt();
				myRustyShield.setTotalDamageBlocked(5);
				int damageBlocked = myRustyShield.getTotalDamageBlocked();
				
			
				String sstrength = Integer.toString(strength);
				String sagility = Integer.toString(agility);
				String sspeed = Integer.toString(speed);
				String sintelligence = Integer.toString(intelligence);
				String stotalDamage = Integer.toString(totalDamage);
				String sdamageBlocked = Integer.toString(damageBlocked);
		
				textField_14.setText(sstrength);
				textField_13.setText(sspeed);
				textField_12.setText(sagility);
				textField_11.setText(sintelligence);
				textField_10.setText(stotalDamage);
				textField_9.setText(sdamageBlocked);
			}
		});
		
		//radio button action listener that dispalys the stats of the selected character
		rdbtnNewRadioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				canvasvar2+=1;
				myAxeThrower.setStrength(7);
				int strength = myAxeThrower.getStrength();
				myAxeThrower.setAgility(7);
				int agility = myAxeThrower.getAgility();
				myAxeThrower.setSpeed(8);
				int speed = myAxeThrower.getSpeed();
				myAxeThrower.setIntelligence(10);
				int intelligence = myAxeThrower.getIntelligence();
				myAxe.setTotalDamageDealt(25);
				int totalDamage = myAxe.getTotalDamageDealt();
				myLeatherVest.setTotalDamageBlocked(5);
				int damageBlocked = myLeatherVest.getTotalDamageBlocked();
			
				String sstrength = Integer.toString(strength);
				String sagility = Integer.toString(agility);
				String sspeed = Integer.toString(speed);
				String sintelligence = Integer.toString(intelligence);
				String stotalDamage = Integer.toString(totalDamage);
				String sdamageBlocked = Integer.toString(damageBlocked);
		
				textField_14.setText(sstrength);
				textField_13.setText(sspeed);
				textField_12.setText(sagility);
				textField_11.setText(sintelligence);
				textField_10.setText(stotalDamage);
				textField_9.setText(sdamageBlocked);		
			}
		});
				
		JSeparator separator = new JSeparator();
		separator.setBounds(239, 131, 0, 327);
		SelectHuman.add(separator);

		//Button that sets the selected human character
		JButton btnNewButton_5 = new JButton("Select Character Human");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame f=new JFrame();
				if(rdbtnNewRadioButton.isSelected()||rdbtnNewRadioButton_1.isSelected()) {
					SelectHuman.setVisible(false);
					BattleMain.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(f,"Please make a selection!!!!");
					SelectHuman.setVisible(true);
					BattleMain.setVisible(false);
				}
				
				//radio button that sets the current human to footman
				if(rdbtnNewRadioButton.isSelected())
				{
					currentHuman = new Footman(101, "Attacker", "Human", new Sword(15, 10, 25, "Sword"), new Shield(15,10,5,"Shield"), 10, 5, 3, 4, "Footman",5);
					//currentHumanWeapon = new Sword(15,10, 25,"Sword");
					//currentHumanDefense = new Shield(15, 10, 5,"Shield");
					
					myFootman.setName("Footman");
					String name = myFootman.getName();
					textFieldHumanSummary.setText(name);
					lblHeroName.setText(name);
					
					HumansBattle.clear();
					HumansBattle.add(currentHuman);
					canvasvar+=1;
					
				}
				//radio button that sets the current human to archer
				else if(rdbtnNewRadioButton_1.isSelected())
				{
					currentHuman = new Archer(100, "Attacker", "Human", new Arrows(15,10,25,"Arrows"), new SteelVest(10,5,5,"Steel Vest"), 10, 5, 3, 4, "Archer",5);
					//currentHumanWeapon = new Arrows(15,10,25,"Arrows");
					//currentHumanDefense = new SteelVest(10,5,5,"Steel Vest");
					
					myArcher.setName("Archer");
					String name = myArcher.getName();
					textFieldHumanSummary.setText(name);
					lblHeroName.setText(name);
					HumansBattle.clear();
					HumansBattle.add(currentHuman);
					canvasvar+=1;
				}
				
			
			}
		});
		btnNewButton_5.setBounds(120, 58, 187, 23);
		SelectHuman.add(btnNewButton_5);
		
		
		//Button that sets the selected Orc character
		JButton btnNewButton_6 = new JButton("Select Character Orc");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame f =new JFrame();
				if(rdbtnNewRadioButton_2.isSelected()||rdbtnNewRadioButton_3.isSelected()) {
					SelectOrc.setVisible(false);
					BattleMain.setVisible(true);
					
				}else {
					 JOptionPane.showMessageDialog(f,"Please make a selection!!!!");  
					SelectOrc.setVisible(true);
					BattleMain.setVisible(false);
				}
				
				//radio button that sets the current orc to grunt
				if(rdbtnNewRadioButton_2.isSelected())
				{
					currentOrc = new Grunt(100, "Defender", "Orc", new Dagger(15,10,25,"Dagger"), new RustyShield(15,10,5,"RustyShield"), 10, 5, 3, 4, "Grunt",5);
					//currentOrcWeapon = new Dagger(15,10,25,"Dagger");
					//currentOrcDefense = new RustyShield(15,10,5, "Rusty Shield");
					
					
					myGrunt.setName("Grunt");
					String name = myGrunt.getName();
					textField_1.setText(name);
					lblMonsterName.setText(name);
					OrcBattle.add(currentOrc);
					canvasvar2+=1;
				}
				//radio button that sets the current orc to AxeThrower
				else if(rdbtnNewRadioButton_3.isSelected())
				{
					currentOrc = new AxeThrower(100, "Defender", "Orc", new Axe(20,5,25, "Axe"), new LeatherVest(10,10,5, "LeatherVest"), 10, 5, 3, 4, "AxeThrower",5);
					//currentOrcWeapon = new Axe(20,5,25,"Axe");
					//currentOrcDefense = new LeatherVest(10,10,5,"Leather Vest");
					
					myAxeThrower.setName("Axe Thrower");
					String name = myAxeThrower.getName();
					textField_1.setText(name);
					lblMonsterName.setText(name);
					OrcBattle.add(currentOrc);
					canvasvar2+=1;
					
				}
			}
		});
		btnNewButton_6.setBounds(145, 62, 157, 23);
		SelectOrc.add(btnNewButton_6);
		
		
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(239, 320, 86, 20);
		SelectOrc.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(239, 286, 86, 20);
		SelectOrc.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(239, 255, 86, 20);
		SelectOrc.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(239, 219, 86, 20);
		SelectOrc.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(239, 176, 86, 20);
		SelectOrc.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(239, 141, 86, 20);
		SelectOrc.add(textField_14);
		
		textField_2 = new JTextField();
		textField_2.setBounds(12, 163, 115, 20);
		BeginBattle.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(408, 163, 107, 20);
		BeginBattle.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(150, 89, 28, 20);
		BeginBattle.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(382, 89, 28, 20);
		BeginBattle.add(textField_5);
		textField_5.setColumns(10);
		
		List list = new List();
		list.setBounds(10, 296, 601, 163);
		BeginBattle.add(list);
		
		txtClock = new JTextField();
		txtClock.setBounds(222, 108, 86, 20);
		BeginBattle.add(txtClock);
		txtClock.setColumns(10);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNewRadioButton);
		group.add(rdbtnNewRadioButton_1);
		
		ButtonGroup group2 = new ButtonGroup();
		group2.add(rdbtnNewRadioButton_2);
		group2.add(rdbtnNewRadioButton_3);
		

		
		ButtonGroup group4 = new ButtonGroup();
		group4.add(rdbtnNewRadioButton_4);
		group4.add(rdbtnNewRadioButton_5);
				
		JLabel lblNewLabel_21 = new JLabel("New label");
		lblNewLabel_21.setIcon(new ImageIcon("F:\\PROG1400\\code\\prog1400-dba-dp\\Assignment3-GUI-2\\src\\images\\strength.jpg"));
		lblNewLabel_21.setBounds(10, 153, 207, 145);
		Armory.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("");
		lblNewLabel_22.setIcon(new ImageIcon("F:\\PROG1400\\code\\prog1400-dba-dp\\Assignment3-GUI-2\\src\\images\\books.jpg"));
		lblNewLabel_22.setBounds(291, 172, 140, 126);
		Armory.add(lblNewLabel_22);
		
		//Button that generates an attack-one attack at a time
		JButton btnNewButton_8 = new JButton("Fight!!");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame f =new JFrame();
				if(count<1) {
					UpdateClock(txtClock);
					count++;

				}
				int diceRoll1 = rand.nextInt(6)+1;
				int diceRoll2 = rand.nextInt(6)+1;
				String sdiceRoll1 = Integer.toString(diceRoll1);
				String sdiceRoll2 = Integer.toString(diceRoll2);
				textField_4.setText(sdiceRoll1);
				textField_5.setText(sdiceRoll2);
				
				//int health = currentHuman.getHealthPoints();
//				int health1 = currentHuman.getHealthPoints();
//				String Humanhealth = Integer.toString(health1);
//				
//				int health2 = currentOrc.getHealthPoints();
//				String Orchealth = Integer.toString(health2);
//				
//				
//				String humanRole = currentHuman.getRole();
//				String orcRole = currentOrc.getRole();
//				
//				
//				if(humanRole.equals("Attacker"))
//				{
//					for(int i=0;i<OrcBattle.size(); i++)
//					{
//						currentOrc.setHealthPoints(health2-10);
//						list.add(HumansBattle.get(i).Attack());
//						list.add(OrcBattle.get(i).Defend());
//						currentHuman.setRole("Defender"); 
//						currentOrc.setRole("Attacker");
//					}
//				}else if(humanRole.equals("Defender")) {
//					for(int i=0;i<HumansBattle.size(); i++)
//					{
//						currentHuman.setHealthPoints(health1-20);
//						list.add(OrcBattle.get(i).Attack());
//						list.add(HumansBattle.get(i).Defend());
//						currentHuman.setRole("Attacker"); 
//						currentOrc.setRole("Defender");
//					}
//				}
				//battle and get winner methods
				Battle(list, diceRoll1, diceRoll2);
				getWinner(lblAnounceWinner);
				
				int Humanhealth = currentHuman.getHealthPoints();
				int Orchealth = currentOrc.getHealthPoints();
				
				if(Humanhealth>0) {
					textField_2.setText(""+Humanhealth);
				}else if(Humanhealth<=0) {
					textField_2.setText("0");
					btnNewButton_8.setEnabled(false);
					JOptionPane.showMessageDialog(f,"Orc wins!!!!"); 
				}
				
				
				if(Orchealth>0) {
					textField_3.setText(""+Orchealth);
				}else if(Orchealth<=0) {
					textField_3.setText("0");
					btnNewButton_8.setEnabled(false);
					JOptionPane.showMessageDialog(f,"Human wins!!!!"); 
				}			
			}
		});
		
		btnNewButton_8.setBounds(198, 45, 89, 23);
		BeginBattle.add(btnNewButton_8);
		
		//Button that exits the battle and resets the game 
		JButton btnNewButton_7 = new JButton("Exit Battle");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				exitvar +=1;
				btnNewButton_8.setEnabled(true);
				
				BeginBattle.setVisible(false);
				BattleMain.setVisible(true);
				HumansBattle.clear();
				OrcBattle.clear();

				group.clearSelection();
				group2.clearSelection();
				group3.clearSelection();
				group4.clearSelection();
				
				textFieldHumanSummary.setText(null);
				textField_1.setText(null);
				
				txtStrength.setText(null);
				txtSpeed.setText(null);
				txtAgility.setText(null);
				txtInteligence.setText(null);
				txtDamage.setText(null);
				txtDefense.setText(null);
				
				textField_14.setText(null);
				textField_13.setText(null);
				textField_12.setText(null);
				textField_11.setText(null);
				textField_10.setText(null);
				textField_9.setText(null);
				
				textField_4.setText(null);
				textField_5.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				
				lblHeroName.setText(null);
				lblMonsterName.setText(null);
				list.removeAll();
				txtClock.setText(null);
			}
		});
		btnNewButton_7.setBounds(198, 11, 89, 23);
		BeginBattle.add(btnNewButton_7);
		
		textField = new JTextField();
		textField.setBounds(12, 219, 107, 20);
		BeginBattle.add(textField);
		textField.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(408, 219, 107, 20);
		BeginBattle.add(textField_7);
		textField_7.setColumns(10);
		
		//Button that brings a human to the armory only if they have enough points  
		JButton btnNewButton_3 = new JButton("Human armory");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				group3.clearSelection();
				JFrame f =new JFrame();
				if(currentHuman.getPoints()>=10) {
					BeginBattle.setVisible(false);
					Armory.setVisible(true);
				}else if(currentHuman.getPoints()<10) {
					BeginBattle.setVisible(true);
					Armory.setVisible(false);
					JOptionPane.showMessageDialog(f,"You don't have enough points to go to the armory!!!");
				}
				
			}
		});
		btnNewButton_3.setBounds(129, 218, 125, 23);
		BeginBattle.add(btnNewButton_3);
		
		JLabel lblNewLabel_19 = new JLabel("Points");
		lblNewLabel_19.setBounds(12, 245, 105, 14);
		BeginBattle.add(lblNewLabel_19);
		
		textField_6 = new JTextField();
		textField_6.setBounds(12, 262, 105, 20);
		BeginBattle.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_20 = new JLabel("Points");
		lblNewLabel_20.setBounds(408, 245, 46, 14);
		BeginBattle.add(lblNewLabel_20);
		
		textField_8 = new JTextField();
		textField_8.setBounds(408, 262, 107, 20);
		BeginBattle.add(textField_8);
		textField_8.setColumns(10);
		
		//Button that brings an orc to the armory only if they have enough points
		JButton btnNewButton_9 = new JButton("Orc armory");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				group4.clearSelection();
				JFrame f =new JFrame();
				if(currentOrc.getPoints()>=10) {
					BeginBattle.setVisible(false);
					OrcArmory.setVisible(true);
				}else if(currentOrc.getPoints()<10) {
					BeginBattle.setVisible(true);
					OrcArmory.setVisible(false);
					JOptionPane.showMessageDialog(f,"You don't have enough points to go to the armory!!!");
				}
			}
		});
		btnNewButton_9.setBounds(257, 218, 141, 23);
		BeginBattle.add(btnNewButton_9);
	}
	
	//Method that is called when the battle button is pressed
	private void Battle(List list, int diceRoll1, int diceRoll2) {
		
		//gets the character roles
		String humanRole = currentHuman.getRole();
		String orcRole = currentOrc.getRole();
		
		//sets the role to a text box
		textField.setText(humanRole);
		textField_7.setText(orcRole);
		
		//gets the character health
		int health1 = currentHuman.getHealthPoints();
		String Humanhealth = Integer.toString(health1);
		
		int health2 = currentOrc.getHealthPoints();
		String Orchealth = Integer.toString(health2);
		
		//gets the total damage for each character
		int totalDamage1 = currentHuman.getWeapon().getTotalDamageDealt();
		int totalDamage2 = currentOrc.getWeapon().getTotalDamageDealt();
		System.out.println(totalDamage1);
		
		//Gets the total defense for each character
		int totalDefense1 = currentHuman.getDefense().getTotalDamageBlocked();
		int totalDefense2 = currentOrc.getDefense().getTotalDamageBlocked();
		
		//Chunk of code that runs if orc is defender 
		if(orcRole.equals("Defender"))
		{
			for(int i=0;i<OrcBattle.size(); i++)
			{
				if(diceRoll1 <= diceRoll2) {
					list.add("Humans lost the play---no damage dealt");
					currentHuman.setRole("Defender"); 
					currentOrc.setRole("Attacker");
				}else if(diceRoll1 > diceRoll2)  {
				currentOrc.setHealthPoints(health2+totalDefense2-totalDamage1);
				
				int humanPoints = currentHuman.getPoints();
				currentHuman.setPoints(humanPoints+5);
				textField_6.setText(""+currentHuman.getPoints());
				
				textField_8.setText(""+currentOrc.getPoints());
				
				list.add(HumansBattle.get(i).Attack());
				list.add(OrcBattle.get(i).Defend());
				currentHuman.setRole("Defender"); 
				currentOrc.setRole("Attacker");
				//textField_6.setText(""+humanPoints);
				}
			}
			
			//Chunk of code that runs if human is defender
		}else if(humanRole.equals("Defender")) {
			for(int i=0;i<HumansBattle.size(); i++)
			{
				if(diceRoll2 <= diceRoll1) {
					list.add("Orcs lost the play---no damage dealt");
					currentHuman.setRole("Attacker"); 
					currentOrc.setRole("Defender");
				}else if(diceRoll2 > diceRoll1)  {
				currentHuman.setHealthPoints(health1+totalDefense1-totalDamage2);
				
				int orcPoints = currentOrc.getPoints();
				currentOrc.setPoints(orcPoints+5);
				textField_8.setText(""+currentOrc.getPoints());
				
				textField_6.setText(""+currentHuman.getPoints());
				
				list.add(OrcBattle.get(i).Attack());
				list.add(HumansBattle.get(i).Defend());
				currentHuman.setRole("Attacker"); 
				currentOrc.setRole("Defender");
				//textField_8.setText(""+orcPoints);
				}
			}
		}
		
	}
	
	//Chunk of code that gets the winner and displays it to the screen
	private void getWinner(JLabel lblAnounceWinner) {
		int health1 = currentHuman.getHealthPoints();
		int health2 = currentOrc.getHealthPoints();
		if(health1 <=0) {
			lblAnounceWinner.setText("Orcs win!!!!");
			//lblGoldEarned.setText("Orc wins 15 points to use at armory!!!!");
		}else if(health2 <=0) {
			lblAnounceWinner.setText("Humans win!!!!");
			//lblGoldEarned.setText("Human wins 15 points to use at armory!!!!");
		}
	}
	
	//Method that Updates the clock
	private void UpdateClock(JTextField textOutput)
	{
		Timer timer = new Timer();
		timer.schedule(new RemindTask(textOutput), 0, 1000);
	}

	
	class RemindTask extends TimerTask {
		private int time = 0;
		private int ttime = 0;
		private int minutes = 0;
		private int tminutes = 0;
		private final JTextField output;
		public RemindTask(JTextField textOutput) {
			this.output = textOutput;
		}
		public void run() {
			time += 1;
			if(time==10) {
				time=0;
				ttime+=1;
				if(ttime==6) {
					ttime=0;
					minutes+=1;
					if(minutes==10) {
						minutes=0;
						tminutes+=1;
					}
						
				}
			}
			this.output.setText(" "+tminutes+minutes+":"+ttime+time);
			//this.output.setText(Integer.toString(time));
			//System.out.println(" TestClock" + time);
		}
	}
}
