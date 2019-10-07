/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg1.pkg10118007.latihan20.targetsaldobulanan;
import java.text.DecimalFormat;

/**
 * Nama      : Rama Al Halik
 * Kelas     : IF-1
 * NIM       : 10118007
 * Deskripsi : Menampilkan Saldo tabungan perbulan hingga target yang ditentukan
 * @author Rama
 */
public class TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            int i, saldo;

        DecimalFormat satuan = new DecimalFormat();

        i = 1;
        saldo = 3500000;
        while (i < 10) {

            saldo += (0.08 * saldo);
            System.out.println("Saldo di bulan ke-" + i + " Rp." + satuan.format(saldo));
            i++;

            if (saldo >= 6000000) {
                break;
            }

        }
    }
    
}
