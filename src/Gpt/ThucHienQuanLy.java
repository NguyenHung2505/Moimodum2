package Gpt;

import java.util.ArrayList;
import java.util.List;

public class ThucHienQuanLy implements PhuongThucQuanLy<DanhBa> {
    List<DanhBa>danhBaList = new ArrayList<>();
    private int soThanhVien = 0;

    public ThucHienQuanLy() {
    }

    public ThucHienQuanLy(List<DanhBa> danhBaList) {
        this.danhBaList = danhBaList;
    }

    @Override
    public void xemDanhSach() {
        for (int i = 0; i < danhBaList.size(); i++) {
            System.out.println(this.danhBaList.get(i));
        }

    }

    @Override
    public void themMoi(DanhBa danhBa) {
        danhBaList.add(danhBa);
        soThanhVien++;

    }

    @Override
    public void capNhap(int sdt, DanhBa danhBa) {
        int indexOf=timKiem(sdt);
        if(indexOf == -1){
            System.out.println("khong co");
        } else{
            danhBaList.set(timKiem(sdt) , danhBa);
        }

    }


    @Override
    public void xoa(int sdt) {
            int indexOf=timKiem(sdt);
            if(indexOf == -1){
                System.out.println("khooong cooo !");
            } else{
                danhBaList.remove(indexOf);
            }
            soThanhVien--;


    }

    @Override
    public int timKiem(int sdt) {
        for (int i = 0; i < danhBaList.size(); i++) {
            if(this.danhBaList.get(i).getSdt()==(sdt)){
                System.out.println(danhBaList.get(i));
                return i;
            }
        }
        return -1;

    }

    @Override
    public void thoat() {
        System.exit(0);

    }

    public String hienthi() {
        String str = "";
        for (DanhBa db: danhBaList) {
            str += "So dien Thoai: " + db.getSdt() + "Ho va ten: " + db.getHoTen() +"Dia chi: " + db.getDiaChi() +"Email: " + db.getEmail()+"\n";
        }
        return str;
    }

}
