package com.amazon.aps.iva.ic0;

import com.amazon.aps.iva.kb0.k;
/* compiled from: CacheByClass.kt */
/* loaded from: classes4.dex */
public final class a {
    static {
        Object H;
        try {
            H = Class.forName("java.lang.ClassValue");
        } catch (Throwable th) {
            H = com.amazon.aps.iva.ab.x.H(th);
        }
        if (!(H instanceof k.a)) {
            Class cls = (Class) H;
            H = Boolean.TRUE;
        }
        Object obj = Boolean.FALSE;
        if (H instanceof k.a) {
            H = obj;
        }
        ((Boolean) H).booleanValue();
    }

    public static final c a(com.amazon.aps.iva.xb0.l lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "compute");
        return new c(lVar);
    }
}
