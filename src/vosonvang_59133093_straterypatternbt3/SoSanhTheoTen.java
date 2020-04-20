/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vosonvang_59133093_straterypatternbt3;

/**
 *
 * @author Dalaryizmi
 */
public class SoSanhTheoTen implements ISoSanh<SinhVien>{

    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        int ss = o1.getHoTen().compareTo(o2.getHoTen());
        if (ss > 0){
            return 1;
        }
        if (ss < 0){
            return -1;
        }
        return 0;
    }
    
}
