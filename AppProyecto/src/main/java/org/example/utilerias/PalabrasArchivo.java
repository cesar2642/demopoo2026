package org.example.utilerias;

import org.example.model.Palabra;

import java.io.*;
import java.util.ArrayList;

public class PalabrasArchivo {
    private String ruta;

    public PalabrasArchivo(String ruta){
        this.ruta = ruta;
    }

    public void escribirPalabras(ArrayList<Palabra> palabras){
        try(
                ObjectOutputStream salida = new ObjectOutputStream(
                        new FileOutputStream(this.ruta)
                )
        ){

            salida.writeObject(palabras);
            System.out.println("Palabras guardadas correctamente");

        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch (IOException ioe){
            System.out.println(ioe.getMessage());
        }
    }

    public ArrayList<Palabra> leerPalabras() {
        try(
                ObjectInputStream entrada = new ObjectInputStream(
                        new FileInputStream(this.ruta)
                )
        ){

            ArrayList<Palabra> palabras = ( ArrayList<Palabra> ) entrada.readObject();
            return palabras;
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch (IOException ioe){
            System.out.println(ioe.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }


}

