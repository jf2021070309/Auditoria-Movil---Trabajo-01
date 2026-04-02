package com.amazon.aps.iva.a2;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: SemanticsConfiguration.kt */
/* loaded from: classes.dex */
public final class l implements c0, Iterable<Map.Entry<? extends b0<?>, ? extends Object>>, com.amazon.aps.iva.zb0.a {
    public final LinkedHashMap b = new LinkedHashMap();
    public boolean c;
    public boolean d;

    @Override // com.amazon.aps.iva.a2.c0
    public final <T> void b(b0<T> b0Var, T t) {
        com.amazon.aps.iva.yb0.j.f(b0Var, "key");
        boolean z = t instanceof a;
        LinkedHashMap linkedHashMap = this.b;
        if (z && d(b0Var)) {
            Object obj = linkedHashMap.get(b0Var);
            com.amazon.aps.iva.yb0.j.d(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
            a aVar = (a) obj;
            a aVar2 = (a) t;
            String str = aVar2.a;
            if (str == null) {
                str = aVar.a;
            }
            com.amazon.aps.iva.kb0.a aVar3 = aVar2.b;
            if (aVar3 == null) {
                aVar3 = aVar.b;
            }
            linkedHashMap.put(b0Var, new a(str, aVar3));
            return;
        }
        linkedHashMap.put(b0Var, t);
    }

    public final <T> boolean d(b0<T> b0Var) {
        com.amazon.aps.iva.yb0.j.f(b0Var, "key");
        return this.b.containsKey(b0Var);
    }

    public final <T> T e(b0<T> b0Var) {
        com.amazon.aps.iva.yb0.j.f(b0Var, "key");
        T t = (T) this.b.get(b0Var);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Key not present: " + b0Var + " - consider getOrElse or getOrNull");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.b, lVar.b) && this.c == lVar.c && this.d == lVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + com.amazon.aps.iva.a0.r.b(this.c, this.b.hashCode() * 31, 31);
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<? extends b0<?>, ? extends Object>> iterator() {
        return this.b.entrySet().iterator();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.c) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.d) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : this.b.entrySet()) {
            Object value = entry.getValue();
            sb.append(str);
            sb.append(((b0) entry.getKey()).a);
            sb.append(" : ");
            sb.append(value);
            str = ", ";
        }
        return defpackage.i.D(this) + "{ " + ((Object) sb) + " }";
    }
}
