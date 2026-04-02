package com.amazon.aps.iva.zh;

import com.amazon.aps.iva.yh.f;
import com.crunchyroll.music.artist.ArtistActivity;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.application.d;
import com.ellation.crunchyroll.ui.duration.DurationFormatter;
/* compiled from: ArtistModule.kt */
/* loaded from: classes.dex */
public final class k implements j {
    public static final /* synthetic */ com.amazon.aps.iva.fc0.l<Object>[] h = {com.amazon.aps.iva.k.q.a(k.class, "viewModel", "getViewModel()Lcom/crunchyroll/music/artist/ArtistViewModelImpl;", 0)};
    public final ArtistActivity a;
    public final com.amazon.aps.iva.at.f b;
    public final i c;
    public final com.amazon.aps.iva.ez.a d;
    public final com.amazon.aps.iva.gn.c e;
    public final com.amazon.aps.iva.kb0.m f;
    public final com.amazon.aps.iva.ci.e g;

    /* compiled from: ArtistModule.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.a<Boolean> {
        public a(com.amazon.aps.iva.yh.i iVar) {
            super(0, iVar, com.amazon.aps.iva.yh.e.class, "isUserPremium", "isUserPremium()Z", 0);
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final Boolean invoke() {
            return Boolean.valueOf(((com.amazon.aps.iva.yh.e) this.receiver).b());
        }
    }

    /* compiled from: ArtistModule.kt */
    /* loaded from: classes.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ci.h, com.amazon.aps.iva.kb0.q> {
        public b() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.ci.h hVar) {
            com.amazon.aps.iva.ci.h hVar2 = hVar;
            com.amazon.aps.iva.yb0.j.f(hVar2, "it");
            com.amazon.aps.iva.hi.a aVar = f.a.b;
            if (aVar != null) {
                aVar.d(k.this.a, new com.amazon.aps.iva.l50.c(hVar2.a, hVar2.i));
                return com.amazon.aps.iva.kb0.q.a;
            }
            com.amazon.aps.iva.yb0.j.m("watchMusicScreenRouter");
            throw null;
        }
    }

    /* compiled from: ArtistModule.kt */
    /* loaded from: classes.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.ci.h, com.amazon.aps.iva.gi.f> {
        public static final c h = new c();

        public c() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.gi.f invoke(com.amazon.aps.iva.ci.h hVar) {
            com.amazon.aps.iva.ci.h hVar2 = hVar;
            com.amazon.aps.iva.yb0.j.f(hVar2, "it");
            String str = hVar2.a;
            String str2 = hVar2.j;
            com.amazon.aps.iva.x50.t tVar = hVar2.i;
            String str3 = hVar2.b;
            String str4 = hVar2.k;
            if (str4 == null) {
                str4 = "";
            }
            return new com.amazon.aps.iva.gi.f(str, str2, tVar, str3, str4);
        }
    }

    /* compiled from: ArtistModule.kt */
    /* loaded from: classes.dex */
    public static final class d extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<l> {
        public final /* synthetic */ com.amazon.aps.iva.l50.a i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.amazon.aps.iva.l50.a aVar) {
            super(0);
            this.i = aVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final l invoke() {
            k kVar = k.this;
            ArtistActivity artistActivity = kVar.a;
            w wVar = (w) kVar.d.getValue(kVar, k.h[0]);
            com.ellation.crunchyroll.application.d a = d.a.a();
            com.amazon.aps.iva.yh.i iVar = f.a.a;
            if (iVar != null) {
                com.amazon.aps.iva.n60.b invoke = iVar.j().invoke();
                com.amazon.aps.iva.rv.e n = com.amazon.aps.iva.aq.k.n(kVar.a);
                com.amazon.aps.iva.yh.i iVar2 = f.a.a;
                if (iVar2 != null) {
                    com.amazon.aps.iva.bi.a f = iVar2.f();
                    com.amazon.aps.iva.ds.c cVar = com.amazon.aps.iva.ds.c.b;
                    com.amazon.aps.iva.l50.a aVar = this.i;
                    com.amazon.aps.iva.yb0.j.f(aVar, "input");
                    com.amazon.aps.iva.zh.b bVar = com.amazon.aps.iva.zh.b.h;
                    com.amazon.aps.iva.yb0.j.f(bVar, "createTimer");
                    com.amazon.aps.iva.zh.d dVar = new com.amazon.aps.iva.zh.d(aVar, cVar, bVar);
                    com.amazon.aps.iva.yb0.j.f(artistActivity, "view");
                    com.amazon.aps.iva.yb0.j.f(a, "appLifecycle");
                    com.amazon.aps.iva.yb0.j.f(invoke, "reloadDebouncer");
                    com.amazon.aps.iva.gn.c cVar2 = kVar.e;
                    com.amazon.aps.iva.yb0.j.f(cVar2, "shareComponent");
                    com.amazon.aps.iva.yb0.j.f(f, "browseMusicConfig");
                    return new m(artistActivity, wVar, a, invoke, n, cVar2, f, dVar);
                }
                com.amazon.aps.iva.yb0.j.m("dependencies");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
    }

    /* compiled from: ViewModelFactory.kt */
    /* loaded from: classes.dex */
    public static final class e extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<androidx.fragment.app.h> {
        public final /* synthetic */ androidx.fragment.app.h h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(androidx.fragment.app.h hVar) {
            super(0);
            this.h = hVar;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final androidx.fragment.app.h invoke() {
            return this.h;
        }
    }

    /* compiled from: ArtistModule.kt */
    /* loaded from: classes.dex */
    public static final class f extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<androidx.lifecycle.p, w> {
        public f() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final w invoke(androidx.lifecycle.p pVar) {
            com.amazon.aps.iva.yb0.j.f(pVar, "it");
            k kVar = k.this;
            i iVar = kVar.c;
            DurationFormatter.Companion companion = DurationFormatter.Companion;
            ArtistActivity artistActivity = kVar.a;
            DurationFormatter create = companion.create(artistActivity);
            com.amazon.aps.iva.yb0.j.f(artistActivity, "context");
            com.amazon.aps.iva.yb0.j.f(create, "durationFormatter");
            return new w(iVar, kVar.b, new g(artistActivity, create), new com.amazon.aps.iva.yh.d(new com.amazon.aps.iva.yh.b(artistActivity)));
        }
    }

    public k(ArtistActivity artistActivity, com.amazon.aps.iva.l50.a aVar) {
        this.a = artistActivity;
        com.amazon.aps.iva.yh.i iVar = f.a.a;
        if (iVar != null) {
            this.b = new com.amazon.aps.iva.at.f(new a(iVar));
            com.amazon.aps.iva.yh.i iVar2 = f.a.a;
            if (iVar2 != null) {
                EtpContentService etpContentService = iVar2.getEtpContentService();
                com.amazon.aps.iva.yb0.j.f(etpContentService, "etpContentService");
                this.c = new i(etpContentService, aVar);
                this.d = new com.amazon.aps.iva.ez.a(w.class, new e(artistActivity), new f());
                com.amazon.aps.iva.yh.i iVar3 = f.a.a;
                if (iVar3 != null) {
                    com.amazon.aps.iva.gn.c i = iVar3.a.i(artistActivity);
                    this.e = i;
                    this.f = com.amazon.aps.iva.kb0.f.b(new d(aVar));
                    b bVar = new b();
                    this.g = new com.amazon.aps.iva.ci.e(DurationFormatter.Companion.create(artistActivity), new com.amazon.aps.iva.gi.b(c.h, i), bVar, com.amazon.aps.iva.aq.k.n(artistActivity).c());
                    return;
                }
                com.amazon.aps.iva.yb0.j.m("dependencies");
                throw null;
            }
            com.amazon.aps.iva.yb0.j.m("dependencies");
            throw null;
        }
        com.amazon.aps.iva.yb0.j.m("dependencies");
        throw null;
    }

    @Override // com.amazon.aps.iva.zh.j
    public final com.amazon.aps.iva.ci.e a() {
        return this.g;
    }

    @Override // com.amazon.aps.iva.zh.j
    public final l getPresenter() {
        return (l) this.f.getValue();
    }
}
