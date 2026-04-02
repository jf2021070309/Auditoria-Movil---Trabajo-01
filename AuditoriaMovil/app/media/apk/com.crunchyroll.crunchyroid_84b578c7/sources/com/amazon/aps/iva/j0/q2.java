package com.amazon.aps.iva.j0;
/* compiled from: TextLayoutResultProxy.kt */
/* loaded from: classes.dex */
public final class q2 {
    public final com.amazon.aps.iva.c2.y a;
    public com.amazon.aps.iva.s1.q b;
    public com.amazon.aps.iva.s1.q c;

    public q2(com.amazon.aps.iva.c2.y yVar) {
        this.a = yVar;
    }

    public final long a(long j) {
        com.amazon.aps.iva.e1.e eVar;
        com.amazon.aps.iva.s1.q qVar = this.b;
        com.amazon.aps.iva.e1.e eVar2 = com.amazon.aps.iva.e1.e.e;
        if (qVar != null) {
            if (qVar.l()) {
                com.amazon.aps.iva.s1.q qVar2 = this.c;
                if (qVar2 != null) {
                    eVar = qVar2.f(qVar, true);
                } else {
                    eVar = null;
                }
            } else {
                eVar = eVar2;
            }
            if (eVar != null) {
                eVar2 = eVar;
            }
        }
        float c = com.amazon.aps.iva.e1.c.c(j);
        float f = eVar2.a;
        if (c >= f) {
            float c2 = com.amazon.aps.iva.e1.c.c(j);
            f = eVar2.c;
            if (c2 <= f) {
                f = com.amazon.aps.iva.e1.c.c(j);
            }
        }
        float d = com.amazon.aps.iva.e1.c.d(j);
        float f2 = eVar2.b;
        if (d >= f2) {
            float d2 = com.amazon.aps.iva.e1.c.d(j);
            f2 = eVar2.d;
            if (d2 <= f2) {
                f2 = com.amazon.aps.iva.e1.c.d(j);
            }
        }
        return com.amazon.aps.iva.e1.d.d(f, f2);
    }

    public final int b(long j, boolean z) {
        if (z) {
            j = a(j);
        }
        return this.a.m(c(j));
    }

    public final long c(long j) {
        com.amazon.aps.iva.e1.c cVar;
        long j2;
        com.amazon.aps.iva.s1.q qVar = this.b;
        if (qVar != null) {
            com.amazon.aps.iva.s1.q qVar2 = this.c;
            if (qVar2 != null) {
                if (qVar.l() && qVar2.l()) {
                    j2 = qVar.a0(qVar2, j);
                } else {
                    j2 = j;
                }
                cVar = new com.amazon.aps.iva.e1.c(j2);
            } else {
                cVar = null;
            }
            if (cVar != null) {
                return cVar.a;
            }
            return j;
        }
        return j;
    }
}
