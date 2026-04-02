package com.amazon.aps.iva.am;

import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
/* compiled from: ProfileNetworkSource.kt */
/* loaded from: classes2.dex */
public final class c implements b {
    public final EtpAccountService a;

    /* compiled from: ProfileNetworkSource.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.profiles.data.sources.ProfileNetworkSourceImpl", f = "ProfileNetworkSource.kt", l = {21}, m = "fetchProfile")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public String h;
        public /* synthetic */ Object i;
        public int k;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return c.this.a(null, this);
        }
    }

    public c(EtpAccountService etpAccountService) {
        this.a = etpAccountService;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // com.amazon.aps.iva.am.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r11, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.em.a> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.amazon.aps.iva.am.c.a
            if (r0 == 0) goto L13
            r0 = r12
            com.amazon.aps.iva.am.c$a r0 = (com.amazon.aps.iva.am.c.a) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.am.c$a r0 = new com.amazon.aps.iva.am.c$a
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r11 = r0.h
            com.amazon.aps.iva.ab.x.i0(r12)
            goto L41
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            com.amazon.aps.iva.ab.x.i0(r12)
            r0.h = r11
            r0.k = r3
            com.ellation.crunchyroll.api.etp.account.EtpAccountService r12 = r10.a
            java.lang.Object r12 = r12.getProfileById(r11, r0)
            if (r12 != r1) goto L41
            return r1
        L41:
            r3 = r11
            com.ellation.crunchyroll.api.etp.account.model.UserProfileResponse r12 = (com.ellation.crunchyroll.api.etp.account.model.UserProfileResponse) r12
            com.amazon.aps.iva.em.a r11 = new com.amazon.aps.iva.em.a
            java.lang.String r4 = r12.getProfileName()
            java.lang.String r5 = r12.getUserName()
            java.lang.String r6 = r12.getAvatar()
            java.lang.String r7 = r12.getBackground()
            r8 = 0
            r9 = 0
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.am.c.a(java.lang.String, com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
