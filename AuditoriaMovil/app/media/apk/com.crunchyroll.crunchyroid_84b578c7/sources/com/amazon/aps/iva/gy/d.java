package com.amazon.aps.iva.gy;

import com.amazon.aps.iva.gy.l;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.api.model.HomeFeedItemRaw;
import java.util.List;
/* compiled from: ContinueWatchingItemInteractor.kt */
/* loaded from: classes2.dex */
public final class d extends com.amazon.aps.iva.wy.a implements l {
    public final EtpContentService b;

    /* compiled from: ContinueWatchingItemInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.feed.interactor.ContinueWatchingItemInteractorImpl", f = "ContinueWatchingItemInteractor.kt", l = {27}, m = "loadItem")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public HomeFeedItemRaw h;
        public d i;
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
            return d.this.D1(null, 0, this);
        }
    }

    public d(EtpContentService etpContentService) {
        this.b = etpContentService;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    @Override // com.amazon.aps.iva.gy.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D1(com.ellation.crunchyroll.api.model.HomeFeedItemRaw r10, int r11, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.xx.l> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.amazon.aps.iva.gy.d.a
            if (r0 == 0) goto L13
            r0 = r12
            com.amazon.aps.iva.gy.d$a r0 = (com.amazon.aps.iva.gy.d.a) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            com.amazon.aps.iva.gy.d$a r0 = new com.amazon.aps.iva.gy.d$a
            r0.<init>(r12)
        L18:
            r4 = r0
            java.lang.Object r12 = r4.k
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r4.m
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            int r11 = r4.j
            com.amazon.aps.iva.gy.d r10 = r4.i
            com.ellation.crunchyroll.api.model.HomeFeedItemRaw r0 = r4.h
            com.amazon.aps.iva.ab.x.i0(r12)
            goto L54
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            com.amazon.aps.iva.ab.x.i0(r12)
            com.ellation.crunchyroll.api.etp.content.EtpContentService r1 = r9.b
            java.lang.String r12 = r10.getLink()
            r3 = 0
            r5 = 2
            r6 = 0
            r4.h = r10
            r4.i = r9
            r4.j = r11
            r4.m = r2
            r2 = r12
            java.lang.Object r12 = com.ellation.crunchyroll.api.etp.content.EtpContentService.DefaultImpls.getContinueWatching$default(r1, r2, r3, r4, r5, r6)
            if (r12 != r0) goto L52
            return r0
        L52:
            r0 = r10
            r10 = r9
        L54:
            com.ellation.crunchyroll.api.etp.content.ContentApiResponse r12 = (com.ellation.crunchyroll.api.etp.content.ContentApiResponse) r12
            java.util.List r12 = r12.getData()
            r10.getClass()
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r10 = r12.iterator()
        L63:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L8c
            java.lang.Object r1 = r10.next()
            com.ellation.crunchyroll.api.model.ContinueWatchingPanel r1 = (com.ellation.crunchyroll.api.model.ContinueWatchingPanel) r1
            com.ellation.crunchyroll.model.Panel r2 = r1.getPanel()
            if (r2 != 0) goto L76
            goto L7d
        L76:
            java.lang.String r3 = r0.getId()
            r2.setFeedId(r3)
        L7d:
            com.ellation.crunchyroll.model.Panel r1 = r1.getPanel()
            if (r1 != 0) goto L84
            goto L63
        L84:
            java.lang.String r2 = r0.getTitle()
            r1.setFeedTitle(r2)
            goto L63
        L8c:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r12 = r12.iterator()
        L95:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto Lc6
            java.lang.Object r1 = r12.next()
            com.ellation.crunchyroll.api.model.ContinueWatchingPanel r1 = (com.ellation.crunchyroll.api.model.ContinueWatchingPanel) r1
            java.lang.String r2 = "<this>"
            com.amazon.aps.iva.yb0.j.f(r1, r2)
            com.ellation.crunchyroll.model.Panel r4 = r1.getPanel()
            if (r4 == 0) goto Lbf
            com.amazon.aps.iva.yx.g r2 = new com.amazon.aps.iva.yx.g
            long r5 = r1.getPlayhead()
            boolean r7 = r1.isFullyWatched()
            boolean r8 = r1.isNew()
            r3 = r2
            r3.<init>(r4, r5, r7, r8)
            goto Lc0
        Lbf:
            r2 = 0
        Lc0:
            if (r2 == 0) goto L95
            r10.add(r2)
            goto L95
        Lc6:
            com.amazon.aps.iva.xx.g$c$a r12 = new com.amazon.aps.iva.xx.g$c$a
            r12.<init>(r10, r0, r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.gy.d.D1(com.ellation.crunchyroll.api.model.HomeFeedItemRaw, int, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.gy.l
    public final void H(HomeFeedItemRaw homeFeedItemRaw, List list) {
        com.amazon.aps.iva.yb0.j.f(list, "panels");
        com.amazon.aps.iva.yb0.j.f(homeFeedItemRaw, "feedItem");
        l.a.b(list, homeFeedItemRaw);
    }
}
