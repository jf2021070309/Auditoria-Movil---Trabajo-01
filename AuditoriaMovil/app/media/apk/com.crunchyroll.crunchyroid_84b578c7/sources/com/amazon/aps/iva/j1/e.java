package com.amazon.aps.iva.j1;

import android.graphics.PathMeasure;
import com.amazon.aps.iva.f1.o0;
import com.amazon.aps.iva.lb0.z;
import java.util.List;
/* compiled from: Vector.kt */
/* loaded from: classes.dex */
public final class e extends i {
    public com.amazon.aps.iva.f1.s b;
    public float c = 1.0f;
    public List<? extends f> d;
    public float e;
    public float f;
    public com.amazon.aps.iva.f1.s g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public boolean o;
    public boolean p;
    public com.amazon.aps.iva.h1.i q;
    public final com.amazon.aps.iva.f1.m r;
    public com.amazon.aps.iva.f1.m s;
    public final com.amazon.aps.iva.kb0.e t;

    /* compiled from: Vector.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<o0> {
        public static final a h = new a();

        public a() {
            super(0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final o0 invoke() {
            return new com.amazon.aps.iva.f1.n(new PathMeasure());
        }
    }

    public e() {
        int i = o.a;
        this.d = z.b;
        this.e = 1.0f;
        this.h = 0;
        this.i = 0;
        this.j = 4.0f;
        this.l = 1.0f;
        this.n = true;
        this.o = true;
        com.amazon.aps.iva.f1.m j = com.amazon.aps.iva.cq.b.j();
        this.r = j;
        this.s = j;
        this.t = com.amazon.aps.iva.kb0.f.a(com.amazon.aps.iva.kb0.g.NONE, a.h);
    }

    @Override // com.amazon.aps.iva.j1.i
    public final void a(com.amazon.aps.iva.h1.e eVar) {
        com.amazon.aps.iva.yb0.j.f(eVar, "<this>");
        if (this.n) {
            h.b(this.d, this.r);
            e();
        } else if (this.p) {
            e();
        }
        this.n = false;
        this.p = false;
        com.amazon.aps.iva.f1.s sVar = this.b;
        if (sVar != null) {
            com.amazon.aps.iva.h1.e.E(eVar, this.s, sVar, this.c, null, 56);
        }
        com.amazon.aps.iva.f1.s sVar2 = this.g;
        if (sVar2 != null) {
            com.amazon.aps.iva.h1.i iVar = this.q;
            if (this.o || iVar == null) {
                iVar = new com.amazon.aps.iva.h1.i(this.f, this.j, this.h, this.i, 16);
                this.q = iVar;
                this.o = false;
            }
            com.amazon.aps.iva.h1.e.E(eVar, this.s, sVar2, this.e, iVar, 48);
        }
    }

    public final void e() {
        boolean z;
        boolean z2 = false;
        if (this.k == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        com.amazon.aps.iva.f1.m mVar = this.r;
        if (z) {
            if (this.l == 1.0f) {
                z2 = true;
            }
            if (z2) {
                this.s = mVar;
                return;
            }
        }
        if (com.amazon.aps.iva.yb0.j.a(this.s, mVar)) {
            this.s = com.amazon.aps.iva.cq.b.j();
        } else {
            int g = this.s.g();
            this.s.i();
            this.s.f(g);
        }
        com.amazon.aps.iva.kb0.e eVar = this.t;
        ((o0) eVar.getValue()).b(mVar);
        float a2 = ((o0) eVar.getValue()).a();
        float f = this.k;
        float f2 = this.m;
        float f3 = ((f + f2) % 1.0f) * a2;
        float f4 = ((this.l + f2) % 1.0f) * a2;
        if (f3 > f4) {
            ((o0) eVar.getValue()).c(f3, a2, this.s);
            ((o0) eVar.getValue()).c(0.0f, f4, this.s);
            return;
        }
        ((o0) eVar.getValue()).c(f3, f4, this.s);
    }

    public final String toString() {
        return this.r.toString();
    }
}
