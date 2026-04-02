package com.amazon.aps.iva.xc0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
/* compiled from: JvmAbi.kt */
/* loaded from: classes4.dex */
public final class c0 {
    public static final com.amazon.aps.iva.nd0.c a;
    public static final com.amazon.aps.iva.nd0.b b;

    static {
        com.amazon.aps.iva.nd0.c cVar = new com.amazon.aps.iva.nd0.c("kotlin.jvm.JvmField");
        a = cVar;
        com.amazon.aps.iva.nd0.b.l(cVar);
        com.amazon.aps.iva.nd0.b.l(new com.amazon.aps.iva.nd0.c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        b = com.amazon.aps.iva.nd0.b.f("kotlin/jvm/internal/RepeatableContainer", false);
    }

    public static final String a(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "propertyName");
        if (!c(str)) {
            return "get" + com.amazon.aps.iva.ab.x.w(str);
        }
        return str;
    }

    public static final String b(String str) {
        String w;
        StringBuilder sb = new StringBuilder("set");
        if (c(str)) {
            w = str.substring(2);
            com.amazon.aps.iva.yb0.j.e(w, "this as java.lang.String).substring(startIndex)");
        } else {
            w = com.amazon.aps.iva.ab.x.w(str);
        }
        sb.append(w);
        return sb.toString();
    }

    public static final boolean c(String str) {
        com.amazon.aps.iva.yb0.j.f(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (!com.amazon.aps.iva.oe0.m.h0(str, "is", false) || str.length() == 2) {
            return false;
        }
        char charAt = str.charAt(2);
        if (com.amazon.aps.iva.yb0.j.h(97, charAt) <= 0 && com.amazon.aps.iva.yb0.j.h(charAt, 122) <= 0) {
            return false;
        }
        return true;
    }
}
