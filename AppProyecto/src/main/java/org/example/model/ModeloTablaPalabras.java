package org.example.model;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.util.ArrayList;

public class ModeloTablaPalabras implements TableModel {
    private ArrayList<Palabra> data;

    public ModeloTablaPalabras() {
        this.data = new ArrayList<>();
    }

    public ModeloTablaPalabras(ArrayList<Palabra> info) {
        this.data = info;
    }

    public ArrayList<Palabra> getData() {
        return data;
    }

    public void setData(ArrayList<Palabra> data) {
        this.data = data;
    }

    public void agregarPalabra(Palabra pal){
        this.data.add(pal);

    }

    public Palabra getPalabra(int index){
        return this.data.get(index);
    }

    public void eliminarPalabra(int index) {
        this.data.remove(index);
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String columnName = "";
        switch (columnIndex) {
            case 0:
                columnName = "Idioma";
                break;
            case 1:
                columnName = "Palabra";
                break;
            case 2:
                columnName = "Significado";
                break;
            case 3:
                columnName = "Ejemplo";
                break;
            case 4:
                columnName = "Categoría";
                break;
            case 5:
                columnName = "Dificultad";
                break;
            default:
                columnName = "NA";
                break;
        }
        return columnName;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {

        switch (columnIndex) {
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
            default:
                return String.class;
        }

    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Palabra word = data.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return word.getIdioma();
            case 1:
                return word.getPalabra();
            case 2:
                return word.getSignificado();
            case 3:
                return word.getEjemplo();
            case 4:
                return word.getCategoria();
            case 5:
                return word.getPalabra();
            default:
                return "NA";
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }


}
