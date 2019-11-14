/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author ARVINA
 */
public class PembayaranGaji {
    public int hitungGaji(pegawai peg){
        int uang=peg.gaji();
        if(peg instanceof Direktur)
            uang+=((Direktur)peg).tunjungan();
        if(peg instanceof Staf)
            uang+=((Staf)peg).bonus();
        return uang;
    }
    public static void main(String []args){
        PembayaranGaji pg=new PembayaranGaji ();
        Staf ali=new Staf();
        Direktur tony = new Direktur();
        System.out.println("Gaji yang dibayarkan untuk Staf ="+pg.hitungGaji(ali));
        System.out.println("Gaji yang dibayarkan kepada Direktur ="+pg.hitungGaji(tony));
    }
}
