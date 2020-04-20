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
public class MainThanhToan {
    public static void main(String[] args){
        HangHoa hh1 = new HangHoa("Máy Nikon F2 + 50mm F1.4 Ais", 6000000, "Hình thức đẹp, seri 8888, phụ kiện kèm cap và dây");
        HangHoa hh2 = new HangHoa("Máy Mamiya 645 Super + 80mm F2.8 C", 9500000, "Hình thức tạm ổn, kèm 2 gù ngắm rốn và gù ngang");
        HangHoa hh3 = new HangHoa("Combo 4 cuộn film", 500000, "Indate 2021 iso 400");
        
        ThanhToanOnline thanhToanOnline =new ThanhToanOnline();
        ThanhToanCOD thanhToanCOD = new ThanhToanCOD();

        GioHang gh1 = new GioHang();
        gh1.setHinhThucTT(thanhToanOnline);
        gh1.themHangHoa(hh1);
        gh1.themHangHoa(hh3);
        gh1.indsHangHoa();
        System.out.println("Tổng tiền hàng là: " + gh1.tongTienHang());
        System.out.println("Tổng tiền thanh toán Online: " + gh1.thanhToan());

        System.out.println("\nDanh sach mat hang thanh toan COD:\n");
        GioHang gh2 = new GioHang();
        gh2.setHinhThucTT(thanhToanCOD);
        gh2.themHangHoa(hh1);
        gh2.themHangHoa(hh2);
        gh2.indsHangHoa();
        System.out.println("Tổng tiền hàng là: " + gh2.tongTienHang());
        System.out.println("Tổng tiền thanh toán COD:" + gh2.thanhToan());
    }
}
