package com.amazon.aps.iva.n30;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.oe0.m;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.ellation.crunchyroll.api.etp.account.model.ProfileApiModel;
import com.google.android.gms.common.Scopes;
/* compiled from: UserProfilePresenter.kt */
/* loaded from: classes2.dex */
public final class d extends l implements com.amazon.aps.iva.xb0.l<ProfileApiModel, q> {
    public final /* synthetic */ e h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar) {
        super(1);
        this.h = eVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(ProfileApiModel profileApiModel) {
        ProfileApiModel profileApiModel2 = profileApiModel;
        j.f(profileApiModel2, Scopes.PROFILE);
        e eVar = this.h;
        e.q6(eVar).o();
        e.q6(eVar).O7();
        if (!m.b0(profileApiModel2.getUsername())) {
            e.q6(eVar).setUsername(profileApiModel2.getUsername());
        }
        return q.a;
    }
}
