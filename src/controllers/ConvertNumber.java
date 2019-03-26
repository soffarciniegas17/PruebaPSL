/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;

import utils.Constans;

/**
 *
 * @author Sophie
 */
public class ConvertNumber {

    private ArrayList<models.Number> list;
    private String cadena;

    public void init(String[] array,javax.swing.JLabel label ) {
        cadena = "";
        list = new ArrayList();

        String c1[] = array[0].split("   ");
        String c2[] = array[1].split("  ");
        String c3[] = array[2].split("  ");

        for (int i = 0; i < c1.length; i++) {
            list.add(new models.Number(c1[i], c2[i], c3[i], 0));
            label.setText(convertOne(list.get(i)));

        }

    }

    public String convertOne(models.Number model) {

        models.Number modelnew = model;

        for (String comp : modelnew.comp) {
            //   System.out.println(modelnew.comp[j]);
            compare(comp, modelnew);
        }

        cadena += " " + numbeeer(modelnew.getValue(), model);

        return cadena;
    }

    public void compare(String c, models.Number model) {
        c = c.replace(" ", "");

        switch (c) {
            case "|":
                model.increment(Constans.SI);
                break;
            case "_":
                model.increment(Constans.S_);
                break;
            case "_|":
                model.increment(Constans.S_I);
                break;
            case "|_":
                model.increment(Constans.SI_);
                break;
            case "|_|":
                model.increment(Constans.SI_I);
                break;
            case " ":
                model.increment(0);
                break;
            case "||":
                model.increment(10);
                break;
        }
    }

    public int numbeeer(int valu, models.Number mo) {

        if (valu == Constans.NUM2 || valu == Constans.NUM5) {

            mo.setFinalNumber(mo.getC2().equals("_|") ? 2 : 5);

        } else if (valu == Constans.NUM3 || valu == Constans.NUM9) {

            mo.setFinalNumber(mo.getC2().equals("|_|") ? 9 : 3);

        } else {
            switch (valu) {
                case Constans.NUM1:
                    mo.setFinalNumber(1);
                    break;
                case Constans.NUM4:
                    mo.setFinalNumber(4);
                    break;
                case Constans.NUM6:
                    mo.setFinalNumber(6);
                    break;
                case Constans.NUM7:
                    mo.setFinalNumber(7);
                    break;
                case Constans.NUM8:
                    mo.setFinalNumber(8);
                    break;

            }
        }

        return mo.getFinalNumber();
    }
}
