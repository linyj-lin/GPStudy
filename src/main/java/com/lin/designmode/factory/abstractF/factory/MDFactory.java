package com.lin.designmode.factory.abstractF.factory;

import com.lin.designmode.factory.abstractF.product.*;

/*美的工厂*/
public class MDFactory extends AbstractFactory{
    public Air createAir() {
        Air air = new MDAir();
        return air;
    }

    public Washer createWasher() {
        Washer washer = new MDWasher();
        return washer;
    }
}
