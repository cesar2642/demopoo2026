package org.example.model;

import javax.swing.*;
import java.util.ArrayList;

public class ModeloDefaultComboIdiomas extends DefaultComboBoxModel {

    public ModeloDefaultComboIdiomas(ArrayList lenguas) {
        super(lenguas.toArray());
    }

    public ModeloDefaultComboIdiomas() {
        super();
    }

}
