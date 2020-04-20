/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vosonvang_59133093_straterypatternbt1;

/**
 *
 * @author Dalaryizmi
 */
public class MainTinh {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Context pt = new Context();
        
        pt.setTinhToan(new Cong());
        System.out.println("75 + 12 = " + pt.tinh(75, 12));
        
        pt.setTinhToan(new Tru());
        System.out.println("54 - 78 = " + pt.tinh(54, 78));
    }
}
