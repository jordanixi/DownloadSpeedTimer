/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.downloadtimer;

import javax.swing.SwingUtilities;

/**
 *
 * @author Jordan
 */
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DownloadTimer calculator = new DownloadTimer();
            calculator.run();
        });
    }
}