package com.amazon.aps.iva.l9;

import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.k9.p;
/* compiled from: OperationImpl.java */
/* loaded from: classes.dex */
public final class c implements p {
    public final v<p.a> c = new v<>();
    public final com.amazon.aps.iva.v9.c<p.a.c> d = new com.amazon.aps.iva.v9.c<>();

    public c() {
        a(p.b);
    }

    public final void a(p.a aVar) {
        this.c.i(aVar);
        boolean z = aVar instanceof p.a.c;
        com.amazon.aps.iva.v9.c<p.a.c> cVar = this.d;
        if (z) {
            cVar.h((p.a.c) aVar);
        } else if (aVar instanceof p.a.C0438a) {
            cVar.i(((p.a.C0438a) aVar).a);
        }
    }
}
