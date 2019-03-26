/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import utils.Constans;

/**
 *
 * @author Sophie
 */
public class CreateCode {

    javax.swing.JLabel c1;
    javax.swing.JLabel c2;
    javax.swing.JLabel c3;

    public void init(String numbers, javax.swing.JLabel c1, javax.swing.JLabel c2, javax.swing.JLabel c3) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        for (int i = 0; i < numbers.length(); i++) {
            char[] l = numbers.toCharArray();

            convert(Character.getNumericValue(l[i]));

        }
    }

    public void convert(int number) {
        models.Number model = null;

        switch (number) {
            case 1:
                model = new models.Number("  ", " " + Constans.S1 + " ", " " + Constans.S1 + " ", Constans.NUM1);
                break;
            case 2:
                model = new models.Number(" " + Constans.S2 + " ", " " + Constans.S3 + " ", " " + Constans.S4 + " ", number);
                break;
            case 3:
                model = new models.Number("" + Constans.S2 + " ", " " + Constans.S3 + " ", " " + Constans.S3 + " ", number);
                break;
            case 4:
                model = new models.Number("    ",  Constans.S5 + " ", "   " + Constans.S1 + " " , number);
                break;
            case 5:
                model = new models.Number("  " + Constans.S2 + " ", "  "+Constans.S4 + " ", "  " + Constans.S3 + " ", number);
                break;
            case 6:
                model = new models.Number("  "+Constans.S2 + " ", " "+ Constans.S4 + "  ", " "+ Constans.S5 +" ", number);
                break;
            case 7:
                model = new models.Number("_"+ Constans.S2+ " " ,"   "+ Constans.S1 +" ",  "   "+ Constans.S1 +" ", number);
                break;
            case 8:
                model = new models.Number(" "+ Constans.S2+ " ", " "+ Constans.S5 +" "," "+ Constans.S5 + " ", number);
                break;
            case 9:
                model = new models.Number(" "+ Constans.S2+ " ", " "+ Constans.S5 +" ", "   "+ Constans.S1+ "  ", number);
                break;
            case 0:
                model = new models.Number(" "+ Constans.S2+ " ", " "+Constans.S6 + " ", " " +Constans.S5 +" ", number);
                break;
        }

        c1.setText(c1.getText() + "  " + model.getC1() + "  ");
        c2.setText(c2.getText() + " " + model.getC2() + " ");
        c3.setText(c3.getText() + " " + model.getC3() + " ");

    }

}
