/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan60;

/**
 *
 * @author lutfi
 * NAMA : LUTFI RAMADHAN
 * NIM  : 10118908
 * KELAS : IF 11 KARYAWAN
 */
public class Latihan60 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KekuatanMata s, r, b;
        s = new Sharingan();
        s.setKarakter("Uchiha Sasuke");
        s.Jurus();
        r = new Rinnegan();
        r.setKarakter("Uzumaki Nagato");
        r.Jurus();
        b = new Byakugan();
        b.setKarakter("Hyuga Neji");
        b.Jurus();
    }

}
