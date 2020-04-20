/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vosonvang_59133093_straterypatternbt2;

/**
 *
 * @author Dalaryizmi
 */
public class HangHoa {
    public String tenHH;
    public int gia;
    public String moTa;

    public HangHoa(String tenHH, int gia, String moTa) {
        this.tenHH = tenHH;
        this.gia = gia;
        this.moTa = moTa;
    }

    public String getTenHH() {
        return tenHH;
    }

    public int getGia() {
        return gia;
    }

    public String getMoTa() {
        return moTa;
    }
    
    public String thongTinHH(){
        return "Tên hàng hóa: " + this.tenHH + ", Giá: " + this.gia + ", Mô tả: " + this.moTa;
    }
}
