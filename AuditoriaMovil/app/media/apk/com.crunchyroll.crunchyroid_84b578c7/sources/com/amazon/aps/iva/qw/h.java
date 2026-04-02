package com.amazon.aps.iva.qw;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.mf0.a;
import com.amazon.aps.iva.qw.g;
import com.amazon.aps.iva.se0.d0;
import com.amazon.aps.iva.sv.a2;
import com.amazon.aps.iva.sv.c2;
import com.amazon.aps.iva.wv.n0;
import com.ellation.crunchyroll.api.cms.model.streams.Streams;
import com.ellation.crunchyroll.api.model.Subtitle;
import com.ellation.crunchyroll.model.Episode;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.io.File;
import java.util.Collection;
/* compiled from: SubtitlesDownloader.kt */
/* loaded from: classes2.dex */
public final class h implements g {
    public final String a;
    public final n0 b;
    public final com.amazon.aps.iva.xb0.l<Streams, Collection<Subtitle>> c;
    public final a2<g.a> d;
    public final com.amazon.aps.iva.qw.b e;
    public final com.amazon.aps.iva.sv.c f;
    public final d0 g;

    /* compiled from: SubtitlesDownloader.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<g.a, q> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(g.a aVar) {
            g.a aVar2 = aVar;
            com.amazon.aps.iva.yb0.j.f(aVar2, "it");
            a.C0515a c0515a = com.amazon.aps.iva.mf0.a.a;
            c0515a.a("Cancelled " + aVar2.e, new Object[0]);
            return q.a;
        }
    }

    /* compiled from: SubtitlesDownloader.kt */
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<q> {
        public final /* synthetic */ com.amazon.aps.iva.qw.a h;
        public final /* synthetic */ g.a i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.amazon.aps.iva.qw.a aVar, g.a aVar2) {
            super(0);
            this.h = aVar;
            this.i = aVar2;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final q invoke() {
            this.h.a(this.i);
            return q.a;
        }
    }

    /* compiled from: SubtitlesDownloader.kt */
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Exception, q> {
        public final /* synthetic */ com.amazon.aps.iva.qw.a h;
        public final /* synthetic */ h i;
        public final /* synthetic */ PlayableAsset j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.amazon.aps.iva.qw.a aVar, h hVar, PlayableAsset playableAsset) {
            super(1);
            this.h = aVar;
            this.i = hVar;
            this.j = playableAsset;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(Exception exc) {
            Exception exc2 = exc;
            com.amazon.aps.iva.yb0.j.f(exc2, "throwable");
            this.h.b(exc2);
            PlayableAsset playableAsset = this.j;
            k kVar = new k(playableAsset);
            h hVar = this.i;
            hVar.d(kVar);
            hVar.c(playableAsset.getId());
            return q.a;
        }
    }

    public h(String str, com.amazon.aps.iva.wv.c cVar, com.amazon.aps.iva.xb0.l lVar, c2 c2Var, com.amazon.aps.iva.sv.d dVar, d0 d0Var) {
        com.amazon.aps.iva.qw.c cVar2 = com.amazon.aps.iva.qw.c.a;
        com.amazon.aps.iva.yb0.j.f(str, "downloadPath");
        com.amazon.aps.iva.yb0.j.f(lVar, "downloadingItems");
        this.a = str;
        this.b = cVar;
        this.c = lVar;
        this.d = c2Var;
        this.e = cVar2;
        this.f = dVar;
        this.g = d0Var;
    }

    @Override // com.amazon.aps.iva.qw.g
    public final void a() {
        this.d.a();
        com.amazon.aps.iva.mf0.a.a.a("Cancelled all", new Object[0]);
    }

    @Override // com.amazon.aps.iva.qw.g
    public final void b() {
        a();
        com.amazon.aps.iva.vb0.f.L(new File(this.a));
        com.amazon.aps.iva.mf0.a.a.a("Removed all", new Object[0]);
    }

    @Override // com.amazon.aps.iva.qw.g
    public final void c(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadId");
        com.amazon.aps.iva.vb0.f.L(new File(com.amazon.aps.iva.n4.a.a(new StringBuilder(), this.a, "/", str)));
        com.amazon.aps.iva.mf0.a.a.a("Removed ".concat(str), new Object[0]);
    }

    @Override // com.amazon.aps.iva.qw.g
    public final void d(com.amazon.aps.iva.xb0.l<? super g.a, Boolean> lVar) {
        this.d.b(lVar, a.h);
    }

    @Override // com.amazon.aps.iva.qw.g
    public final void e(PlayableAsset playableAsset, Streams streams, com.amazon.aps.iva.xb0.a<q> aVar, com.amazon.aps.iva.xb0.l<? super Throwable, q> lVar) {
        int i;
        int i2;
        Episode episode;
        com.amazon.aps.iva.yb0.j.f(playableAsset, "asset");
        com.amazon.aps.iva.yb0.j.f(streams, "streams");
        com.amazon.aps.iva.yb0.j.f(lVar, "failure");
        com.amazon.aps.iva.xb0.l<Streams, Collection<Subtitle>> lVar2 = this.c;
        Collection<Subtitle> invoke = lVar2.invoke(streams);
        if (invoke != null && (!invoke.isEmpty())) {
            Collection<Subtitle> invoke2 = lVar2.invoke(streams);
            if (invoke2 != null) {
                i = invoke2.size();
            } else {
                i = 0;
            }
            d a2 = this.e.a(i, new j(this, lVar, playableAsset, aVar), lVar);
            for (Subtitle subtitle : invoke) {
                if (!a2.c()) {
                    String url = subtitle.getUrl();
                    if (url != null) {
                        i2 = url.hashCode();
                    } else {
                        i2 = 0;
                    }
                    String valueOf = String.valueOf(i2);
                    File file = new File(com.amazon.aps.iva.n4.a.a(new StringBuilder(), this.a, "/", playableAsset.getId()), valueOf);
                    String path = file.getPath();
                    com.amazon.aps.iva.yb0.j.e(path, "file.path");
                    String format = subtitle.getFormat();
                    com.amazon.aps.iva.yb0.j.f(valueOf, "fileName");
                    com.amazon.aps.iva.yb0.j.f(format, "format");
                    String parentId = playableAsset.getParentId();
                    String str = null;
                    if (playableAsset instanceof Episode) {
                        episode = (Episode) playableAsset;
                    } else {
                        episode = null;
                    }
                    if (episode != null) {
                        str = episode.getSeasonId();
                    }
                    g.a aVar2 = new g.a(parentId, str, valueOf, path, playableAsset.getId(), format);
                    b bVar = new b(a2, aVar2);
                    c cVar = new c(a2, this, playableAsset);
                    if (file.exists()) {
                        bVar.invoke();
                    } else {
                        a2<g.a> a2Var = this.d;
                        String url2 = subtitle.getUrl();
                        com.amazon.aps.iva.yb0.j.c(url2);
                        a2Var.c(aVar2, url2, file, bVar, cVar);
                    }
                }
            }
            return;
        }
        aVar.invoke();
    }
}
