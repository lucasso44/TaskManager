/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.kingston.programming.taskmanager.listener;

import uk.ac.kingston.programming.taskmanager.view.NavBarLink;

/**
 *
 * @author lucas
 */
public interface NavBarLinkListener {
    public void onNavBarLinkClicked(NavBarLink navBarLink, String title, String link);
}
