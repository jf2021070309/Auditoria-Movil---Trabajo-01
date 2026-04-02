package com.amazon.aps.iva.gy;

import com.amazon.aps.iva.gy.l;
import com.ellation.crunchyroll.api.GsonHolder;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.api.model.HomeFeedItemRaw;
import com.ellation.crunchyroll.api.model.HomeFeedItemResourceType;
import com.google.gson.Gson;
import java.util.List;
/* compiled from: MusicHeroItemInteractor.kt */
/* loaded from: classes2.dex */
public final class r implements l {
    public final EtpContentService b;
    public final com.amazon.aps.iva.yh.c c;
    public final Gson d;

    /* compiled from: MusicHeroItemInteractor.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[HomeFeedItemResourceType.values().length];
            try {
                iArr[HomeFeedItemResourceType.ARTIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HomeFeedItemResourceType.MUSIC_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HomeFeedItemResourceType.MUSIC_CONCERT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* compiled from: MusicHeroItemInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.feed.interactor.MusicHeroItemInteractorImpl", f = "MusicHeroItemInteractor.kt", l = {49}, m = "loadItem")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.c {
        public /* synthetic */ Object h;
        public int j;

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            return r.this.D1(null, 0, this);
        }
    }

    public r(EtpContentService etpContentService, com.amazon.aps.iva.yh.c cVar) {
        Gson gsonHolder = GsonHolder.getInstance();
        com.amazon.aps.iva.yb0.j.f(gsonHolder, "gson");
        this.b = etpContentService;
        this.c = cVar;
        this.d = gsonHolder;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    @Override // com.amazon.aps.iva.gy.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D1(com.ellation.crunchyroll.api.model.HomeFeedItemRaw r5, int r6, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.xx.l> r7) {
        /*
            r4 = this;
            com.google.gson.Gson r6 = r4.d
            boolean r0 = r7 instanceof com.amazon.aps.iva.gy.r.b
            if (r0 == 0) goto L15
            r0 = r7
            com.amazon.aps.iva.gy.r$b r0 = (com.amazon.aps.iva.gy.r.b) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L15
            int r1 = r1 - r2
            r0.j = r1
            goto L1a
        L15:
            com.amazon.aps.iva.gy.r$b r0 = new com.amazon.aps.iva.gy.r$b
            r0.<init>(r7)
        L1a:
            java.lang.Object r7 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            com.amazon.aps.iva.ab.x.i0(r7)     // Catch: com.google.gson.JsonSyntaxException -> La4
            goto La0
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            com.amazon.aps.iva.ab.x.i0(r7)
            com.ellation.crunchyroll.api.model.DisplayType r7 = r5.getDisplayType()
            com.ellation.crunchyroll.api.model.DisplayType r2 = com.ellation.crunchyroll.api.model.DisplayType.HERO
            if (r7 != r2) goto Laa
            java.lang.Object r7 = r5.getObjectData()
            if (r7 == 0) goto La7
            java.lang.Object r7 = r5.getObjectData()     // Catch: com.google.gson.JsonSyntaxException -> La4
            java.lang.String r7 = r6.toJson(r7)     // Catch: com.google.gson.JsonSyntaxException -> La4
            com.ellation.crunchyroll.api.model.HomeFeedItemResourceType r5 = r5.getResourceType()     // Catch: com.google.gson.JsonSyntaxException -> La4
            int[] r2 = com.amazon.aps.iva.gy.r.a.a     // Catch: com.google.gson.JsonSyntaxException -> La4
            int r5 = r5.ordinal()     // Catch: com.google.gson.JsonSyntaxException -> La4
            r5 = r2[r5]     // Catch: com.google.gson.JsonSyntaxException -> La4
            if (r5 == r3) goto L88
            r0 = 2
            com.amazon.aps.iva.yh.c r1 = r4.c
            if (r5 == r0) goto L76
            r0 = 3
            if (r5 == r0) goto L64
            com.amazon.aps.iva.xx.i r5 = com.amazon.aps.iva.xx.i.b     // Catch: com.google.gson.JsonSyntaxException -> La4
            goto Lac
        L64:
            java.lang.Class<com.ellation.crunchyroll.model.music.MusicConcert> r5 = com.ellation.crunchyroll.model.music.MusicConcert.class
            java.lang.Object r5 = r6.fromJson(r7, r5)     // Catch: com.google.gson.JsonSyntaxException -> La4
            java.lang.String r6 = "gson.fromJson(json, MusicConcert::class.java)"
            com.amazon.aps.iva.yb0.j.e(r5, r6)     // Catch: com.google.gson.JsonSyntaxException -> La4
            com.ellation.crunchyroll.model.music.MusicAsset r5 = (com.ellation.crunchyroll.model.music.MusicAsset) r5     // Catch: com.google.gson.JsonSyntaxException -> La4
            com.amazon.aps.iva.xx.p r5 = com.amazon.aps.iva.gy.t.e(r5, r1)     // Catch: com.google.gson.JsonSyntaxException -> La4
            goto Lac
        L76:
            java.lang.Class<com.ellation.crunchyroll.model.music.MusicVideo> r5 = com.ellation.crunchyroll.model.music.MusicVideo.class
            java.lang.Object r5 = r6.fromJson(r7, r5)     // Catch: com.google.gson.JsonSyntaxException -> La4
            java.lang.String r6 = "gson.fromJson(json, MusicVideo::class.java)"
            com.amazon.aps.iva.yb0.j.e(r5, r6)     // Catch: com.google.gson.JsonSyntaxException -> La4
            com.ellation.crunchyroll.model.music.MusicAsset r5 = (com.ellation.crunchyroll.model.music.MusicAsset) r5     // Catch: com.google.gson.JsonSyntaxException -> La4
            com.amazon.aps.iva.xx.p r5 = com.amazon.aps.iva.gy.t.e(r5, r1)     // Catch: com.google.gson.JsonSyntaxException -> La4
            goto Lac
        L88:
            java.lang.Class<com.ellation.crunchyroll.model.music.Artist> r5 = com.ellation.crunchyroll.model.music.Artist.class
            java.lang.Object r5 = r6.fromJson(r7, r5)     // Catch: com.google.gson.JsonSyntaxException -> La4
            java.lang.String r6 = "gson.fromJson(json, Artist::class.java)"
            com.amazon.aps.iva.yb0.j.e(r5, r6)     // Catch: com.google.gson.JsonSyntaxException -> La4
            com.ellation.crunchyroll.model.music.Artist r5 = (com.ellation.crunchyroll.model.music.Artist) r5     // Catch: com.google.gson.JsonSyntaxException -> La4
            com.ellation.crunchyroll.api.etp.content.EtpContentService r6 = r4.b     // Catch: com.google.gson.JsonSyntaxException -> La4
            r0.j = r3     // Catch: com.google.gson.JsonSyntaxException -> La4
            java.lang.Object r7 = com.amazon.aps.iva.gy.t.f(r5, r6, r0)     // Catch: com.google.gson.JsonSyntaxException -> La4
            if (r7 != r1) goto La0
            return r1
        La0:
            r5 = r7
            com.amazon.aps.iva.xx.l r5 = (com.amazon.aps.iva.xx.l) r5     // Catch: com.google.gson.JsonSyntaxException -> La4
            goto Lac
        La4:
            com.amazon.aps.iva.xx.i r5 = com.amazon.aps.iva.xx.i.b
            return r5
        La7:
            com.amazon.aps.iva.xx.i r5 = com.amazon.aps.iva.xx.i.b
            goto Lac
        Laa:
            com.amazon.aps.iva.xx.i r5 = com.amazon.aps.iva.xx.i.b
        Lac:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.gy.r.D1(com.ellation.crunchyroll.api.model.HomeFeedItemRaw, int, com.amazon.aps.iva.ob0.d):java.lang.Object");
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
}
