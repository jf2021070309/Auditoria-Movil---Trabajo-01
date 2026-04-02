package com.amazon.aps.iva.bw;

import android.annotation.SuppressLint;
import android.util.Pair;
import com.amazon.aps.iva.e.z;
import com.amazon.aps.iva.g6.x;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.g0;
import com.amazon.aps.iva.se0.j1;
import com.ellation.crunchyroll.api.cms.model.streams.Stream;
import com.ellation.crunchyroll.downloading.exoplayer.ExoPlayerLocalVideosManagerImpl;
import java.util.LinkedHashMap;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
/* compiled from: DashDrmLicenseManager.kt */
@SuppressLint({"UnsafeOptInUsageError"})
/* loaded from: classes2.dex */
public final class g implements e, g0 {
    public final com.amazon.aps.iva.pw.a b;
    public final com.amazon.aps.iva.bw.a c;
    public final OkHttpClient d;
    public final com.amazon.aps.iva.sv.c e;
    public final com.amazon.aps.iva.wu.a f;
    public final LinkedHashMap g = new LinkedHashMap();

    /* compiled from: DashDrmLicenseManager.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.drm.DashDrmLicenseManagerImpl", f = "DashDrmLicenseManager.kt", l = {176}, m = "getLicenseExpiration")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public x h;
        public /* synthetic */ Object i;
        public int k;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return g.this.g(null, this);
        }
    }

    /* compiled from: DashDrmLicenseManager.kt */
    /* loaded from: classes2.dex */
    public static final class b implements Call.Factory {
        public b() {
        }

        @Override // okhttp3.Call.Factory
        public final Call newCall(Request request) {
            com.amazon.aps.iva.yb0.j.f(request, "request");
            return g.this.d.newCall(request);
        }
    }

    /* compiled from: DashDrmLicenseManager.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.drm.DashDrmLicenseManagerImpl$getLicenseExpiration$licenseRemainingSec$1", f = "DashDrmLicenseManager.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.j<? extends Long, ? extends Long>>, Object> {
        public final /* synthetic */ x h;
        public final /* synthetic */ byte[] i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(x xVar, byte[] bArr, com.amazon.aps.iva.ob0.d<? super c> dVar) {
            super(2, dVar);
            this.h = xVar;
            this.i = bArr;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            return new c(this.h, this.i, dVar);
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.j<? extends Long, ? extends Long>> dVar) {
            return ((c) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            com.amazon.aps.iva.ab.x.i0(obj);
            Pair<Long, Long> c = this.h.c(this.i);
            com.amazon.aps.iva.yb0.j.e(c, "licenseHelper.getLicense…ionRemainingSec(keySetId)");
            return new com.amazon.aps.iva.kb0.j(c.first, c.second);
        }
    }

    /* compiled from: DashDrmLicenseManager.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.downloading.drm.DashDrmLicenseManagerImpl$renewLicense$2", f = "DashDrmLicenseManager.kt", l = {207}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends com.amazon.aps.iva.qb0.i implements com.amazon.aps.iva.xb0.p<g0, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.m6.m>, Object> {
        public int h;
        public /* synthetic */ Object i;
        public final /* synthetic */ com.amazon.aps.iva.m6.m k;
        public final /* synthetic */ byte[] l;

        /* compiled from: DashDrmLicenseManager.kt */
        /* loaded from: classes2.dex */
        public static final class a extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Stream, q> {
            public final /* synthetic */ g0 h;
            public final /* synthetic */ com.amazon.aps.iva.se0.m<com.amazon.aps.iva.m6.m> i;
            public final /* synthetic */ g j;
            public final /* synthetic */ com.amazon.aps.iva.m6.m k;
            public final /* synthetic */ byte[] l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(g0 g0Var, com.amazon.aps.iva.se0.n nVar, g gVar, com.amazon.aps.iva.m6.m mVar, byte[] bArr) {
                super(1);
                this.h = g0Var;
                this.i = nVar;
                this.j = gVar;
                this.k = mVar;
                this.l = bArr;
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final q invoke(Stream stream) {
                Stream stream2 = stream;
                com.amazon.aps.iva.yb0.j.f(stream2, "stream");
                com.amazon.aps.iva.se0.i.d(this.h, null, null, new h(this.i, this.j, this.k, this.l, stream2, null), 3);
                return q.a;
            }
        }

        /* compiled from: DashDrmLicenseManager.kt */
        /* loaded from: classes2.dex */
        public /* synthetic */ class b extends com.amazon.aps.iva.yb0.i implements com.amazon.aps.iva.xb0.l<Throwable, q> {
            public b(com.amazon.aps.iva.se0.n nVar) {
                super(1, nVar, com.amazon.aps.iva.ob0.f.class, "resumeWithException", "resumeWithException(Lkotlin/coroutines/Continuation;Ljava/lang/Throwable;)V", 1);
            }

            @Override // com.amazon.aps.iva.xb0.l
            public final q invoke(Throwable th) {
                Throwable th2 = th;
                com.amazon.aps.iva.yb0.j.f(th2, "p0");
                ((com.amazon.aps.iva.ob0.d) this.receiver).resumeWith(com.amazon.aps.iva.ab.x.H(th2));
                return q.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.amazon.aps.iva.m6.m mVar, byte[] bArr, com.amazon.aps.iva.ob0.d<? super d> dVar) {
            super(2, dVar);
            this.k = mVar;
            this.l = bArr;
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final com.amazon.aps.iva.ob0.d<q> create(Object obj, com.amazon.aps.iva.ob0.d<?> dVar) {
            d dVar2 = new d(this.k, this.l, dVar);
            dVar2.i = obj;
            return dVar2;
        }

        @Override // com.amazon.aps.iva.xb0.p
        public final Object invoke(g0 g0Var, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.m6.m> dVar) {
            return ((d) create(g0Var, dVar)).invokeSuspend(q.a);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            com.amazon.aps.iva.pb0.a aVar = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED;
            int i = this.h;
            if (i != 0) {
                if (i == 1) {
                    g0 g0Var = (g0) this.i;
                    com.amazon.aps.iva.ab.x.i0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                com.amazon.aps.iva.ab.x.i0(obj);
                g0 g0Var2 = (g0) this.i;
                byte[] bArr = this.l;
                this.i = g0Var2;
                g gVar = g.this;
                com.amazon.aps.iva.m6.m mVar = this.k;
                this.h = 1;
                com.amazon.aps.iva.se0.n nVar = new com.amazon.aps.iva.se0.n(1, com.amazon.aps.iva.a60.b.s(this));
                nVar.r();
                com.amazon.aps.iva.pw.a aVar2 = gVar.b;
                String str = mVar.b;
                com.amazon.aps.iva.yb0.j.e(str, "downloadRequest.id");
                aVar2.b(str, new a(g0Var2, nVar, gVar, mVar, bArr), new b(nVar));
                obj = nVar.q();
                if (obj == aVar) {
                    return aVar;
                }
            }
            return obj;
        }
    }

    public g(com.amazon.aps.iva.pw.a aVar, com.amazon.aps.iva.bw.a aVar2, OkHttpClient okHttpClient, com.amazon.aps.iva.sv.c cVar, com.amazon.aps.iva.wu.a aVar3) {
        this.b = aVar;
        this.c = aVar2;
        this.d = okHttpClient;
        this.e = cVar;
        this.f = aVar3;
    }

    @Override // com.amazon.aps.iva.bw.e
    public final void b() {
        LinkedHashMap linkedHashMap = this.g;
        for (j1 j1Var : linkedHashMap.values()) {
            j1Var.a(null);
        }
        linkedHashMap.clear();
    }

    @Override // com.amazon.aps.iva.bw.e
    public final void c(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadId");
        j1 j1Var = (j1) this.g.remove(str);
        if (j1Var != null) {
            j1Var.a(null);
        }
    }

    @Override // com.amazon.aps.iva.bw.e
    public final void d(long j, com.amazon.aps.iva.m6.m mVar, ExoPlayerLocalVideosManagerImpl.f fVar, ExoPlayerLocalVideosManagerImpl.g gVar) {
        com.amazon.aps.iva.se0.i.d(this, null, null, new i(fVar, gVar, mVar, this, j, null), 3);
    }

    @Override // com.amazon.aps.iva.bw.e
    public final void e(String str, String str2, String str3, ExoPlayerLocalVideosManagerImpl.h hVar, ExoPlayerLocalVideosManagerImpl.i iVar) {
        com.amazon.aps.iva.yb0.j.f(str, "downloadId");
        com.amazon.aps.iva.yb0.j.f(str2, "videoToken");
        com.amazon.aps.iva.yb0.j.f(str3, "manifestUrl");
        com.amazon.aps.iva.se0.i.d(this, this.f.a(), null, new f(hVar, iVar, this, str, str2, str3, null), 2);
    }

    @Override // com.amazon.aps.iva.bw.e
    public final Object f(com.amazon.aps.iva.m6.m mVar, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.m6.m> dVar) {
        byte[] bArr = mVar.f;
        if (bArr == null) {
            return mVar;
        }
        return z.p(new d(mVar, bArr, null), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    @Override // com.amazon.aps.iva.bw.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(byte[] r8, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.bw.l> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.amazon.aps.iva.bw.g.a
            if (r0 == 0) goto L13
            r0 = r9
            com.amazon.aps.iva.bw.g$a r0 = (com.amazon.aps.iva.bw.g.a) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.bw.g$a r0 = new com.amazon.aps.iva.bw.g$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.amazon.aps.iva.g6.x r8 = r0.h
            com.amazon.aps.iva.ab.x.i0(r9)     // Catch: com.amazon.aps.iva.g6.d.a -> L7a
            goto L76
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            com.amazon.aps.iva.ab.x.i0(r9)
            com.amazon.aps.iva.y5.b$a r9 = new com.amazon.aps.iva.y5.b$a
            com.amazon.aps.iva.bw.g$b r2 = new com.amazon.aps.iva.bw.g$b
            r2.<init>()
            r9.<init>(r2)
            com.amazon.aps.iva.g6.e$a r2 = new com.amazon.aps.iva.g6.e$a
            r2.<init>()
            android.os.Handler r4 = new android.os.Handler
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            r4.<init>(r5)
            com.amazon.aps.iva.bw.k r5 = new com.amazon.aps.iva.bw.k
            r5.<init>()
            r2.a(r4, r5)
            com.amazon.aps.iva.kb0.q r4 = com.amazon.aps.iva.kb0.q.a
            java.lang.String r4 = ""
            com.amazon.aps.iva.g6.x r9 = com.amazon.aps.iva.g6.x.d(r4, r9, r2)
            com.amazon.aps.iva.wu.a r2 = r7.f     // Catch: com.amazon.aps.iva.g6.d.a -> L79
            com.amazon.aps.iva.ye0.b r2 = r2.a()     // Catch: com.amazon.aps.iva.g6.d.a -> L79
            com.amazon.aps.iva.bw.g$c r4 = new com.amazon.aps.iva.bw.g$c     // Catch: com.amazon.aps.iva.g6.d.a -> L79
            r5 = 0
            r4.<init>(r9, r8, r5)     // Catch: com.amazon.aps.iva.g6.d.a -> L79
            r0.h = r9     // Catch: com.amazon.aps.iva.g6.d.a -> L79
            r0.k = r3     // Catch: com.amazon.aps.iva.g6.d.a -> L79
            java.lang.Object r8 = com.amazon.aps.iva.se0.i.g(r0, r2, r4)     // Catch: com.amazon.aps.iva.g6.d.a -> L79
            if (r8 != r1) goto L73
            return r1
        L73:
            r6 = r9
            r9 = r8
            r8 = r6
        L76:
            com.amazon.aps.iva.kb0.j r9 = (com.amazon.aps.iva.kb0.j) r9     // Catch: com.amazon.aps.iva.g6.d.a -> L7a
            goto L8c
        L79:
            r8 = r9
        L7a:
            java.lang.Long r9 = new java.lang.Long
            r0 = 0
            r9.<init>(r0)
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r0)
            com.amazon.aps.iva.kb0.j r0 = new com.amazon.aps.iva.kb0.j
            r0.<init>(r9, r2)
            r9 = r0
        L8c:
            android.os.HandlerThread r8 = r8.c
            r8.quit()
            com.amazon.aps.iva.bw.l r8 = new com.amazon.aps.iva.bw.l
            A r0 = r9.b
            java.lang.String r1 = "licenseRemainingSec.first"
            com.amazon.aps.iva.yb0.j.e(r0, r1)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            B r9 = r9.c
            java.lang.String r2 = "licenseRemainingSec.second"
            com.amazon.aps.iva.yb0.j.e(r9, r2)
            java.lang.Number r9 = (java.lang.Number) r9
            long r2 = r9.longValue()
            r8.<init>(r0, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.bw.g.g(byte[], com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.se0.g0
    public final com.amazon.aps.iva.ob0.g getCoroutineContext() {
        return this.e.getCoroutineContext();
    }
}
