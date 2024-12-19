package DiceApp2;

public class Dice {
    int me;//Diceの目

    void roll(){
        me=(int)(Math.random()*6)+1;//1~6の乱数
    }
}
