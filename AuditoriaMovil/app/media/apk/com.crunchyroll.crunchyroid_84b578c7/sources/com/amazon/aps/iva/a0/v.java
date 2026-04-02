package com.amazon.aps.iva.a0;

import com.amazon.aps.iva.a1.f;
/* compiled from: Clickable.kt */
/* loaded from: classes.dex */
public final class v extends f.c implements com.amazon.aps.iva.u1.i1 {
    public boolean o;
    public String p;
    public com.amazon.aps.iva.a2.i q;
    public com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> r;
    public String s;
    public com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> t;

    public v(boolean z, String str, com.amazon.aps.iva.a2.i iVar, com.amazon.aps.iva.xb0.a aVar, String str2, com.amazon.aps.iva.xb0.a aVar2) {
        com.amazon.aps.iva.yb0.j.f(aVar, "onClick");
        this.o = z;
        this.p = str;
        this.q = iVar;
        this.r = aVar;
        this.s = str2;
        this.t = aVar2;
    }

    @Override // com.amazon.aps.iva.u1.i1
    public final boolean d1() {
        return true;
    }

    @Override // com.amazon.aps.iva.u1.i1
    public final void o0(com.amazon.aps.iva.a2.l lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "<this>");
        com.amazon.aps.iva.a2.i iVar = this.q;
        if (iVar != null) {
            com.amazon.aps.iva.a2.y.d(lVar, iVar.a);
        }
        com.amazon.aps.iva.a2.y.b(lVar, this.p, new t(this));
        if (this.t != null) {
            lVar.b(com.amazon.aps.iva.a2.k.c, new com.amazon.aps.iva.a2.a(this.s, new u(this)));
        }
        if (!this.o) {
            lVar.b(com.amazon.aps.iva.a2.v.i, com.amazon.aps.iva.kb0.q.a);
        }
    }
}
