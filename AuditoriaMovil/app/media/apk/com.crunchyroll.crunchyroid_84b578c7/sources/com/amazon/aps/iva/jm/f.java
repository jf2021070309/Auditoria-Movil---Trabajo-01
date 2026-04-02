package com.amazon.aps.iva.jm;

import com.amazon.aps.iva.jm.d;
import com.ellation.crunchyroll.api.etp.account.EtpAccountService;
import com.ellation.crunchyroll.api.etp.account.model.UpdateAvatarBody;
import com.ellation.crunchyroll.api.etp.assets.DigitalAssetManagementService;
import java.util.ArrayList;
/* compiled from: AvatarSelectionInteractor.kt */
/* loaded from: classes2.dex */
public final class f extends com.amazon.aps.iva.wy.a implements e {
    public final DigitalAssetManagementService b;
    public final EtpAccountService c;
    public final com.amazon.aps.iva.p60.f d;
    public final ArrayList e;

    /* compiled from: AvatarSelectionInteractor.kt */
    @com.amazon.aps.iva.qb0.e(c = "com.crunchyroll.profiles.presentation.avatar.AvatarSelectionInteractorImpl", f = "AvatarSelectionInteractor.kt", l = {40}, m = "loadAvatars")
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
            return f.this.j1(this);
        }
    }

    public f(DigitalAssetManagementService digitalAssetManagementService, EtpAccountService etpAccountService, com.amazon.aps.iva.p60.g gVar) {
        this.b = digitalAssetManagementService;
        this.c = etpAccountService;
        this.d = gVar;
        ArrayList arrayList = new ArrayList(5);
        for (int i = 0; i < 5; i++) {
            arrayList.add(new d.a(null));
        }
        this.e = arrayList;
    }

    @Override // com.amazon.aps.iva.jm.e
    public final Object W(String str, com.amazon.aps.iva.ob0.d<? super com.amazon.aps.iva.kb0.q> dVar) {
        Object updateAvatar = this.c.updateAvatar(new UpdateAvatarBody(str), dVar);
        if (updateAvatar == com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED) {
            return updateAvatar;
        }
        return com.amazon.aps.iva.kb0.q.a;
    }

    @Override // com.amazon.aps.iva.jm.e
    public final ArrayList j() {
        return this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    @Override // com.amazon.aps.iva.jm.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j1(com.amazon.aps.iva.ob0.d<? super java.util.List<com.ellation.crunchyroll.api.etp.assets.model.AvatarCollection>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.amazon.aps.iva.jm.f.a
            if (r0 == 0) goto L13
            r0 = r8
            com.amazon.aps.iva.jm.f$a r0 = (com.amazon.aps.iva.jm.f.a) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            com.amazon.aps.iva.jm.f$a r0 = new com.amazon.aps.iva.jm.f$a
            r0.<init>(r8)
        L18:
            r4 = r0
            java.lang.Object r8 = r4.h
            com.amazon.aps.iva.pb0.a r0 = com.amazon.aps.iva.pb0.a.COROUTINE_SUSPENDED
            int r1 = r4.j
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            com.amazon.aps.iva.ab.x.i0(r8)
            goto L51
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L30:
            com.amazon.aps.iva.ab.x.i0(r8)
            com.ellation.crunchyroll.api.etp.assets.DigitalAssetManagementService r1 = r7.b
            com.amazon.aps.iva.p60.f r8 = r7.d
            java.util.Locale r8 = r8.a()
            java.lang.String r8 = r8.toLanguageTag()
            java.lang.String r3 = "localeProvider.locale.toLanguageTag()"
            com.amazon.aps.iva.yb0.j.e(r8, r3)
            r3 = 0
            r5 = 2
            r6 = 0
            r4.j = r2
            r2 = r8
            java.lang.Object r8 = com.ellation.crunchyroll.api.etp.assets.DigitalAssetManagementService.DefaultImpls.getAvatars$default(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L51
            return r0
        L51:
            com.ellation.crunchyroll.api.etp.model.ApiCollection r8 = (com.ellation.crunchyroll.api.etp.model.ApiCollection) r8
            java.util.List r8 = r8.getItems()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.aps.iva.jm.f.j1(com.amazon.aps.iva.ob0.d):java.lang.Object");
    }
}
