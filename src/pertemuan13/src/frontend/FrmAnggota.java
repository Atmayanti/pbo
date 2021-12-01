package frontend;
import backend.*;

import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class FrmAnggota extends JFrame {
    private JButton btnSimpan;
    private JButton btnTambahData;
    private JButton btnHapus;
    private JTextField txtCari;
    private JButton btnCari;
    private JTable tblAnggota;
    private JTextField txtIdAnggota;
    private JTextField txtNama;
    private JTextField txtAlamat;
    private JTextField txtTelepon;
    private JPanel FrmAnggota;

    public static void main(String[] args) {
        FrmAnggota frmAnggota = new FrmAnggota();
        frmAnggota.setVisible(true);
    }

    public void kosongkanForm() {
        txtIdAnggota.setText("0");
        txtNama.setText("");
        txtAlamat.setText("");
        txtTelepon.setText("");
    }

    public void tampilkanData(){
        String[] kolom = {"ID", "Nama", "Alamat","Telepon"};
        ArrayList<Anggota> list = new Anggota().getAll();
        Object rowData[] = new Object[4];

        tblAnggota.setModel(new DefaultTableModel(new Object[][] {}, kolom));

        for (Anggota anggota : list) {
            rowData[0] = anggota.getIdAnggota();
            rowData[1] = anggota.getNama();
            rowData[2] = anggota.getAlamat();
            rowData[3] = anggota.getTelepon();

            ((DefaultTableModel)tblAnggota.getModel()).addRow(rowData);
        }
    }

    public void cari(String keyword) {
        String[] kolom = {"ID", "Nama", "Alamat","Telepon"};
        ArrayList<Anggota> list = new Anggota().search(keyword);
        Object rowData[] = new Object[4];

        tblAnggota.setModel(new DefaultTableModel(new Object[][] {}, kolom));

        for (Anggota anggota : list) {
            rowData[0] = anggota.getIdAnggota();
            rowData[1] = anggota.getNama();
            rowData[2] = anggota.getAlamat();
            rowData[3] = anggota.getTelepon();

            ((DefaultTableModel)tblAnggota.getModel()).addRow(rowData);
        }
    }

    public FrmAnggota() {
        tampilkanData();
        kosongkanForm();
        setContentPane(FrmAnggota);
        pack();

        btnSimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Anggota anggota = new Anggota();
                anggota.setIdAnggota(Integer.parseInt(txtIdAnggota.getText()));
                anggota.setNama(txtNama.getText());
                anggota.setAlamat(txtAlamat.getText());
                anggota.setTelepon(txtTelepon.getText());
                anggota.save();
                txtIdAnggota.setText(Integer.toString(anggota.getIdAnggota()));
                tampilkanData();
            }
        });

        btnTambahData.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kosongkanForm();
            }
        });

        btnHapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = (DefaultTableModel)tblAnggota.getModel();
                int row = tblAnggota.getSelectedRow();

                Anggota anggota = new Anggota().getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
                anggota.delete();
                kosongkanForm();
                tampilkanData();
            }
        });

        btnCari.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cari(txtCari.getText());
            }
        });


        tblAnggota.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                DefaultTableModel model = (DefaultTableModel)tblAnggota.getModel();
                int row = tblAnggota.getSelectedRow();

                txtIdAnggota.setText(model.getValueAt(row, 0).toString());
                txtNama.setText(model.getValueAt(row, 1).toString());
                txtAlamat.setText(model.getValueAt(row, 2).toString());
                txtTelepon.setText(model.getValueAt(row, 3).toString());
            }
        });
    }

}