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
public class StrateryPatternDemoDuck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Duck duck1 = new MallarDuck();
        duck1.setFlyBehavior(new FlyByWings());
        SQuack sQuack = new SQuack();
        duck1.setQuackBehavior(sQuack);
        System.out.println(duck1.Display());
        
        Duck duck2 = new CherryValleyDuck();
        duck2.setFlyBehavior(new CantFly());
        duck2.setQuackBehavior(sQuack);
        System.out.println(duck2.Display());
    }
    
}
