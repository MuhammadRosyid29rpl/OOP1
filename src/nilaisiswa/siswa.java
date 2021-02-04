/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaisiswa;

/**
 *
 * @author ASUS TUF A15
 */
public class siswa {
  String nama;
int nilai; 
//method  cetak  nilai
 public void cetaknilai(){
System.out.println("Nilai  Produktif  RPL  5  "+nama+"  adalah  ="  +nilai);
}

//method  pengecekan public  boolean  lulus(){
public boolean getNilai(){;
return  nilai>=75;
}
public  boolean  tidaklulus(){
return  nilai<74;
}
}


