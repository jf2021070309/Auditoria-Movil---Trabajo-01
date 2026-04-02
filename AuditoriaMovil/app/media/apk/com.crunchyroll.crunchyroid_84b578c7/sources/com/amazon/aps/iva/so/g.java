package com.amazon.aps.iva.so;

import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.x50.t;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.util.List;
/* compiled from: WatchScreenAssetsPresenter.kt */
/* loaded from: classes2.dex */
public final class g extends com.amazon.aps.iva.wy.b<h> implements com.amazon.aps.iva.kz.a {
    public final i b;
    public final boolean c;
    public final t d;
    public final com.amazon.aps.iva.so.b e;

    /* compiled from: WatchScreenAssetsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.wo.g>>, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.wo.g>> gVar) {
            com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.wo.g>> gVar2 = gVar;
            g gVar3 = g.this;
            gVar2.c(new d(gVar3));
            gVar2.e(new e(gVar3));
            gVar2.b(new f(gVar3));
            return q.a;
        }
    }

    /* compiled from: WatchScreenAssetsPresenter.kt */
    /* loaded from: classes2.dex */
    public static final class b implements w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public b(a aVar) {
            this.a = aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof w) || !(obj instanceof com.amazon.aps.iva.yb0.f)) {
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

    public g(com.amazon.aps.iva.so.b bVar, h hVar, n nVar, t tVar, boolean z) {
        super(hVar, new com.amazon.aps.iva.wy.j[0]);
        this.b = nVar;
        this.c = z;
        this.d = tVar;
        this.e = bVar;
    }

    @Override // com.amazon.aps.iva.kz.a
    public final void b4(com.amazon.aps.iva.kz.i iVar) {
    }

    @Override // com.amazon.aps.iva.kz.a
    public final void k0(com.amazon.aps.iva.kz.i iVar) {
        PlayableAsset b2;
        com.amazon.aps.iva.so.b bVar;
        com.amazon.aps.iva.vo.c V0 = this.b.V0();
        if (V0 != null && (b2 = V0.b(iVar.a)) != null && (bVar = this.e) != null) {
            bVar.N2(b2);
        }
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        this.b.W().e(getView(), new b(new a()));
    }
}
