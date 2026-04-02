package com.amazon.aps.iva.hc0;

import com.amazon.aps.iva.fc0.g;
import com.amazon.aps.iva.fc0.l;
import com.amazon.aps.iva.ic0.h;
import com.amazon.aps.iva.ic0.h0;
import com.amazon.aps.iva.ic0.v0;
import com.amazon.aps.iva.jc0.f;
import com.amazon.aps.iva.yb0.j;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* compiled from: ReflectJvmMapping.kt */
/* loaded from: classes4.dex */
public final class b {
    public static final Field a(l<?> lVar) {
        j.f(lVar, "<this>");
        h0<?> c = v0.c(lVar);
        if (c != null) {
            return c.k.getValue();
        }
        return null;
    }

    public static final Method b(g<?> gVar) {
        Object obj;
        f<?> i;
        j.f(gVar, "<this>");
        h<?> a = v0.a(gVar);
        if (a != null && (i = a.i()) != null) {
            obj = i.b();
        } else {
            obj = null;
        }
        if (!(obj instanceof Method)) {
            return null;
        }
        return (Method) obj;
    }
}
