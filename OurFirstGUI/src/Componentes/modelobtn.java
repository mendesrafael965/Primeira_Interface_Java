package Componentes;

import java.awt.event.ActionListener;

import javax.swing.JButton;

public class modelobtn {
	
	JButton btnModelo;
	
	ActionListener action;
	
	//Criar um m�todo para retornar esse bot�o padr�o
	public JButton setBtn(String nome, ActionListener action) {
		//Instanciar objeto que ser� retornado
		btnModelo = new JButton(nome);
		
		this.action = action;
		
		btnModelo.addActionListener(action);
		
		return btnModelo;
	}
}
