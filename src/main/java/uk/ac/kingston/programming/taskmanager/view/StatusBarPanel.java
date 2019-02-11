/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.kingston.programming.taskmanager.view;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import uk.ac.kingston.programming.taskmanager.controller.StatusBarListener;

/**
 *
 * @author lucas
 */
public final class StatusBarPanel extends AppPanel implements StatusBarListener{
    
    private JLabel statusTextLabel;
    private JLabel queryTextLabel;
    
    public StatusBarPanel() {
        
        super(true, true);

        createChildControls();
    }

    @Override
    public void createChildControls() {
        
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setBackground(Styling.createColor(800));
        
        statusTextLabel = new JLabel();
        statusTextLabel.setBorder(BorderFactory.createEmptyBorder(5, 20, 10, 10));
        statusTextLabel.setFont(Styling.createFontMedium(false));
        statusTextLabel.setForeground(Color.white);
        
        add(statusTextLabel);        
        
        queryTextLabel = new JLabel();
        queryTextLabel.setBorder(BorderFactory.createEmptyBorder(5, 10, 10, 30));
        queryTextLabel.setFont(Styling.createFontMedium(false));
        queryTextLabel.setForeground(Color.white); 
        
        add(queryTextLabel);
    }
    
    @Override
    public void setStatusBarText(String text) {
        statusTextLabel.setText(text);
        updateUI();
    }

    @Override
    public void setQueryBarText(String text) {
        queryTextLabel.setText(text);
        updateUI();
    }
    
    @Override
    public void onTaskListProviderSet() {
        getTaskListProvider().setStatusBarListener(this);
    };
}
