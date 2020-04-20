/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vosonvang_59133093_straterypatternbt2;

import java.util.ArrayList;
/**
 *
 * @author Dalaryizmi
 */
public class GioHang {
    IThanhToan hinhThucTT;
    ArrayList<HangHoa> dsHangHoa = new ArrayList<>();

    public void setHinhThucTT(IThanhToan hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }
    
    public void themHangHoa(HangHoa hh){
        dsHangHoa.add(hh);
    }
    
    public int tongTienHang(){
        int tienHang = 0;
        for(int i = 0; i < dsHangHoa.size(); i++){
            tienHang += dsHangHoa.get(i).getGia();
        }
        return tienHang;
    }
    
    public double thanhToan(){
        return hinhThucTT.thanhToan(tongTienHang());
    }
    
    public void indsHangHoa(){
        dsHangHoa.forEach(hh -> System.out.println(hh.thongTinHH()));
    }
}
