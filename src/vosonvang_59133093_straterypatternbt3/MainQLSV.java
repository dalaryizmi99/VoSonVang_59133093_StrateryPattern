/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vosonvang_59133093_straterypatternbt3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
/**
 *
 * @author Dalaryizmi
 */
public class MainQLSV {
    public static void main(String[] args ) throws ParseException{
    
        SimpleDateFormat fDate = new SimpleDateFormat("dd/MM/yyyy");
        
        QLSV quanLy = new QLSV();
        
        SinhVien sv1 = new SinhVien("Võ Sơn Vang", fDate.parse("06/12/1999"), 8.5f);
        SinhVien sv2 = new SinhVien("Nguyễn Đình Thuận", fDate.parse("25/12/1999"), 8.0f);
        SinhVien sv3 = new SinhVien("Lê Tấn Đạt", fDate.parse("5/2/1999"), 7.0f);
        SinhVien sv4 = new SinhVien("Ngô Đắc Lương", fDate.parse("2/1/1999"), 8.7f);
        SinhVien sv5 = new SinhVien("Võ Hữu Huy", fDate.parse("12/4/1999"), 9.0f);
        
        quanLy.them(sv1);
        quanLy.them(sv2);
        quanLy.them(sv3);
        quanLy.them(sv4);
        quanLy.them(sv5);
        
        quanLy.setSoSanh(new SoSanhTheoTen());
        quanLy.sapXep();
        System.out.println("\nDanh sách sinh viên (sắp xếp theo tên)");
        quanLy.inDanhSach();
        
        quanLy.setSoSanh(new SoSanhTheoDiem());
        quanLy.sapXep();
        System.out.println("\nDanh sách sinh viên (sắp xếp theo điểm)");
        quanLy.inDanhSach();
    }  
}
