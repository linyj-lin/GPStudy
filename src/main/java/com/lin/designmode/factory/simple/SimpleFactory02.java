package com.lin.designmode.factory.simple;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SimpleFactory02 {

    public static <T> T getInstace(Class<T> tClass) throws IllegalAccessException, InstantiationException {
        final T t = tClass.newInstance();
        // 加入代理
        Object o = Proxy.newProxyInstance(tClass.getClassLoader(), tClass.getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("使用了代理------前置");
                Object invoke = method.invoke(t, args);
                System.out.println("使用了代理------后置");
                return invoke;//这个返回的是方法执行后的返回值

            }
        });
        return (T) o;

    }
}
