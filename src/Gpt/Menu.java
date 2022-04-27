package Gpt;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ThucHienQuanLy thucHienQuanLy= new ThucHienQuanLy();
        int luaChon = 0;
        do
        {System.out.println("QUẢN LÝ DANH BẠ------");
            System.out.println("MỜI NHẬP SỐ LỰA CHỌN");
            System.out.println("XIN MỜI CHỌN CHỨC NĂNG :");
            System.out.println(
                            " + 1. Xem danh sách. \n"
                            +"2.  Thêm mới.\n"
                            +"3.  Cập nhật.\n"
                            +"4. xoá .\n"
                            +"5. Tìm kiếm.\n"
                            +"6. Đọc từ file.\n"
                            +"7. Ghi vào file.\n"
                            +"8.  thoát"
            );
                   try {
                       luaChon = sc.nextInt();

                   }catch (InputMismatchException e){
                       System.out.println("nhap sai . tro lai MENU");
                   }


            if(luaChon==1){


                thucHienQuanLy.xemDanhSach();

            }else if(luaChon==2){
                sc.nextLine();
                System.out.println("nhập họ và tên "); String hoTen = sc.nextLine();
                System.out.println("nhập số điện thoại"); int sdt = sc.nextInt();
                sc.nextLine();
                System.out.println("nhap địa chỉ"); String diaChi = sc.nextLine();
                System.out.println("nhập emal"); String email = sc.nextLine();
                DanhBa danhBa = new DanhBa(hoTen,sdt,diaChi,email);
                thucHienQuanLy.themMoi(danhBa);

            }else if(luaChon==3){
                System.out.println(" nhập sdt cần cập nhật : "); int sdt1 = sc.nextInt();
                sc.nextLine();
                System.out.println("loading-----");
                System.out.println("nhập họ và tên "); String hoTen = sc.nextLine();
                System.out.println("nhập số điện thoại"); int sdt = sc.nextInt();
                System.out.println("nhap địa chỉ"); String diaChi = sc.nextLine();
                sc.nextLine();
                System.out.println("nhập emal"); String email = sc.nextLine();
                DanhBa db = new DanhBa(hoTen,sdt,diaChi,email);
                thucHienQuanLy.capNhap(sdt1,db);

            }else if(luaChon==4){
                System.out.println(" nhập sdt để xoá người dùng"); int sdt2 = sc.nextInt();
                thucHienQuanLy.xoa(sdt2);

            }else if(luaChon==5){
                System.out.println("nhập sđt để tìm thông tin"); int sdt3 = sc.nextInt();
                thucHienQuanLy.timKiem(sdt3);
            }else if(luaChon==6){
//                liên kết đến file đọc
//                Filreader  là đọc fire

//                reader =  đọc ; writer =  viết
                FileReader fr = new FileReader("a1.csv");
                BufferedReader br = new BufferedReader(fr);
                String content;
                while ((content= br.readLine()) != null) {
                    System.out.println(content + "\n");
                }
            }else if(luaChon==7){
//                chưa có thì tạo file mới ,
//                nếu có ùi mang tính chất liên kết
//                có fileWriter đi kèm thì BufferedWrite mới dùng đc.
                FileWriter fw = new FileWriter("a1.csv");
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(thucHienQuanLy.hienthi());
                bw.close();
            }else if(luaChon==8){

            }

        }while (luaChon!=8);

    }
}
