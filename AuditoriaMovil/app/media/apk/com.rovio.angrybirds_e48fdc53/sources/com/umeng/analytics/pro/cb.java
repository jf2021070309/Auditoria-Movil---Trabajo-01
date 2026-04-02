package com.umeng.analytics.pro;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/* compiled from: FieldMetaData.java */
/* loaded from: classes3.dex */
public class cb implements Serializable {
    private static Map<Class<? extends bp>, Map<? extends bw, cb>> d = new HashMap();
    public final String a;
    public final byte b;
    public final cc c;

    public cb(String str, byte b, cc ccVar) {
        this.a = str;
        this.b = b;
        this.c = ccVar;
    }

    public static void a(Class<? extends bp> cls, Map<? extends bw, cb> map) {
        d.put(cls, map);
    }

    public static Map<? extends bw, cb> a(Class<? extends bp> cls) {
        if (!d.containsKey(cls)) {
            try {
                cls.newInstance();
            } catch (IllegalAccessException e) {
                throw new RuntimeException("IllegalAccessException for TBase class: " + cls.getName() + ", message: " + e.getMessage());
            } catch (InstantiationException e2) {
                throw new RuntimeException("InstantiationException for TBase class: " + cls.getName() + ", message: " + e2.getMessage());
            }
        }
        return d.get(cls);
    }
}
