package models;

/**
 *
 * @author Sophie
 */
public class Number {

    public static String comp[] = new String[3];
    private String c1;
    private String c2;
    private String c3;
    private int value;
    private int finalNumber;
    

    public Number(String c1, String c2, String c3, int value) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.value = value;

        this.comp[0] = c1;
        this.comp[1] = c2;
        this.comp[2] = c3;
    }

    public int getFinalNumber() {
        return finalNumber;
    }

    public void setFinalNumber(int finalNumber) {
        this.finalNumber = finalNumber;
    }

    
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void increment(int value) {
        this.value= this.value+ value;
    }

    public String getC1() {
        return c1;
    }

    public void setC1(String c1) {
        this.c1 = c1;
    }

    public String getC2() {
        return c2;
    }

    public void setC2(String c2) {
        this.c2 = c2;
    }

    public String getC3() {
        return c3;
    }

    public void setC3(String c3) {
        this.c3 = c3;
    }

//    public void newNumber(String array[]) {
//        for (int i = 0; i < array.length; i++) {
//            this.comp[i] = array[i];
//        }
//    }
}
