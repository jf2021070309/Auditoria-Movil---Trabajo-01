package com.amazon.aps.iva.di;

import com.amazon.aps.iva.i5.w;
import com.amazon.aps.iva.kb0.q;
import com.crunchyroll.music.featuredmusic.FeaturedMusicLayout;
import java.util.List;
/* compiled from: FeaturedMusicPresenter.kt */
/* loaded from: classes.dex */
public final class k extends com.amazon.aps.iva.wy.b<m> implements g {
    public final n b;

    /* compiled from: FeaturedMusicPresenter.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.ei.i>>, q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.ei.i>> gVar) {
            com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.ei.i>> gVar2 = gVar;
            k kVar = k.this;
            gVar2.c(new h(kVar));
            gVar2.e(new i(kVar.getView()));
            gVar2.b(new j(kVar));
            return q.a;
        }
    }

    /* compiled from: FeaturedMusicPresenter.kt */
    /* loaded from: classes.dex */
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

    public k(FeaturedMusicLayout featuredMusicLayout, n nVar) {
        super(featuredMusicLayout, new com.amazon.aps.iva.wy.j[0]);
        this.b = nVar;
    }

    @Override // com.amazon.aps.iva.di.g
    public final void V1(d dVar) {
        com.amazon.aps.iva.yb0.j.f(dVar, "input");
        this.b.x5(dVar);
    }

    @Override // com.amazon.aps.iva.di.g
    public final void b() {
        this.b.O3();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        this.b.P6().e(getView(), new b(new a()));
    }
}
