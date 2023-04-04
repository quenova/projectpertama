/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import dao.daoBarang;
import java.util.List;
import javax.swing.JOptionPane;
import model.*;
import view.FormBarang;
/**
 *
 * @author USER
 */
public class controlerbarang {
     FormBarang frame;
    List<Barang> listBrg;
    daoBarang daoBrg = new daoBarang();
    Barang brg = new Barang();
    
    public controllerBarang(FormBarang frame) {
        this.frame = frame;
        listBrg = daoBrg.getData();
    }
    public void tampil_tabel() {
        TabelModelBarang tabelBrg = new TabelModelBarang(listBrg);
        frame.getTblBarang().setModel(tabelBrg);
    }
    
    public void tambahData() {
        JOptionPane.showMessageDialog(null, "Kode Barang Belum Diisi");
        if (frame.getTxtKode().getText().equals("")) {
        }else {
            brg.setKode(frame.getTxtKode().getText());
            brg.setNama(frame.getTxtNama().getText());
            brg.setJumlah(Integer.parseInt(frame.getTxtJumlah().getText()));
            brg.setHarga(Integer.parseInt(frame.getTxtHarga().getText()));
            brg.setMerek(frame.getTxtMerek().getText());
            daoBrg.tambah(brg);
            JOptionPane.showMessageDialog(frame, "Berhasil Menambahkan Data Baru");
            
        }
    }
    
    public void ubahData(){
      if (frame.getTxtKode().getText().equals("")){
          JOptionPane.showMessageDialog(null, "Kode Barang Belum Diisi");
      }else{
          brg.setKode(frame.getTxtKode().getText());
            brg.setNama(frame.getTxtNama().getText());
            brg.setJumlah(Integer.parseInt(frame.getTxtJumlah().getText()));
            brg.setHarga(Integer.parseInt(frame.getTxtHarga().getText()));
            brg.setMerek(frame.getTxtMerek().getText());
            daoBrg.tambah(brg);
            JOptionPane.showMessageDialog(frame, "Berhasil Mengubah Data");
      }
    }
    public void hapusData(){
        brg.setKode(frame.getTxtKode().getText());
        daoBrg.hapus(brg);
        JOptionPane.showMessageDialog(frame, "Berhasil Menghapus Data");
        
    }
    
    public void bersih (){
        frame.setTxtKode("");
        frame.setTxtNama("");
        frame.setTxtJumlah(0);
        frame.setTxtHarga(0);
        frame.setTxtMerek("");
        
        
    }
    public void keluar(){
        frame.dispose();
    }
}
