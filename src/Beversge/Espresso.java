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
public class Espresso extends DarkRoast{
    private String BeverageName;

    public Espresso() {
         System.out.println("エスプレッソ:"+cost());
    }
    
    @Override
    public String getDescription() {
        return "エスプレッソ";
    }

    @Override
    public int cost() {
        return 300;
    }
}
