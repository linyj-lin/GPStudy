package com.lin.designmode.single;

public class LazySimpleSingleton {
    private LazySimpleSingleton() {
    }

    private static LazySimpleSingleton lazySimpleSingleton;

    public static synchronized LazySimpleSingleton getLazySimpleSingleton() {
        if (lazySimpleSingleton == null) {
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }
}
