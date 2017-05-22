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
public class SoyLatte  extends CondimentDecorator{

    public SoyLatte(Beverage beverage) {
        super(beverage);
         System.out.println("ソイラテ:"+cost());
    }

    @Override
    public String getDescription() {
        return "ソイラテ";
    }

    @Override
    public int cost() {
        return 600;
    }
    
}
