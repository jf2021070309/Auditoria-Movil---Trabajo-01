package com.amazon.aps.iva.ez;
/* compiled from: Event.kt */
/* loaded from: classes2.dex */
public class d<T> {
    public final T b;
    public boolean c;

    public d(T t) {
        this.b = t;
    }

    public final T a() {
        if (this.c) {
            return null;
        }
        this.c = true;
        return this.b;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!com.amazon.aps.iva.yb0.j.a(cls2, cls)) {
            return false;
        }
        com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type com.ellation.crunchyroll.mvp.viewmodel.Event<*>");
        d dVar = (d) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.b, dVar.b) && this.c == dVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        T t = this.b;
        if (t != null) {
            i = t.hashCode();
        } else {
            i = 0;
        }
        return Boolean.hashCode(this.c) + (i * 31);
    }
}
