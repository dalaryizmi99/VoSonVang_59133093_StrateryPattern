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
public abstract class Duck {
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;
    
    public Duck(){
    }

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
    
    public String swim(){
        return "Vịt bơi trong ao";
    }
    public String performQuack(){
        return quackBehavior.quack();
    }
    
    public String performFly(){
        return flyBehavior.fly();
    }
    
    public abstract String Display();
}
