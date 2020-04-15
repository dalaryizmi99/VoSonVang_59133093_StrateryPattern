/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vosonvang_59133093_straterypatterndemo;

/**
 *
 * @author Dalaryizmi
 */
public class CantQuack implements IQuackBehavior{

    @Override
    public String quack() {
        return "Can't Quack nghĩa là không thể kêu...!";
    }
    
    
}
