package frontend;

import backend.Anggota;
import backend.Buku;
import backend.Peminjaman;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class FrmPeminjaman extends JFrame {
    private JPanel FrmPeminjaman;
    private JTable tblPeminjaman;
    private JButton btnSimpan;
    private JButton btnTambahBaru;
    private JButton btnHapus;
    private JTextField txtIdPeminjaman;
    private JTextField txtCariBuku;
    private JTextField txtIdBuku;
    private JTextField txtIdAnggota;
    private JButton btnCariAnggota;
    private JButton btnCariBuku;
    private JTextField txtTanggalPinjam;
    private JTextField txtTanggalKembali;
    private JLabel lblAnggota;
    private JLabel lblBuku;

    public FrmPeminjaman() {
        kosongkanForm();
        tampilkanData();
        this.setContentPane(FrmPeminjaman);
        this.pack();

        btnCariAnggota.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cariAnggota(txtIdAnggota.getText());
            }
        });

        btnSimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                simpan();
            }
        });
        btnTambahBaru.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kosongkanForm();
            }
        });
        btnHapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model =
                        (DefaultTableModel) tblPeminjaman.getModel();
                int row = tblPeminjaman.getSelectedRow(); Peminjaman p = new
                        Peminjaman().getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
                p.delete(); kosongkanForm(); tampilkanData();
            }
        });
        tblPeminjaman.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                DefaultTableModel model = (DefaultTableModel) tblPeminjaman.getModel();
                int row = tblPeminjaman.getSelectedRow();
                Peminjaman p = new Peminjaman().getById(Integer.parseInt(model.getValueAt(row, 0).toString()));
                int id = Integer.parseInt(model.getValueAt(row,0).toString());
                txtIdPeminjaman.setText(model.getValueAt(row,0).toString());
                lblAnggota.setText(model.getValueAt(row,1).toString());
                lblBuku.setText(model.getValueAt(row,2).toString());
                txtIdBuku.setText(Integer.toString(new Peminjaman().getById(id).getBuku().getIdBuku()));
                txtIdAnggota.setText(Integer.toString(new Peminjaman().getById(id).getAnggota().getIdAnggota()));
                txtTanggalPinjam.setText(model.getValueAt(row,3).toString().replace('-','/'));
                txtTanggalKembali.setText(model.getValueAt(row,4).toString().replace('-','/'));
            }
        });
        btnCariBuku.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cariBuku(txtIdBuku.getText());
            }
        });
    }

    public void kosongkanForm() {
        txtIdPeminjaman.setText("0");
        txtIdBuku.setText("");
        txtTanggalKembali.setText("");
        txtTanggalPinjam.setText("");
        lblAnggota.setText("Nama Anggota");
        lblBuku.setText("Judul Buku");
    }

    public void tampilkanData() {
        String[] kolom = {"ID Peminjaman","Nama Anggota","Judul Buku","Tgl Pinjam","Tgl Kembali"};
        ArrayList<Peminjaman> list = new Peminjaman().getAll();
        Object[] rowData = new Object[5];

        tblPeminjaman.setModel(new DefaultTableModel(new Object[][] {}, kolom));

        for (Peminjaman p: list) {
            rowData[0] = p.getIdPeminjaman();
            rowData[1] = p.getAnggota().getNama();
            rowData[2] = p.getBuku().getJudul();
            rowData[3] = p.getTglPinjam();
            rowData[4] = p.getTglKembali();

            ((DefaultTableModel)tblPeminjaman.getModel()).addRow(rowData);
        }
    }

    public void cariAnggota(String idAnggota) {
        int id = Integer.parseInt(idAnggota);
        Anggota a = new Anggota().getById(id);

        if (a.getIdAnggota() == 0) {
            lblAnggota.setText("Anggota dengan id " + id + " tidak ada");
        } else {
            lblAnggota.setText(a.getNama());
        }
    }

    public void cariBuku(String idBuku) {
        int id = Integer.parseInt(idBuku);
        Buku b = new Buku().getById(id);

        if (b.getIdBuku() == 0) {
            lblBuku.setText("Buku dengan id "+id+" tidak ada");
        } else {
            lblBuku.setText(b.getJudul());
        }
    }

    public void simpan() {
        Peminjaman p = new Peminjaman();
        p.setIdPeminjaman(Integer.parseInt(txtIdPeminjaman.getText()));
        p.setAnggota(new Anggota().getById(Integer.parseInt(txtIdAnggota.getText())));
        p.setBuku(new Buku().getById(Integer.parseInt(txtIdBuku.getText())));
        p.setTglPinjam(txtTanggalPinjam.getText());
        p.setTglKembali(txtTanggalKembali.getText()); p.save();
        txtIdPeminjaman.setText(Integer.toString(p.getIdPeminjaman()));
        tampilkanData();
    }

    public static void main(String[] args) {
        FrmPeminjaman fr = new FrmPeminjaman();
        fr.setVisible(true);
    }
}
