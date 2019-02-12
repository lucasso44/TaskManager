/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.kingston.programming.todomanager.listener;

import uk.ac.kingston.programming.todomanager.model.Task;

/**
 *
 * @author lucas
 */
public interface PreviewPanelListener {
    public void onEditButtonClicked(Task task);
    public void onDeleteButtonClicked(Task task);
    public void onTaskItemUpdated(Task task);
}
