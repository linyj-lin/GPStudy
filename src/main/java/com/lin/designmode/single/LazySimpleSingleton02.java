package com.lin.designmode.single;

public class LazySimpleSingleton02 {
    private LazySimpleSingleton02() {
    }

    private static volatile LazySimpleSingleton02 lazySimpleSingleton;

    public static LazySimpleSingleton02 getLazySimpleSingleton() {
        if (lazySimpleSingleton == null) {
            synchronized (LazySimpleSingleton.class) {
                if (lazySimpleSingleton == null) {
                    lazySimpleSingleton = new LazySimpleSingleton02();
                }
            }
        }
        return lazySimpleSingleton;
    }
}
