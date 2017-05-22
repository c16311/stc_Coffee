/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beversge;

/**
 *
 * @author keiichirou
 */
public class CafeMocha extends CondimentDecorator{

    public CafeMocha(Beverage beverage) {
        super(beverage);
        System.out.println("カフェモカを:"+cost());
    }

    @Override
    public String getDescription() {
       return "カフェモカ";
    }

    @Override
    public int cost() {
        return 300;
    }
    
}
