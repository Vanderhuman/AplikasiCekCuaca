/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas.AplikasiCekCuaca;

/**
 *
 * @author USER
 */
public class Cuaca {
    private String kota;
    private String kondisi;
    private double suhu;

    public Cuaca(String kota, String kondisi, double suhu) {
        this.kota = kota;
        this.kondisi = kondisi;
        this.suhu = suhu;
    }

    public String getKota() { return kota; }
    public String getKondisi() { return kondisi; }
    public double getSuhu() { return suhu; }
}
