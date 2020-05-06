package com.lin.designmode.factory.simple;

public class SimpleFactory {

    public static <T> T getInstace(Class<T> tClass) {
        T t = null;
        try {
            t = tClass.newInstance();
            return t;
        } catch (InstantiationException e) {
            System.out.println("创建对象失败" + e);
            return null;
        } catch (IllegalAccessException e) {
            System.out.println("创建对象失败" + e);
            return null;
        }

    }
}
