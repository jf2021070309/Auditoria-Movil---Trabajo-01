package com.amazon.aps.iva.ad;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: RequestTracker.java */
/* loaded from: classes.dex */
public final class k {
    public final Set<com.amazon.aps.iva.dd.d> a = Collections.newSetFromMap(new WeakHashMap());
    public final HashSet b = new HashSet();
    public boolean c;

    public final boolean a(com.amazon.aps.iva.dd.d dVar) {
        boolean z = true;
        if (dVar == null) {
            return true;
        }
        boolean remove = this.a.remove(dVar);
        if (!this.b.remove(dVar) && !remove) {
            z = false;
        }
        if (z) {
            dVar.clear();
        }
        return z;
    }

    public final void b() {
        Iterator it = com.amazon.aps.iva.hd.l.d(this.a).iterator();
        while (it.hasNext()) {
            com.amazon.aps.iva.dd.d dVar = (com.amazon.aps.iva.dd.d) it.next();
            if (!dVar.f() && !dVar.d()) {
                dVar.clear();
                if (!this.c) {
                    dVar.j();
                } else {
                    this.b.add(dVar);
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{numRequests=");
        sb.append(this.a.size());
        sb.append(", isPaused=");
        return com.amazon.aps.iva.e4.e.c(sb, this.c, "}");
    }
}
