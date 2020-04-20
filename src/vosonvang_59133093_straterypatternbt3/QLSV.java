/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vosonvang_59133093_straterypatternbt3;

import java.util.ArrayList;
/**
 *
 * @author Dalaryizmi
 */
public class QLSV {
    public ArrayList<SinhVien> dsSinhVien = new ArrayList<>();
    public ISoSanh soSanh;

    public void setSoSanh(ISoSanh soSanh) {
        this.soSanh = soSanh;
    }
    
    public void them(SinhVien sv) {
        dsSinhVien.add(sv);
    }
    
    public void sapXep() {
        dsSinhVien.sort((a, b) -> soSanh.soSanh((SinhVien) a, (SinhVien) b));
    }
    
    public void inDanhSach() {
        dsSinhVien.forEach(sv -> System.out.println(sv.getThongTin()));
    }
}
