package Componentes;

import java.awt.event.ActionListener;

import javax.swing.JButton;

public class modelobtn {
	
	JButton btnModelo;
	
	ActionListener action;
	
	//Criar um método para retornar esse botão padrão
	public JButton setBtn(String nome, ActionListener action) {
		//Instanciar objeto que será retornado
		btnModelo = new JButton(nome);
		
		this.action = action;
		
		btnModelo.addActionListener(action);
		
		return btnModelo;
	}
}
