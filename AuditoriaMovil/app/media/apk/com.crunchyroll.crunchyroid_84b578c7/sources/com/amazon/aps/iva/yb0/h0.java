package com.amazon.aps.iva.yb0;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: TypeIntrinsics.java */
/* loaded from: classes4.dex */
public final class h0 {
    public static Collection a(AbstractCollection abstractCollection) {
        if ((abstractCollection instanceof com.amazon.aps.iva.zb0.a) && !(abstractCollection instanceof com.amazon.aps.iva.zb0.b)) {
            g(abstractCollection, "kotlin.collections.MutableCollection");
            throw null;
        }
        return abstractCollection;
    }

    public static List b(Object obj) {
        if ((obj instanceof com.amazon.aps.iva.zb0.a) && !(obj instanceof com.amazon.aps.iva.zb0.c)) {
            g(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            j.j(h0.class.getName(), e);
            throw e;
        }
    }

    public static Map c(AbstractMap abstractMap) {
        if ((abstractMap instanceof com.amazon.aps.iva.zb0.a) && !(abstractMap instanceof com.amazon.aps.iva.zb0.d)) {
            g(abstractMap, "kotlin.collections.MutableMap");
            throw null;
        }
        return abstractMap;
    }

    public static Set d(Object obj) {
        if ((obj instanceof com.amazon.aps.iva.zb0.a) && !(obj instanceof com.amazon.aps.iva.zb0.e)) {
            g(obj, "kotlin.collections.MutableSet");
            throw null;
        }
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            j.j(h0.class.getName(), e);
            throw e;
        }
    }

    public static Object e(int i, Object obj) {
        if (obj != null && !f(i, obj)) {
            g(obj, "kotlin.jvm.functions.Function" + i);
            throw null;
        }
        return obj;
    }

    public static boolean f(int i, Object obj) {
        int i2;
        if (!(obj instanceof com.amazon.aps.iva.kb0.a)) {
            return false;
        }
        if (obj instanceof g) {
            i2 = ((g) obj).getArity();
        } else if (obj instanceof com.amazon.aps.iva.xb0.a) {
            i2 = 0;
        } else if (obj instanceof com.amazon.aps.iva.xb0.l) {
            i2 = 1;
        } else if (obj instanceof com.amazon.aps.iva.xb0.p) {
            i2 = 2;
        } else if (obj instanceof com.amazon.aps.iva.xb0.q) {
            i2 = 3;
        } else if (obj instanceof com.amazon.aps.iva.xb0.r) {
            i2 = 4;
        } else if (obj instanceof com.amazon.aps.iva.xb0.s) {
            i2 = 5;
        } else if (obj instanceof com.amazon.aps.iva.xb0.t) {
            i2 = 6;
        } else if (obj instanceof com.amazon.aps.iva.xb0.u) {
            i2 = 7;
        } else if (obj instanceof com.amazon.aps.iva.xb0.v) {
            i2 = 8;
        } else if (obj instanceof com.amazon.aps.iva.xb0.w) {
            i2 = 9;
        } else if (obj instanceof com.amazon.aps.iva.xb0.b) {
            i2 = 10;
        } else if (obj instanceof com.amazon.aps.iva.xb0.c) {
            i2 = 11;
        } else if (obj instanceof com.amazon.aps.iva.xb0.d) {
            i2 = 12;
        } else if (obj instanceof com.amazon.aps.iva.xb0.e) {
            i2 = 13;
        } else if (obj instanceof com.amazon.aps.iva.xb0.f) {
            i2 = 14;
        } else if (obj instanceof com.amazon.aps.iva.xb0.g) {
            i2 = 15;
        } else if (obj instanceof com.amazon.aps.iva.xb0.h) {
            i2 = 16;
        } else if (obj instanceof com.amazon.aps.iva.xb0.i) {
            i2 = 17;
        } else if (obj instanceof com.amazon.aps.iva.xb0.j) {
            i2 = 18;
        } else if (obj instanceof com.amazon.aps.iva.xb0.k) {
            i2 = 19;
        } else if (obj instanceof com.amazon.aps.iva.xb0.m) {
            i2 = 20;
        } else if (obj instanceof com.amazon.aps.iva.xb0.n) {
            i2 = 21;
        } else if (obj instanceof com.amazon.aps.iva.xb0.o) {
            i2 = 22;
        } else {
            i2 = -1;
        }
        if (i2 != i) {
            return false;
        }
        return true;
    }

    public static void g(Object obj, String str) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        ClassCastException classCastException = new ClassCastException(com.amazon.aps.iva.k.q.b(name, " cannot be cast to ", str));
        j.j(h0.class.getName(), classCastException);
        throw classCastException;
    }
}
