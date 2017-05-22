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
public class Furappeccino  extends CondimentDecorator{

    public Furappeccino(Beverage beverage) {
        super(beverage);
        System.out.println("フラペチーノ:"+cost());
    }

    @Override
    public String getDescription() {
       return "フラペチーノ";
    }

    @Override
    public int cost() {
        return 500;
    }
    
}
