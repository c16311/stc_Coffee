
package Beversge;
/**
 * 
https://github.com/c16311/stc_Coffee.git


 * @author keiichirou
 */
public class Main {
    public static void main(String[] args){
        //Beverage t1 = new CafeMocha();
        int [] sum = new int[2];
        
        
        Beverage bev1 = new Espresso();
        
        sum[0] = bev1.cost();
        Beverage bev2 = new HouseBlend();
        sum[1] = bev2.cost();
        CondimentDecorator deco1 = new CafeMocha(bev1);
        System.out.println(bev1.getDescription()+"+"+deco1.getDescription());

        sum[0] += deco1.cost();
        CondimentDecorator deco2 = new Furappeccino(bev2);
        System.out.println(bev2.getDescription()+"+"+deco2.getDescription());
        sum[1] += deco2.cost();
        CondimentDecorator deco3 = new SoyLatte(bev1);
        System.out.println(bev1.getDescription()+"+"+deco3.getDescription());
        sum[0] += deco3.cost();
        CondimentDecorator deco4 = new CaramelMakart(bev2);
        System.out.println(bev2.getDescription()+"+"+deco4.getDescription());
        System.out.println();
        sum[1] += deco4.cost();
        
        
        System.out.println("小計");
        
        System.out.println("1:ハウスブレンド:"+sum[0]);
        System.out.println("2:エスプレッソ:"+sum[1]);
        System.out.println("合計:"+(sum[1]+sum[0]));
    }
}
