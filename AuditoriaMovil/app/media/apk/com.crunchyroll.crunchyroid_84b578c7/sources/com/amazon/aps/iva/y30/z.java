package com.amazon.aps.iva.y30;

import com.ellation.crunchyroll.api.etp.account.model.ProfileApiModel;
import com.google.android.gms.common.Scopes;
/* compiled from: SettingsListPresenter.kt */
/* loaded from: classes2.dex */
public final class z extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<ProfileApiModel, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ w h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(w wVar) {
        super(1);
        this.h = wVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(ProfileApiModel profileApiModel) {
        ProfileApiModel profileApiModel2 = profileApiModel;
        com.amazon.aps.iva.yb0.j.f(profileApiModel2, Scopes.PROFILE);
        w wVar = this.h;
        w.q6(wVar).E5(profileApiModel2);
        w.q6(wVar).yf(profileApiModel2);
        return com.amazon.aps.iva.kb0.q.a;
    }
}
