package com.amazon.aps.iva.fd0;

import com.amazon.aps.iva.pc0.h;
import java.util.Iterator;
/* compiled from: typeEnhancement.kt */
/* loaded from: classes4.dex */
public final class f implements com.amazon.aps.iva.pc0.h {
    public final com.amazon.aps.iva.nd0.c b;

    public f(com.amazon.aps.iva.nd0.c cVar) {
        this.b = cVar;
    }

    @Override // com.amazon.aps.iva.pc0.h
    public final boolean A(com.amazon.aps.iva.nd0.c cVar) {
        return h.b.b(this, cVar);
    }

    @Override // com.amazon.aps.iva.pc0.h
    public final com.amazon.aps.iva.pc0.c h(com.amazon.aps.iva.nd0.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
        if (com.amazon.aps.iva.yb0.j.a(cVar, this.b)) {
            return e.a;
        }
        return null;
    }

    @Override // com.amazon.aps.iva.pc0.h
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<com.amazon.aps.iva.pc0.c> iterator() {
        return com.amazon.aps.iva.lb0.y.b;
    }
}
