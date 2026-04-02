package com.amazon.aps.iva.lm;

import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.gr.n;
import com.amazon.aps.iva.i5.f0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lm.g;
import com.amazon.aps.iva.nm.c;
import com.amazon.aps.iva.ve0.a0;
import com.amazon.aps.iva.ve0.u0;
import com.amazon.aps.iva.ve0.v0;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.api.etp.assets.model.AssetType;
/* compiled from: ManageProfileController.kt */
/* loaded from: classes2.dex */
public final class h extends f0 implements c {
    public final com.amazon.aps.iva.ui.b<com.amazon.aps.iva.nm.c> b;
    public final v0 c;

    /* compiled from: ManageProfileController.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.profiles.presentation.manageprofile.ManageProfileViewModel$1", f = "ManageProfileController.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements p<com.amazon.aps.iva.ui.a, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public /* synthetic */ Object h;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.h = obj;
            return aVar;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(com.amazon.aps.iva.ui.a aVar, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((a) create(aVar, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            x.i0(obj);
            com.amazon.aps.iva.ui.a aVar2 = (com.amazon.aps.iva.ui.a) this.h;
            if (aVar2 instanceof com.amazon.aps.iva.hm.c) {
                com.amazon.aps.iva.hm.c cVar = (com.amazon.aps.iva.hm.c) aVar2;
                h hVar = h.this;
                hVar.getClass();
                int i = b.a[cVar.c.ordinal()];
                v0 v0Var = hVar.c;
                if (i != 1) {
                    if (i == 2) {
                        n.A(v0Var, new j(cVar));
                    }
                } else {
                    n.A(v0Var, new i(cVar));
                }
            }
            return q.a;
        }
    }

    /* compiled from: ManageProfileController.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AssetType.values().length];
            try {
                iArr[AssetType.AVATAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AssetType.WALLPAPER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public h(com.amazon.aps.iva.ui.b<com.amazon.aps.iva.nm.c> bVar, com.amazon.aps.iva.dm.a aVar) {
        com.amazon.aps.iva.yb0.j.f(bVar, "navigator");
        com.amazon.aps.iva.yb0.j.f(aVar, "profilesGateway");
        this.b = bVar;
        com.amazon.aps.iva.mm.a aVar2 = (com.amazon.aps.iva.mm.a) bVar.T5();
        com.amazon.aps.iva.mm.b bVar2 = new com.amazon.aps.iva.mm.b(aVar2.b, aVar2.e, aVar2.c, aVar2.d, false, "");
        com.amazon.aps.iva.dn.d dVar = com.amazon.aps.iva.dn.d.CONTROLS_ENABLED;
        this.c = x.e(new f(bVar2, new com.amazon.aps.iva.dn.e(aVar2.b, aVar2.c, aVar2.d, dVar)));
        com.amazon.aps.iva.dg.b.A(w.D(this), new a0(bVar.Y4(), new a(null)));
    }

    @Override // com.amazon.aps.iva.ri.a
    public final void K4(g gVar) {
        g gVar2 = gVar;
        com.amazon.aps.iva.yb0.j.f(gVar2, "event");
        if (!com.amazon.aps.iva.yb0.j.a(gVar2, g.d.a)) {
            boolean a2 = com.amazon.aps.iva.yb0.j.a(gVar2, g.a.a);
            com.amazon.aps.iva.ui.b<com.amazon.aps.iva.nm.c> bVar = this.b;
            if (a2) {
                bVar.w7(null);
                return;
            }
            boolean a3 = com.amazon.aps.iva.yb0.j.a(gVar2, g.b.a);
            v0 v0Var = this.c;
            if (a3) {
                c.d dVar = c.d.a;
                com.amazon.aps.iva.mm.b bVar2 = ((f) v0Var.getValue()).a;
                bVar.v1(dVar, new com.amazon.aps.iva.hm.b(bVar2.a, bVar2.c, bVar2.d));
            } else if (com.amazon.aps.iva.yb0.j.a(gVar2, g.c.a)) {
                c.e eVar = c.e.a;
                com.amazon.aps.iva.mm.b bVar3 = ((f) v0Var.getValue()).a;
                bVar.v1(eVar, new com.amazon.aps.iva.hm.b(bVar3.a, bVar3.c, bVar3.d));
            }
        }
    }

    @Override // com.amazon.aps.iva.ri.a
    public final u0<f> getState() {
        return this.c;
    }
}
