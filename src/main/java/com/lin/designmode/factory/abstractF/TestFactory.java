package com.lin.designmode.factory.abstractF;

import com.lin.designmode.factory.abstractF.factory.AbstractFactory;
import com.lin.designmode.factory.abstractF.factory.GLFactory;
import com.lin.designmode.factory.abstractF.factory.MDFactory;
import com.lin.designmode.factory.abstractF.product.Air;
import com.lin.designmode.factory.abstractF.product.Washer;

public class TestFactory {
    public static void main(String[] args) {
        AbstractFactory glfactory = new GLFactory();
        AbstractFactory mdfactory = new MDFactory();
        Air glair = glfactory.createAir();

        Washer glwasher = glfactory.createWasher();
        Air mdair = mdfactory.createAir();
        Washer mdwasher = mdfactory.createWasher();


        String airName = glair.getAirName();
        String washerName = glwasher.getWasherName();
        System.out.println("格力工厂生产:"+airName+"及"+washerName);

        String airName1 = mdair.getAirName();
        String washerName1 = mdwasher.getWasherName();
        System.out.println("美的工厂生产:"+airName1+"及"+washerName1);



    }

}
