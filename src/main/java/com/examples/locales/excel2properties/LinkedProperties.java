package com.examples.locales.excel2properties;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Properties;

public class LinkedProperties extends Properties {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private final HashSet<Object> keys = new LinkedHashSet<>();

    public LinkedProperties() {
        // Nothing is done here
    }

    public Iterable<Object> orderedKeys() {
        return Collections.list(keys());
    }

    @Override
    public Enumeration<Object> keys() {
        return Collections.<Object>enumeration(keys);
    }

    @Override
    public Object put(Object key, Object value) {
        keys.add(key);
        return super.put(key, value);
    }

    @Override
    public synchronized boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public synchronized int hashCode() {
        return super.hashCode();
    }
}