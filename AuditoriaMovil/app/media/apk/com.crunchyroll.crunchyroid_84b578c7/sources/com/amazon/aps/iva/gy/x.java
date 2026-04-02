package com.amazon.aps.iva.gy;

import com.amazon.aps.iva.gy.l;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.api.model.HomeFeedItemRaw;
import java.util.List;
/* compiled from: WatchlistItemInteractor.kt */
/* loaded from: classes2.dex */
public final class x extends com.amazon.aps.iva.wy.a implements l {
    public final EtpContentService b;

    /* compiled from: WatchlistItemInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.feed.interactor.WatchlistItemInteractorImpl", f = "WatchlistItemInteractor.kt", l = {21}, m = "loadItem")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public x h;
        public HomeFeedItemRaw i;
        public int j;
        public /* synthetic */ Object k;
        public int m;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.k = obj;
            this.m |= Integer.MIN_VALUE;
            return x.this.D1(null, 0, this);
        }
    }

    public x(EtpContentService etpContentService) {
        this.b = etpContentService;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
    @Override // com.amazon.aps.iva.gy.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D1(com.ellation.crunchyroll.api.model.HomeFeedItemRaw r10, int r11, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.xx.l> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.amazon.aps.iva.gy.x.a
            if (r0 == 0) goto L13
            r0 = r12
            com.amazon.aps.iva.gy.x$a r0 = (com.amazon.aps.iva.gy.x.a) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            com.amazon.aps.iva.gy.x$a r0 = new com.amazon.aps.iva.gy.x$a
            r0.<init>(r12)
        L18:
            r5 = r0
            java.lang.Object r12 = r5.k
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r5.m
            r8 = 1
            if (r1 == 0) goto L36
            if (r1 != r8) goto L2e
            int r11 = r5.j
            com.ellation.crunchyroll.api.model.HomeFeedItemRaw r10 = r5.i
            com.amazon.aps.iva.gy.x r0 = r5.h
            com.amazon.aps.iva.ab.x.i0(r12)
            goto L56
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            com.amazon.aps.iva.ab.x.i0(r12)
            com.ellation.crunchyroll.api.etp.content.EtpContentService r1 = r9.b
            r2 = 0
            r3 = 0
            java.lang.Integer r4 = new java.lang.Integer
            r12 = 20
            r4.<init>(r12)
            r6 = 3
            r7 = 0
            r5.h = r9
            r5.i = r10
            r5.j = r11
            r5.m = r8
            java.lang.Object r12 = com.ellation.crunchyroll.api.etp.content.EtpContentService.DefaultImpls.getWatchlist$default(r1, r2, r3, r4, r5, r6, r7)
            if (r12 != r0) goto L55
            return r0
        L55:
            r0 = r9
        L56:
            com.ellation.crunchyroll.api.etp.content.ContentApiResponse r12 = (com.ellation.crunchyroll.api.etp.content.ContentApiResponse) r12
            java.util.List r1 = r12.getData()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L67:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L7d
            java.lang.Object r3 = r1.next()
            com.ellation.crunchyroll.model.watchlist.WatchlistPanel r3 = (com.ellation.crunchyroll.model.watchlist.WatchlistPanel) r3
            com.ellation.crunchyroll.model.Panel r3 = r3.getPanel()
            if (r3 == 0) goto L67
            r2.add(r3)
            goto L67
        L7d:
            r0.H(r10, r2)
            java.util.List r0 = r12.getData()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L8f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto La7
            java.lang.Object r2 = r0.next()
            com.ellation.crunchyroll.model.watchlist.WatchlistPanel r2 = (com.ellation.crunchyroll.model.watchlist.WatchlistPanel) r2
            java.lang.String r3 = ""
            com.amazon.aps.iva.b60.k r2 = com.amazon.aps.iva.aq.k.O(r2, r3)
            if (r2 == 0) goto L8f
            r1.add(r2)
            goto L8f
        La7:
            int r0 = r12.getTotal()
            java.util.List r12 = r12.getData()
            int r12 = r12.size()
            if (r0 <= r12) goto Lb6
            goto Lb7
        Lb6:
            r8 = 0
        Lb7:
            com.amazon.aps.iva.xx.g$c$b r12 = new com.amazon.aps.iva.xx.g$c$b
            r12.<init>(r10, r1, r8, r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.gy.x.D1(com.ellation.crunchyroll.api.model.HomeFeedItemRaw, int, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.gy.l
    public final void H(HomeFeedItemRaw homeFeedItemRaw, List list) {
        com.amazon.aps.iva.yb0.j.f(list, "panels");
        com.amazon.aps.iva.yb0.j.f(homeFeedItemRaw, "feedItem");
        l.a.b(list, homeFeedItemRaw);
    }
}
