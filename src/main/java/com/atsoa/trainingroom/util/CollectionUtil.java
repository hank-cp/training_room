package com.atsoa.trainingroom.util;

import java.util.*;

@SuppressWarnings("unchecked")
public class CollectionUtil {

    //*************************************************************************
    // pre-Java9 Collection Util
    //*************************************************************************

    public static <T> T[] array(T... args) {
        return args;
    }

    public static <T> List<T> list(T... args) {
        return Arrays.asList(args);
    }

    public static <T> Set<T> set(T... args) {
        Set<T> result = new HashSet<T>(args.length);
        result.addAll(Arrays.asList(args));
        return result;
    }

    public static <K, V> Map<K, V> map(Entry... entries) {
        Map<K, V> result = new LinkedHashMap<>(entries.length);

        for (Entry<? extends K, ? extends V> entry : entries)
            result.put(entry.key, entry.value);

        return result;
    }

    public static <K, V> Entry<K, V> entry(K key, V value) {
        return new Entry<>(key, value);
    }

    public static class Entry<K, V> {
        K key;
        V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
