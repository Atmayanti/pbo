package frontend;

import backend.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class FrmBuku extends javax.swing.JFrame {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambahBaru;
    private javax.swing.JComboBox<String> cmbKategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBuku;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtIdBuku;
    private javax.swing.JTextField txtJudul;
    private javax.swing.JTextField txtPenerbit;
    private javax.swing.JTextField txtPenulis;
    private JPanel FrmBuku;
    // End of variables declaration//GEN-END:variables

    public FrmBuku() {
        setContentPane(FrmBuku);
        pack();
        tampilkanData();
        tampilkanCmbKategori();
        kosongkanFrom();
        btnSimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Buku buku = new Buku();
                buku.setIdBuku(Integer.parseInt(txtIdBuku.getText()));
                buku.setKategori((Kategori)cmbKategori.getSelectedItem());
                buku.setJudul(txtJudul.getText());
                buku.setPenulis(txtPenulis.getText());
                buku.setPenerbit(txtPenerbit.getText());
                buku.save();
                txtIdBuku.setText(Integer.toString(buku.getIdBuku()));

                tampilkanData();
            }
        });

        btnTambahBaru.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kosongkanFrom();
            }
        });

        btnHapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = (DefaultTableModel)tblBuku.getModel();
                int row = tblBuku.getSelectedRow();

                Buku buku = new Buku().getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
                buku.delete();
                kosongkanFrom();
                tampilkanData();
            }
        });

        btnCari.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cari(txtCari.getText());
            }
        });
        tblBuku.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                DefaultTableModel model = (DefaultTableModel)tblBuku.getModel();
                int row = tblBuku.getSelectedRow();
                Buku buku = new Buku().getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
                txtIdBuku.setText(String.valueOf(buku.getIdBuku()));
                cmbKategori.getModel().setSelectedItem(buku.getKategori());
                txtJudul.setText(buku.getJudul());
                txtPenulis.setText(buku.getPenulis());
                txtPenerbit.setText(buku.getPenerbit());
            }
        });
    }

    public void kosongkanFrom(){
        txtIdBuku.setText("0");
        cmbKategori.setSelectedIndex(0);
        txtJudul.setText("");
        txtPenulis.setText("");
        txtPenerbit.setText("");
    }

    public  void tampilkanData(){
        String []kolom = {"ID", "Kategori","Judul","Penulis","Penerbit"};
        ArrayList<Buku>list = new Buku().getAll();
        Object rowData[] = new Object[5];

        tblBuku.setModel(new DefaultTableModel(new Object[][]{}, kolom));
        for (int i = 0; i<list.size(); i++){
            rowData[0]= list.get(i).getIdBuku();
            rowData[1]= list.get(i).getKategori().getNama();
            rowData[2]= list.get(i).getJudul();
            rowData[3]= list.get(i).getPenulis();
            rowData[4]= list.get(i).getPenerbit();
            ((DefaultTableModel)tblBuku.getModel()).addRow(rowData);
        }
    }

    public void cari(String keyword){
        String []kolom = {"ID", "Kategori","Judul","Penulis","Penerbit"};
        ArrayList<Buku>list = new Buku().search(keyword);
        Object rowData[] = new Object[5];

        tblBuku.setModel(new DefaultTableModel(new Object[][]{}, kolom));
        for (Buku buku : list){
            rowData[0]= buku.getIdBuku();
            rowData[1]= buku.getKategori().getNama();
            rowData[2]= buku.getJudul();
            rowData[3]= buku.getPenulis();
            rowData[4]= buku.getPenerbit();
            ((DefaultTableModel)tblBuku.getModel()).addRow(rowData);
        }
    }

    public void tampilkanCmbKategori(){
        cmbKategori.setModel(new DefaultComboBoxModel(new Kategori().getAll().toArray()));
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBuku().setVisible(true);
            }
        });
    }

}
