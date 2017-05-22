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
public class CaramelMakart  extends CondimentDecorator{

    public CaramelMakart(Beverage beverage) {
        super(beverage);
        System.out.println("キャラメルマキアート:"+cost());
    }

    @Override
    public String getDescription() {
        return "キャラメルマキアート";
    }

    @Override
    public int cost() {
        return 200;
    }
    
}
