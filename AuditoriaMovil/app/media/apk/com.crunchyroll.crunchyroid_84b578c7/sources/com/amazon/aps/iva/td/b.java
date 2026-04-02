package com.amazon.aps.iva.td;

import com.amazon.aps.iva.ob0.d;
import com.amazon.aps.iva.qb0.c;
import com.amazon.aps.iva.qb0.e;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
/* compiled from: ContinueWatchingInteractor.kt */
/* loaded from: classes.dex */
public final class b implements com.amazon.aps.iva.td.a {
    public final EtpContentService a;

    /* compiled from: ContinueWatchingInteractor.kt */
    @e(c = "com.crunchyroll.appwidgets.continuewatching.data.ContinueWatchingInteractorImpl", f = "ContinueWatchingInteractor.kt", l = {20}, m = "getContinueWatching")
    /* loaded from: classes.dex */
    public static final class a extends c {
        public /* synthetic */ Object h;
        public int j;

        public a(d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            return b.this.a(this);
        }
    }

    public b(EtpContentService etpContentService) {
        this.a = etpContentService;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // com.amazon.aps.iva.td.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.amazon.aps.iva.ob0.d<? super java.util.List<com.ellation.crunchyroll.api.model.ContinueWatchingPanel>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.amazon.aps.iva.td.b.a
            if (r0 == 0) goto L13
            r0 = r5
            com.amazon.aps.iva.td.b$a r0 = (com.amazon.aps.iva.td.b.a) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.td.b$a r0 = new com.amazon.aps.iva.td.b$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            com.amazon.aps.iva.ab.x.i0(r5)
            goto L3e
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            com.amazon.aps.iva.ab.x.i0(r5)
            r0.j = r3
            com.ellation.crunchyroll.api.etp.content.EtpContentService r5 = r4.a
            r2 = 0
            java.lang.Object r5 = com.ellation.crunchyroll.api.etp.content.EtpContentService.DefaultImpls.getContinueWatchingPanels$default(r5, r2, r0, r3, r2)
            if (r5 != r1) goto L3e
            return r1
        L3e:
            com.ellation.crunchyroll.api.etp.content.ContentApiResponse r5 = (com.ellation.crunchyroll.api.etp.content.ContentApiResponse) r5
            java.util.List r5 = r5.getData()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.td.b.a(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
