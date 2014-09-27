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
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

public class ShoppingList extends JFrame {

    ShoppingList() {
        //Create panels
	JPanel board = new JPanel();
        JPanel listPanel = new JPanel(new BorderLayout());
        JPanel storePanel = new JPanel(new BorderLayout());
        
        //Create list panel
 	JLabel listName = new JLabel("MY SHOPPING LIST");
        listName.setHorizontalAlignment(JLabel.CENTER);
        listName.setFont(new Font("Serif",Font.BOLD,40));
        ShoppingListPanel list = new ShoppingListPanel();
        
        listPanel.add(listName,BorderLayout.NORTH);
        listPanel.add(list,BorderLayout.CENTER);
        
        //Create store panel
        JButton findStore = new JButton("Find my best store!");
        findStore.setFont(new Font("Serif",Font.BOLD,40));
        LocationPanel location = new LocationPanel();
        
        storePanel.add(findStore,BorderLayout.NORTH);
        storePanel.add(location,BorderLayout.CENTER);
		
	board.add(listPanel);
        board.add(storePanel);
		
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
