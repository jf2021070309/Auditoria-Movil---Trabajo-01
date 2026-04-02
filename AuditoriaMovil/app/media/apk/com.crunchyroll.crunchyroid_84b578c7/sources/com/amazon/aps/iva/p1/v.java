package com.amazon.aps.iva.p1;

import com.amazon.aps.iva.o0.y1;
/* compiled from: PointerIcon.kt */
/* loaded from: classes.dex */
public final class v implements p, com.amazon.aps.iva.t1.g<v>, com.amazon.aps.iva.t1.d {
    public p c;
    public boolean d;
    public com.amazon.aps.iva.xb0.l<? super p, com.amazon.aps.iva.kb0.q> e;
    public final y1 f;
    public boolean g;
    public boolean h;
    public final com.amazon.aps.iva.t1.i<v> i;
    public final v j;

    /* compiled from: PointerIcon.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<p, com.amazon.aps.iva.kb0.q> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final /* bridge */ /* synthetic */ com.amazon.aps.iva.kb0.q invoke(p pVar) {
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public v(p pVar, boolean z, s sVar) {
        com.amazon.aps.iva.yb0.j.f(pVar, "icon");
        this.c = pVar;
        this.d = z;
        this.e = sVar;
        this.f = com.amazon.aps.iva.cq.b.c0(null);
        this.i = q.a;
        this.j = this;
    }

    @Override // com.amazon.aps.iva.t1.g
    public final com.amazon.aps.iva.t1.i<v> getKey() {
        return this.i;
    }

    @Override // com.amazon.aps.iva.t1.g
    public final v getValue() {
        return this.j;
    }

    @Override // com.amazon.aps.iva.t1.d
    public final void j(com.amazon.aps.iva.t1.h hVar) {
        com.amazon.aps.iva.yb0.j.f(hVar, "scope");
        v l = l();
        this.f.setValue((v) hVar.l(q.a));
        if (l != null && l() == null) {
            if (this.h) {
                l.y();
            }
            this.h = false;
            this.e = a.h;
        }
    }

    public final v l() {
        return (v) this.f.getValue();
    }

    public final boolean p() {
        boolean z;
        if (this.d) {
            return true;
        }
        v l = l();
        if (l != null && l.p()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    public final void x() {
        this.g = true;
        v l = l();
        if (l != null) {
            l.x();
        }
    }

    public final void y() {
        this.g = false;
        if (this.h) {
            this.e.invoke(this.c);
        } else if (l() == null) {
            this.e.invoke(null);
        } else {
            v l = l();
            if (l != null) {
                l.y();
            }
        }
    }
}
