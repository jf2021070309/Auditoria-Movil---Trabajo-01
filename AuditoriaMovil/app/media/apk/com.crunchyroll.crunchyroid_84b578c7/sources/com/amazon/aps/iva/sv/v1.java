package com.amazon.aps.iva.sv;

import com.amazon.aps.iva.rw.a;
import com.amazon.aps.iva.tv.d;
import com.ellation.crunchyroll.api.cms.model.Season;
import com.ellation.crunchyroll.api.cms.model.streams.Streams;
import com.ellation.crunchyroll.model.Episode;
import com.ellation.crunchyroll.model.Movie;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.cast.MediaError;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
/* compiled from: DownloadsRepository.kt */
/* loaded from: classes2.dex */
public final class v1 implements u1 {
    public final com.amazon.aps.iva.wv.x b;
    public final com.amazon.aps.iva.wv.g c;
    public final com.amazon.aps.iva.wv.s d;
    public final com.amazon.aps.iva.wv.i0 e;
    public final com.amazon.aps.iva.wv.j f;
    public final com.amazon.aps.iva.wv.m g;
    public final com.amazon.aps.iva.wv.q h;
    public final com.amazon.aps.iva.wv.u i;
    public final com.amazon.aps.iva.wv.b0 j;
    public final com.amazon.aps.iva.kw.i k;
    public final com.amazon.aps.iva.wv.e0 l;
    public final com.amazon.aps.iva.wv.g0 m;
    public final com.amazon.aps.iva.wv.k0 n;
    public final com.amazon.aps.iva.wv.n0 o;
    public final com.amazon.aps.iva.wv.n0 p;
    public final com.amazon.aps.iva.wv.d q;
    public final com.amazon.aps.iva.wv.a r;
    public final com.amazon.aps.iva.ew.b s;
    public final com.amazon.aps.iva.wv.o t;
    public final com.amazon.aps.iva.xb0.a<Date> u;
    public com.amazon.aps.iva.xb0.l<? super String, com.amazon.aps.iva.kb0.q> v = y.h;

    /* compiled from: DownloadsRepository.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsRepositoryImpl", f = "DownloadsRepository.kt", l = {367, 368, 369, 370, 371, 372, 373, 374, 375, 376, 377, 378, 379}, m = "clear")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public v1 h;
        public /* synthetic */ Object i;
        public int k;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return v1.this.clear(this);
        }
    }

    /* compiled from: DownloadsRepository.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsRepositoryImpl", f = "DownloadsRepository.kt", l = {184, 185, 187, 188, 192, 193, 197, 206, 208}, m = "saveModels")
    /* loaded from: classes2.dex */
    public static final class a0 extends com.amazon.aps.iva.qb0.c {
        public v1 h;
        public com.amazon.aps.iva.sw.b i;
        public com.amazon.aps.iva.sw.b j;
        public /* synthetic */ Object k;
        public int m;

        public a0(com.amazon.aps.iva.ob0.d<? super a0> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.k = obj;
            this.m |= Integer.MIN_VALUE;
            return v1.this.w(null, this);
        }
    }

    /* compiled from: DownloadsRepository.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsRepositoryImpl", f = "DownloadsRepository.kt", l = {437, 438}, m = "deleteAllMovieListingsWithoutMovies")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.c {
        public v1 h;
        public Iterator i;
        public /* synthetic */ Object j;
        public int l;

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return v1.this.a(this);
        }
    }

    /* compiled from: DownloadsRepository.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsRepositoryImpl", f = "DownloadsRepository.kt", l = {214, 215, 218}, m = "saveStreams")
    /* loaded from: classes2.dex */
    public static final class b0 extends com.amazon.aps.iva.qb0.c {
        public v1 h;
        public Streams i;
        public /* synthetic */ Object j;
        public int l;

        public b0(com.amazon.aps.iva.ob0.d<? super b0> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return v1.this.k(null, null, this);
        }
    }

    /* compiled from: DownloadsRepository.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsRepositoryImpl", f = "DownloadsRepository.kt", l = {449, 450}, m = "deleteAllSeasonsWithoutEpisodes")
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.qb0.c {
        public v1 h;
        public Iterator i;
        public /* synthetic */ Object j;
        public int l;

        public c(com.amazon.aps.iva.ob0.d<? super c> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return v1.this.u(this);
        }
    }

    /* compiled from: DownloadsRepository.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsRepositoryImpl", f = "DownloadsRepository.kt", l = {386, 391}, m = "saveWatchProgress")
    /* loaded from: classes2.dex */
    public static final class c0 extends com.amazon.aps.iva.qb0.c {
        public Object h;
        public String i;
        public long j;
        public /* synthetic */ Object k;
        public int m;

        public c0(com.amazon.aps.iva.ob0.d<? super c0> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.k = obj;
            this.m |= Integer.MIN_VALUE;
            return v1.this.b(null, 0L, this);
        }
    }

    /* compiled from: DownloadsRepository.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsRepositoryImpl", f = "DownloadsRepository.kt", l = {443, 444}, m = "deleteAllSeriesWithoutSeasons")
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.qb0.c {
        public v1 h;
        public Iterator i;
        public /* synthetic */ Object j;
        public int l;

        public d(com.amazon.aps.iva.ob0.d<? super d> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return v1.this.o(this);
        }
    }

    /* compiled from: DownloadsRepository.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsRepositoryImpl", f = "DownloadsRepository.kt", l = {357, 358, 359, 360, 361, 362, 363}, m = "deleteAssets")
    /* loaded from: classes2.dex */
    public static final class e<A extends PlayableAsset> extends com.amazon.aps.iva.qb0.c {
        public v1 h;
        public List i;
        public /* synthetic */ Object j;
        public int l;

        public e(com.amazon.aps.iva.ob0.d<? super e> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return v1.this.i(null, this);
        }
    }

    /* compiled from: DownloadsRepository.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsRepositoryImpl", f = "DownloadsRepository.kt", l = {271, 272}, m = "deleteDownload")
    /* loaded from: classes2.dex */
    public static final class f extends com.amazon.aps.iva.qb0.c {
        public v1 h;
        public String i;
        public /* synthetic */ Object j;
        public int l;

        public f(com.amazon.aps.iva.ob0.d<? super f> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return v1.this.d(null, this);
        }
    }

    /* compiled from: DownloadsRepository.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsRepositoryImpl", f = "DownloadsRepository.kt", l = {455, 456, 457, 458, 459, 460, 461}, m = "deleteEpisode")
    /* loaded from: classes2.dex */
    public static final class g extends com.amazon.aps.iva.qb0.c {
        public v1 h;
        public Episode i;
        public /* synthetic */ Object j;
        public int l;

        public g(com.amazon.aps.iva.ob0.d<? super g> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return v1.this.l(null, this);
        }
    }

    /* compiled from: DownloadsRepository.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsRepositoryImpl", f = "DownloadsRepository.kt", l = {466, 467, 468, 469}, m = "deleteEpisodeData")
    /* loaded from: classes2.dex */
    public static final class h extends com.amazon.aps.iva.qb0.c {
        public v1 h;
        public Episode i;
        public /* synthetic */ Object j;
        public int l;

        public h(com.amazon.aps.iva.ob0.d<? super h> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return v1.this.m(null, this);
        }
    }

    /* compiled from: DownloadsRepository.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsRepositoryImpl", f = "DownloadsRepository.kt", l = {MediaError.DetailedErrorCode.HLS_NETWORK_KEY_LOAD, MediaError.DetailedErrorCode.HLS_NETWORK_INVALID_SEGMENT, 318}, m = "deleteEpisodes")
    /* loaded from: classes2.dex */
    public static final class i extends com.amazon.aps.iva.qb0.c {
        public v1 h;
        public List i;
        public com.amazon.aps.iva.xb0.l j;
        public Iterator k;
        public Episode l;
        public int m;
        public /* synthetic */ Object n;
        public int p;

        public i(com.amazon.aps.iva.ob0.d<? super i> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.n = obj;
            this.p |= Integer.MIN_VALUE;
            return v1.this.n(null, null, null, this);
        }
    }

    /* compiled from: DownloadsRepository.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsRepositoryImpl", f = "DownloadsRepository.kt", l = {501, 502, 503, 504, 505, 506, 507}, m = "deleteMovie")
    /* loaded from: classes2.dex */
    public static final class j extends com.amazon.aps.iva.qb0.c {
        public v1 h;
        public Movie i;
        public /* synthetic */ Object j;
        public int l;

        public j(com.amazon.aps.iva.ob0.d<? super j> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return v1.this.p(null, this);
        }
    }

    /* compiled from: DownloadsRepository.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsRepositoryImpl", f = "DownloadsRepository.kt", l = {AdRequest.MAX_CONTENT_URL_LENGTH, 513, 514, 515}, m = "deleteMovieData")
    /* loaded from: classes2.dex */
    public static final class k extends com.amazon.aps.iva.qb0.c {
        public v1 h;
        public Movie i;
        public /* synthetic */ Object j;
        public int l;

        public k(com.amazon.aps.iva.ob0.d<? super k> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return v1.this.y(null, this);
        }
    }

    /* compiled from: DownloadsRepository.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsRepositoryImpl", f = "DownloadsRepository.kt", l = {526, 527}, m = "deleteMovieListing")
    /* loaded from: classes2.dex */
    public static final class l extends com.amazon.aps.iva.qb0.c {
        public v1 h;
        public String i;
        public /* synthetic */ Object j;
        public int l;

        public l(com.amazon.aps.iva.ob0.d<? super l> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return v1.this.z(null, this);
        }
    }

    /* compiled from: DownloadsRepository.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsRepositoryImpl", f = "DownloadsRepository.kt", l = {519, 520, 521}, m = "deleteMovieListingIfNoMovies")
    /* loaded from: classes2.dex */
    public static final class m extends com.amazon.aps.iva.qb0.c {
        public v1 h;
        public String i;
        public /* synthetic */ Object j;
        public int l;

        public m(com.amazon.aps.iva.ob0.d<? super m> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return v1.this.B(null, this);
        }
    }

    /* compiled from: DownloadsRepository.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsRepositoryImpl", f = "DownloadsRepository.kt", l = {298, 299, 302}, m = "deleteMovies")
    /* loaded from: classes2.dex */
    public static final class n extends com.amazon.aps.iva.qb0.c {
        public v1 h;
        public List i;
        public com.amazon.aps.iva.xb0.l j;
        public Iterator k;
        public Movie l;
        public int m;
        public /* synthetic */ Object n;
        public int p;

        public n(com.amazon.aps.iva.ob0.d<? super n> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.n = obj;
            this.p |= Integer.MIN_VALUE;
            return v1.this.D(null, null, null, this);
        }
    }

    /* compiled from: DownloadsRepository.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsRepositoryImpl", f = "DownloadsRepository.kt", l = {479, 479}, m = "deleteSeason")
    /* loaded from: classes2.dex */
    public static final class o extends com.amazon.aps.iva.qb0.c {
        public v1 h;
        public /* synthetic */ Object i;
        public int k;

        public o(com.amazon.aps.iva.ob0.d<? super o> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return v1.this.F(null, this);
        }
    }

    /* compiled from: DownloadsRepository.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsRepositoryImpl", f = "DownloadsRepository.kt", l = {483, 484}, m = "deleteSeason")
    /* loaded from: classes2.dex */
    public static final class p extends com.amazon.aps.iva.qb0.c {
        public v1 h;
        public Season i;
        public /* synthetic */ Object j;
        public int l;

        public p(com.amazon.aps.iva.ob0.d<? super p> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return v1.this.E(null, this);
        }
    }

    /* compiled from: DownloadsRepository.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsRepositoryImpl", f = "DownloadsRepository.kt", l = {473, 474}, m = "deleteSeasonIfNoEpisodes")
    /* loaded from: classes2.dex */
    public static final class q extends com.amazon.aps.iva.qb0.c {
        public v1 h;
        public String i;
        public /* synthetic */ Object j;
        public int l;

        public q(com.amazon.aps.iva.ob0.d<? super q> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return v1.this.H(null, this);
        }
    }

    /* compiled from: DownloadsRepository.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsRepositoryImpl", f = "DownloadsRepository.kt", l = {494, 495, 496}, m = "deleteSeries")
    /* loaded from: classes2.dex */
    public static final class r extends com.amazon.aps.iva.qb0.c {
        public v1 h;
        public String i;
        public /* synthetic */ Object j;
        public int l;

        public r(com.amazon.aps.iva.ob0.d<? super r> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return v1.this.I(null, this);
        }
    }

    /* compiled from: DownloadsRepository.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsRepositoryImpl", f = "DownloadsRepository.kt", l = {488, 489}, m = "deleteSeriesIfNoSeasons")
    /* loaded from: classes2.dex */
    public static final class s extends com.amazon.aps.iva.qb0.c {
        public v1 h;
        public String i;
        public /* synthetic */ Object j;
        public int l;

        public s(com.amazon.aps.iva.ob0.d<? super s> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return v1.this.J(null, this);
        }
    }

    /* compiled from: DownloadsRepository.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsRepositoryImpl", f = "DownloadsRepository.kt", l = {261, 261}, m = "getAllAssetsIds")
    /* loaded from: classes2.dex */
    public static final class t extends com.amazon.aps.iva.qb0.c {
        public Object h;
        public /* synthetic */ Object i;
        public int k;

        public t(com.amazon.aps.iva.ob0.d<? super t> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return v1.this.j(this);
        }
    }

    /* compiled from: DownloadsRepository.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsRepositoryImpl", f = "DownloadsRepository.kt", l = {404, 404}, m = "getPlayableAsset")
    /* loaded from: classes2.dex */
    public static final class u extends com.amazon.aps.iva.qb0.c {
        public v1 h;
        public String i;
        public /* synthetic */ Object j;
        public int l;

        public u(com.amazon.aps.iva.ob0.d<? super u> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return v1.this.h(null, this);
        }
    }

    /* compiled from: DownloadsRepository.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsRepositoryImpl", f = "DownloadsRepository.kt", l = {425, 429}, m = "getPlayableAssets")
    /* loaded from: classes2.dex */
    public static final class v extends com.amazon.aps.iva.qb0.c {
        public v1 h;
        public String i;
        public /* synthetic */ Object j;
        public int l;

        public v(com.amazon.aps.iva.ob0.d<? super v> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return v1.this.v(null, this);
        }
    }

    /* compiled from: DownloadsRepository.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsRepositoryImpl", f = "DownloadsRepository.kt", l = {416, 421}, m = "getSeasonAssets")
    /* loaded from: classes2.dex */
    public static final class w extends com.amazon.aps.iva.qb0.c {
        public v1 h;
        public String i;
        public /* synthetic */ Object j;
        public int l;

        public w(com.amazon.aps.iva.ob0.d<? super w> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return v1.this.C(null, null, this);
        }
    }

    /* compiled from: DownloadsRepository.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsRepositoryImpl", f = "DownloadsRepository.kt", l = {265}, m = "getSyncQuality")
    /* loaded from: classes2.dex */
    public static final class x extends com.amazon.aps.iva.qb0.c {
        public /* synthetic */ Object h;
        public int j;

        public x(com.amazon.aps.iva.ob0.d<? super x> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            return v1.this.q(null, this);
        }
    }

    /* compiled from: DownloadsRepository.kt */
    /* loaded from: classes2.dex */
    public static final class y extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<String, com.amazon.aps.iva.kb0.q> {
        public static final y h = new y();

        public y() {
            super(1);
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final com.amazon.aps.iva.kb0.q invoke(String str) {
            com.amazon.aps.iva.yb0.j.f(str, "it");
            return com.amazon.aps.iva.kb0.q.a;
        }
    }

    /* compiled from: DownloadsRepository.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.DownloadsRepositoryImpl", f = "DownloadsRepository.kt", l = {224, 227, 231}, m = "saveElementsOrder")
    /* loaded from: classes2.dex */
    public static final class z extends com.amazon.aps.iva.qb0.c {
        public v1 h;
        public com.amazon.aps.iva.sw.b i;
        public /* synthetic */ Object j;
        public int l;

        public z(com.amazon.aps.iva.ob0.d<? super z> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return v1.this.K(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v1(com.amazon.aps.iva.wv.x xVar, com.amazon.aps.iva.wv.g gVar, com.amazon.aps.iva.wv.s sVar, com.amazon.aps.iva.wv.i0 i0Var, com.amazon.aps.iva.wv.j jVar, com.amazon.aps.iva.wv.m mVar, com.amazon.aps.iva.wv.q qVar, com.amazon.aps.iva.wv.u uVar, com.amazon.aps.iva.wv.b0 b0Var, com.amazon.aps.iva.kw.i iVar, com.amazon.aps.iva.wv.e0 e0Var, com.amazon.aps.iva.wv.g0 g0Var, com.amazon.aps.iva.wv.k0 k0Var, com.amazon.aps.iva.wv.n0 n0Var, com.amazon.aps.iva.wv.n0 n0Var2, com.amazon.aps.iva.wv.d dVar, com.amazon.aps.iva.wv.a aVar, com.amazon.aps.iva.ew.b bVar, com.amazon.aps.iva.wv.o oVar, com.amazon.aps.iva.xb0.a<? extends Date> aVar2) {
        this.b = xVar;
        this.c = gVar;
        this.d = sVar;
        this.e = i0Var;
        this.f = jVar;
        this.g = mVar;
        this.h = qVar;
        this.i = uVar;
        this.j = b0Var;
        this.k = iVar;
        this.l = e0Var;
        this.m = g0Var;
        this.n = k0Var;
        this.o = n0Var;
        this.p = n0Var2;
        this.q = dVar;
        this.r = aVar;
        this.s = bVar;
        this.t = oVar;
        this.u = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[RETURN] */
    @Override // com.amazon.aps.iva.sv.u1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(java.lang.String r6, com.ellation.crunchyroll.downloading.q.f r7, com.ellation.crunchyroll.downloading.q.g r8, com.amazon.aps.iva.ob0.d r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.amazon.aps.iva.sv.x1
            if (r0 == 0) goto L13
            r0 = r9
            com.amazon.aps.iva.sv.x1 r0 = (com.amazon.aps.iva.sv.x1) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            com.amazon.aps.iva.sv.x1 r0 = new com.amazon.aps.iva.sv.x1
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.k
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.m
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L63
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            com.amazon.aps.iva.xb0.l r8 = r0.j
            com.amazon.aps.iva.xb0.l r7 = r0.i
            com.amazon.aps.iva.sv.v1 r6 = r0.h
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L51
        L3c:
            com.amazon.aps.iva.ab.x.i0(r9)
            r0.h = r5
            r0.i = r7
            r0.j = r8
            r0.m = r4
            com.amazon.aps.iva.wv.j r9 = r5.f
            java.lang.Object r9 = r9.e(r6, r0)
            if (r9 != r1) goto L50
            return r1
        L50:
            r6 = r5
        L51:
            java.util.List r9 = (java.util.List) r9
            r2 = 0
            r0.h = r2
            r0.i = r2
            r0.j = r2
            r0.m = r3
            java.lang.Object r6 = r6.n(r9, r7, r8, r0)
            if (r6 != r1) goto L63
            return r1
        L63:
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.sv.v1.A(java.lang.String, com.ellation.crunchyroll.downloading.q$f, com.ellation.crunchyroll.downloading.q$g, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B(java.lang.String r7, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.amazon.aps.iva.sv.v1.m
            if (r0 == 0) goto L13
            r0 = r8
            com.amazon.aps.iva.sv.v1$m r0 = (com.amazon.aps.iva.sv.v1.m) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.sv.v1$m r0 = new com.amazon.aps.iva.sv.v1$m
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L45
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L7d
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.String r7 = r0.i
            com.amazon.aps.iva.sv.v1 r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L6d
        L3d:
            java.lang.String r7 = r0.i
            com.amazon.aps.iva.sv.v1 r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L58
        L45:
            com.amazon.aps.iva.ab.x.i0(r8)
            r0.h = r6
            r0.i = r7
            r0.l = r5
            com.amazon.aps.iva.wv.q r8 = r6.h
            java.lang.Object r8 = r8.c(r7, r0)
            if (r8 != r1) goto L57
            return r1
        L57:
            r2 = r6
        L58:
            java.util.List r8 = (java.util.List) r8
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L80
            r0.h = r2
            r0.i = r7
            r0.l = r4
            java.lang.Object r8 = r2.z(r7, r0)
            if (r8 != r1) goto L6d
            return r1
        L6d:
            com.amazon.aps.iva.wv.o r8 = r2.t
            r2 = 0
            r0.h = r2
            r0.i = r2
            r0.l = r3
            java.lang.Object r7 = r8.b(r7, r0)
            if (r7 != r1) goto L7d
            return r1
        L7d:
            com.amazon.aps.iva.kb0.q r7 = com.amazon.aps.iva.kb0.q.a
            return r7
        L80:
            com.amazon.aps.iva.kb0.q r7 = com.amazon.aps.iva.kb0.q.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.sv.v1.B(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d A[PHI: r8 
      PHI: (r8v8 java.lang.Object) = (r8v5 java.lang.Object), (r8v1 java.lang.Object) binds: [B:27:0x006a, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // com.amazon.aps.iva.sv.z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C(java.lang.String r6, java.lang.String r7, com.amazon.aps.iva.ob0.d<? super java.util.List<? extends com.ellation.crunchyroll.model.PlayableAsset>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.amazon.aps.iva.sv.v1.w
            if (r0 == 0) goto L13
            r0 = r8
            com.amazon.aps.iva.sv.v1$w r0 = (com.amazon.aps.iva.sv.v1.w) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.sv.v1$w r0 = new com.amazon.aps.iva.sv.v1$w
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L6d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r6 = r0.i
            com.amazon.aps.iva.sv.v1 r7 = r0.h
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L4f
        L3a:
            com.amazon.aps.iva.ab.x.i0(r8)
            if (r7 == 0) goto L5c
            r0.h = r5
            r0.i = r6
            r0.l = r4
            com.amazon.aps.iva.wv.j r8 = r5.f
            java.lang.Object r8 = r8.e(r7, r0)
            if (r8 != r1) goto L4e
            return r1
        L4e:
            r7 = r5
        L4f:
            java.util.List r8 = (java.util.List) r8
            r2 = r8
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r4
            if (r2 == 0) goto L5d
            return r8
        L5c:
            r7 = r5
        L5d:
            com.amazon.aps.iva.wv.q r7 = r7.h
            r8 = 0
            r0.h = r8
            r0.i = r8
            r0.l = r3
            java.lang.Object r8 = r7.c(r6, r0)
            if (r8 != r1) goto L6d
            return r1
        L6d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.sv.v1.C(java.lang.String, java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00e1 -> B:41:0x00e3). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00e7 -> B:43:0x00e8). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D(java.util.List<com.ellation.crunchyroll.model.Movie> r9, com.amazon.aps.iva.xb0.l<? super com.ellation.crunchyroll.model.PlayableAsset, com.amazon.aps.iva.kb0.q> r10, com.amazon.aps.iva.xb0.l<? super com.ellation.crunchyroll.model.PlayableAsset, com.amazon.aps.iva.kb0.q> r11, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r12) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.sv.v1.D(java.util.List, com.amazon.aps.iva.xb0.l, com.amazon.aps.iva.xb0.l, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E(com.ellation.crunchyroll.api.cms.model.Season r6, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.sv.v1.p
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.sv.v1$p r0 = (com.amazon.aps.iva.sv.v1.p) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.sv.v1$p r0 = new com.amazon.aps.iva.sv.v1$p
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L68
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            com.ellation.crunchyroll.api.cms.model.Season r6 = r0.i
            com.amazon.aps.iva.sv.v1 r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L56
        L3a:
            com.amazon.aps.iva.ab.x.i0(r7)
            java.lang.String r7 = "<this>"
            com.amazon.aps.iva.yb0.j.f(r6, r7)
            java.lang.String r7 = r6.getId()
            r0.h = r5
            r0.i = r6
            r0.l = r4
            com.amazon.aps.iva.wv.e0 r2 = r5.l
            java.lang.Object r7 = r2.deleteItem(r7, r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            r2 = r5
        L56:
            java.lang.String r6 = r6.getSeriesId()
            r7 = 0
            r0.h = r7
            r0.i = r7
            r0.l = r3
            java.lang.Object r6 = r2.J(r6, r0)
            if (r6 != r1) goto L68
            return r1
        L68:
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.sv.v1.E(com.ellation.crunchyroll.api.cms.model.Season, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F(java.lang.String r6, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.sv.v1.o
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.sv.v1$o r0 = (com.amazon.aps.iva.sv.v1.o) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.sv.v1$o r0 = new com.amazon.aps.iva.sv.v1$o
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L59
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            com.amazon.aps.iva.sv.v1 r6 = r0.h
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L49
        L38:
            com.amazon.aps.iva.ab.x.i0(r7)
            r0.h = r5
            r0.k = r4
            com.amazon.aps.iva.wv.e0 r7 = r5.l
            java.lang.Object r7 = r7.readItem(r6, r0)
            if (r7 != r1) goto L48
            return r1
        L48:
            r6 = r5
        L49:
            com.ellation.crunchyroll.api.cms.model.Season r7 = (com.ellation.crunchyroll.api.cms.model.Season) r7
            if (r7 == 0) goto L59
            r2 = 0
            r0.h = r2
            r0.k = r3
            java.lang.Object r6 = r6.E(r7, r0)
            if (r6 != r1) goto L59
            return r1
        L59:
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.sv.v1.F(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(java.lang.String r6, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.sv.v1.q
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.sv.v1$q r0 = (com.amazon.aps.iva.sv.v1.q) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.sv.v1$q r0 = new com.amazon.aps.iva.sv.v1$q
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L63
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r6 = r0.i
            com.amazon.aps.iva.sv.v1 r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L4d
        L3a:
            com.amazon.aps.iva.ab.x.i0(r7)
            r0.h = r5
            r0.i = r6
            r0.l = r4
            com.amazon.aps.iva.wv.j r7 = r5.f
            java.lang.Object r7 = r7.e(r6, r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            r2 = r5
        L4d:
            java.util.List r7 = (java.util.List) r7
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L66
            r7 = 0
            r0.h = r7
            r0.i = r7
            r0.l = r3
            java.lang.Object r6 = r2.F(r6, r0)
            if (r6 != r1) goto L63
            return r1
        L63:
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
            return r6
        L66:
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.sv.v1.H(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I(java.lang.String r7, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.amazon.aps.iva.sv.v1.r
            if (r0 == 0) goto L13
            r0 = r8
            com.amazon.aps.iva.sv.v1$r r0 = (com.amazon.aps.iva.sv.v1.r) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.sv.v1$r r0 = new com.amazon.aps.iva.sv.v1$r
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L49
            if (r2 == r5) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.String r7 = r0.i
            com.amazon.aps.iva.sv.v1 r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L7b
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            java.lang.String r7 = r0.i
            com.amazon.aps.iva.sv.v1 r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L6b
        L41:
            java.lang.String r7 = r0.i
            com.amazon.aps.iva.sv.v1 r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L5c
        L49:
            com.amazon.aps.iva.ab.x.i0(r8)
            r0.h = r6
            r0.i = r7
            r0.l = r5
            com.amazon.aps.iva.wv.i0 r8 = r6.e
            java.lang.Object r8 = r8.deleteItem(r7, r0)
            if (r8 != r1) goto L5b
            return r1
        L5b:
            r2 = r6
        L5c:
            com.amazon.aps.iva.wv.x r8 = r2.b
            r0.h = r2
            r0.i = r7
            r0.l = r4
            java.lang.Object r8 = r8.deleteItem(r7, r0)
            if (r8 != r1) goto L6b
            return r1
        L6b:
            com.amazon.aps.iva.wv.o r8 = r2.t
            r0.h = r2
            r0.i = r7
            r0.l = r3
            java.lang.Object r8 = r8.b(r7, r0)
            if (r8 != r1) goto L7a
            return r1
        L7a:
            r0 = r2
        L7b:
            com.amazon.aps.iva.xb0.l<? super java.lang.String, com.amazon.aps.iva.kb0.q> r8 = r0.v
            r8.invoke(r7)
            com.amazon.aps.iva.kb0.q r7 = com.amazon.aps.iva.kb0.q.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.sv.v1.I(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J(java.lang.String r6, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.sv.v1.s
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.sv.v1$s r0 = (com.amazon.aps.iva.sv.v1.s) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.sv.v1$s r0 = new com.amazon.aps.iva.sv.v1$s
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L63
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r6 = r0.i
            com.amazon.aps.iva.sv.v1 r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L4d
        L3a:
            com.amazon.aps.iva.ab.x.i0(r7)
            r0.h = r5
            r0.i = r6
            r0.l = r4
            com.amazon.aps.iva.wv.e0 r7 = r5.l
            java.lang.Object r7 = r7.c(r6, r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            r2 = r5
        L4d:
            java.util.List r7 = (java.util.List) r7
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L66
            r7 = 0
            r0.h = r7
            r0.i = r7
            r0.l = r3
            java.lang.Object r6 = r2.I(r6, r0)
            if (r6 != r1) goto L63
            return r1
        L63:
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
            return r6
        L66:
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.sv.v1.J(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K(com.amazon.aps.iva.sw.b r10, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.amazon.aps.iva.sv.v1.z
            if (r0 == 0) goto L13
            r0 = r11
            com.amazon.aps.iva.sv.v1$z r0 = (com.amazon.aps.iva.sv.v1.z) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.sv.v1$z r0 = new com.amazon.aps.iva.sv.v1$z
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            com.amazon.aps.iva.ab.x.i0(r11)
            goto Lab
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            com.amazon.aps.iva.sw.b r10 = r0.i
            com.amazon.aps.iva.sv.v1 r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r11)
            goto L8f
        L3f:
            com.amazon.aps.iva.sw.b r10 = r0.i
            com.amazon.aps.iva.sv.v1 r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r11)
            goto L69
        L47:
            com.amazon.aps.iva.ab.x.i0(r11)
            com.ellation.crunchyroll.api.cms.model.Season r11 = r10.d
            if (r11 == 0) goto L68
            com.amazon.aps.iva.wv.w r2 = new com.amazon.aps.iva.wv.w
            java.lang.String r11 = r11.getId()
            java.util.List<java.lang.String> r7 = r10.h
            r2.<init>(r11, r7)
            r0.h = r9
            r0.i = r10
            r0.l = r5
            com.amazon.aps.iva.wv.m r11 = r9.g
            java.lang.Object r11 = r11.saveItem(r2, r0)
            if (r11 != r1) goto L68
            return r1
        L68:
            r2 = r9
        L69:
            com.ellation.crunchyroll.model.PlayableAsset r11 = r10.b
            boolean r5 = r11 instanceof com.ellation.crunchyroll.model.Movie
            if (r5 == 0) goto L72
            com.ellation.crunchyroll.model.Movie r11 = (com.ellation.crunchyroll.model.Movie) r11
            goto L73
        L72:
            r11 = r6
        L73:
            if (r11 == 0) goto L8f
            com.amazon.aps.iva.wv.u r5 = r2.i
            com.amazon.aps.iva.wv.w r7 = new com.amazon.aps.iva.wv.w
            java.lang.String r11 = r11.getParentId()
            java.util.List<java.lang.String> r8 = r10.h
            r7.<init>(r11, r8)
            r0.h = r2
            r0.i = r10
            r0.l = r4
            java.lang.Object r11 = r5.saveItem(r7, r0)
            if (r11 != r1) goto L8f
            return r1
        L8f:
            com.amazon.aps.iva.wv.g0 r11 = r2.m
            com.amazon.aps.iva.wv.w r2 = new com.amazon.aps.iva.wv.w
            com.ellation.crunchyroll.model.ContentContainer r4 = r10.e
            java.lang.String r4 = r4.getId()
            java.util.List<java.lang.String> r10 = r10.i
            r2.<init>(r4, r10)
            r0.h = r6
            r0.i = r6
            r0.l = r3
            java.lang.Object r10 = r11.saveItem(r2, r0)
            if (r10 != r1) goto Lab
            return r1
        Lab:
            com.amazon.aps.iva.kb0.q r10 = com.amazon.aps.iva.kb0.q.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.sv.v1.K(com.amazon.aps.iva.sw.b, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    @Override // com.amazon.aps.iva.sv.z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.amazon.aps.iva.sv.v1.b
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.aps.iva.sv.v1$b r0 = (com.amazon.aps.iva.sv.v1.b) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.sv.v1$b r0 = new com.amazon.aps.iva.sv.v1$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.util.Iterator r2 = r0.i
            com.amazon.aps.iva.sv.v1 r4 = r0.h
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L54
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            com.amazon.aps.iva.sv.v1 r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r6)
            r4 = r2
            goto L4e
        L3d:
            com.amazon.aps.iva.ab.x.i0(r6)
            r0.h = r5
            r0.l = r4
            com.amazon.aps.iva.wv.s r6 = r5.d
            java.lang.Object r6 = r6.readAllKeys(r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            r4 = r5
        L4e:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r2 = r6.iterator()
        L54:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L6d
            java.lang.Object r6 = r2.next()
            java.lang.String r6 = (java.lang.String) r6
            r0.h = r4
            r0.i = r2
            r0.l = r3
            java.lang.Object r6 = r4.B(r6, r0)
            if (r6 != r1) goto L54
            return r1
        L6d:
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.sv.v1.a(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // com.amazon.aps.iva.mg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r9, long r10, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.ig.a> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.amazon.aps.iva.sv.v1.c0
            if (r0 == 0) goto L13
            r0 = r12
            com.amazon.aps.iva.sv.v1$c0 r0 = (com.amazon.aps.iva.sv.v1.c0) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            com.amazon.aps.iva.sv.v1$c0 r0 = new com.amazon.aps.iva.sv.v1$c0
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.k
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.m
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r9 = r0.h
            r3 = r9
            com.amazon.aps.iva.ig.a r3 = (com.amazon.aps.iva.ig.a) r3
            com.amazon.aps.iva.ab.x.i0(r12)
            goto L7c
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            long r10 = r0.j
            java.lang.String r9 = r0.i
            java.lang.Object r2 = r0.h
            com.amazon.aps.iva.sv.v1 r2 = (com.amazon.aps.iva.sv.v1) r2
            com.amazon.aps.iva.ab.x.i0(r12)
            goto L5d
        L44:
            com.amazon.aps.iva.ab.x.i0(r12)
            r6 = 0
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 <= 0) goto L7c
            r0.h = r8
            r0.i = r9
            r0.j = r10
            r0.m = r5
            java.lang.Object r12 = r8.h(r9, r0)
            if (r12 != r1) goto L5c
            return r1
        L5c:
            r2 = r8
        L5d:
            if (r12 == 0) goto L7c
            com.amazon.aps.iva.ig.a r12 = new com.amazon.aps.iva.ig.a
            com.amazon.aps.iva.xb0.a<java.util.Date> r5 = r2.u
            java.lang.Object r5 = r5.invoke()
            java.util.Date r5 = (java.util.Date) r5
            r12.<init>(r10, r9, r5)
            r0.h = r12
            r0.i = r3
            r0.m = r4
            com.amazon.aps.iva.wv.b0 r9 = r2.j
            java.lang.Object r9 = r9.saveItem(r12, r0)
            if (r9 != r1) goto L7b
            return r1
        L7b:
            r3 = r12
        L7c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.sv.v1.b(java.lang.String, long, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0108 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0160 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019d A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x015e -> B:50:0x0161). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0169 -> B:52:0x016a). Please submit an issue!!! */
    @Override // com.amazon.aps.iva.sv.u1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r10, com.ellation.crunchyroll.downloading.p.f r11, com.ellation.crunchyroll.downloading.p.g r12, com.amazon.aps.iva.ob0.d r13) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.sv.v1.c(java.lang.String, com.ellation.crunchyroll.downloading.p$f, com.ellation.crunchyroll.downloading.p$g, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0100 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013d A[RETURN] */
    @Override // com.amazon.aps.iva.sv.u1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object clear(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r5) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.sv.v1.clear(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058 A[RETURN] */
    @Override // com.amazon.aps.iva.sv.u1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r6, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.sv.v1.f
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.sv.v1$f r0 = (com.amazon.aps.iva.sv.v1.f) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.sv.v1$f r0 = new com.amazon.aps.iva.sv.v1$f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L59
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r6 = r0.i
            com.amazon.aps.iva.sv.v1 r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L4b
        L3a:
            com.amazon.aps.iva.ab.x.i0(r7)
            r0.h = r5
            r0.i = r6
            r0.l = r4
            java.lang.Object r7 = r5.l(r6, r0)
            if (r7 != r1) goto L4a
            return r1
        L4a:
            r2 = r5
        L4b:
            r7 = 0
            r0.h = r7
            r0.i = r7
            r0.l = r3
            java.lang.Object r6 = r2.p(r6, r0)
            if (r6 != r1) goto L59
            return r1
        L59:
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.sv.v1.d(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.sv.u1
    public final Object e(String str, com.amazon.aps.iva.wg.b bVar, a.C0685a c0685a) {
        Object saveItem = this.r.saveItem(new com.amazon.aps.iva.xv.a(str, bVar.getHeight()), c0685a);
        if (saveItem == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return saveItem;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }

    @Override // com.amazon.aps.iva.mg.a
    public final Object f(com.amazon.aps.iva.ig.a aVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        Object saveItem = this.k.saveItem(aVar, dVar);
        if (saveItem == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return saveItem;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }

    @Override // com.amazon.aps.iva.sv.z1
    public final Object getMovie(String str, com.amazon.aps.iva.ob0.d<? super Movie> dVar) {
        return this.h.readItem(str, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // com.amazon.aps.iva.sv.z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r6, com.amazon.aps.iva.ob0.d<? super com.ellation.crunchyroll.model.PlayableAsset> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.sv.v1.u
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.sv.v1$u r0 = (com.amazon.aps.iva.sv.v1.u) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.sv.v1$u r0 = new com.amazon.aps.iva.sv.v1$u
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L62
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r6 = r0.i
            com.amazon.aps.iva.sv.v1 r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L4d
        L3a:
            com.amazon.aps.iva.ab.x.i0(r7)
            r0.h = r5
            r0.i = r6
            r0.l = r4
            com.amazon.aps.iva.wv.j r7 = r5.f
            java.lang.Object r7 = r7.readItem(r6, r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            r2 = r5
        L4d:
            com.ellation.crunchyroll.model.Episode r7 = (com.ellation.crunchyroll.model.Episode) r7
            if (r7 == 0) goto L52
            goto L64
        L52:
            com.amazon.aps.iva.wv.q r7 = r2.h
            r2 = 0
            r0.h = r2
            r0.i = r2
            r0.l = r3
            java.lang.Object r7 = r7.readItem(r6, r0)
            if (r7 != r1) goto L62
            return r1
        L62:
            com.ellation.crunchyroll.model.PlayableAsset r7 = (com.ellation.crunchyroll.model.PlayableAsset) r7
        L64:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.sv.v1.h(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f2 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <A extends com.ellation.crunchyroll.model.PlayableAsset> java.lang.Object i(java.util.List<? extends A> r5, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r6) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.sv.v1.i(java.util.List, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    @Override // com.amazon.aps.iva.sv.z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(com.amazon.aps.iva.ob0.d<? super java.util.List<java.lang.String>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.sv.v1.t
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.sv.v1$t r0 = (com.amazon.aps.iva.sv.v1.t) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.sv.v1$t r0 = new com.amazon.aps.iva.sv.v1$t
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r0 = r0.h
            java.util.Collection r0 = (java.util.Collection) r0
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L61
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            java.lang.Object r2 = r0.h
            com.amazon.aps.iva.sv.v1 r2 = (com.amazon.aps.iva.sv.v1) r2
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L4f
        L3e:
            com.amazon.aps.iva.ab.x.i0(r7)
            r0.h = r6
            r0.k = r4
            com.amazon.aps.iva.wv.j r7 = r6.f
            java.lang.Object r7 = r7.readAllKeys(r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            r2 = r6
        L4f:
            java.util.Collection r7 = (java.util.Collection) r7
            com.amazon.aps.iva.wv.q r2 = r2.h
            r0.h = r7
            r0.k = r3
            java.lang.Object r0 = r2.readAllKeys(r0)
            if (r0 != r1) goto L5e
            return r1
        L5e:
            r5 = r0
            r0 = r7
            r7 = r5
        L61:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r7 = com.amazon.aps.iva.lb0.x.L0(r7, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.sv.v1.j(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076 A[RETURN] */
    @Override // com.amazon.aps.iva.sv.u1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(com.ellation.crunchyroll.model.PlayableAsset r7, com.ellation.crunchyroll.api.cms.model.streams.Streams r8, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.amazon.aps.iva.sv.v1.b0
            if (r0 == 0) goto L13
            r0 = r9
            com.amazon.aps.iva.sv.v1$b0 r0 = (com.amazon.aps.iva.sv.v1.b0) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.sv.v1$b0 r0 = new com.amazon.aps.iva.sv.v1$b0
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L35
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L77
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            com.ellation.crunchyroll.api.cms.model.streams.Streams r8 = r0.i
            com.amazon.aps.iva.sv.v1 r7 = r0.h
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L67
        L3d:
            com.amazon.aps.iva.ab.x.i0(r9)
            boolean r9 = r7 instanceof com.ellation.crunchyroll.model.Episode
            if (r9 == 0) goto L53
            r0.h = r6
            r0.i = r8
            r0.l = r5
            com.amazon.aps.iva.wv.j r9 = r6.f
            java.lang.Object r7 = r9.saveItem(r7, r0)
            if (r7 != r1) goto L66
            return r1
        L53:
            boolean r9 = r7 instanceof com.ellation.crunchyroll.model.Movie
            if (r9 == 0) goto L7a
            r0.h = r6
            r0.i = r8
            r0.l = r4
            com.amazon.aps.iva.wv.q r9 = r6.h
            java.lang.Object r7 = r9.saveItem(r7, r0)
            if (r7 != r1) goto L66
            return r1
        L66:
            r7 = r6
        L67:
            com.amazon.aps.iva.wv.k0 r7 = r7.n
            r9 = 0
            r0.h = r9
            r0.i = r9
            r0.l = r3
            java.lang.Object r7 = r7.saveItem(r8, r0)
            if (r7 != r1) goto L77
            return r1
        L77:
            com.amazon.aps.iva.kb0.q r7 = com.amazon.aps.iva.kb0.q.a
            return r7
        L7a:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            java.lang.String r7 = " not supported"
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.sv.v1.k(com.ellation.crunchyroll.model.PlayableAsset, com.ellation.crunchyroll.api.cms.model.streams.Streams, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e6 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r6, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r7) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.sv.v1.l(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(com.ellation.crunchyroll.model.Episode r8, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.amazon.aps.iva.sv.v1.h
            if (r0 == 0) goto L13
            r0 = r9
            com.amazon.aps.iva.sv.v1$h r0 = (com.amazon.aps.iva.sv.v1.h) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.sv.v1$h r0 = new com.amazon.aps.iva.sv.v1$h
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L51
            if (r2 == r6) goto L49
            if (r2 == r5) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            com.amazon.aps.iva.ab.x.i0(r9)
            goto La7
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            com.ellation.crunchyroll.model.Episode r8 = r0.i
            com.amazon.aps.iva.sv.v1 r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L93
        L41:
            com.ellation.crunchyroll.model.Episode r8 = r0.i
            com.amazon.aps.iva.sv.v1 r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L80
        L49:
            com.ellation.crunchyroll.model.Episode r8 = r0.i
            com.amazon.aps.iva.sv.v1 r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L6d
        L51:
            com.amazon.aps.iva.ab.x.i0(r9)
            java.lang.String r9 = "<this>"
            com.amazon.aps.iva.yb0.j.f(r8, r9)
            java.lang.String r9 = r8.getId()
            r0.h = r7
            r0.i = r8
            r0.l = r6
            com.amazon.aps.iva.wv.j r2 = r7.f
            java.lang.Object r9 = r2.deleteItem(r9, r0)
            if (r9 != r1) goto L6c
            return r1
        L6c:
            r2 = r7
        L6d:
            com.amazon.aps.iva.wv.k0 r9 = r2.n
            java.lang.String r6 = com.amazon.aps.iva.aq.j.r(r8)
            r0.h = r2
            r0.i = r8
            r0.l = r5
            java.lang.Object r9 = r9.deleteItem(r6, r0)
            if (r9 != r1) goto L80
            return r1
        L80:
            com.amazon.aps.iva.wv.b0 r9 = r2.j
            java.lang.String r5 = com.amazon.aps.iva.aq.j.r(r8)
            r0.h = r2
            r0.i = r8
            r0.l = r4
            java.lang.Object r9 = r9.deleteItem(r5, r0)
            if (r9 != r1) goto L93
            return r1
        L93:
            com.amazon.aps.iva.ew.b r9 = r2.s
            java.lang.String r8 = com.amazon.aps.iva.aq.j.r(r8)
            r2 = 0
            r0.h = r2
            r0.i = r2
            r0.l = r3
            java.lang.Object r8 = r9.deleteItem(r8, r0)
            if (r8 != r1) goto La7
            return r1
        La7:
            com.amazon.aps.iva.kb0.q r8 = com.amazon.aps.iva.kb0.q.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.sv.v1.m(com.ellation.crunchyroll.model.Episode, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00e1 -> B:41:0x00e3). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00e7 -> B:43:0x00e8). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.util.List<com.ellation.crunchyroll.model.Episode> r9, com.amazon.aps.iva.xb0.l<? super com.ellation.crunchyroll.model.Episode, com.amazon.aps.iva.kb0.q> r10, com.amazon.aps.iva.xb0.l<? super com.ellation.crunchyroll.model.Episode, com.amazon.aps.iva.kb0.q> r11, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r12) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.sv.v1.n(java.util.List, com.amazon.aps.iva.xb0.l, com.amazon.aps.iva.xb0.l, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    @Override // com.amazon.aps.iva.sv.z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.amazon.aps.iva.sv.v1.d
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.aps.iva.sv.v1$d r0 = (com.amazon.aps.iva.sv.v1.d) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.sv.v1$d r0 = new com.amazon.aps.iva.sv.v1$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.util.Iterator r2 = r0.i
            com.amazon.aps.iva.sv.v1 r4 = r0.h
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L54
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            com.amazon.aps.iva.sv.v1 r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r6)
            r4 = r2
            goto L4e
        L3d:
            com.amazon.aps.iva.ab.x.i0(r6)
            r0.h = r5
            r0.l = r4
            com.amazon.aps.iva.wv.i0 r6 = r5.e
            java.lang.Object r6 = r6.readAllKeys(r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            r4 = r5
        L4e:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r2 = r6.iterator()
        L54:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L6d
            java.lang.Object r6 = r2.next()
            java.lang.String r6 = (java.lang.String) r6
            r0.h = r4
            r0.i = r2
            r0.l = r3
            java.lang.Object r6 = r4.J(r6, r0)
            if (r6 != r1) goto L54
            return r1
        L6d:
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.sv.v1.o(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e6 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.String r6, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r7) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.sv.v1.p(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056 A[ORIG_RETURN, RETURN] */
    @Override // com.amazon.aps.iva.sv.z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(java.lang.String r5, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.wg.b> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.amazon.aps.iva.sv.v1.x
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.aps.iva.sv.v1$x r0 = (com.amazon.aps.iva.sv.v1.x) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.sv.v1$x r0 = new com.amazon.aps.iva.sv.v1$x
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            com.amazon.aps.iva.ab.x.i0(r6)
            r0.j = r3
            com.amazon.aps.iva.wv.a r6 = r4.r
            java.lang.Object r6 = r6.readItem(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            com.amazon.aps.iva.xv.a r6 = (com.amazon.aps.iva.xv.a) r6
            if (r6 == 0) goto L56
            int r5 = r6.b()
            com.amazon.aps.iva.rw.b$b r6 = com.amazon.aps.iva.rw.b.C0686b.g
            int r0 = r6.f
            if (r5 != r0) goto L4c
            goto L57
        L4c:
            com.amazon.aps.iva.rw.b$c r6 = com.amazon.aps.iva.rw.b.c.g
            int r0 = r6.f
            if (r5 != r0) goto L53
            goto L57
        L53:
            com.amazon.aps.iva.rw.b$a r6 = com.amazon.aps.iva.rw.b.a.g
            goto L57
        L56:
            r6 = 0
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.sv.v1.q(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0168 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    @Override // com.amazon.aps.iva.sv.z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable s(java.lang.String r20, com.amazon.aps.iva.ob0.d r21) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.sv.v1.s(java.lang.String, com.amazon.aps.iva.ob0.d):java.io.Serializable");
    }

    @Override // com.amazon.aps.iva.sv.z1
    public final Object t(com.amazon.aps.iva.qb0.c cVar) {
        return this.b.readAllItems(cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    @Override // com.amazon.aps.iva.sv.z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.amazon.aps.iva.sv.v1.c
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.aps.iva.sv.v1$c r0 = (com.amazon.aps.iva.sv.v1.c) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.sv.v1$c r0 = new com.amazon.aps.iva.sv.v1$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.util.Iterator r2 = r0.i
            com.amazon.aps.iva.sv.v1 r4 = r0.h
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L54
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            com.amazon.aps.iva.sv.v1 r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r6)
            r4 = r2
            goto L4e
        L3d:
            com.amazon.aps.iva.ab.x.i0(r6)
            r0.h = r5
            r0.l = r4
            com.amazon.aps.iva.wv.e0 r6 = r5.l
            java.lang.Object r6 = r6.readAllKeys(r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            r4 = r5
        L4e:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r2 = r6.iterator()
        L54:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L6d
            java.lang.Object r6 = r2.next()
            java.lang.String r6 = (java.lang.String) r6
            r0.h = r4
            r0.i = r2
            r0.l = r3
            java.lang.Object r6 = r4.H(r6, r0)
            if (r6 != r1) goto L54
            return r1
        L6d:
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.sv.v1.u(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    @Override // com.amazon.aps.iva.sv.z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.String r7, com.amazon.aps.iva.ob0.d<? super java.util.List<? extends com.ellation.crunchyroll.model.PlayableAsset>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.amazon.aps.iva.sv.v1.v
            if (r0 == 0) goto L13
            r0 = r8
            com.amazon.aps.iva.sv.v1$v r0 = (com.amazon.aps.iva.sv.v1.v) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.sv.v1$v r0 = new com.amazon.aps.iva.sv.v1$v
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L6a
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.String r7 = r0.i
            com.amazon.aps.iva.sv.v1 r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L4d
        L3a:
            com.amazon.aps.iva.ab.x.i0(r8)
            r0.h = r6
            r0.i = r7
            r0.l = r4
            com.amazon.aps.iva.wv.j r8 = r6.f
            java.io.Serializable r8 = r8.h(r7, r0)
            if (r8 != r1) goto L4c
            return r1
        L4c:
            r2 = r6
        L4d:
            java.util.List r8 = (java.util.List) r8
            r5 = r8
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            r4 = r4 ^ r5
            if (r4 == 0) goto L5a
            return r8
        L5a:
            com.amazon.aps.iva.wv.q r8 = r2.h
            r2 = 0
            r0.h = r2
            r0.i = r2
            r0.l = r3
            java.lang.Object r8 = r8.c(r7, r0)
            if (r8 != r1) goto L6a
            return r1
        L6a:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.sv.v1.v(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0157 A[RETURN] */
    @Override // com.amazon.aps.iva.sv.u1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(com.amazon.aps.iva.sw.b r11, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r12) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.sv.v1.w(com.amazon.aps.iva.sw.b, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.sv.z1
    public final Object x(String str, d.b bVar) {
        return this.n.readItem(str, bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(com.ellation.crunchyroll.model.Movie r8, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.amazon.aps.iva.sv.v1.k
            if (r0 == 0) goto L13
            r0 = r9
            com.amazon.aps.iva.sv.v1$k r0 = (com.amazon.aps.iva.sv.v1.k) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.sv.v1$k r0 = new com.amazon.aps.iva.sv.v1$k
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L51
            if (r2 == r6) goto L49
            if (r2 == r5) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            com.amazon.aps.iva.ab.x.i0(r9)
            goto La7
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            com.ellation.crunchyroll.model.Movie r8 = r0.i
            com.amazon.aps.iva.sv.v1 r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L93
        L41:
            com.ellation.crunchyroll.model.Movie r8 = r0.i
            com.amazon.aps.iva.sv.v1 r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L80
        L49:
            com.ellation.crunchyroll.model.Movie r8 = r0.i
            com.amazon.aps.iva.sv.v1 r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L6d
        L51:
            com.amazon.aps.iva.ab.x.i0(r9)
            java.lang.String r9 = "<this>"
            com.amazon.aps.iva.yb0.j.f(r8, r9)
            java.lang.String r9 = r8.getId()
            r0.h = r7
            r0.i = r8
            r0.l = r6
            com.amazon.aps.iva.wv.q r2 = r7.h
            java.lang.Object r9 = r2.deleteItem(r9, r0)
            if (r9 != r1) goto L6c
            return r1
        L6c:
            r2 = r7
        L6d:
            com.amazon.aps.iva.wv.k0 r9 = r2.n
            java.lang.String r6 = com.amazon.aps.iva.aq.j.r(r8)
            r0.h = r2
            r0.i = r8
            r0.l = r5
            java.lang.Object r9 = r9.deleteItem(r6, r0)
            if (r9 != r1) goto L80
            return r1
        L80:
            com.amazon.aps.iva.wv.b0 r9 = r2.j
            java.lang.String r5 = com.amazon.aps.iva.aq.j.r(r8)
            r0.h = r2
            r0.i = r8
            r0.l = r4
            java.lang.Object r9 = r9.deleteItem(r5, r0)
            if (r9 != r1) goto L93
            return r1
        L93:
            com.amazon.aps.iva.ew.b r9 = r2.s
            java.lang.String r8 = com.amazon.aps.iva.aq.j.r(r8)
            r2 = 0
            r0.h = r2
            r0.i = r2
            r0.l = r3
            java.lang.Object r8 = r9.deleteItem(r8, r0)
            if (r8 != r1) goto La7
            return r1
        La7:
            com.amazon.aps.iva.kb0.q r8 = com.amazon.aps.iva.kb0.q.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.sv.v1.y(com.ellation.crunchyroll.model.Movie, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(java.lang.String r6, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.sv.v1.l
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.sv.v1$l r0 = (com.amazon.aps.iva.sv.v1.l) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.sv.v1$l r0 = new com.amazon.aps.iva.sv.v1$l
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.String r6 = r0.i
            com.amazon.aps.iva.sv.v1 r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L61
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.String r6 = r0.i
            com.amazon.aps.iva.sv.v1 r2 = r0.h
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L51
        L3e:
            com.amazon.aps.iva.ab.x.i0(r7)
            r0.h = r5
            r0.i = r6
            r0.l = r4
            com.amazon.aps.iva.wv.s r7 = r5.d
            java.lang.Object r7 = r7.deleteItem(r6, r0)
            if (r7 != r1) goto L50
            return r1
        L50:
            r2 = r5
        L51:
            com.amazon.aps.iva.wv.x r7 = r2.b
            r0.h = r2
            r0.i = r6
            r0.l = r3
            java.lang.Object r7 = r7.deleteItem(r6, r0)
            if (r7 != r1) goto L60
            return r1
        L60:
            r0 = r2
        L61:
            com.amazon.aps.iva.xb0.l<? super java.lang.String, com.amazon.aps.iva.kb0.q> r7 = r0.v
            r7.invoke(r6)
            com.amazon.aps.iva.kb0.q r6 = com.amazon.aps.iva.kb0.q.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.sv.v1.z(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
