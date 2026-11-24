/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minimarket.model;

/**
 *
 * @author ThinkPad T14 G2
 */
public class Admin extends Pengguna {
    public Admin(String id, String nama, String username, String password) {
        super(id, nama, username, password);
    }

    @Override
    public void tampilkanHakAkses() {
        System.out.println("MENU ADMIN");
        System.out.println("1. Kelola produk");
        System.out.println("2. Lihat laporan bulanan");
    }
}
