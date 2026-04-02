package com.amazon.aps.iva.gy;

import com.amazon.aps.iva.gy.l;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.api.model.HomeFeedItemRaw;
import com.google.android.gms.common.ConnectionResult;
import java.util.List;
/* compiled from: ArtistsItemInteractor.kt */
/* loaded from: classes2.dex */
public final class a implements l {
    public final EtpContentService b;

    /* compiled from: ArtistsItemInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.feed.interactor.ArtistsItemInteractorImpl", f = "ArtistsItemInteractor.kt", l = {ConnectionResult.API_DISABLED}, m = "loadItem")
    /* renamed from: com.amazon.aps.iva.gy.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0312a extends com.amazon.aps.iva.qb0.c {
        public HomeFeedItemRaw h;
        public /* synthetic */ Object i;
        public int k;

        public C0312a(com.amazon.aps.iva.ob0.d<? super C0312a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return a.this.D1(null, 0, this);
        }
    }

    public a(EtpContentService etpContentService) {
        this.b = etpContentService;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e A[LOOP:0: B:18:0x0068->B:20:0x006e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a7  */
    @Override // com.amazon.aps.iva.gy.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D1(com.ellation.crunchyroll.api.model.HomeFeedItemRaw r12, int r13, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.xx.l> r14) {
        /*
            r11 = this;
            boolean r13 = r14 instanceof com.amazon.aps.iva.gy.a.C0312a
            if (r13 == 0) goto L13
            r13 = r14
            com.amazon.aps.iva.gy.a$a r13 = (com.amazon.aps.iva.gy.a.C0312a) r13
            int r0 = r13.k
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r13.k = r0
            goto L18
        L13:
            com.amazon.aps.iva.gy.a$a r13 = new com.amazon.aps.iva.gy.a$a
            r13.<init>(r14)
        L18:
            java.lang.Object r14 = r13.i
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r13.k
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            com.ellation.crunchyroll.api.model.HomeFeedItemRaw r12 = r13.h
            com.amazon.aps.iva.ab.x.i0(r14)
            goto L53
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            com.amazon.aps.iva.ab.x.i0(r14)
            java.util.List r14 = r12.getItemsIds()
            r3 = r14
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.lang.String r4 = ","
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 62
            java.lang.String r14 = com.amazon.aps.iva.lb0.x.B0(r3, r4, r5, r6, r7, r8)
            r13.h = r12
            r13.k = r2
            com.ellation.crunchyroll.api.etp.content.EtpContentService r1 = r11.b
            java.lang.Object r14 = r1.getArtists(r14, r13)
            if (r14 != r0) goto L53
            return r0
        L53:
            com.ellation.crunchyroll.api.etp.content.ContentApiResponse r14 = (com.ellation.crunchyroll.api.etp.content.ContentApiResponse) r14
            java.util.List r13 = r14.getData()
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r14 = new java.util.ArrayList
            int r0 = com.amazon.aps.iva.lb0.r.Y(r13)
            r14.<init>(r0)
            java.util.Iterator r13 = r13.iterator()
        L68:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L9e
            java.lang.Object r0 = r13.next()
            com.ellation.crunchyroll.model.music.Artist r0 = (com.ellation.crunchyroll.model.music.Artist) r0
            com.amazon.aps.iva.xx.b r10 = new com.amazon.aps.iva.xx.b
            java.lang.String r2 = r0.getId()
            java.lang.String r3 = r0.getName()
            com.ellation.crunchyroll.model.music.MusicImages r4 = r0.getImages()
            java.util.List r5 = r0.getVideos()
            java.util.List r6 = r0.getConcerts()
            java.lang.String r7 = r12.getId()
            java.lang.String r8 = r12.getTitle()
            java.util.List r9 = r0.getGenres()
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r14.add(r10)
            goto L68
        L9e:
            boolean r13 = r14.isEmpty()
            if (r13 == 0) goto La7
            com.amazon.aps.iva.xx.i r12 = com.amazon.aps.iva.xx.i.b
            goto Lad
        La7:
            com.amazon.aps.iva.xx.a r13 = new com.amazon.aps.iva.xx.a
            r13.<init>(r12, r14)
            r12 = r13
        Lad:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.gy.a.D1(com.ellation.crunchyroll.api.model.HomeFeedItemRaw, int, com.amazon.aps.iva.ob0.d):java.lang.Object");
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
