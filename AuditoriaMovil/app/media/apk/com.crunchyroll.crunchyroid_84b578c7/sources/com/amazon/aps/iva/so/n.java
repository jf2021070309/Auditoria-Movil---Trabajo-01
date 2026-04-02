package com.amazon.aps.iva.so;

import androidx.lifecycle.LiveData;
import com.amazon.aps.iva.ab.x;
import com.amazon.aps.iva.e.w;
import com.amazon.aps.iva.ez.g;
import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.j9.i0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.lb0.a0;
import com.amazon.aps.iva.lb0.o;
import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.xb0.p;
import com.ellation.crunchyroll.model.Episode;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.util.List;
import java.util.Map;
/* compiled from: WatchScreenAssetsViewModel.kt */
/* loaded from: classes2.dex */
public final class n extends com.amazon.aps.iva.ez.b implements i {
    public final com.amazon.aps.iva.vo.e b;
    public final com.amazon.aps.iva.uo.f c;
    public final com.amazon.aps.iva.az.d d;
    public final com.amazon.aps.iva.ue0.a e;
    public final v<com.amazon.aps.iva.ez.g<List<com.amazon.aps.iva.wo.g>>> f;

    /* compiled from: WatchScreenAssetsViewModel.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.watchscreen.screen.assets.WatchScreenAssetsViewModelImpl$onAssetDownloadStateUpdated$1", f = "WatchScreenAssetsViewModel.kt", l = {68}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.i implements p<g0, com.amazon.aps.iva.ob0.d<? super q>, Object> {
        public int h;
        public final /* synthetic */ com.amazon.aps.iva.qg.b[] j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.amazon.aps.iva.qg.b[] bVarArr, com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(2, dVar);
            this.j = bVarArr;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new a(this.j, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super q> dVar) {
            return ((a) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                x.i0(obj);
                com.amazon.aps.iva.ue0.a aVar2 = n.this.e;
                List b0 = o.b0(this.j);
                this.h = 1;
                if (aVar2.g(b0, this) == aVar) {
                    return aVar;
                }
            }
            return q.a;
        }
    }

    public n(i0 i0Var, com.amazon.aps.iva.vo.e eVar, com.amazon.aps.iva.uo.g gVar) {
        super(new com.amazon.aps.iva.wy.j[0]);
        this.b = eVar;
        this.c = gVar;
        com.amazon.aps.iva.az.d c = com.amazon.aps.iva.xy.m.c((com.amazon.aps.iva.ve0.f) i0Var.b, w.D(this), new g.b(null), null, new m(this, null), 12);
        this.d = c;
        this.e = com.amazon.aps.iva.dg.b.c(0, null, 7);
        this.f = com.amazon.aps.iva.i5.j.b(com.amazon.aps.iva.xy.m.c(c, w.D(this), null, new k(this, null), new l(this, null), 10), w.D(this).getCoroutineContext());
        com.amazon.aps.iva.se0.i.d(w.D(this), null, null, new j(this, null), 3);
    }

    @Override // com.amazon.aps.iva.qg.a
    public final void G2(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "assetId");
    }

    public final com.amazon.aps.iva.hg.g P() {
        List list;
        Map map;
        Episode episode;
        com.amazon.aps.iva.vo.c V0 = V0();
        if (V0 == null || (list = V0.a) == null) {
            list = z.b;
        }
        com.amazon.aps.iva.vo.c V02 = V0();
        if (V02 == null || (map = V02.b) == null) {
            map = a0.b;
        }
        String str = null;
        if (list.isEmpty()) {
            return null;
        }
        String parentId = ((PlayableAsset) com.amazon.aps.iva.lb0.x.t0(list)).getParentId();
        Object v0 = com.amazon.aps.iva.lb0.x.v0(list);
        if (v0 instanceof Episode) {
            episode = (Episode) v0;
        } else {
            episode = null;
        }
        if (episode != null) {
            str = episode.getSeasonId();
        }
        return new com.amazon.aps.iva.hg.g(parentId, str, list, map);
    }

    @Override // com.amazon.aps.iva.so.i
    public final com.amazon.aps.iva.vo.c V0() {
        return (com.amazon.aps.iva.vo.c) com.amazon.aps.iva.xy.m.b(this.d);
    }

    @Override // com.amazon.aps.iva.so.i
    public final LiveData W() {
        return this.f;
    }

    @Override // com.amazon.aps.iva.qg.a
    public final void X6(com.amazon.aps.iva.qg.b... bVarArr) {
        com.amazon.aps.iva.yb0.j.f(bVarArr, "states");
        com.amazon.aps.iva.se0.i.d(w.D(this), null, null, new a(bVarArr, null), 3);
    }

    @Override // com.amazon.aps.iva.so.i
    public final void x4() {
        this.d.e(false);
    }
}
