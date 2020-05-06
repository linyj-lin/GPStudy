package com.lin.designmode.single;

public class LazySimpleSingleton03 {
    private LazySimpleSingleton03() {
    }

    public final static LazySimpleSingleton03 getLazySimpleSingleton() {
        LazySimpleSingleton03 lazy = LazyHolder.LAZY;
        return lazy;
    }

    private static class LazyHolder {
        private static final LazySimpleSingleton03 LAZY = new LazySimpleSingleton03();
    }
}
