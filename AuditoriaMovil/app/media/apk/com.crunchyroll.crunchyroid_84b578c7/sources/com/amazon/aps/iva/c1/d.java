package com.amazon.aps.iva.c1;

import com.amazon.aps.iva.a1.f;
import com.amazon.aps.iva.u1.p;
import com.amazon.aps.iva.u1.p0;
import com.amazon.aps.iva.u1.q0;
/* compiled from: DrawModifier.kt */
/* loaded from: classes.dex */
public final class d extends f.c implements b, p0, a {
    public final e o;
    public boolean p;
    public com.amazon.aps.iva.xb0.l<? super e, i> q;

    public d(e eVar, com.amazon.aps.iva.xb0.l<? super e, i> lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "block");
        this.o = eVar;
        this.q = lVar;
        eVar.b = this;
    }

    @Override // com.amazon.aps.iva.u1.o
    public final void H0() {
        w0();
    }

    @Override // com.amazon.aps.iva.u1.p0
    public final void a0() {
        w0();
    }

    @Override // com.amazon.aps.iva.c1.a
    public final com.amazon.aps.iva.o2.c getDensity() {
        return com.amazon.aps.iva.u1.i.e(this).s;
    }

    @Override // com.amazon.aps.iva.c1.a
    public final com.amazon.aps.iva.o2.l getLayoutDirection() {
        return com.amazon.aps.iva.u1.i.e(this).t;
    }

    @Override // com.amazon.aps.iva.c1.a
    public final long h() {
        return com.amazon.aps.iva.o2.k.b(com.amazon.aps.iva.u1.i.d(this, 128).d);
    }

    @Override // com.amazon.aps.iva.u1.o
    public final void w(com.amazon.aps.iva.h1.c cVar) {
        com.amazon.aps.iva.yb0.j.f(cVar, "<this>");
        boolean z = this.p;
        e eVar = this.o;
        if (!z) {
            eVar.c = null;
            q0.a(this, new c(this, eVar));
            if (eVar.c != null) {
                this.p = true;
            } else {
                throw new IllegalStateException("DrawResult not defined, did you forget to call onDraw?".toString());
            }
        }
        i iVar = eVar.c;
        com.amazon.aps.iva.yb0.j.c(iVar);
        iVar.a.invoke(cVar);
    }

    @Override // com.amazon.aps.iva.c1.b
    public final void w0() {
        this.p = false;
        this.o.c = null;
        p.a(this);
    }
}
