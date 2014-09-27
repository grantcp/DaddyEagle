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
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;

import targetAPICalls.TargetCall;
import targetParser.*;

public class ShoppingList extends JFrame implements ActionListener {

    private LocationPanel location;
    private JTextField zipField;
    private ShoppingListPanel list;
    private String[] listOfItems;
    private String zipCode;
    
    ShoppingList() {
        //Create panels
	JPanel board = new JPanel();
        JPanel listPanel = new JPanel(new BorderLayout());
        JPanel storePanel = new JPanel(new BorderLayout());
        JPanel zipPanel = new JPanel();
        JPanel userPanel = new JPanel(new GridLayout(2,1));
        
        //Create list panel
 	JLabel listName = new JLabel("MY SHOPPING LIST");
        listName.setHorizontalAlignment(JLabel.CENTER);
        listName.setFont(new Font("Serif",Font.BOLD,40));
        list = new ShoppingListPanel();
        
        listPanel.add(listName,BorderLayout.NORTH);
        listPanel.add(list,BorderLayout.CENTER);
        
        //Create store panel
        JButton findStore = new JButton("Find my best store!");
        findStore.setFont(new Font("Serif",Font.BOLD,40));
        findStore.setActionCommand("findStore");
        findStore.addActionListener(this);
        JLabel lblZip = new JLabel("Your Zip Code:");
        lblZip.setHorizontalAlignment(JLabel.RIGHT);
        lblZip.setFont(new Font("Serif",Font.BOLD,30));
        zipField = new JTextField();
        zipField.setFont(new Font("Serif",Font.BOLD,30));
        zipField.setPreferredSize(new Dimension(200,40));
        location = new LocationPanel();
        
        zipPanel.add(lblZip);
        zipPanel.add(zipField);
        userPanel.add(zipPanel);
        userPanel.add(findStore);
        storePanel.add(userPanel,BorderLayout.NORTH);
        storePanel.add(location,BorderLayout.CENTER);
		
	board.add(listPanel);
        board.add(storePanel);
		
	getContentPane().add(board);
		
	this.setResizable(true);
	}

        public void actionPerformed(ActionEvent e) {
            //Perform actions if the findStore button was clicked
            if (e.getActionCommand().equalsIgnoreCase("findStore")) {
                //Pull items from shopping list
                listOfItems = new String[ShoppingListPanel.LIST_SIZE];
                for (int i = 0; i < ShoppingListPanel.LIST_SIZE; i++) {
                    listOfItems[i] = list.getItem(i);
                }
                zipCode = zipField.getText();
                System.out.println("Zip Code: " + zipCode);
                
                //Target API queries & parsing here!
                for (int j = 0; j < ShoppingListPanel.LIST_SIZE; j++) {
                    if (!listOfItems[j].equalsIgnoreCase("")) {
                        ProductParser pParser = new ProductParser(TargetCall.getTargetProduct(listOfItems[j]));
                        list.setItem(j, pParser.getPartName());
                        System.out.println("PartNo: " + pParser.getPartNo());
                        System.out.println("PartName: " + pParser.getPartName());
                    }
                }
                
                //Repaint
                this.repaint();
            }
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
