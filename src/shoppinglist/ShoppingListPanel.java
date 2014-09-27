/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppinglist;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Dimension;

/**
 *
 * @author awershow
 */
public class ShoppingListPanel extends JPanel {
    //Panel components
    private JPanel labelPanel;
    private JLabel[] labelArray;
    private JPanel textPanel;
    private  JTextField[] textArray;
    
    //Size of list
    private static int LIST_SIZE = 10;
    
    //Constructor
    public ShoppingListPanel() {
        //Initialization
        super(new BorderLayout());
        labelArray = new JLabel[LIST_SIZE];
        textArray = new JTextField[LIST_SIZE];
        
        //Create label panel
        labelPanel = new JPanel(new GridLayout(LIST_SIZE,1));
        for (int i = 0; i < LIST_SIZE; i++) {
            labelArray[i] = new JLabel(Integer.toString(i+1));
            labelArray[i].setPreferredSize(new Dimension(20,20));
            labelArray[i].setHorizontalAlignment(JLabel.CENTER);
            labelPanel.add(labelArray[i]);
        }
        
        //Create text panel
        textPanel = new JPanel(new GridLayout(LIST_SIZE,1));
        for (int j = 0; j < LIST_SIZE; j++) {
            textArray[j] = new JTextField();
            textArray[j].setPreferredSize(new Dimension(100,20));
            textPanel.add(textArray[j]);
        }
        
        //Add sub-panels to main panel
        this.add(labelPanel,BorderLayout.WEST);
        this.add(textPanel,BorderLayout.CENTER);
    }
}
