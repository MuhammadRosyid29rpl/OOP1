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
public class kelulusan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //object
siswa pelajar =  new  siswa();

//pengisian  Atribut pelajar
pelajar.nama=  "Anya";
pelajar.nilai=75;

//menjalankan  method
pelajar.cetaknilai();

//menentukan  lulus if(	()){
if(pelajar.nilai >= 75){
System.out.println("selamat  anda  lulus");
}
else{  if( pelajar.nilai <= 75  ){
System.out.println("Anda  harus  belajar  lebih  giat  lagi");
}

    }
    
}
}
