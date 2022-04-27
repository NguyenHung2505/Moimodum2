package Gpt;

public interface PhuongThucQuanLy<A> {
    void xemDanhSach ();
    void themMoi(DanhBa danhBa);
    void capNhap (int sdt ,A a);
    void xoa (int sdt );
    int timKiem(int sdt);
    void thoat ();

}
