package com.lin.designmode.factory.method;

public class TestMethodFactory {
    public static void main(String[] args) {
        CFactory cFactory = new CFactory();
        JavaFactory javaFactory = new JavaFactory();
        C c = cFactory.create();
        Java java = javaFactory.create();
        c.test();
        java.test();
    }
}
