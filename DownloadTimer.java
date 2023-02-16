/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.downloadtimer;

/**
 *
 * @author Jordan
 */
import javax.swing.JOptionPane; 

public class DownloadTimer {
    public void run() {
        String inputGB = JOptionPane.showInputDialog("Enter the amount of gigabytes:");
        double gigabytes = Double.parseDouble(inputGB);
        double megabytes = gigabytes * 1024;

        String inputSpeed = JOptionPane.showInputDialog("Enter the download speed in MB/s:");
        double speed = Double.parseDouble(inputSpeed);

        double timeInSeconds = megabytes / speed;
        int minutes = (int) (timeInSeconds / 60);
        int seconds = (int) (timeInSeconds % 60);
        int hours = minutes / 60;
        minutes %= 60;

        String result = String.format("Download time: %d hours, %d minutes, %d seconds", hours, minutes, seconds);
        JOptionPane.showMessageDialog(null, result);
    }
}