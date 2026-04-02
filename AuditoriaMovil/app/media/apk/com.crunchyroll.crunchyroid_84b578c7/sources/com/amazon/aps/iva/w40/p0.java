package com.amazon.aps.iva.w40;

import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.w40.b0;
import com.ellation.crunchyroll.model.simulcast.SimulcastSeason;
import java.util.ArrayList;
import java.util.List;
/* compiled from: SimulcastViewModel.kt */
/* loaded from: classes2.dex */
public final class p0 extends com.amazon.aps.iva.ez.b implements o0 {
    public final j0 b;
    public final g c;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.j8.h<com.amazon.aps.iva.uz.h>>> d;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.uz.h>>> e;
    public final com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<List<SimulcastSeason>>> f;
    public final com.amazon.aps.iva.i5.v<SimulcastSeason> g;

    /* compiled from: SimulcastViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.uz.h>>, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.uz.h>>, com.amazon.aps.iva.kb0.q> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b0.b bVar) {
            super(1);
            this.h = bVar;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.uz.h>> gVar) {
            com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.uz.h>> gVar2 = gVar;
            if (gVar2 != null) {
                this.h.invoke(gVar2);
            }
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: SimulcastViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class b implements com.amazon.aps.iva.i5.w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public b(com.amazon.aps.iva.xb0.l lVar) {
            this.a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof com.amazon.aps.iva.i5.w) || !(obj instanceof com.amazon.aps.iva.yb0.f)) {
                return false;
            }
            return com.amazon.aps.iva.yb0.j.a(this.a, ((com.amazon.aps.iva.yb0.f) obj).getFunctionDelegate());
        }

        @Override // com.amazon.aps.iva.yb0.f
        public final com.amazon.aps.iva.kb0.a<?> getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // com.amazon.aps.iva.i5.w
        public final /* synthetic */ void onChanged(Object obj) {
            this.a.invoke(obj);
        }
    }

    /* compiled from: SimulcastViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Integer, com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ List<Integer> h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ArrayList arrayList) {
            super(1);
            this.h = arrayList;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(Integer num) {
            this.h.add(Integer.valueOf(num.intValue()));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public p0(l0 l0Var, h hVar) {
        super(l0Var);
        this.b = l0Var;
        this.c = hVar;
        this.d = new com.amazon.aps.iva.i5.v<>();
        this.e = new com.amazon.aps.iva.i5.v<>();
        this.f = new com.amazon.aps.iva.i5.v<>();
        this.g = new com.amazon.aps.iva.i5.v<>();
    }

    @Override // com.amazon.aps.iva.w40.o0
    public final void I0(com.amazon.aps.iva.i5.o oVar, b0.c cVar) {
        com.amazon.aps.iva.yb0.j.f(oVar, "owner");
        com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<List<SimulcastSeason>>> vVar = this.f;
        if (vVar.d() == null) {
            vVar.k(new g.b(null));
            this.b.Z0(new r0(this), new s0(this));
        }
        vVar.e(oVar, new b(new q0(cVar)));
    }

    public final void N8() {
        com.amazon.aps.iva.j8.e<?, com.amazon.aps.iva.uz.h> eVar;
        g.c<com.amazon.aps.iva.j8.h<com.amazon.aps.iva.uz.h>> a2;
        com.amazon.aps.iva.j8.h<com.amazon.aps.iva.uz.h> hVar;
        com.amazon.aps.iva.ez.g<com.amazon.aps.iva.j8.h<com.amazon.aps.iva.uz.h>> d = this.d.d();
        com.amazon.aps.iva.jz.a aVar = null;
        if (d != null && (a2 = d.a()) != null && (hVar = a2.a) != null) {
            eVar = hVar.g();
        } else {
            eVar = null;
        }
        if (eVar instanceof com.amazon.aps.iva.jz.a) {
            aVar = (com.amazon.aps.iva.jz.a) eVar;
        }
        if (aVar != null) {
            aVar.destroy();
        }
    }

    @Override // com.amazon.aps.iva.w40.o0
    public final void U(com.amazon.aps.iva.i5.o oVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.uz.h>>, com.amazon.aps.iva.kb0.q> lVar) {
        com.amazon.aps.iva.yb0.j.f(oVar, "owner");
        this.e.e(oVar, new b(new a((b0.b) lVar)));
    }

    @Override // com.amazon.aps.iva.w40.o0
    public final void a(com.amazon.aps.iva.b60.j jVar, com.amazon.aps.iva.xb0.l<? super List<Integer>, com.amazon.aps.iva.kb0.q> lVar) {
        List list;
        g.c<com.amazon.aps.iva.j8.h<com.amazon.aps.iva.uz.h>> a2;
        com.amazon.aps.iva.yb0.j.f(jVar, "data");
        com.amazon.aps.iva.ez.g<com.amazon.aps.iva.j8.h<com.amazon.aps.iva.uz.h>> d = this.d.d();
        if (d == null || (a2 = d.a()) == null || (list = (com.amazon.aps.iva.j8.h) a2.a) == null) {
            list = com.amazon.aps.iva.lb0.z.b;
        }
        ArrayList arrayList = new ArrayList();
        com.amazon.aps.iva.uz.i.a(list, jVar.b, jVar.c, new c(arrayList));
        if (!arrayList.isEmpty()) {
            ((b0.f) lVar).invoke(arrayList);
        }
    }

    @Override // com.amazon.aps.iva.w40.o0
    public final com.amazon.aps.iva.i5.v e8() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.ez.b, com.amazon.aps.iva.i5.f0
    public final void onCleared() {
        super.onCleared();
        N8();
    }

    @Override // com.amazon.aps.iva.w40.o0
    public final void t0(com.amazon.aps.iva.i5.o oVar, com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.ez.g<? extends com.amazon.aps.iva.j8.h<com.amazon.aps.iva.uz.h>>, com.amazon.aps.iva.kb0.q> lVar) {
        com.amazon.aps.iva.yb0.j.f(oVar, "owner");
        this.d.e(oVar, new b(lVar));
    }

    @Override // com.amazon.aps.iva.w40.o0
    public final void v4(SimulcastSeason simulcastSeason) {
        com.amazon.aps.iva.yb0.j.f(simulcastSeason, "season");
        com.amazon.aps.iva.i5.v<SimulcastSeason> vVar = this.g;
        if (!com.amazon.aps.iva.yb0.j.a(vVar.d(), simulcastSeason)) {
            vVar.k(simulcastSeason);
            z0();
        }
    }

    @Override // com.amazon.aps.iva.w40.o0
    public final void z0() {
        g.c<List<SimulcastSeason>> cVar;
        String str;
        com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<List<SimulcastSeason>>> vVar = this.f;
        com.amazon.aps.iva.ez.g<List<SimulcastSeason>> d = vVar.d();
        if (d != null) {
            cVar = d.a();
        } else {
            cVar = null;
        }
        if (cVar == null) {
            vVar.k(new g.b(null));
            this.b.Z0(new r0(this), new s0(this));
            return;
        }
        N8();
        com.amazon.aps.iva.i5.v<com.amazon.aps.iva.ez.g<com.amazon.aps.iva.j8.h<com.amazon.aps.iva.uz.h>>> vVar2 = this.d;
        g gVar = this.c;
        SimulcastSeason d2 = this.g.d();
        if (d2 != null) {
            str = d2.getId();
        } else {
            str = null;
        }
        com.amazon.aps.iva.yb0.j.c(str);
        vVar2.k(new g.c(gVar.a(str, new t0(this), new u0(this), new v0(this), com.amazon.aps.iva.e.w.D(this)), null));
    }
}
