/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppinglist;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Font;

/**
 *
 * @author awershow
 */
public class LocationPanel extends JPanel {
    //Panel components
    private JPanel namePanel;
    private JLabel actName;
    
    private JPanel addressPanel;
    private JLabel actAddress;
    
    private JPanel cityStateZipPanel;
    private JLabel actCityStateZip;
    private JLabel actState;
    private JLabel actZip;    
    
    public LocationPanel() {
        super(new GridLayout(3,1));
        
        //Extra components
        JLabel lblName = new JLabel("Store:");
        lblName.setPreferredSize(new Dimension(200,40));
        lblName.setFont(new Font("Serif",Font.BOLD,30));
        lblName.setHorizontalAlignment(JLabel.RIGHT);
        JLabel lblAddress = new JLabel("Address:");
        lblAddress.setPreferredSize(new Dimension(200,40));
        lblAddress.setFont(new Font("Serif",Font.BOLD,30));
        lblAddress.setHorizontalAlignment(JLabel.RIGHT);
        JLabel lblCityStateZip = new JLabel("City/State/Zip:");
        lblCityStateZip.setPreferredSize(new Dimension(200,40));
        lblCityStateZip.setFont(new Font("Serif",Font.BOLD,30));
        lblCityStateZip.setHorizontalAlignment(JLabel.RIGHT);
        
        //Construct subpanels
        namePanel = new JPanel();
        actName = new JLabel("[FIND ME]");
        actName.setPreferredSize(new Dimension(200,40));
        actName.setFont(new Font("Serif",Font.BOLD,30));
        namePanel.add(lblName);
        namePanel.add(actName);
        
        addressPanel = new JPanel();
        actAddress = new JLabel("[FIND ME]");
        actAddress.setPreferredSize(new Dimension(200,40));
        actAddress.setFont(new Font("Serif",Font.BOLD,30));
        addressPanel.add(lblAddress);
        addressPanel.add(actAddress);
        
        cityStateZipPanel = new JPanel();
        actCityStateZip = new JLabel("[FIND ME]");
        actCityStateZip.setPreferredSize(new Dimension(200,40));
        actCityStateZip.setFont(new Font("Serif",Font.BOLD,30));
        cityStateZipPanel.add(lblCityStateZip);
        cityStateZipPanel.add(actCityStateZip);
        
        //Add subpanels to main panel
        this.add(namePanel);
        this.add(addressPanel);
        this.add(cityStateZipPanel);
    }
}
