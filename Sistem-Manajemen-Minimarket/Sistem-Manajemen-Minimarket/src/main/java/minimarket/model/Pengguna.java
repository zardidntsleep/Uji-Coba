/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minimarket.model;

/**
 *
 * @author ThinkPad T14 G2
 */
public abstract class Pengguna implements Autentikasi {

    private String idPengguna;
    private String nama;
    private String username;
    private String password;

    public Pengguna(String id, String nama,
                    String username, String password) {
        this.idPengguna = id;
        this.nama = nama;
        this.username = username;
        this.password = password;
    }

    public String getIdPengguna() {
        return idPengguna;
    }

    public String getNama() {
        return nama;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    @Override
    public void logout() {
        System.out.println("Pengguna berhasil logout.");
    }

    public abstract void tampilkanHakAkses();
}
