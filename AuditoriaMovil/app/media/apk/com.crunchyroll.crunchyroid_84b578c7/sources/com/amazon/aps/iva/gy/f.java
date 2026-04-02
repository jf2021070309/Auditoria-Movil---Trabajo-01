package com.amazon.aps.iva.gy;

import com.amazon.aps.iva.gy.l;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.api.model.HomeFeedItemRaw;
import java.util.List;
/* compiled from: DynamicCollectionItemInteractor.kt */
/* loaded from: classes2.dex */
public final class f extends com.amazon.aps.iva.wy.a implements l {
    public final EtpContentService b;

    /* compiled from: DynamicCollectionItemInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.feed.interactor.DynamicCollectionItemInteractor", f = "DynamicCollectionItemInteractor.kt", l = {11}, m = "loadItem")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public f h;
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
            return f.this.D1(null, 0, this);
        }
    }

    public f(EtpContentService etpContentService) {
        com.amazon.aps.iva.yb0.j.f(etpContentService, "contentService");
        this.b = etpContentService;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // com.amazon.aps.iva.gy.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D1(com.ellation.crunchyroll.api.model.HomeFeedItemRaw r5, int r6, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.xx.l> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.amazon.aps.iva.gy.f.a
            if (r0 == 0) goto L13
            r0 = r7
            com.amazon.aps.iva.gy.f$a r0 = (com.amazon.aps.iva.gy.f.a) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            com.amazon.aps.iva.gy.f$a r0 = new com.amazon.aps.iva.gy.f$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.k
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.m
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            int r6 = r0.j
            com.ellation.crunchyroll.api.model.HomeFeedItemRaw r5 = r0.i
            com.amazon.aps.iva.gy.f r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r7)
            goto L4e
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            com.amazon.aps.iva.ab.x.i0(r7)
            java.lang.String r7 = r5.getLink()
            r0.h = r4
            r0.i = r5
            r0.j = r6
            r0.m = r3
            com.ellation.crunchyroll.api.etp.content.EtpContentService r2 = r4.b
            java.lang.Object r7 = r2.getCollection(r7, r0)
            if (r7 != r1) goto L4d
            return r1
        L4d:
            r0 = r4
        L4e:
            com.ellation.crunchyroll.api.etp.content.ContentApiResponse r7 = (com.ellation.crunchyroll.api.etp.content.ContentApiResponse) r7
            java.util.List r7 = r7.getData()
            r0.getClass()
            com.amazon.aps.iva.xx.l r5 = com.amazon.aps.iva.gy.l.a.a(r0, r7, r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.gy.f.D1(com.ellation.crunchyroll.api.model.HomeFeedItemRaw, int, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.gy.l
    public final void H(HomeFeedItemRaw homeFeedItemRaw, List list) {
        l.a.b(list, homeFeedItemRaw);
    }
}
