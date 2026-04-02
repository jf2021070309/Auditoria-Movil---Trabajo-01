package com.amazon.aps.iva.nc0;

import com.amazon.aps.iva.me0.a;
import com.amazon.aps.iva.nc0.k;
import com.amazon.aps.iva.yb0.d0;
/* compiled from: JvmBuiltInsCustomizer.kt */
/* loaded from: classes4.dex */
public final class q extends a.b<com.amazon.aps.iva.oc0.e, k.a> {
    public final /* synthetic */ String a;
    public final /* synthetic */ d0<k.a> b;

    public q(String str, d0<k.a> d0Var) {
        this.a = str;
        this.b = d0Var;
    }

    @Override // com.amazon.aps.iva.me0.a.d
    public final Object a() {
        k.a aVar = this.b.b;
        if (aVar == null) {
            return k.a.NOT_CONSIDERED;
        }
        return aVar;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [T, com.amazon.aps.iva.nc0.k$a] */
    /* JADX WARN: Type inference failed for: r3v5, types: [T, com.amazon.aps.iva.nc0.k$a] */
    /* JADX WARN: Type inference failed for: r3v9, types: [T, com.amazon.aps.iva.nc0.k$a] */
    @Override // com.amazon.aps.iva.me0.a.d
    public final boolean c(Object obj) {
        com.amazon.aps.iva.oc0.e eVar = (com.amazon.aps.iva.oc0.e) obj;
        com.amazon.aps.iva.yb0.j.f(eVar, "javaClassDescriptor");
        String F = com.amazon.aps.iva.aq.k.F(eVar, this.a);
        boolean contains = u.b.contains(F);
        d0<k.a> d0Var = this.b;
        if (contains) {
            d0Var.b = k.a.HIDDEN;
        } else if (u.c.contains(F)) {
            d0Var.b = k.a.VISIBLE;
        } else if (u.a.contains(F)) {
            d0Var.b = k.a.DROP;
        }
        if (d0Var.b == null) {
            return true;
        }
        return false;
    }
}
