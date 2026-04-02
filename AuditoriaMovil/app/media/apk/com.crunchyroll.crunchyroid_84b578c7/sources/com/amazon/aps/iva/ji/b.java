package com.amazon.aps.iva.ji;

import com.amazon.aps.iva.lb0.z;
import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.qb0.e;
import com.amazon.aps.iva.x50.t;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.model.music.MusicAsset;
import java.util.List;
/* compiled from: WatchMusicInteractor.kt */
/* loaded from: classes.dex */
public final class b extends com.amazon.aps.iva.wy.a implements com.amazon.aps.iva.ji.a {
    public final EtpContentService b;
    public List<? extends MusicAsset> c = z.b;

    /* compiled from: WatchMusicInteractor.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.MUSIC_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.CONCERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    /* compiled from: WatchMusicInteractor.kt */
    @e(c = "com.crunchyroll.music.watch.WatchMusicInteractorImpl", f = "WatchMusicInteractor.kt", l = {41, 42}, m = "getMusicAssetsByArtist")
    /* renamed from: com.amazon.aps.iva.ji.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0418b extends com.amazon.aps.iva.qb0.c {
        public b h;
        public /* synthetic */ Object i;
        public int k;

        public C0418b(d<? super C0418b> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return b.this.F1(null, null, this);
        }
    }

    public b(EtpContentService etpContentService) {
        this.b = etpContentService;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    @Override // com.amazon.aps.iva.ji.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F1(java.lang.String r6, com.amazon.aps.iva.x50.t r7, com.amazon.aps.iva.ob0.d<? super java.util.List<? extends com.ellation.crunchyroll.model.music.MusicAsset>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.amazon.aps.iva.ji.b.C0418b
            if (r0 == 0) goto L13
            r0 = r8
            com.amazon.aps.iva.ji.b$b r0 = (com.amazon.aps.iva.ji.b.C0418b) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.ji.b$b r0 = new com.amazon.aps.iva.ji.b$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            com.amazon.aps.iva.ji.b r6 = r0.h
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L61
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            com.amazon.aps.iva.ji.b r6 = r0.h
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L8b
        L3a:
            com.amazon.aps.iva.ab.x.i0(r8)
            java.util.List<? extends com.ellation.crunchyroll.model.music.MusicAsset> r8 = r5.c
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r2 = r8.isEmpty()
            if (r2 == 0) goto L9c
            int[] r8 = com.amazon.aps.iva.ji.b.a.a
            int r2 = r7.ordinal()
            r8 = r8[r2]
            com.ellation.crunchyroll.api.etp.content.EtpContentService r2 = r5.b
            if (r8 == r4) goto L7f
            if (r8 != r3) goto L68
            r0.h = r5
            r0.k = r3
            java.lang.Object r8 = r2.getArtistMusicConcerts(r6, r0)
            if (r8 != r1) goto L60
            return r1
        L60:
            r6 = r5
        L61:
            com.ellation.crunchyroll.api.etp.content.ContentApiResponse r8 = (com.ellation.crunchyroll.api.etp.content.ContentApiResponse) r8
            java.util.List r7 = r8.getData()
            goto L91
        L68:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            java.lang.String r7 = " not supported"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r6.<init>(r7)
            throw r6
        L7f:
            r0.h = r5
            r0.k = r4
            java.lang.Object r8 = r2.getArtistMusicVideos(r6, r0)
            if (r8 != r1) goto L8a
            return r1
        L8a:
            r6 = r5
        L8b:
            com.ellation.crunchyroll.api.etp.content.ContentApiResponse r8 = (com.ellation.crunchyroll.api.etp.content.ContentApiResponse) r8
            java.util.List r7 = r8.getData()
        L91:
            r8 = r7
            r6.getClass()
            java.lang.String r7 = "<set-?>"
            com.amazon.aps.iva.yb0.j.f(r8, r7)
            r6.c = r8
        L9c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ji.b.F1(java.lang.String, com.amazon.aps.iva.x50.t, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    @Override // com.amazon.aps.iva.ji.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable v0(java.lang.String r7, com.amazon.aps.iva.x50.t r8, com.amazon.aps.iva.ob0.d r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.amazon.aps.iva.ji.c
            if (r0 == 0) goto L13
            r0 = r9
            com.amazon.aps.iva.ji.c r0 = (com.amazon.aps.iva.ji.c) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.ji.c r0 = new com.amazon.aps.iva.ji.c
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L75
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L98
        L36:
            com.amazon.aps.iva.ab.x.i0(r9)
            java.util.List<? extends com.ellation.crunchyroll.model.music.MusicAsset> r9 = r6.c
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L41:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L59
            java.lang.Object r2 = r9.next()
            r5 = r2
            com.ellation.crunchyroll.model.music.MusicAsset r5 = (com.ellation.crunchyroll.model.music.MusicAsset) r5
            java.lang.String r5 = r5.getId()
            boolean r5 = com.amazon.aps.iva.yb0.j.a(r5, r7)
            if (r5 == 0) goto L41
            goto L5a
        L59:
            r2 = 0
        L5a:
            com.ellation.crunchyroll.model.music.MusicAsset r2 = (com.ellation.crunchyroll.model.music.MusicAsset) r2
            if (r2 != 0) goto La5
            int[] r9 = com.amazon.aps.iva.ji.b.a.a
            int r2 = r8.ordinal()
            r9 = r9[r2]
            com.ellation.crunchyroll.api.etp.content.EtpContentService r2 = r6.b
            if (r9 == r4) goto L8f
            if (r9 != r3) goto L78
            r0.j = r3
            java.lang.Object r9 = r2.getMusicConcerts(r7, r0)
            if (r9 != r1) goto L75
            return r1
        L75:
            com.ellation.crunchyroll.api.etp.content.ContentApiResponse r9 = (com.ellation.crunchyroll.api.etp.content.ContentApiResponse) r9
            goto L9a
        L78:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            java.lang.String r8 = " not supported"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.<init>(r8)
            throw r7
        L8f:
            r0.j = r4
            java.lang.Object r9 = r2.getMusicVideos(r7, r0)
            if (r9 != r1) goto L98
            return r1
        L98:
            com.ellation.crunchyroll.api.etp.content.ContentApiResponse r9 = (com.ellation.crunchyroll.api.etp.content.ContentApiResponse) r9
        L9a:
            java.util.List r7 = r9.getData()
            java.lang.Object r7 = com.amazon.aps.iva.lb0.x.t0(r7)
            r2 = r7
            com.ellation.crunchyroll.model.music.MusicAsset r2 = (com.ellation.crunchyroll.model.music.MusicAsset) r2
        La5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.ji.b.v0(java.lang.String, com.amazon.aps.iva.x50.t, com.amazon.aps.iva.ob0.d):java.io.Serializable");
    }
}
