/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minimarket.repository;

/**
 *
 * @author ThinkPad T14 G2
 */
import java.util.ArrayList;
import minimarket.model.StatusTransaksi;
import minimarket.model.Transaksi;

public class PenyimpananTransaksi {

    private ArrayList<Transaksi> daftarTransaksi;

    public PenyimpananTransaksi() {
        daftarTransaksi = new ArrayList<Transaksi>();
    }

    // Menyimpan transaksi yang berhasil
    public void simpanTransaksi(Transaksi transaksi) {
        if (transaksi.getStatus().equals(StatusTransaksi.BERHASIL)) {
            daftarTransaksi.add(transaksi);
            System.out.println("Transaksi berhasil disimpan.");
        } else {
            System.out.println("Transaksi gagal tidak disimpan.");
        }
    }

    // Mengambil seluruh daftar transaksi
    public ArrayList<Transaksi> getDaftarTransaksi() {
        return daftarTransaksi;
    }

    // Menghitung jumlah transaksi yang tersimpan
    public int getJumlahTransaksi() {
        return daftarTransaksi.size();
    }
}
