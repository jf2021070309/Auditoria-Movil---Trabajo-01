package com.amazon.aps.iva.k0;

import com.amazon.aps.iva.c2.y;
import com.amazon.aps.iva.j0.g1;
import com.amazon.aps.iva.l0.u;
import com.amazon.aps.iva.l0.v;
/* compiled from: SelectionController.kt */
/* loaded from: classes.dex */
public final class k implements g1 {
    public long a;
    public long b;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.s1.q> c;
    public final /* synthetic */ u d;
    public final /* synthetic */ long e;
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<y> f;

    public k(g gVar, u uVar, long j, h hVar) {
        this.c = gVar;
        this.d = uVar;
        this.e = j;
        this.f = hVar;
        long j2 = com.amazon.aps.iva.e1.c.b;
        this.a = j2;
        this.b = j2;
    }

    @Override // com.amazon.aps.iva.j0.g1
    public final void b(long j) {
        com.amazon.aps.iva.s1.q invoke = this.c.invoke();
        u uVar = this.d;
        if (invoke != null) {
            if (!invoke.l()) {
                return;
            }
            if (l.a(this.f.invoke(), j, j)) {
                uVar.c();
            } else {
                uVar.d();
            }
            this.a = j;
        }
        if (!v.a(uVar, this.e)) {
            return;
        }
        this.b = com.amazon.aps.iva.e1.c.b;
    }

    @Override // com.amazon.aps.iva.j0.g1
    public final void d(long j) {
        com.amazon.aps.iva.s1.q invoke = this.c.invoke();
        if (invoke == null || !invoke.l()) {
            return;
        }
        long j2 = this.e;
        u uVar = this.d;
        if (!v.a(uVar, j2)) {
            return;
        }
        long f = com.amazon.aps.iva.e1.c.f(this.b, j);
        this.b = f;
        long f2 = com.amazon.aps.iva.e1.c.f(this.a, f);
        if (!l.a(this.f.invoke(), this.a, f2) && uVar.g()) {
            this.a = f2;
            this.b = com.amazon.aps.iva.e1.c.b;
        }
    }

    @Override // com.amazon.aps.iva.j0.g1
    public final void onCancel() {
        long j = this.e;
        u uVar = this.d;
        if (v.a(uVar, j)) {
            uVar.h();
        }
    }

    @Override // com.amazon.aps.iva.j0.g1
    public final void onStop() {
        long j = this.e;
        u uVar = this.d;
        if (v.a(uVar, j)) {
            uVar.h();
        }
    }

    @Override // com.amazon.aps.iva.j0.g1
    public final void a() {
    }

    @Override // com.amazon.aps.iva.j0.g1
    public final void c() {
    }
}
