package com.amazon.aps.iva.uc0;

import java.lang.reflect.Type;
import java.util.Iterator;
/* compiled from: ReflectJavaType.kt */
/* loaded from: classes4.dex */
public abstract class e0 implements com.amazon.aps.iva.ed0.w {
    public abstract Type O();

    public final boolean equals(Object obj) {
        if ((obj instanceof e0) && com.amazon.aps.iva.yb0.j.a(O(), ((e0) obj).O())) {
            return true;
        }
        return false;
    }

    @Override // com.amazon.aps.iva.ed0.d
    public com.amazon.aps.iva.ed0.a h(com.amazon.aps.iva.nd0.c cVar) {
        Object obj;
        com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
        Iterator<T> it = getAnnotations().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            com.amazon.aps.iva.nd0.b i = ((com.amazon.aps.iva.ed0.a) next).i();
            if (i != null) {
                obj = i.b();
            }
            if (com.amazon.aps.iva.yb0.j.a(obj, cVar)) {
                obj = next;
                break;
            }
        }
        return (com.amazon.aps.iva.ed0.a) obj;
    }

    public final int hashCode() {
        return O().hashCode();
    }

    public final String toString() {
        return getClass().getName() + ": " + O();
    }
}
