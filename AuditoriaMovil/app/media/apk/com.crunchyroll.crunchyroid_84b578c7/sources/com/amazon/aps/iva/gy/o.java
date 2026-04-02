package com.amazon.aps.iva.gy;

import com.amazon.aps.iva.gy.l;
import com.amazon.aps.iva.ot.a;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.api.model.HomeFeedItemRaw;
import com.ellation.crunchyroll.api.model.HomeFeedItemResponseType;
import com.ellation.crunchyroll.model.music.MusicAsset;
import com.ellation.crunchyroll.model.music.MusicGenre;
import com.ellation.crunchyroll.model.music.MusicImages;
import com.ellation.crunchyroll.model.music.MusicVideo;
import com.ellation.crunchyroll.ui.labels.LabelUiModelKt;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: MusicAssetsInteractor.kt */
/* loaded from: classes2.dex */
public final class o implements l {
    public final EtpContentService b;
    public final com.amazon.aps.iva.at.d c;
    public final com.amazon.aps.iva.yh.c d;

    /* compiled from: MusicAssetsInteractor.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[HomeFeedItemResponseType.values().length];
            try {
                iArr[HomeFeedItemResponseType.MUSIC_MEDIA_MIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HomeFeedItemResponseType.MUSIC_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HomeFeedItemResponseType.CONCERT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* compiled from: MusicAssetsInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.feed.interactor.MusicAssetsInteractorImpl", f = "MusicAssetsInteractor.kt", l = {58, 59, 74, 75}, m = "getAssets")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.c {
        public Object h;
        public Object i;
        public Object j;
        public LinkedHashMap k;
        public /* synthetic */ Object l;
        public int n;

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.l = obj;
            this.n |= Integer.MIN_VALUE;
            return o.this.m(null, this);
        }
    }

    /* compiled from: MusicAssetsInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.feed.interactor.MusicAssetsInteractorImpl", f = "MusicAssetsInteractor.kt", l = {43}, m = "loadItem")
    /* loaded from: classes2.dex */
    public static final class c extends com.amazon.aps.iva.qb0.c {
        public HomeFeedItemRaw h;
        public /* synthetic */ Object i;
        public int k;

        public c(com.amazon.aps.iva.ob0.d<? super c> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return o.this.D1(null, 0, this);
        }
    }

    public o(EtpContentService etpContentService, com.amazon.aps.iva.at.f fVar, com.amazon.aps.iva.yh.c cVar) {
        this.b = etpContentService;
        this.c = fVar;
        this.d = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    @Override // com.amazon.aps.iva.gy.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D1(com.ellation.crunchyroll.api.model.HomeFeedItemRaw r4, int r5, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.xx.l> r6) {
        /*
            r3 = this;
            boolean r5 = r6 instanceof com.amazon.aps.iva.gy.o.c
            if (r5 == 0) goto L13
            r5 = r6
            com.amazon.aps.iva.gy.o$c r5 = (com.amazon.aps.iva.gy.o.c) r5
            int r0 = r5.k
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r5.k = r0
            goto L18
        L13:
            com.amazon.aps.iva.gy.o$c r5 = new com.amazon.aps.iva.gy.o$c
            r5.<init>(r6)
        L18:
            java.lang.Object r6 = r5.i
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r5.k
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            com.ellation.crunchyroll.api.model.HomeFeedItemRaw r4 = r5.h
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            com.amazon.aps.iva.ab.x.i0(r6)
            r5.h = r4
            r5.k = r2
            java.lang.Object r6 = r3.m(r4, r5)
            if (r6 != r0) goto L3f
            return r0
        L3f:
            java.util.List r6 = (java.util.List) r6
            boolean r5 = r6.isEmpty()
            if (r5 == 0) goto L4a
            com.amazon.aps.iva.xx.i r4 = com.amazon.aps.iva.xx.i.b
            goto L50
        L4a:
            com.amazon.aps.iva.xx.o r5 = new com.amazon.aps.iva.xx.o
            r5.<init>(r4, r6)
            r4 = r5
        L50:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.gy.o.D1(com.ellation.crunchyroll.api.model.HomeFeedItemRaw, int, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.gy.l
    public final void H(HomeFeedItemRaw homeFeedItemRaw, List list) {
        com.amazon.aps.iva.yb0.j.f(list, "panels");
        com.amazon.aps.iva.yb0.j.f(homeFeedItemRaw, "feedItem");
        l.a.b(list, homeFeedItemRaw);
    }

    @Override // com.amazon.aps.iva.wy.j
    public final void cancelRunningApiCalls() {
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x021b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(com.ellation.crunchyroll.api.model.HomeFeedItemRaw r14, com.amazon.aps.iva.ob0.d<? super java.util.List<com.amazon.aps.iva.xx.n>> r15) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.gy.o.m(com.ellation.crunchyroll.api.model.HomeFeedItemRaw, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073 A[LOOP:0: B:19:0x006d->B:21:0x0073, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable p(com.ellation.crunchyroll.api.model.HomeFeedItemRaw r11, com.amazon.aps.iva.ob0.d r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.amazon.aps.iva.gy.p
            if (r0 == 0) goto L13
            r0 = r12
            com.amazon.aps.iva.gy.p r0 = (com.amazon.aps.iva.gy.p) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.gy.p r0 = new com.amazon.aps.iva.gy.p
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.ellation.crunchyroll.api.model.HomeFeedItemRaw r11 = r0.i
            com.amazon.aps.iva.gy.o r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r12)
            goto L58
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            com.amazon.aps.iva.ab.x.i0(r12)
            java.util.List r12 = r11.getItemsIds()
            r4 = r12
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.lang.String r5 = ","
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 62
            java.lang.String r12 = com.amazon.aps.iva.lb0.x.B0(r4, r5, r6, r7, r8, r9)
            r0.h = r10
            r0.i = r11
            r0.l = r3
            com.ellation.crunchyroll.api.etp.content.EtpContentService r2 = r10.b
            java.lang.Object r12 = r2.getMusicConcerts(r12, r0)
            if (r12 != r1) goto L57
            return r1
        L57:
            r0 = r10
        L58:
            com.ellation.crunchyroll.api.etp.content.ContentApiResponse r12 = (com.ellation.crunchyroll.api.etp.content.ContentApiResponse) r12
            java.util.List r12 = r12.getData()
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = com.amazon.aps.iva.lb0.r.Y(r12)
            r1.<init>(r2)
            java.util.Iterator r12 = r12.iterator()
        L6d:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L81
            java.lang.Object r2 = r12.next()
            com.ellation.crunchyroll.model.music.MusicConcert r2 = (com.ellation.crunchyroll.model.music.MusicConcert) r2
            com.amazon.aps.iva.xx.n r2 = r0.r(r2, r11)
            r1.add(r2)
            goto L6d
        L81:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.gy.o.p(com.ellation.crunchyroll.api.model.HomeFeedItemRaw, com.amazon.aps.iva.ob0.d):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073 A[LOOP:0: B:19:0x006d->B:21:0x0073, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable q(com.ellation.crunchyroll.api.model.HomeFeedItemRaw r11, com.amazon.aps.iva.ob0.d r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.amazon.aps.iva.gy.q
            if (r0 == 0) goto L13
            r0 = r12
            com.amazon.aps.iva.gy.q r0 = (com.amazon.aps.iva.gy.q) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            com.amazon.aps.iva.gy.q r0 = new com.amazon.aps.iva.gy.q
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.j
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.ellation.crunchyroll.api.model.HomeFeedItemRaw r11 = r0.i
            com.amazon.aps.iva.gy.o r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r12)
            goto L58
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            com.amazon.aps.iva.ab.x.i0(r12)
            java.util.List r12 = r11.getItemsIds()
            r4 = r12
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.lang.String r5 = ","
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 62
            java.lang.String r12 = com.amazon.aps.iva.lb0.x.B0(r4, r5, r6, r7, r8, r9)
            r0.h = r10
            r0.i = r11
            r0.l = r3
            com.ellation.crunchyroll.api.etp.content.EtpContentService r2 = r10.b
            java.lang.Object r12 = r2.getMusicVideos(r12, r0)
            if (r12 != r1) goto L57
            return r1
        L57:
            r0 = r10
        L58:
            com.ellation.crunchyroll.api.etp.content.ContentApiResponse r12 = (com.ellation.crunchyroll.api.etp.content.ContentApiResponse) r12
            java.util.List r12 = r12.getData()
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = com.amazon.aps.iva.lb0.r.Y(r12)
            r1.<init>(r2)
            java.util.Iterator r12 = r12.iterator()
        L6d:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L81
            java.lang.Object r2 = r12.next()
            com.ellation.crunchyroll.model.music.MusicVideo r2 = (com.ellation.crunchyroll.model.music.MusicVideo) r2
            com.amazon.aps.iva.xx.n r2 = r0.r(r2, r11)
            r1.add(r2)
            goto L6d
        L81:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.gy.o.q(com.ellation.crunchyroll.api.model.HomeFeedItemRaw, com.amazon.aps.iva.ob0.d):java.io.Serializable");
    }

    public final com.amazon.aps.iva.xx.n r(MusicAsset musicAsset, HomeFeedItemRaw homeFeedItemRaw) {
        MusicVideo musicVideo;
        String str;
        List<MusicGenre> genres;
        MusicGenre musicGenre;
        String id = musicAsset.getId();
        com.amazon.aps.iva.yh.c cVar = this.d;
        String b2 = cVar.b(musicAsset);
        String a2 = cVar.a(musicAsset);
        String c2 = cVar.c(musicAsset);
        MusicImages images = musicAsset.getImages();
        long x = com.amazon.aps.iva.gr.n.x(musicAsset.getDurationMs());
        if (musicAsset instanceof MusicVideo) {
            musicVideo = (MusicVideo) musicAsset;
        } else {
            musicVideo = null;
        }
        if (musicVideo != null && (genres = musicVideo.getGenres()) != null && (musicGenre = (MusicGenre) com.amazon.aps.iva.lb0.x.v0(genres)) != null) {
            str = musicGenre.getDisplayValue();
        } else {
            str = null;
        }
        com.amazon.aps.iva.at.d dVar = this.c;
        return new com.amazon.aps.iva.xx.n(id, b2, a2, c2, images, str, a.c.a(dVar.b(musicAsset)), x, dVar.a(musicAsset), musicAsset.getType(), homeFeedItemRaw.getId(), homeFeedItemRaw.getTitle(), LabelUiModelKt.toLabelUiModel$default(musicAsset, false, 1, null));
    }
}
