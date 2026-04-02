package com.amazon.aps.iva.ql;

import com.amazon.aps.iva.kb0.q;
import com.ellation.crunchyroll.api.etp.account.model.ProfileApiModel;
import com.ellation.crunchyroll.application.CrunchyrollApplication;
/* compiled from: PlayerSettingsSynchronizer.kt */
/* loaded from: classes2.dex */
public final class h extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<ProfileApiModel, q> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.a<Boolean> h;
    public final /* synthetic */ i i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(CrunchyrollApplication.g gVar, i iVar) {
        super(1);
        this.h = gVar;
        this.i = iVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final q invoke(ProfileApiModel profileApiModel) {
        ProfileApiModel profileApiModel2 = profileApiModel;
        if (profileApiModel2 != null && this.h.invoke().booleanValue()) {
            i iVar = this.i;
            com.amazon.aps.iva.se0.i.d(iVar.d, null, null, new j(iVar, profileApiModel2, null), 3);
            com.amazon.aps.iva.se0.i.d(iVar.d, null, null, new k(iVar, profileApiModel2, null), 3);
        }
        return q.a;
    }
}
