package com.amazon.aps.iva.q00;

import com.amazon.aps.iva.wy.i;
import com.amazon.aps.iva.x50.q;
import com.ellation.crunchyroll.api.etp.content.EtpContentService;
import java.util.LinkedHashMap;
/* compiled from: GeoRestrictionInteractor.kt */
/* loaded from: classes2.dex */
public final class c extends i {
    public final EtpContentService b;
    public final q c;
    public final LinkedHashMap d = new LinkedHashMap();

    /* compiled from: GeoRestrictionInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.ellation.crunchyroll.presentation.download.access.GeoRestrictionInteractorImpl", f = "GeoRestrictionInteractor.kt", l = {41}, m = "isContentGeoRestricted")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public c h;
        public String i;
        public c j;
        public /* synthetic */ Object k;
        public int m;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.k = obj;
            this.m |= Integer.MIN_VALUE;
            return c.this.m(null, this);
        }
    }

    public c(EtpContentService etpContentService, q qVar) {
        this.b = etpContentService;
        this.c = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(java.lang.String r5, com.amazon.aps.iva.ob0.d<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.amazon.aps.iva.q00.c.a
            if (r0 == 0) goto L13
            r0 = r6
            com.amazon.aps.iva.q00.c$a r0 = (com.amazon.aps.iva.q00.c.a) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            com.amazon.aps.iva.q00.c$a r0 = new com.amazon.aps.iva.q00.c$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.k
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.m
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            com.amazon.aps.iva.q00.c r5 = r0.j
            java.lang.String r1 = r0.i
            com.amazon.aps.iva.q00.c r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r6)     // Catch: java.lang.Throwable -> L2d
            goto L61
        L2d:
            r6 = move-exception
            goto L68
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            com.amazon.aps.iva.ab.x.i0(r6)
            com.amazon.aps.iva.x50.q r6 = r4.c
            boolean r6 = r6.c()
            if (r6 == 0) goto L83
            java.util.LinkedHashMap r6 = r4.d
            java.lang.Object r6 = r6.get(r5)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            if (r6 == 0) goto L4d
            return r6
        L4d:
            com.ellation.crunchyroll.api.etp.content.EtpContentService r6 = r4.b     // Catch: java.lang.Throwable -> L64
            r0.h = r4     // Catch: java.lang.Throwable -> L64
            r0.i = r5     // Catch: java.lang.Throwable -> L64
            r0.j = r4     // Catch: java.lang.Throwable -> L64
            r0.m = r3     // Catch: java.lang.Throwable -> L64
            java.lang.Object r6 = r6.getPanelIds(r5, r0)     // Catch: java.lang.Throwable -> L64
            if (r6 != r1) goto L5e
            return r1
        L5e:
            r0 = r4
            r1 = r5
            r5 = r0
        L61:
            com.ellation.crunchyroll.api.etp.content.ContentApiResponse r6 = (com.ellation.crunchyroll.api.etp.content.ContentApiResponse) r6     // Catch: java.lang.Throwable -> L2d
            goto L6c
        L64:
            r6 = move-exception
            r0 = r4
            r1 = r5
            r5 = r0
        L68:
            com.amazon.aps.iva.kb0.k$a r6 = com.amazon.aps.iva.ab.x.H(r6)
        L6c:
            r5.getClass()
            java.lang.Throwable r5 = com.amazon.aps.iva.kb0.k.a(r6)
            boolean r5 = r5 instanceof com.ellation.crunchyroll.api.etp.error.NotFoundException
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            java.util.LinkedHashMap r0 = r0.d
            r0.put(r1, r6)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L83:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.q00.c.m(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
