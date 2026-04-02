package com.ellation.crunchyroll.downloading;

import com.amazon.aps.iva.mf0.a;
import com.amazon.aps.iva.sv.a2;
import com.amazon.aps.iva.sv.b2;
import com.amazon.aps.iva.sv.c2;
import com.ellation.crunchyroll.api.cms.model.streams.Streams;
import com.ellation.crunchyroll.downloading.a;
import com.ellation.crunchyroll.model.Episode;
import com.ellation.crunchyroll.model.PlayableAsset;
import java.io.File;
/* compiled from: BifDownloader.kt */
/* loaded from: classes2.dex */
public final class b implements com.ellation.crunchyroll.downloading.a {
    public final String a;
    public final com.amazon.aps.iva.wv.d b;
    public final a2<a.C0962a> c;
    public final com.amazon.aps.iva.se0.g0 d;

    /* compiled from: BifDownloader.kt */
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<a.C0962a, com.amazon.aps.iva.kb0.q> {
        public static final a h = new a();

        public a() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(a.C0962a c0962a) {
            a.C0962a c0962a2 = c0962a;
            com.amazon.aps.iva.yb0.j.f(c0962a2, "it");
            a.C0515a c0515a = com.amazon.aps.iva.mf0.a.a;
            c0515a.a("Cancelled " + c0962a2.a, new Object[0]);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: BifDownloader.kt */
    /* renamed from: com.ellation.crunchyroll.downloading.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0963b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
        public final /* synthetic */ String i;
        public final /* synthetic */ PlayableAsset j;
        public final /* synthetic */ File k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0963b(String str, PlayableAsset playableAsset, File file) {
            super(0);
            this.i = str;
            this.j = playableAsset;
            this.k = file;
        }

        @Override // com.amazon.aps.iva.xb0.a
        public final com.amazon.aps.iva.kb0.q invoke() {
            b bVar = b.this;
            com.amazon.aps.iva.se0.i.d(bVar.d, null, null, new c(bVar, this.i, this.j, this.k, null), 3);
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    public b(String str, com.amazon.aps.iva.wv.e eVar, c2 c2Var, com.amazon.aps.iva.sv.d dVar) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadPath");
        this.a = str;
        this.b = eVar;
        this.c = c2Var;
        this.d = dVar;
    }

    @Override // com.ellation.crunchyroll.downloading.a
    public final void a() {
        this.c.a();
        com.amazon.aps.iva.mf0.a.a.a("Cancelled all", new Object[0]);
    }

    @Override // com.ellation.crunchyroll.downloading.a
    public final void b() {
        a();
        com.amazon.aps.iva.vb0.f.L(new File(this.a));
        com.amazon.aps.iva.mf0.a.a.a("Removed all", new Object[0]);
    }

    @Override // com.ellation.crunchyroll.downloading.a
    public final void c(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadId");
        com.amazon.aps.iva.vb0.f.L(new File(com.amazon.aps.iva.n4.a.a(new StringBuilder(), this.a, "/", str)));
        com.amazon.aps.iva.mf0.a.a.a("Removed ".concat(str), new Object[0]);
    }

    @Override // com.ellation.crunchyroll.downloading.a
    public final void d(com.amazon.aps.iva.xb0.l<? super a.C0962a, Boolean> lVar) {
        this.c.b(lVar, a.h);
    }

    @Override // com.ellation.crunchyroll.downloading.a
    public final void e(PlayableAsset playableAsset, Streams streams) {
        Episode episode;
        com.amazon.aps.iva.yb0.j.f(playableAsset, "asset");
        for (String str : streams.getBifs()) {
            String valueOf = String.valueOf(str.hashCode());
            File file = new File(com.amazon.aps.iva.n4.a.a(new StringBuilder(), this.a, "/", playableAsset.getId()), valueOf);
            if (!file.exists()) {
                a2<a.C0962a> a2Var = this.c;
                String id = playableAsset.getId();
                String parentId = playableAsset.getParentId();
                String str2 = null;
                if (playableAsset instanceof Episode) {
                    episode = (Episode) playableAsset;
                } else {
                    episode = null;
                }
                if (episode != null) {
                    str2 = episode.getSeasonId();
                }
                a2Var.c(new a.C0962a(id, parentId, str2), str, file, new C0963b(valueOf, playableAsset, file), b2.h);
            }
        }
    }
}
