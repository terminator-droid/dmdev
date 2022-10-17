package com.dudev.generics.practice.task1;

public final class PairUtil {
    private PairUtil() {
    }
    public static <K, V> Pair<V, K> swap(Pair<K, V> source) {
        V second = source.getSecondVariable();
        K first = source.getFirstVariable();
        return new Pair<>(second, first);
    }
}
