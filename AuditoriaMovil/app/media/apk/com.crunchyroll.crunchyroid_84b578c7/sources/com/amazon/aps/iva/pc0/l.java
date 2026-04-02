package com.amazon.aps.iva.pc0;

import com.amazon.aps.iva.ee0.p1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: Annotations.kt */
/* loaded from: classes4.dex */
public final class l implements h {
    public final h b;
    public final com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.nd0.c, Boolean> c;

    public l(h hVar, p1 p1Var) {
        this.b = hVar;
        this.c = p1Var;
    }

    @Override // com.amazon.aps.iva.pc0.h
    public final boolean A(com.amazon.aps.iva.nd0.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
        if (this.c.invoke(cVar).booleanValue()) {
            return this.b.A(cVar);
        }
        return false;
    }

    @Override // com.amazon.aps.iva.pc0.h
    public final c h(com.amazon.aps.iva.nd0.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "fqName");
        if (this.c.invoke(cVar).booleanValue()) {
            return this.b.h(cVar);
        }
        return null;
    }

    @Override // com.amazon.aps.iva.pc0.h
    public final boolean isEmpty() {
        boolean z;
        h<c> hVar = this.b;
        if ((hVar instanceof Collection) && ((Collection) hVar).isEmpty()) {
            return false;
        }
        for (c cVar : hVar) {
            com.amazon.aps.iva.nd0.c c = cVar.c();
            if (c != null && this.c.invoke(c).booleanValue()) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<c> iterator() {
        boolean z;
        ArrayList arrayList = new ArrayList();
        for (c cVar : this.b) {
            com.amazon.aps.iva.nd0.c c = cVar.c();
            if (c != null && this.c.invoke(c).booleanValue()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(cVar);
            }
        }
        return arrayList.iterator();
    }
}
