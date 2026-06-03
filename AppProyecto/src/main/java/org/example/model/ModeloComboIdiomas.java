package org.example.model;

import javax.swing.*;
import javax.swing.event.ListDataListener;
import java.util.ArrayList;

public class ModeloComboIdiomas implements ComboBoxModel {

    private ArrayList<String> idiomas;
    private String selectedItem;

    public ModeloComboIdiomas(ArrayList<String> lenguas) {
        this.idiomas = lenguas;
    }

    public ArrayList<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(ArrayList<String> idiomas) {
        this.idiomas = idiomas;
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectedItem = (String) anItem;

    }

    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }

    @Override
    public int getSize() {
        return idiomas.size();
    }

    @Override
    public Object getElementAt(int index) {
        return idiomas.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {

    }

    @Override
    public void removeListDataListener(ListDataListener l) {

    }
}
