package com.lin.designmode.factory.simple;

public class SimpleFactpryTest {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Demo demo = SimpleFactory02.getInstace(DemoImpl.class);
        demo.test();

    }
}
