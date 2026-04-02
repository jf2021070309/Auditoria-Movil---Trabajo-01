package com.amazon.aps.iva.dh;

import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.t50.c;
import com.amazon.aps.iva.yb0.j;
import java.util.Collection;
import java.util.List;
/* compiled from: InAppReviewEligibilityMonitor.kt */
/* loaded from: classes.dex */
public final class f implements e {
    public final List<com.amazon.aps.iva.eh.b> a;
    public final g b;
    public final com.amazon.aps.iva.gh.a c;
    public final com.amazon.aps.iva.t50.c d;
    public final com.amazon.aps.iva.xb0.a<Boolean> e;
    public final v<Boolean> f;

    public f(List list, h hVar, com.amazon.aps.iva.gh.b bVar, com.amazon.aps.iva.xb0.a aVar) {
        c.b bVar2 = c.b.a;
        j.f(aVar, "isUserPremium");
        this.a = list;
        this.b = hVar;
        this.c = bVar;
        this.d = bVar2;
        this.e = aVar;
        this.f = new v<>(Boolean.valueOf(c()));
    }

    @Override // com.amazon.aps.iva.dh.e
    public final void a() {
        this.f.k(Boolean.valueOf(c()));
    }

    @Override // com.amazon.aps.iva.dh.e
    public final v b() {
        return this.f;
    }

    public final boolean c() {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.d.a() > this.b.b()) {
            z = true;
        } else {
            z = false;
        }
        if (this.c.b() >= 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.e.invoke().booleanValue() && z && z2) {
            List<com.amazon.aps.iva.eh.b> list = this.a;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (com.amazon.aps.iva.eh.b bVar : list) {
                    if (bVar.a()) {
                        z3 = true;
                        break;
                    }
                }
            }
            z3 = false;
            if (z3) {
                return true;
            }
        }
        return false;
    }
}
