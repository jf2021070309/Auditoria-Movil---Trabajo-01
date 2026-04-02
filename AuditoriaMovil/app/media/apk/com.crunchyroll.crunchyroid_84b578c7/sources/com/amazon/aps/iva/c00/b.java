package com.amazon.aps.iva.c00;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.m;
import com.amazon.aps.iva.se0.n;
import com.amazon.aps.iva.wv.k0;
import com.amazon.aps.iva.wv.l0;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.api.cms.model.streams.Streams;
import com.ellation.crunchyroll.downloading.InternalDownloadsManager;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.google.android.gms.cast.MediaError;
/* compiled from: StreamsInteractor.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.wy.i {
    public final k0 b;
    public final com.amazon.aps.iva.fg.c c;

    /* compiled from: StreamsInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.content.OfflineStreamsInteractorImpl", f = "StreamsInteractor.kt", l = {85, MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED}, m = "getPlaybackStreams")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public b h;
        public PlayableAsset i;
        public /* synthetic */ Object j;
        public int l;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return b.this.x1(null, false, this);
        }
    }

    /* compiled from: StreamsInteractor.kt */
    /* renamed from: com.amazon.aps.iva.c00.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0155b extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.fg.d, q> {
        public final /* synthetic */ m<com.amazon.aps.iva.kb0.j<Streams, ? extends com.amazon.aps.iva.fg.d>> h;
        public final /* synthetic */ Streams i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0155b(n nVar, Streams streams) {
            super(1);
            this.h = nVar;
            this.i = streams;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.fg.d dVar) {
            com.amazon.aps.iva.fg.d dVar2 = dVar;
            com.amazon.aps.iva.yb0.j.f(dVar2, "localVideoData");
            this.h.P(new com.amazon.aps.iva.kb0.j<>(this.i, dVar2), c.h);
            return q.a;
        }
    }

    public b(l0 l0Var, InternalDownloadsManager internalDownloadsManager) {
        com.amazon.aps.iva.yb0.j.f(internalDownloadsManager, "downloadsManager");
        this.b = l0Var;
        this.c = internalDownloadsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable m(com.ellation.crunchyroll.model.PlayableAsset r5, com.amazon.aps.iva.ob0.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.amazon.aps.iva.c00.d
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.aps.iva.c00.d r0 = (com.amazon.aps.iva.c00.d) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.c00.d r0 = new com.amazon.aps.iva.c00.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.ellation.crunchyroll.model.PlayableAsset r5 = r0.h
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            com.amazon.aps.iva.ab.x.i0(r6)
            java.lang.String r6 = r5.getId()
            r0.h = r5
            r0.k = r3
            com.amazon.aps.iva.wv.k0 r2 = r4.b
            java.lang.Object r6 = r2.readItem(r6, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            com.ellation.crunchyroll.api.cms.model.streams.Streams r6 = (com.ellation.crunchyroll.api.cms.model.streams.Streams) r6
            if (r6 == 0) goto L4a
            return r6
        L4a:
            com.amazon.aps.iva.c00.a r6 = new com.amazon.aps.iva.c00.a
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.c00.b.m(com.ellation.crunchyroll.model.PlayableAsset, com.amazon.aps.iva.ob0.d):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077 A[PHI: r7 
      PHI: (r7v6 java.lang.Object) = (r7v5 java.lang.Object), (r7v1 java.lang.Object) binds: [B:21:0x0074, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x1(com.ellation.crunchyroll.model.PlayableAsset r5, boolean r6, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.j<com.ellation.crunchyroll.api.cms.model.streams.Streams, ? extends com.amazon.aps.iva.fg.d>> r7) {
        /*
            r4 = this;
            boolean r6 = r7 instanceof com.amazon.aps.iva.c00.b.a
            if (r6 == 0) goto L13
            r6 = r7
            com.amazon.aps.iva.c00.b$a r6 = (com.amazon.aps.iva.c00.b.a) r6
            int r0 = r6.l
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.l = r0
            goto L18
        L13:
            com.amazon.aps.iva.c00.b$a r6 = new com.amazon.aps.iva.c00.b$a
            r6.<init>(r7)
        L18:
            java.lang.Object r7 = r6.j
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r6.l
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2a
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L77
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            com.ellation.crunchyroll.model.PlayableAsset r5 = r6.i
            com.amazon.aps.iva.c00.b r1 = r6.h
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L4b
        L3a:
            com.amazon.aps.iva.ab.x.i0(r7)
            r6.h = r4
            r6.i = r5
            r6.l = r3
            java.io.Serializable r7 = r4.m(r5, r6)
            if (r7 != r0) goto L4a
            return r0
        L4a:
            r1 = r4
        L4b:
            com.ellation.crunchyroll.api.cms.model.streams.Streams r7 = (com.ellation.crunchyroll.api.cms.model.streams.Streams) r7
            r6.h = r1
            r6.i = r5
            r6.getClass()
            r6.l = r2
            com.amazon.aps.iva.se0.n r2 = new com.amazon.aps.iva.se0.n
            com.amazon.aps.iva.ob0.d r6 = com.amazon.aps.iva.a60.b.s(r6)
            r2.<init>(r3, r6)
            r2.r()
            com.amazon.aps.iva.fg.c r6 = r1.c
            java.lang.String r5 = r5.getId()
            com.amazon.aps.iva.c00.b$b r1 = new com.amazon.aps.iva.c00.b$b
            r1.<init>(r2, r7)
            r6.n(r5, r1)
            java.lang.Object r7 = r2.q()
            if (r7 != r0) goto L77
            return r0
        L77:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.c00.b.x1(com.ellation.crunchyroll.model.PlayableAsset, boolean, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
