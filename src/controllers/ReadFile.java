/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;

/**
 *
 * @author Sophie
 */
public class ReadFile {

    private String columns[] = new String[3];

    public String[] leer(String ruta) {

        int i = 0;

        try {
            BufferedReader bf = new BufferedReader(new FileReader(ruta));

            String bfread;

            while ((bfread = bf.readLine()) != null) {
                columns[i] = bfread;
                i++;
            }

        } catch (Exception e) {
            System.out.println("No se encontró el archivo");
        }
        return columns;
    }
}
