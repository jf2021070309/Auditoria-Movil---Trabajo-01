package com.amazon.aps.iva.jd;

import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import com.ellation.crunchyroll.api.etp.account.model.AccountApiModel;
/* compiled from: AccountDataInteractorImpl.kt */
/* loaded from: classes.dex */
public final class c extends com.amazon.aps.iva.wy.a implements a {
    public final EtpAccountService b;
    public final d c;

    public c(EtpAccountService etpAccountService) {
        com.amazon.aps.iva.oz.a aVar = com.amazon.aps.iva.oz.a.a;
        this.b = etpAccountService;
        this.c = aVar;
    }

    @Override // com.amazon.aps.iva.jd.a
    public final AccountApiModel J0() {
        return (AccountApiModel) this.c.c().d();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // com.amazon.aps.iva.jd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable v1(com.amazon.aps.iva.ob0.d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.amazon.aps.iva.jd.b
            if (r0 == 0) goto L13
            r0 = r5
            com.amazon.aps.iva.jd.b r0 = (com.amazon.aps.iva.jd.b) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.jd.b r0 = new com.amazon.aps.iva.jd.b
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.amazon.aps.iva.jd.c r0 = r0.h
            com.amazon.aps.iva.ab.x.i0(r5)
            goto L42
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            com.amazon.aps.iva.ab.x.i0(r5)
            r0.h = r4
            r0.k = r3
            com.ellation.crunchyroll.api.etp.account.EtpAccountService r5 = r4.b
            java.lang.Object r5 = r5.getAccount(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            r0 = r4
        L42:
            com.ellation.crunchyroll.api.etp.account.model.AccountApiModel r5 = (com.ellation.crunchyroll.api.etp.account.model.AccountApiModel) r5
            com.amazon.aps.iva.jd.d r0 = r0.c
            r0.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.jd.c.v1(com.amazon.aps.iva.ob0.d):java.io.Serializable");
    }
}
