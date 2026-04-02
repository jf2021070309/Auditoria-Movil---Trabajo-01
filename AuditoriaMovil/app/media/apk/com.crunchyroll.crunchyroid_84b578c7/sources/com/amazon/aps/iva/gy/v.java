package com.amazon.aps.iva.gy;

import com.amazon.aps.iva.gy.l;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.api.model.HomeFeedItemRaw;
import com.ellation.crunchyroll.model.Panel;
import java.util.List;
/* compiled from: PanelItemInteractor.kt */
/* loaded from: classes2.dex */
public final class v extends com.amazon.aps.iva.wy.a implements l {
    public final EtpContentService b;
    public int c;

    /* compiled from: PanelItemInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.feed.interactor.PanelItemInteractor", f = "PanelItemInteractor.kt", l = {30}, m = "loadItem")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public /* synthetic */ Object h;
        public int j;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            return v.this.D1(null, 0, this);
        }
    }

    /* compiled from: PanelItemInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.feed.interactor.PanelItemInteractor", f = "PanelItemInteractor.kt", l = {87}, m = "toHomeFeedItem")
    /* loaded from: classes2.dex */
    public static final class b extends com.amazon.aps.iva.qb0.c {
        public Panel h;
        public HomeFeedItemRaw i;
        public com.amazon.aps.iva.xx.k j;
        public /* synthetic */ Object k;
        public int m;

        public b(com.amazon.aps.iva.ob0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.k = obj;
            this.m |= Integer.MIN_VALUE;
            return v.this.y0(null, null, 0, null, this);
        }
    }

    public v(EtpContentService etpContentService) {
        com.amazon.aps.iva.yb0.j.f(etpContentService, "etpContentService");
        this.b = etpContentService;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C(java.lang.String r6, com.amazon.aps.iva.x50.t r7, com.amazon.aps.iva.ob0.d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.amazon.aps.iva.gy.u
            if (r0 == 0) goto L13
            r0 = r8
            com.amazon.aps.iva.gy.u r0 = (com.amazon.aps.iva.gy.u) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.gy.u r0 = new com.amazon.aps.iva.gy.u
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            com.amazon.aps.iva.ab.x.i0(r8)     // Catch: java.io.IOException -> L53
            goto L3e
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            com.amazon.aps.iva.ab.x.i0(r8)
            com.ellation.crunchyroll.api.etp.content.EtpContentService r8 = r5.b     // Catch: java.io.IOException -> L53
            r0.j = r4     // Catch: java.io.IOException -> L53
            java.lang.Object r8 = com.ellation.crunchyroll.api.etp.content.EtpContentServiceKt.getContainerUpNext(r8, r7, r6, r0)     // Catch: java.io.IOException -> L53
            if (r8 != r1) goto L3e
            return r1
        L3e:
            com.amazon.aps.iva.jf0.a0 r8 = (com.amazon.aps.iva.jf0.a0) r8     // Catch: java.io.IOException -> L53
            T r6 = r8.b     // Catch: java.io.IOException -> L53
            com.ellation.crunchyroll.api.etp.content.ContentApiResponse r6 = (com.ellation.crunchyroll.api.etp.content.ContentApiResponse) r6     // Catch: java.io.IOException -> L53
            if (r6 == 0) goto L53
            java.util.List r6 = r6.getData()     // Catch: java.io.IOException -> L53
            if (r6 == 0) goto L53
            java.lang.Object r6 = com.amazon.aps.iva.lb0.x.v0(r6)     // Catch: java.io.IOException -> L53
            com.ellation.crunchyroll.model.UpNext r6 = (com.ellation.crunchyroll.model.UpNext) r6     // Catch: java.io.IOException -> L53
            r3 = r6
        L53:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.gy.v.C(java.lang.String, com.amazon.aps.iva.x50.t, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @Override // com.amazon.aps.iva.gy.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D1(com.ellation.crunchyroll.api.model.HomeFeedItemRaw r8, int r9, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.xx.l> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.amazon.aps.iva.gy.v.a
            if (r0 == 0) goto L13
            r0 = r10
            com.amazon.aps.iva.gy.v$a r0 = (com.amazon.aps.iva.gy.v.a) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.gy.v$a r0 = new com.amazon.aps.iva.gy.v$a
            r0.<init>(r10)
        L18:
            r6 = r0
            java.lang.Object r10 = r6.h
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r6.j
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            com.amazon.aps.iva.ab.x.i0(r10)
            goto L48
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L30:
            com.amazon.aps.iva.ab.x.i0(r10)
            com.ellation.crunchyroll.model.Panel r10 = r8.getPanel()
            if (r10 == 0) goto L4d
            com.amazon.aps.iva.xx.k r5 = com.amazon.aps.iva.xx.k.ODD
            r6.j = r2
            r1 = r7
            r2 = r10
            r3 = r8
            r4 = r9
            java.lang.Object r10 = r1.y0(r2, r3, r4, r5, r6)
            if (r10 != r0) goto L48
            return r0
        L48:
            com.amazon.aps.iva.xx.c r10 = (com.amazon.aps.iva.xx.c) r10
            if (r10 == 0) goto L4d
            goto L4f
        L4d:
            com.amazon.aps.iva.xx.i r10 = com.amazon.aps.iva.xx.i.b
        L4f:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.gy.v.D1(com.ellation.crunchyroll.api.model.HomeFeedItemRaw, int, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.gy.l
    public final void H(HomeFeedItemRaw homeFeedItemRaw, List list) {
        l.a.b(list, homeFeedItemRaw);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y0(com.ellation.crunchyroll.model.Panel r5, com.ellation.crunchyroll.api.model.HomeFeedItemRaw r6, int r7, com.amazon.aps.iva.xx.k r8, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.xx.c> r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof com.amazon.aps.iva.gy.v.b
            if (r0 == 0) goto L13
            r0 = r9
            com.amazon.aps.iva.gy.v$b r0 = (com.amazon.aps.iva.gy.v.b) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            com.amazon.aps.iva.gy.v$b r0 = new com.amazon.aps.iva.gy.v$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.k
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.m
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            com.amazon.aps.iva.xx.k r8 = r0.j
            com.ellation.crunchyroll.api.model.HomeFeedItemRaw r6 = r0.i
            com.ellation.crunchyroll.model.Panel r5 = r0.h
            com.amazon.aps.iva.ab.x.i0(r9)
            goto L65
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            com.amazon.aps.iva.ab.x.i0(r9)
            if (r7 != 0) goto L40
            com.amazon.aps.iva.xx.c$c r7 = new com.amazon.aps.iva.xx.c$c
            r7.<init>(r5, r6)
            goto L6c
        L40:
            com.amazon.aps.iva.x50.t r7 = r5.getResourceType()
            com.amazon.aps.iva.x50.t r9 = com.amazon.aps.iva.x50.t.EPISODE
            if (r7 != r9) goto L4e
            com.amazon.aps.iva.xx.c$b r7 = new com.amazon.aps.iva.xx.c$b
            r7.<init>(r5, r6, r8)
            goto L6c
        L4e:
            com.amazon.aps.iva.x50.t r7 = r5.getResourceType()
            java.lang.String r9 = com.amazon.aps.iva.xw.f0.a(r5)
            r0.h = r5
            r0.i = r6
            r0.j = r8
            r0.m = r3
            java.lang.Object r9 = r4.C(r9, r7, r0)
            if (r9 != r1) goto L65
            return r1
        L65:
            com.ellation.crunchyroll.model.UpNext r9 = (com.ellation.crunchyroll.model.UpNext) r9
            com.amazon.aps.iva.xx.c$a r7 = new com.amazon.aps.iva.xx.c$a
            r7.<init>(r5, r6, r8, r9)
        L6c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.gy.v.y0(com.ellation.crunchyroll.model.Panel, com.ellation.crunchyroll.api.model.HomeFeedItemRaw, int, com.amazon.aps.iva.xx.k, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
