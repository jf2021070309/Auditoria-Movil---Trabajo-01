package com.amazon.aps.iva.qv;

import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import com.ellation.crunchyroll.api.etp.content.model.customlists.CustomListRequest;
/* compiled from: ModifyCrunchylistInteractor.kt */
/* loaded from: classes2.dex */
public final class h implements g {
    public final EtpContentService b;

    /* compiled from: ModifyCrunchylistInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.crunchylists.modifycrunchylist.ModifyCrunchylistInteractorImpl", f = "ModifyCrunchylistInteractor.kt", l = {24}, m = "createCrunchylist")
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
            return h.this.Q(null, this);
        }
    }

    public h(EtpContentService etpContentService) {
        this.b = etpContentService;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // com.amazon.aps.iva.qv.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q(java.lang.String r5, com.amazon.aps.iva.ob0.d<? super com.ellation.crunchyroll.api.etp.content.model.customlists.CreatedCustomList> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.amazon.aps.iva.qv.h.a
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.aps.iva.qv.h$a r0 = (com.amazon.aps.iva.qv.h.a) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.qv.h$a r0 = new com.amazon.aps.iva.qv.h$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            com.amazon.aps.iva.ab.x.i0(r6)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            com.amazon.aps.iva.ab.x.i0(r6)
            com.ellation.crunchyroll.api.etp.content.model.customlists.CustomListRequest r6 = new com.ellation.crunchyroll.api.etp.content.model.customlists.CustomListRequest
            r6.<init>(r5)
            r0.j = r3
            com.ellation.crunchyroll.api.etp.content.EtpContentService r5 = r4.b
            java.lang.Object r6 = r5.createPrivateCustomList(r6, r0)
            if (r6 != r1) goto L42
            return r1
        L42:
            com.ellation.crunchyroll.api.etp.content.ContentApiResponse r6 = (com.ellation.crunchyroll.api.etp.content.ContentApiResponse) r6
            java.util.List r5 = r6.getData()
            java.lang.Object r5 = com.amazon.aps.iva.lb0.x.t0(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.qv.h.Q(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.qv.g
    public final Object V0(String str, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        Object deletePrivateCustomList = this.b.deletePrivateCustomList(str, dVar);
        if (deletePrivateCustomList == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return deletePrivateCustomList;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }

    @Override // com.amazon.aps.iva.wy.j
    public final void cancelRunningApiCalls() {
    }

    @Override // com.amazon.aps.iva.qv.g
    public final Object z(String str, String str2, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        Object updateCustomList = this.b.updateCustomList(str, new CustomListRequest(str2), dVar);
        if (updateCustomList == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return updateCustomList;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
