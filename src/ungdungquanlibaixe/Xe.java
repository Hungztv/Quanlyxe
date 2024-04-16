/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ungdungquanlibaixe;

import java.net.IDN;

/**
 *
 * @author duong
 */
// Xe.java
public class Xe {
    private int id  ;
    private String bienSo;
    private String loai;
    private String thuongHieu;

    public Xe(int id, String bienSo, String loai, String thuongHieu) {
        this.id = id;
        this.bienSo = bienSo;
        this.loai = loai;
        this.thuongHieu = thuongHieu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBienSo() {
        return bienSo;
    }

    public void setBienSo(String bienSo) {
        this.bienSo = bienSo;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public String getThuongHieu() {
        return thuongHieu;
    }

    public void setThuongHieu(String thuongHieu) {
        this.thuongHieu = thuongHieu;
    }

   
}

