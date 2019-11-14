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
public class Direktur extends pegawai {
    private static final int gajiDir=100000;
    private static final int tunjungan=50000;
    
    public int gaji(){
        return gajiDir;
    }
    public int tunjungan(){
        return tunjungan;
    } 
}
