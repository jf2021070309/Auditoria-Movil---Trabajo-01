package com.amazon.aps.iva.fh;

import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.t50.c;
import com.amazon.aps.iva.yb0.j;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: AppLaunchesEligibilityRule.kt */
/* loaded from: classes.dex */
public final class b implements com.amazon.aps.iva.eh.b {
    public final c a;
    public final com.amazon.aps.iva.ch.a b;
    public final com.amazon.aps.iva.t50.c c;

    public b(d dVar, com.amazon.aps.iva.ch.a aVar) {
        c.b bVar = c.b.a;
        j.f(aVar, "config");
        this.a = dVar;
        this.b = aVar;
        this.c = bVar;
    }

    @Override // com.amazon.aps.iva.eh.b
    public final boolean a() {
        int i;
        boolean z;
        List<a> q = this.a.q();
        boolean z2 = q instanceof Collection;
        com.amazon.aps.iva.ch.a aVar = this.b;
        if (z2 && q.isEmpty()) {
            i = 0;
        } else {
            i = 0;
            for (a aVar2 : q) {
                long b = aVar2.b();
                long a = this.c.a();
                j.f(aVar, "<this>");
                if (b > a - TimeUnit.MINUTES.toMillis(aVar.c())) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && (i = i + 1) < 0) {
                    f1.R();
                    throw null;
                }
            }
        }
        if (i >= aVar.b()) {
            return true;
        }
        return false;
    }
}
