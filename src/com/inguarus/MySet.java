package com.inguarus;

public interface MySet<K extends Comparable<K>, V> {

    boolean containsKey(K key);

    boolean containsValue(V value);

    V get(K key);

    boolean isEmpty();

    V put(K key, V value);

    V remove(K key);

    int size();

    String toString();
}
