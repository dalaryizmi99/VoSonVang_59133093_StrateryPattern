/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vosonvang_59133093_straterypatternbt3;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Dalaryizmi
 */
public class SinhVien {
    private String hoTen;
    private Date ngaySinh;
    private float diemTB;

    public SinhVien(String hoTen, Date ngaySinh, float diemTB) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
    }

    public String getHoTen() {
        return hoTen;
    }

    public float getDiemTB() {
        return diemTB;
    }
    
    public String getThongTin(){
        SimpleDateFormat fDay = new SimpleDateFormat("dd/MM/yyyy");
        return "Họ tên: " + this.hoTen + ", Ngày sinh: " + fDay.format(this.ngaySinh) + ", Điểm TB: " + this.diemTB;
    }
}
