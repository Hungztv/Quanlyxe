package ungdungquanlibaixe;

import java.util.ArrayList;

public class BaiDoXe {
    private ArrayList<Xe> dsXe;
    private int sucChua;
    private int soXeHienTai;
 public BaiDoXe(int sucChua) {
        this.sucChua = sucChua;
        this.soXeHienTai = 0;
        this.dsXe = new ArrayList<>();
    }
    public boolean themXe(Xe xe) {
        if (this.soXeHienTai < this.sucChua) {
            this.dsXe.add(xe);
            this.soXeHienTai++;
            return true;
        }
        return false;
    }
    public boolean xoaXe(String bienSo) {
        for (int i = 0; i < this.dsXe.size(); i++) {
            if (this.dsXe.get(i).getBienSo().equals(bienSo)) {
                this.dsXe.remove(i);
                this.soXeHienTai--;
                return true;
            }
        }
        return false;
    }
    public void hienThi() {
        for (int i = 0; i < this.dsXe.size(); i++) {
            System.out.println(this.dsXe.get(i).toString());
        }
    }
    public int getSucChua() {
        return sucChua;
    }
    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }
    public int getSoXeHienTai() {
        return soXeHienTai;
    }
    public void setSoXeHienTai(int soXeHienTai) {
        this.soXeHienTai = soXeHienTai;
    }
    public ArrayList<Xe> getDsXe() {
        return dsXe;
    }
    public void setDsXe(ArrayList<Xe> dsXe) {
        this.dsXe = dsXe;
    }    
}
