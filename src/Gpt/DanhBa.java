package Gpt;

public class DanhBa {
    private String hoTen;
    private int sdt;
    private String diaChi;
    private String email;

    public DanhBa() {}

    public DanhBa(String hoTen, int sdt, String diaChi, String email) {
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.email = email;
    }

    public String getHoTen() {return hoTen;}
    public void setHoTen(String hoTen) {this.hoTen = hoTen;}

    public int getSdt() {return sdt;}
    public void setSdt(int sdt) {this.sdt = sdt;}

    public String getDiaChi() {return diaChi;}
    public void setDiaChi(String diaChi) {this.diaChi = diaChi;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    @Override
    public String toString() {
        return "DanhBa{" +
                "hoTen='" + hoTen + '\'' +
                ", sdt=" + sdt +
                ", diaChi='" + diaChi + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
