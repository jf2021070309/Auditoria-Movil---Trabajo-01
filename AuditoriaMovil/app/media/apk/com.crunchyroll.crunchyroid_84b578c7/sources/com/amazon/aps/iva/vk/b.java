package com.amazon.aps.iva.vk;

import com.amazon.aps.iva.dj.g;
import com.amazon.aps.iva.dj.h;
import com.amazon.aps.iva.es.r;
import com.amazon.aps.iva.es.x;
import com.amazon.aps.iva.es.z;
import com.amazon.aps.iva.gr.n;
import com.amazon.aps.iva.js.s;
import com.amazon.aps.iva.ks.a;
import com.amazon.aps.iva.ks.w;
import com.amazon.aps.iva.nk.j;
/* compiled from: PlayerControlsAnalytics.kt */
/* loaded from: classes2.dex */
public final class b implements a {
    public final com.amazon.aps.iva.xb0.a<j> a;
    public final com.amazon.aps.iva.xb0.a<w> b;
    public final h c;
    public final com.amazon.aps.iva.ds.a d;

    public b(g.a aVar, g.b bVar, h hVar, com.amazon.aps.iva.ds.a aVar2) {
        this.a = aVar;
        this.b = bVar;
        this.c = hVar;
        this.d = aVar2;
    }

    @Override // com.amazon.aps.iva.vk.a
    public final void a(com.amazon.aps.iva.rv.a aVar, boolean z) {
        s sVar;
        com.amazon.aps.iva.yb0.j.f(aVar, "device");
        w invoke = this.b.invoke();
        if (aVar.S0()) {
            sVar = s.LANDSCAPE;
        } else {
            sVar = s.PORTRAIT;
        }
        this.d.e(new z(sVar, a.C0456a.b(this.c.a(this.a.invoke().h.i)), invoke, z));
    }

    @Override // com.amazon.aps.iva.vk.a
    public final void b() {
        this.d.e(new r(a.C0456a.b(this.c.a(this.a.invoke().h.i)), this.b.invoke()));
    }

    @Override // com.amazon.aps.iva.vk.a
    public final void c() {
        j invoke = this.a.invoke();
        float E = n.E(Long.valueOf(invoke.c)) + 10.0f;
        com.amazon.aps.iva.kk.c cVar = invoke.h;
        float E2 = n.E(Long.valueOf(cVar.s));
        if (E > E2) {
            E = E2;
        }
        this.d.e(new x(this.b.invoke(), n.E(Long.valueOf(invoke.c)), E, this.c.b(cVar.p)));
    }

    @Override // com.amazon.aps.iva.vk.a
    public final void d() {
        j invoke = this.a.invoke();
        float E = n.E(Long.valueOf(invoke.c)) - 10.0f;
        if (E < 0.0f) {
            E = 0.0f;
        }
        this.d.e(new com.amazon.aps.iva.es.w(this.b.invoke(), n.E(Long.valueOf(invoke.c)), E, this.c.b(invoke.h.p)));
    }

    @Override // com.amazon.aps.iva.vk.a
    public final void e(int i, int i2) {
        this.d.e(new z(this.b.invoke(), n.E(Integer.valueOf(i)), n.E(Integer.valueOf(i2)), this.c.b(this.a.invoke().h.p)));
    }
}
