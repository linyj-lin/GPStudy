package com.lin.designmode.factory.abstractF.factory;

import com.lin.designmode.factory.abstractF.product.Air;
import com.lin.designmode.factory.abstractF.product.GLAir;
import com.lin.designmode.factory.abstractF.product.GLWasher;
import com.lin.designmode.factory.abstractF.product.Washer;

/*格力工厂*/
public class GLFactory extends AbstractFactory {
    public Air createAir() {
        Air air = new GLAir();
        return air;
    }

    public Washer createWasher() {
        Washer washer = new GLWasher();
        return washer;
    }
}
