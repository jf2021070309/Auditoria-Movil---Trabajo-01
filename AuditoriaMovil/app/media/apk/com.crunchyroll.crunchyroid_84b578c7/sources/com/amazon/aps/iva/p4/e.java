package com.amazon.aps.iva.p4;
/* compiled from: Button.kt */
/* loaded from: classes.dex */
public final class e {
    public final com.amazon.aps.iva.b5.a a;
    public final com.amazon.aps.iva.b5.a b;

    public e(com.amazon.aps.iva.b5.e eVar, com.amazon.aps.iva.b5.e eVar2) {
        this.a = eVar;
        this.b = eVar2;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!com.amazon.aps.iva.yb0.j.a(e.class, cls)) {
            return false;
        }
        com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type androidx.glance.ButtonColors");
        e eVar = (e) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, eVar.a) && com.amazon.aps.iva.yb0.j.a(this.b, eVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
