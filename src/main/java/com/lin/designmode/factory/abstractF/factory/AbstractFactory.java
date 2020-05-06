package com.lin.designmode.factory.abstractF.factory;

import com.lin.designmode.factory.abstractF.product.Air;
import com.lin.designmode.factory.abstractF.product.Washer;

public abstract class AbstractFactory {
    public abstract Air createAir();

    public abstract Washer createWasher();
}
