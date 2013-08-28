package fr.calculatrice.train;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculatrice extends JFrame{
	
	private JLabel ecran = new JLabel();
	private JPanel label = new JPanel();
	private JPanel operateurs = new JPanel();
	private JPanel numerique = new JPanel();
	String[] panum = {"1","2","3","4","5","6","7","8","9","0",".","=","C","/","-","+","*"};
	JButton[] bunum = new JButton[panum.length];
	double calcul;
	private Dimension dim = new Dimension(45,45);
	private Dimension dim2 = new Dimension(40,35);
	private int i;
	private boolean useoperateur, update = false;
	private String str;
	String operateur;
	String operateurspec;
	Font police = new Font("Arial", Font.BOLD, 12);
	Font police2 = new Font("Arial", Font.BOLD, 10 );
	
	public Calculatrice() {
				
		this.setTitle("Calculatrice");
		this.setSize(210,280);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		ecran.setText("");
		ecran.setFont(police);
		numerique.setPreferredSize(new Dimension (150, 0));
		operateurs.setPreferredSize(new Dimension(35,0));
		label.setPreferredSize(new Dimension(0,40));
		ecran.setPreferredSize(new Dimension(200,30));
		ecran.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		ecran.setHorizontalAlignment(JLabel.RIGHT);;
		ecran.setOpaque(true);
		ecran.setBackground(Color.white);
		
		this.setLayout(new BorderLayout());
		label.add(ecran, BorderLayout.NORTH);
		this.add(numerique, BorderLayout.WEST);
		this.add(operateurs, BorderLayout.CENTER);
		this.add(label, BorderLayout.NORTH);
		init();
		
	}
		
		public void init() {
			for(int i=0; i<panum.length; i++)
			{
				
				bunum[i] = new JButton(panum[i]);
				bunum[i].setPreferredSize(dim);
				bunum[i].setFont(police);
					
				
			switch(i) 
			{			
			case 11:
				bunum[i].setPreferredSize(dim);
				bunum[i].addActionListener(new EqualListener());
				numerique.add(bunum[i]);
				bunum[i].setFont(police);
				break;
			case 12:
				bunum[i].setForeground(Color.red);
				bunum[i].setPreferredSize(dim);
				bunum[i].addActionListener(new EmptyListener());
				operateurs.add(bunum[i]);
				bunum[i].setFont(police);
				break;
			case 13:
				bunum[i].setPreferredSize(dim2);
				bunum[i].addActionListener(new DivisListener());
				operateurs.add(bunum[i]);
				bunum[i].setFont(police2);
				break;
			case 14:
				bunum[i].setPreferredSize(dim2);
				bunum[i].addActionListener(new MoinsListener());
				operateurs.add(bunum[i]);
				bunum[i].setFont(police2);
				break;
			case 15:
				bunum[i].setPreferredSize(dim2);
				bunum[i].addActionListener(new PlusListener());
				operateurs.add(bunum[i]);
				bunum[i].setFont(police2);
				break;
			case 16:
				bunum[i].setPreferredSize(dim2);
				bunum[i].addActionListener(new MultiListener());
				operateurs.add(bunum[i]);
				bunum[i].setFont(police2);
				break;
			default :
				numerique.add(bunum[i]);
				bunum[i].addActionListener(new ChiffreListener());
				break;
			}
			
			
		}
	}
		
		

		private void Operations() {
			if (operateur.equals("+")){
				calcul = calcul + Double.valueOf(ecran.getText()).doubleValue();
				ecran.setText(String.valueOf(calcul));
			}
			if (operateur.equals("-")){
				calcul = calcul - Double.valueOf(ecran.getText()).doubleValue();
				ecran.setText(String.valueOf(calcul));
			}
			if (operateur.equals("*")){
				calcul = calcul * Double.valueOf(ecran.getText()).doubleValue();
				ecran.setText(String.valueOf(calcul));
			}
			if (operateur.equals("/")){
				try {
				calcul = calcul / Double.valueOf(ecran.getText()).doubleValue();
				ecran.setText(String.valueOf(calcul));
			} catch(ArithmeticException e1) {
		        ecran.setText("0");
		      }
			
			}
		}
		
		
	
	class ChiffreListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String str = ((JButton)e.getSource()).getText();
			
			if(update)
				update = false;
			else {
				if(!ecran.getText().equals("0"));
				str = ecran.getText() + str;
			}
			 ecran.setText(str);
			}
		
	}
	
	class EqualListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			try {
			Operations();
			useoperateur = false;
			update = true;
			
			
			} catch (NullPointerException e1) {
				
			}
		}
	}
	
	class EmptyListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			useoperateur = false;
			operateur = "";
			calcul = 0;
			ecran.setText("");
			
		}
	}
	
	class DivisListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			try {
			if(useoperateur){
				Operations();
				ecran.setText(String.valueOf(calcul));
			}
			else {
				calcul = Double.valueOf(ecran.getText()).doubleValue();
				useoperateur = true;
			}
			operateur = "/";
			update = true;
			}catch (NumberFormatException e1) {
			
		}
		}
	}
	class MoinsListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			try {
				if(useoperateur){
					Operations();
					ecran.setText(String.valueOf(calcul));
				}
				else {
					calcul = Double.valueOf(ecran.getText()).doubleValue();
					useoperateur = true;
				}
				operateur = "-";
				update = true;
				}catch (NumberFormatException e1) {
				
			}
			}
	}
	class PlusListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			try {
				if(useoperateur){
					Operations();
					ecran.setText(String.valueOf(calcul));
				}
				else {
					calcul = Double.valueOf(ecran.getText()).doubleValue();
					useoperateur = true;
				}
				operateur = "+";
				update = true;
				}catch (NumberFormatException e1) {
				
			}
			}
	}
	class MultiListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			try {
				if(useoperateur){
					Operations();
					ecran.setText(String.valueOf(calcul));
				}
				else {
					calcul = Double.valueOf(ecran.getText()).doubleValue();
					useoperateur = true;
				}
				operateur = "*";
				update = true;
				}catch (NumberFormatException e1) {
				
			}
			}
		
		

}
}
	
