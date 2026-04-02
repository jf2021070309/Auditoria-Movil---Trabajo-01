package com.amazon.aps.iva.gy;

import com.amazon.aps.iva.gy.l;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.api.model.HomeFeedItemRaw;
import java.util.List;
/* compiled from: CuratedCollectionItemInteractor.kt */
/* loaded from: classes2.dex */
public final class e extends com.amazon.aps.iva.wy.a implements l {
    public final EtpContentService b;

    /* compiled from: CuratedCollectionItemInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.feed.interactor.CuratedCollectionItemInteractor", f = "CuratedCollectionItemInteractor.kt", l = {12}, m = "loadItem")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public e h;
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
            return e.this.D1(null, 0, this);
        }
    }

    public e(EtpContentService etpContentService) {
        com.amazon.aps.iva.yb0.j.f(etpContentService, "etpContentService");
        this.b = etpContentService;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    @Override // com.amazon.aps.iva.gy.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D1(com.ellation.crunchyroll.api.model.HomeFeedItemRaw r12, int r13, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.xx.l> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.amazon.aps.iva.gy.e.a
            if (r0 == 0) goto L13
            r0 = r14
            com.amazon.aps.iva.gy.e$a r0 = (com.amazon.aps.iva.gy.e.a) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            com.amazon.aps.iva.gy.e$a r0 = new com.amazon.aps.iva.gy.e$a
            r0.<init>(r14)
        L18:
            r4 = r0
            java.lang.Object r14 = r4.k
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r4.m
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            int r13 = r4.j
            com.ellation.crunchyroll.api.model.HomeFeedItemRaw r12 = r4.i
            com.amazon.aps.iva.gy.e r0 = r4.h
            com.amazon.aps.iva.ab.x.i0(r14)
            goto L61
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L36:
            com.amazon.aps.iva.ab.x.i0(r14)
            com.ellation.crunchyroll.api.etp.content.EtpContentService r1 = r11.b
            java.util.List r14 = r12.getIds()
            r5 = r14
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.lang.String r6 = ","
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 62
            java.lang.String r14 = com.amazon.aps.iva.lb0.x.B0(r5, r6, r7, r8, r9, r10)
            r3 = 0
            r5 = 2
            r6 = 0
            r4.h = r11
            r4.i = r12
            r4.j = r13
            r4.m = r2
            r2 = r14
            java.lang.Object r14 = com.ellation.crunchyroll.api.etp.content.EtpContentService.DefaultImpls.getPanels$default(r1, r2, r3, r4, r5, r6)
            if (r14 != r0) goto L60
            return r0
        L60:
            r0 = r11
        L61:
            com.ellation.crunchyroll.api.etp.content.ContentApiResponse r14 = (com.ellation.crunchyroll.api.etp.content.ContentApiResponse) r14
            java.util.List r14 = r14.getData()
            r0.getClass()
            com.amazon.aps.iva.xx.l r12 = com.amazon.aps.iva.gy.l.a.a(r0, r14, r12, r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.gy.e.D1(com.ellation.crunchyroll.api.model.HomeFeedItemRaw, int, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.gy.l
    public final void H(HomeFeedItemRaw homeFeedItemRaw, List list) {
        l.a.b(list, homeFeedItemRaw);
    }
}
