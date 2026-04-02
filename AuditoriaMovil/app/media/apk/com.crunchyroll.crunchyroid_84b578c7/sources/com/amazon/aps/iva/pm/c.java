package com.amazon.aps.iva.pm;

import com.amazon.aps.iva.jm.y;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.ql.e;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import com.ellation.crunchyroll.api.etp.account.model.ProfileApiModel;
import com.ellation.crunchyroll.api.etp.account.model.UpdateAudioLanguageBody;
import com.ellation.crunchyroll.api.etp.account.model.UpdateSubtitleLanguageBody;
import com.ellation.crunchyroll.api.etp.model.Image;
/* compiled from: UserProfileInteractorImpl.kt */
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.wy.a implements b, y {
    public final EtpAccountService b;
    public final e c;
    public final y d;

    /* compiled from: UserProfileInteractorImpl.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.profiles.presentation.profile.UserProfileInteractorImpl", f = "UserProfileInteractorImpl.kt", l = {19}, m = "loadAndStoreUserProfile")
    /* loaded from: classes2.dex */
    public static final class a extends com.amazon.aps.iva.qb0.c {
        public c h;
        public /* synthetic */ Object i;
        public int k;

        public a(com.amazon.aps.iva.ob0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // com.amazon.aps.iva.qb0.a
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return c.this.r1(this);
        }
    }

    public c(EtpAccountService etpAccountService, e eVar, y yVar) {
        j.f(etpAccountService, "accountService");
        j.f(eVar, "userProfileStore");
        j.f(yVar, "avatarProvider");
        this.b = etpAccountService;
        this.c = eVar;
        this.d = yVar;
    }

    @Override // com.amazon.aps.iva.pm.b
    public final Object C0(String str, com.amazon.aps.iva.qb0.c cVar) {
        e eVar = this.c;
        ProfileApiModel profileApiModel = (ProfileApiModel) eVar.b().d();
        if (profileApiModel != null) {
            eVar.c(ProfileApiModel.copy$default(profileApiModel, null, null, null, null, null, null, str, null, null, null, false, false, false, 8127, null));
        }
        Object updateSubtitleLanguage = this.b.updateSubtitleLanguage(new UpdateSubtitleLanguageBody(str), cVar);
        if (updateSubtitleLanguage == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return updateSubtitleLanguage;
        }
        return q.a;
    }

    @Override // com.amazon.aps.iva.pm.b
    public final ProfileApiModel E() {
        return (ProfileApiModel) this.c.b().d();
    }

    @Override // com.amazon.aps.iva.pm.b
    public final Object Q0(String str, e.a aVar) {
        Object updateAudioLanguage = this.b.updateAudioLanguage(new UpdateAudioLanguageBody(str), aVar);
        if (updateAudioLanguage == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return updateAudioLanguage;
        }
        return q.a;
    }

    @Override // com.amazon.aps.iva.jm.y
    public final String m(String str) {
        j.f(str, "assetId");
        return this.d.m(str);
    }

    @Override // com.amazon.aps.iva.jm.y
    public final Image q() {
        return this.d.q();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // com.amazon.aps.iva.pm.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r1(com.amazon.aps.iva.ob0.d<? super com.ellation.crunchyroll.api.etp.account.model.ProfileApiModel> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.amazon.aps.iva.pm.c.a
            if (r0 == 0) goto L13
            r0 = r5
            com.amazon.aps.iva.pm.c$a r0 = (com.amazon.aps.iva.pm.c.a) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            com.amazon.aps.iva.pm.c$a r0 = new com.amazon.aps.iva.pm.c$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.i
            com.amazon.aps.iva.pb0.a r1 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r2 = r0.k
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.amazon.aps.iva.pm.c r0 = r0.h
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
            java.lang.Object r5 = r5.getProfile(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            r0 = r4
        L42:
            com.ellation.crunchyroll.api.etp.account.model.ProfileApiModel r5 = (com.ellation.crunchyroll.api.etp.account.model.ProfileApiModel) r5
            com.amazon.aps.iva.pm.e r0 = r0.c
            r0.c(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.pm.c.r1(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }

    @Override // com.amazon.aps.iva.jm.y
    public final String v() {
        return this.d.v();
    }
}
