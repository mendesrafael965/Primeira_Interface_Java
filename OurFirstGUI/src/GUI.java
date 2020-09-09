import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Componentes.modelobtn;

public class GUI{
	
	//Criar variáveis neste local para poder usar em qualquer lugar dentro da classe
	private int count = 0;
	private JLabel label;
	private JFrame frame;
	private JPanel panel;
	
	public GUI() {
		
		//Adicionar botão
		//Instanciar o objeto botão
		JButton btn1 = new JButton("Btn 1");
		
		
		
		//Adicionar evento ação para esse botão
		//1 - Adicionar a interface ActionListner a classe que contém o botão
		//2 - Sobreescrever o método ActionPerformed, ou seja o que vai acontecer 
		//quando o botão for pressionado (ação)
		
		//Adicionar esse ação ao botão
		//btn1.addActionListener(this);
		
		frame = new JFrame();
		
		label = new JLabel("Number of Clicks: 0");
			
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(label); 
		panel.add(btn1);//Adiciona o botão ao painel
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Our GUI");
		frame.pack();
		frame.setVisible(true);
		
		ActionListener action = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				label.setText("btn2 foi pressionado");
				
			}
		};
		
		modelobtn btnmod = new modelobtn();
		JButton btn2 = btnmod.setBtn("Btn 2", action);
		panel.add(btn2);
		
		
		
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				label.setText("btn1 foi pressionado");
			}
		});
	}
	public static void main(String[] args) {
		new GUI();
		
	}
}
