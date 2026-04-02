package com.flurry.sdk;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class lm {
    private static final List<Class<?>> a = new ArrayList();
    private final String b = lm.class.getSimpleName();
    private final Map<Class<?>, Object> c = new LinkedHashMap();

    public lm() {
        ArrayList<Class<?>> arrayList;
        synchronized (a) {
            arrayList = new ArrayList(a);
        }
        for (Class<?> cls : arrayList) {
            try {
                Object newInstance = cls.newInstance();
                synchronized (this.c) {
                    this.c.put(cls, newInstance);
                }
            } catch (Exception e) {
                ko.a(5, this.b, "Module data " + cls + " is not available:", e);
            }
        }
    }

    public static void a(Class<?> cls) {
        synchronized (a) {
            a.add(cls);
        }
    }

    public final Object b(Class<?> cls) {
        Object obj;
        synchronized (this.c) {
            obj = this.c.get(cls);
        }
        return obj;
    }
}
