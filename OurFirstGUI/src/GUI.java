import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener{
	
	private int count = 0;
	private JLabel label;
	private JFrame frame;
	private JPanel panel;
	
	public GUI() {
		
		//tipo nome = new tipo();
		//Para criar um novo objeto usamos o comando new + o construtor da classe
		//(que tem o mesmo nome da classe)
		//new instacia a classe e chama o construtor
		
		frame = new JFrame();
		
		JButton button = new JButton("Click me"); 
		//adiciona a ação ao botão devo passar como parametro a classe que trata o
		//evento do botão(this)
		button.addActionListener(this);
		JButton testeButton = new JButton("Botão de Teste");
		
	
		label = new JLabel("Number of Clicks: 0");
			
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		panel.add(testeButton);
		panel.add(label);
		
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Our GUI");
		frame.pack();
		frame.setVisible(true);
		
		testeButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				label.setText("Teste 1,2,3,... :");
			}
		});
		
	}
	
	

	public static void main(String[] args) {
		new GUI();
		
	}
	
	//Sobre escrever o método da interface ActionListener
	@Override
	public void actionPerformed(ActionEvent arg0) {
		count++;
		label.setText("Number of Clicks: " + count);
		
	}
	
	

}
