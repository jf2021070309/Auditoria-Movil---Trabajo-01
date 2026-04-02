package com.amazon.aps.iva.u1;

import java.util.Map;
/* compiled from: DepthSortedSet.kt */
/* loaded from: classes.dex */
public final class m {
    public final boolean a = false;
    public final com.amazon.aps.iva.kb0.e b = com.amazon.aps.iva.kb0.f.a(com.amazon.aps.iva.kb0.g.NONE, l.h);
    public final l1<androidx.compose.ui.node.e> c = new l1<>(new k());

    public final void a(androidx.compose.ui.node.e eVar) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(eVar, "node");
        if (eVar.F()) {
            if (this.a) {
                com.amazon.aps.iva.kb0.e eVar2 = this.b;
                Integer num = (Integer) ((Map) eVar2.getValue()).get(eVar);
                if (num == null) {
                    ((Map) eVar2.getValue()).put(eVar, Integer.valueOf(eVar.l));
                } else {
                    if (num.intValue() == eVar.l) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
            }
            this.c.add(eVar);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final boolean b(androidx.compose.ui.node.e eVar) {
        boolean z;
        com.amazon.aps.iva.yb0.j.f(eVar, "node");
        boolean contains = this.c.contains(eVar);
        if (this.a) {
            if (contains == ((Map) this.b.getValue()).containsKey(eVar)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        return contains;
    }

    public final androidx.compose.ui.node.e c() {
        androidx.compose.ui.node.e first = this.c.first();
        com.amazon.aps.iva.yb0.j.e(first, "node");
        d(first);
        return first;
    }

    public final boolean d(androidx.compose.ui.node.e eVar) {
        com.amazon.aps.iva.yb0.j.f(eVar, "node");
        if (eVar.F()) {
            boolean remove = this.c.remove(eVar);
            if (this.a) {
                Integer num = (Integer) ((Map) this.b.getValue()).remove(eVar);
                boolean z = true;
                if (remove) {
                    int i = eVar.l;
                    if (num == null || num.intValue() != i) {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    if (num != null) {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
            }
            return remove;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final String toString() {
        String obj = this.c.toString();
        com.amazon.aps.iva.yb0.j.e(obj, "set.toString()");
        return obj;
    }
}
