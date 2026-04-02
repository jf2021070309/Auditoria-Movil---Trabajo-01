package com.amazon.aps.iva.ni;

import android.content.res.Configuration;
import com.crunchyroll.music.watch.screen.WatchMusicActivity;
import com.ellation.crunchyroll.model.music.MusicAsset;
import java.util.List;
/* compiled from: WatchMusicPresenter.kt */
/* loaded from: classes.dex */
public final class k extends com.amazon.aps.iva.wy.b<q> implements g {
    public final r b;
    public final com.amazon.aps.iva.k50.j c;
    public final com.amazon.aps.iva.gn.b d;
    public final com.amazon.aps.iva.k50.d e;
    public final com.amazon.aps.iva.cj.i f;
    public final com.amazon.aps.iva.ni.a g;
    public final com.amazon.aps.iva.yh.c h;
    public final com.amazon.aps.iva.ki.b i;

    /* compiled from: WatchMusicPresenter.kt */
    /* loaded from: classes.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends p>, com.amazon.aps.iva.kb0.q> {
        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends p> gVar) {
            com.amazon.aps.iva.ez.g<? extends p> gVar2 = gVar;
            k kVar = k.this;
            gVar2.c(new h(kVar));
            gVar2.e(new i(kVar));
            gVar2.b(new j(kVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: WatchMusicPresenter.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.ci.h>>, com.amazon.aps.iva.kb0.q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.ci.h>> gVar) {
            com.amazon.aps.iva.ez.g<? extends List<? extends com.amazon.aps.iva.ci.h>> gVar2 = gVar;
            k kVar = k.this;
            gVar2.c(new l(kVar));
            gVar2.e(new m(kVar));
            gVar2.b(new n(kVar));
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: WatchMusicPresenter.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class c extends com.amazon.aps.iva.yb0.a implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public c(r rVar) {
            super(0, rVar, r.class, "reload", "reload(Z)V", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            ((r) this.b).l0(false);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: WatchMusicPresenter.kt */
    /* loaded from: classes.dex */
    public static final class d implements com.amazon.aps.iva.i5.w, com.amazon.aps.iva.yb0.f {
        public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

        public d(com.amazon.aps.iva.xb0.l lVar) {
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

    public k(WatchMusicActivity watchMusicActivity, w wVar, com.amazon.aps.iva.k50.j jVar, com.amazon.aps.iva.gn.c cVar, o oVar, com.amazon.aps.iva.cj.i iVar, WatchMusicActivity watchMusicActivity2, com.amazon.aps.iva.yh.d dVar, com.amazon.aps.iva.ki.c cVar2) {
        super(watchMusicActivity, new com.amazon.aps.iva.wy.j[0]);
        this.b = wVar;
        this.c = jVar;
        this.d = cVar;
        this.e = oVar;
        this.f = iVar;
        this.g = watchMusicActivity2;
        this.h = dVar;
        this.i = cVar2;
    }

    @Override // com.amazon.aps.iva.cl.b
    public final void E0() {
        this.f.Q().e();
    }

    @Override // com.amazon.aps.iva.ni.g
    public final void G0(com.amazon.aps.iva.ci.h hVar) {
        String str;
        com.amazon.aps.iva.yb0.j.f(hVar, "asset");
        this.i.b();
        r rVar = this.b;
        MusicAsset musicAsset = (MusicAsset) rVar.a5().getValue();
        if (musicAsset != null) {
            str = musicAsset.getId();
        } else {
            str = null;
        }
        String str2 = hVar.a;
        boolean a2 = com.amazon.aps.iva.yb0.j.a(str2, str);
        com.amazon.aps.iva.cj.i iVar = this.f;
        if (a2) {
            iVar.Q().e();
            return;
        }
        iVar.Q().f();
        rVar.f3(str2, hVar.i);
    }

    @Override // com.amazon.aps.iva.ni.g
    public final void H() {
        this.b.l0(true);
    }

    @Override // com.amazon.aps.iva.ni.g
    public final void Q0() {
        this.b.i0();
    }

    @Override // com.amazon.aps.iva.ni.g
    public final void a() {
        if (!this.g.G()) {
            getView().closeScreen();
        }
    }

    @Override // com.amazon.aps.iva.ni.g
    public final void b() {
        this.b.l0(false);
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onConfigurationChanged(Configuration configuration) {
        getView().x8();
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        r rVar = this.b;
        rVar.E0().e(getView(), new d(new a()));
        rVar.W().e(getView(), new d(new b()));
        c cVar = new c(rVar);
        this.c.a(com.amazon.aps.iva.k50.k.h, cVar);
        getView().x8();
        this.f.U(getView().getLifecycle());
    }

    @Override // com.amazon.aps.iva.ni.g
    public final void z5(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "artistId");
        this.e.D1(new com.amazon.aps.iva.l50.a(str));
    }

    @Override // com.amazon.aps.iva.cl.b
    public final void f1() {
    }

    @Override // com.amazon.aps.iva.cl.b
    public final void h0() {
    }
}
