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
public class DarkRoast  extends Beverage{
    private String BeverageName;
    public DarkRoast(){
    }
    
    @Override
    public String getDescription() {
        return "コーヒー豆";
    }

    @Override
    public int cost() {
        return 300;
    }
}
