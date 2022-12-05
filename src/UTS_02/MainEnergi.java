/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_02;

import java.util.Scanner;

/**
 *
 * @author infin
 */
public class MainEnergi {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       Kinetic kinetic = new Kinetic();
       double m,v;
       
        System.out.println("Menghitung Energi Kinetik");
        System.out.print("masukkan masa benda: ");
        m = scanner.nextDouble();
        System.out.print("masukkan kecepatn benda: ");
        v = scanner.nextDouble();
        kinetic.setResult(m, v);
        System.out.println("hasilnya adalah "+kinetic.getResult());
    }
}
