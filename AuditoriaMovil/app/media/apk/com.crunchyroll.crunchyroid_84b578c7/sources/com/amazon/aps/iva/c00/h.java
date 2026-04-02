package com.amazon.aps.iva.c00;

import com.amazon.aps.iva.cj.j0;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.se0.m;
import com.amazon.aps.iva.se0.n;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.api.cms.model.streams.Streams;
import com.ellation.crunchyroll.api.etp.playback.PlayService;
import com.ellation.crunchyroll.downloading.InternalDownloadsManager;
import com.ellation.crunchyroll.model.PlayableAsset;
import com.google.android.gms.cast.MediaError;
/* compiled from: StreamsInteractor.kt */
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.wy.i {
    public final com.amazon.aps.iva.fg.c b;
    public final PlayService c;
    public final j0 d;

    /* compiled from: StreamsInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.content.StreamsInteractorImpl", f = "StreamsInteractor.kt", l = {38, MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED}, m = "getPlaybackStreams")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public h h;
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
            return h.this.x1(null, false, this);
        }
    }

    /* compiled from: StreamsInteractor.kt */
    /* loaded from: classes2.dex */
    public static final class b extends l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.fg.d, q> {
        public final /* synthetic */ m<com.amazon.aps.iva.kb0.j<Streams, ? extends com.amazon.aps.iva.fg.d>> h;
        public final /* synthetic */ Streams i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n nVar, Streams streams) {
            super(1);
            this.h = nVar;
            this.i = streams;
        }

        @Override // com.amazon.aps.iva.xb0.l
        public final q invoke(com.amazon.aps.iva.fg.d dVar) {
            com.amazon.aps.iva.fg.d dVar2 = dVar;
            com.amazon.aps.iva.yb0.j.f(dVar2, "localVideoData");
            this.h.P(new com.amazon.aps.iva.kb0.j<>(this.i, dVar2), i.h);
            return q.a;
        }
    }

    public h(InternalDownloadsManager internalDownloadsManager, PlayService playService, com.amazon.aps.iva.cx.q qVar) {
        com.amazon.aps.iva.yb0.j.f(internalDownloadsManager, "downloadsManager");
        com.amazon.aps.iva.yb0.j.f(playService, "playService");
        this.b = internalDownloadsManager;
        this.c = playService;
        this.d = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable m(com.ellation.crunchyroll.model.PlayableAsset r12, boolean r13, com.amazon.aps.iva.ob0.d r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.amazon.aps.iva.c00.j
            if (r0 == 0) goto L13
            r0 = r14
            com.amazon.aps.iva.c00.j r0 = (com.amazon.aps.iva.c00.j) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.c00.j r0 = new com.amazon.aps.iva.c00.j
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.ellation.crunchyroll.model.PlayableAsset r12 = r0.h
            com.amazon.aps.iva.ab.x.i0(r14)
            goto L4b
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            com.amazon.aps.iva.ab.x.i0(r14)
            java.lang.String r14 = r12.getId()
            com.amazon.aps.iva.cj.j0 r2 = r11.d
            boolean r2 = r2.isEnabled()
            r0.h = r12
            r0.k = r3
            com.ellation.crunchyroll.api.etp.playback.PlayService r3 = r11.c
            java.lang.Object r14 = r3.getPlayStream(r14, r2, r13, r0)
            if (r14 != r1) goto L4b
            return r1
        L4b:
            com.ellation.crunchyroll.api.etp.playback.model.PlayResponse r14 = (com.ellation.crunchyroll.api.etp.playback.model.PlayResponse) r14
            java.lang.String r8 = r12.getId()
            com.ellation.crunchyroll.api.cms.model.streams.Stream r12 = new com.ellation.crunchyroll.api.cms.model.streams.Stream
            r1 = 0
            java.lang.String r2 = r14.getUrl()
            r3 = 0
            java.lang.String r4 = r14.getVideoToken()
            r5 = 0
            r6 = 21
            r7 = 0
            r0 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            com.amazon.aps.iva.kb0.j r13 = new com.amazon.aps.iva.kb0.j
            java.lang.String r0 = ""
            r13.<init>(r0, r12)
            java.util.Map r12 = com.amazon.aps.iva.aq.k.x(r13)
            com.amazon.aps.iva.kb0.j r13 = new com.amazon.aps.iva.kb0.j
            java.lang.String r0 = "drm_multitrack_text_dash"
            r13.<init>(r0, r12)
            java.util.Map r2 = com.amazon.aps.iva.aq.k.x(r13)
            java.util.Map r4 = r14.getSubtitles()
            java.util.Map r5 = r14.getCaptions()
            java.lang.String r12 = r14.getBifs()
            java.util.List r6 = com.amazon.aps.iva.ee0.f1.L(r12)
            com.ellation.crunchyroll.api.etp.playback.model.SessionState r7 = r14.getSession()
            com.ellation.crunchyroll.api.cms.model.streams.Streams r12 = new com.ellation.crunchyroll.api.cms.model.streams.Streams
            r9 = 5
            r10 = 0
            r0 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.c00.h.m(com.ellation.crunchyroll.model.PlayableAsset, boolean, com.amazon.aps.iva.ob0.d):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077 A[PHI: r8 
      PHI: (r8v6 java.lang.Object) = (r8v5 java.lang.Object), (r8v1 java.lang.Object) binds: [B:21:0x0074, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x1(com.ellation.crunchyroll.model.PlayableAsset r6, boolean r7, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.j<com.ellation.crunchyroll.api.cms.model.streams.Streams, ? extends com.amazon.aps.iva.fg.d>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.amazon.aps.iva.c00.h.a
            if (r0 == 0) goto L13
            r0 = r8
            com.amazon.aps.iva.c00.h$a r0 = (com.amazon.aps.iva.c00.h.a) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.c00.h$a r0 = new com.amazon.aps.iva.c00.h$a
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
            goto L77
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            com.ellation.crunchyroll.model.PlayableAsset r6 = r0.i
            com.amazon.aps.iva.c00.h r7 = r0.h
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L4b
        L3a:
            com.amazon.aps.iva.ab.x.i0(r8)
            r0.h = r5
            r0.i = r6
            r0.l = r4
            java.io.Serializable r8 = r5.m(r6, r7, r0)
            if (r8 != r1) goto L4a
            return r1
        L4a:
            r7 = r5
        L4b:
            com.ellation.crunchyroll.api.cms.model.streams.Streams r8 = (com.ellation.crunchyroll.api.cms.model.streams.Streams) r8
            r0.h = r7
            r0.i = r6
            r0.getClass()
            r0.l = r3
            com.amazon.aps.iva.se0.n r2 = new com.amazon.aps.iva.se0.n
            com.amazon.aps.iva.ob0.d r0 = com.amazon.aps.iva.a60.b.s(r0)
            r2.<init>(r4, r0)
            r2.r()
            com.amazon.aps.iva.fg.c r7 = r7.b
            java.lang.String r6 = r6.getId()
            com.amazon.aps.iva.c00.h$b r0 = new com.amazon.aps.iva.c00.h$b
            r0.<init>(r2, r8)
            r7.n(r6, r0)
            java.lang.Object r8 = r2.q()
            if (r8 != r1) goto L77
            return r1
        L77:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.c00.h.x1(com.ellation.crunchyroll.model.PlayableAsset, boolean, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
