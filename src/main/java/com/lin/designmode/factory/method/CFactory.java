package com.lin.designmode.factory.method;

public class CFactory implements Factory {
    public C create() {
        return new C();
    }
}
