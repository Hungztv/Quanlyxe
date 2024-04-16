package Panel;

public class DanhSachKhachHang {
    private int id;
    private String ten;
    private String soDienThoai;
    private String email;

    public DanhSachKhachHang(int id, String ten, String soDienThoai, String email) {
        this.id = id;
        this.ten = ten;
        this.soDienThoai = soDienThoai;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


