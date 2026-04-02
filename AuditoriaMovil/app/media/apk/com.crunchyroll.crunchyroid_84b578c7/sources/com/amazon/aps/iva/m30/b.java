package com.amazon.aps.iva.m30;

import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.pm.e;
import com.ellation.crunchyroll.api.etp.account.model.ProfileApiModel;
/* compiled from: UserProfileStoreImpl.kt */
/* loaded from: classes2.dex */
public final class b implements e {
    public static final b a = new b();
    public static final v<ProfileApiModel> b = new v<>(com.ellation.crunchyroll.application.e.d().j0());

    @Override // com.amazon.aps.iva.pm.e
    public final void a() {
        b.i(null);
    }

    @Override // com.amazon.aps.iva.pm.d
    public final v b() {
        return b;
    }

    @Override // com.amazon.aps.iva.pm.e
    public final void c(ProfileApiModel profileApiModel) {
        com.ellation.crunchyroll.application.e.d().k0(profileApiModel);
        b.k(profileApiModel);
    }
}
