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
public class HouseBlend extends Beverage{

    private String BeverageName;
    public HouseBlend(){
        System.out.println("ハウスブレンド:"+cost());
    }
    
    @Override
    public String getDescription() {
        return "ハウスブレンド";
    }

    @Override
    public int cost() {
        return 300;
    }
    
}
