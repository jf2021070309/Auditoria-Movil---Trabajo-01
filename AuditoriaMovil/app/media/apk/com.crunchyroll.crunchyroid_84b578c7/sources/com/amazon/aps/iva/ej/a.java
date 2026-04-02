package com.amazon.aps.iva.ej;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.ee0.f1;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.pj.b;
import com.amazon.aps.iva.pj.d;
import com.amazon.aps.iva.pj.e;
import com.amazon.aps.iva.pj.h;
import com.amazon.aps.iva.pj.i;
import com.amazon.aps.iva.pj.j;
import com.amazon.aps.iva.qj.n;
import com.amazon.aps.iva.qj.o;
import com.amazon.aps.iva.qj.p;
import com.amazon.aps.iva.ve0.v0;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.a0;
import com.amazon.aps.iva.yb0.e0;
import java.util.List;
/* compiled from: PlayerAnalyticsComponent.kt */
/* loaded from: classes.dex */
public final class a extends com.amazon.aps.iva.fj.f<C0224a> {
    public final v0 c;
    public long d;
    public final v0 e;
    public long f;
    public o g;
    public final v0 h;
    public final v0 i;

    /* compiled from: PlayerAnalyticsComponent.kt */
    /* renamed from: com.amazon.aps.iva.ej.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0224a implements com.amazon.aps.iva.fj.g {
    }

    /* compiled from: PlayerAnalyticsComponent.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.amazon.aps.iva.qj.i.values().length];
            iArr[com.amazon.aps.iva.qj.i.CURRENT.ordinal()] = 1;
            a = iArr;
        }
    }

    public a() {
        this(0);
    }

    @Override // com.amazon.aps.iva.fj.a
    public final void d(l<? super C0224a, q> lVar) {
        com.amazon.aps.iva.yb0.j.f(lVar, "block");
        lVar.invoke(new C0224a());
    }

    @Override // com.amazon.aps.iva.fj.a
    public final void dismiss() {
        this.d = 0L;
    }

    @Override // com.amazon.aps.iva.fj.a
    public final List<com.amazon.aps.iva.fc0.d<? extends com.amazon.aps.iva.pj.a>> f() {
        return f1.J(e0.a(com.amazon.aps.iva.pj.c.class));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.aps.iva.fj.a
    public final Object g(com.amazon.aps.iva.pj.a aVar, com.amazon.aps.iva.ob0.d<? super q> dVar) {
        float f;
        boolean z = aVar instanceof com.amazon.aps.iva.pj.e;
        boolean z2 = true;
        v0 v0Var = this.e;
        v0 v0Var2 = this.c;
        if (z) {
            com.amazon.aps.iva.pj.e eVar = (com.amazon.aps.iva.pj.e) aVar;
            if (eVar instanceof e.j) {
                j(((e.j) eVar).a);
            } else if (eVar instanceof e.o) {
                k();
            } else if (eVar instanceof e.h) {
                o oVar = (o) v0Var2.getValue();
                e.h hVar = (e.h) eVar;
                String str = hVar.a;
                Throwable th = hVar.d;
                long j = hVar.e;
                String str2 = hVar.f;
                com.amazon.aps.iva.yb0.j.f(oVar, "videoMetadataContent");
                com.amazon.aps.iva.yb0.j.f(str, "error");
                String str3 = hVar.c;
                com.amazon.aps.iva.yb0.j.f(str3, "errorCodeWithGroup");
                i().b(l(), new i.a(oVar, new n(hVar.b, str3, str, null), j, th, str2));
            } else if (eVar instanceof e.i.a) {
                k();
            } else if (eVar instanceof e.p) {
                this.d = 0L;
                f fVar = new f(eVar, System.currentTimeMillis());
                com.amazon.aps.iva.yb0.j.f(v0Var2, "<this>");
                v0Var2.setValue(fVar.invoke(v0Var2.getValue()));
                j(0L);
            } else if (eVar instanceof e.b) {
                e.b bVar = (e.b) eVar;
                this.d = bVar.a - ((o) v0Var2.getValue()).s;
                i().b(l(), new h.a((o) v0Var2.getValue(), (int) this.d));
                this.h.setValue(Long.valueOf(bVar.c));
                this.i.setValue(Integer.valueOf(bVar.d));
                g gVar = new g(this, eVar);
                com.amazon.aps.iva.yb0.j.f(v0Var, "<this>");
                v0Var.setValue(gVar.invoke(v0Var.getValue()));
                if (((p) v0Var.getValue()).d == 0) {
                    v0Var.setValue(new h(this, eVar).invoke(v0Var.getValue()));
                }
            } else if (eVar instanceof e.d) {
                e.d dVar2 = (e.d) eVar;
                long j2 = dVar2.b;
                if (j2 > this.f) {
                    this.f = j2;
                    i iVar = new i(eVar);
                    com.amazon.aps.iva.yb0.j.f(v0Var, "<this>");
                    v0Var.setValue(iVar.invoke(v0Var.getValue()));
                }
                a0 a0Var = new a0();
                float f2 = ((p) v0Var.getValue()).j;
                a0Var.b = f2;
                if (f2 != 0.0f) {
                    z2 = false;
                }
                int i = dVar2.c;
                if (!z2) {
                    f = (f2 + i) / 2;
                } else {
                    f = i;
                }
                a0Var.b = f;
                j jVar = new j(a0Var);
                com.amazon.aps.iva.yb0.j.f(v0Var, "<this>");
                v0Var.setValue(jVar.invoke(v0Var.getValue()));
            } else if (eVar instanceof e.c) {
                e.c cVar = (e.c) eVar;
                i().b(l(), new i.d((o) v0Var2.getValue(), cVar.a, cVar.b, cVar.c, ((o) v0Var2.getValue()).I));
            }
        } else if (aVar instanceof com.amazon.aps.iva.pj.b) {
            com.amazon.aps.iva.pj.b bVar2 = (com.amazon.aps.iva.pj.b) aVar;
            if (bVar2 instanceof b.a) {
                b.a aVar2 = (b.a) bVar2;
                i().b(l(), new i.c(o.a((o) v0Var2.getValue(), null, null, null, null, null, null, null, null, null, null, 0L, 0L, null, Boolean.TRUE, null, null, -8388609, 15), aVar2.a, aVar2.b, aVar2.c, aVar2.d));
            } else if (!(bVar2 instanceof b.C0619b)) {
                boolean z3 = bVar2 instanceof b.c;
            }
        } else if (aVar instanceof com.amazon.aps.iva.pj.d) {
            com.amazon.aps.iva.pj.d dVar3 = (com.amazon.aps.iva.pj.d) aVar;
            if (dVar3 instanceof d.h) {
                String str4 = ((d.h) dVar3).a;
                com.amazon.aps.iva.ej.b bVar3 = new com.amazon.aps.iva.ej.b(dVar3, (str4 == null || (r2 = (String) com.amazon.aps.iva.oe0.q.E0(str4, new String[]{"?"}).get(0)) == null) ? "" : "");
                com.amazon.aps.iva.yb0.j.f(v0Var, "<this>");
                v0Var.setValue(bVar3.invoke(v0Var.getValue()));
            } else if (dVar3 instanceof d.f) {
                c cVar2 = new c(dVar3);
                com.amazon.aps.iva.yb0.j.f(v0Var2, "<this>");
                v0Var2.setValue(cVar2.invoke(v0Var2.getValue()));
                com.amazon.aps.iva.yb0.j.f(v0Var, "<this>");
                d dVar4 = d.h;
                com.amazon.aps.iva.yb0.j.f(dVar4, "block");
                v0Var.setValue(dVar4.invoke(v0Var.getValue()));
            } else if (dVar3 instanceof d.g) {
                d.g gVar2 = (d.g) dVar3;
                if (b.a[gVar2.b.ordinal()] == 1) {
                    e eVar2 = new e(dVar3);
                    com.amazon.aps.iva.yb0.j.f(v0Var2, "<this>");
                    v0Var2.setValue(eVar2.invoke(v0Var2.getValue()));
                    this.g = gVar2.c;
                }
            }
        } else if (aVar instanceof com.amazon.aps.iva.pj.j) {
            com.amazon.aps.iva.pj.j jVar2 = (com.amazon.aps.iva.pj.j) aVar;
            if (jVar2 instanceof j.b) {
                k kVar = new k(jVar2);
                com.amazon.aps.iva.yb0.j.f(v0Var2, "<this>");
                v0Var2.setValue(kVar.invoke(v0Var2.getValue()));
            }
        }
        return q.a;
    }

    public final void j(long j) {
        boolean z;
        com.amazon.aps.iva.oj.a i = i();
        String l = l();
        v0 v0Var = this.c;
        o oVar = (o) v0Var.getValue();
        o oVar2 = this.g;
        if (j == 0) {
            z = true;
        } else {
            z = false;
        }
        i.b(l, new i.e(oVar, ((o) v0Var.getValue()).I, oVar2, z, Long.valueOf(j)));
    }

    public final void k() {
        i().b(l(), new i.b((o) this.c.getValue(), (p) this.e.getValue()));
    }

    public final String l() {
        return a.class.getSimpleName();
    }

    public a(int i) {
        this.c = x.e(new o(null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, -1, 15));
        this.e = x.e(new p(0));
        this.h = x.e(0L);
        this.i = x.e(0);
    }

    @Override // com.amazon.aps.iva.fj.a
    public final void init() {
    }
}
