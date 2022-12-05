/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_02;

/**
 *
 * @author infin
 */
public class Kinetic {
    double result;

    public double getResult() {
        return result;
    }

    public void setResult(double m, double v) {
        this.result = m*Math.pow(v,2)/2;
    }
}
