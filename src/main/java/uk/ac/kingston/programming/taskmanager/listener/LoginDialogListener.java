/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.kingston.programming.taskmanager.listener;

/**
 *
 * @author lucas
 */
public interface LoginDialogListener {

    public void onLoginButtonPressed(String emailAddress, String password);
    
    public void onCancelButtonPressed();
    
}
