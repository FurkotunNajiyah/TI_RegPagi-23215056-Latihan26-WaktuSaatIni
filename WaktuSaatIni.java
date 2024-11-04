/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * *
 * @author ACER
 * Nama: Siti Furkotun Najiyah
 * NIM: 23215056
 * PRODI: Teknik Informatika
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WaktuSaatIni {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy HH:mm:ss");
        String formattedDateTime = now.format(formatter);

        System.out.println("Hari ini adalah hari : " + formattedDateTime);
    }
}