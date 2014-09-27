/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppinglist;

/**
 *
 * @author awershow
 */
import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ShoppingList extends JFrame {

	ShoppingList() {
		JPanel board = new JPanel(new BorderLayout());
		JLabel listName = new JLabel("What I Want!");
		JTextField item = new JTextField();
		
		board.add(listName, BorderLayout.NORTH);
		board.add(item,BorderLayout.CENTER);
		
		getContentPane().add(board);
		
		this.setResizable(true);
	}

	//Main
	public static void main(String[] args) {
		ShoppingList shopper = new ShoppingList();
		shopper.setTitle("Shopping List");
		WindowListener l = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		shopper.addWindowListener(l);
		shopper.pack();
		shopper.setVisible(true);
	}

}
