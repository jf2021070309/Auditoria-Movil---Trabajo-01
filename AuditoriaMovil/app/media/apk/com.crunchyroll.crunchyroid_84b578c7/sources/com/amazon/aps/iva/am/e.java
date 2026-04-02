package com.amazon.aps.iva.am;

import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
/* compiled from: ProfilesNetworkSource.kt */
/* loaded from: classes2.dex */
public final class e implements d {
    public final EtpAccountService a;

    /* compiled from: ProfilesNetworkSource.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.profiles.data.sources.ProfilesNetworkSourceImpl", f = "ProfilesNetworkSource.kt", l = {26}, m = "get")
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
            return e.this.a(this);
        }
    }

    public e(EtpAccountService etpAccountService) {
        this.a = etpAccountService;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c A[LOOP:0: B:18:0x0056->B:20:0x005c, LOOP_END] */
    @Override // com.amazon.aps.iva.am.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.em.b> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.amazon.aps.iva.am.e.a
            if (r0 == 0) goto L13
            r0 = r13
            com.amazon.aps.iva.am.e$a r0 = (com.amazon.aps.iva.am.e.a) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.am.e$a r0 = new com.amazon.aps.iva.am.e$a
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.h
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.j
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            com.amazon.aps.iva.ab.x.i0(r13)
            goto L3d
        L27:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L2f:
            com.amazon.aps.iva.ab.x.i0(r13)
            r0.j = r3
            com.ellation.crunchyroll.api.etp.account.EtpAccountService r13 = r12.a
            java.lang.Object r13 = r13.getAllProfiles(r0)
            if (r13 != r1) goto L3d
            return r1
        L3d:
            com.ellation.crunchyroll.api.etp.account.model.AllProfilesResponse r13 = (com.ellation.crunchyroll.api.etp.account.model.AllProfilesResponse) r13
            int r0 = r13.getMaxProfilesCount()
            java.util.List r13 = r13.getProfiles()
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = com.amazon.aps.iva.lb0.r.Y(r13)
            r1.<init>(r2)
            java.util.Iterator r13 = r13.iterator()
        L56:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L90
            java.lang.Object r2 = r13.next()
            com.ellation.crunchyroll.api.etp.account.model.ProfileApiModel r2 = (com.ellation.crunchyroll.api.etp.account.model.ProfileApiModel) r2
            com.amazon.aps.iva.em.a r11 = new com.amazon.aps.iva.em.a
            java.lang.String r4 = r2.getProfileId()
            java.lang.String r5 = r2.getProfileName()
            java.lang.String r6 = r2.getUsername()
            java.lang.String r7 = r2.getAvatar()
            java.lang.String r8 = r2.getBackground()
            boolean r3 = r2.isSelected()
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            boolean r2 = r2.getCanSwitch()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r2)
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r1.add(r11)
            goto L56
        L90:
            com.amazon.aps.iva.em.b r13 = new com.amazon.aps.iva.em.b
            r13.<init>(r0, r1)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.am.e.a(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
