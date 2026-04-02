package com.amazon.aps.iva.cj;

import com.ellation.crunchyroll.api.etp.account.model.AccountApiModel;
/* compiled from: PlayerFeatureImpl.kt */
/* loaded from: classes.dex */
public final class o extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<String> {
    public final /* synthetic */ k h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.amazon.aps.iva.nx.f fVar) {
        super(0);
        this.h = fVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final String invoke() {
        String guid;
        AccountApiModel accountApiModel = (AccountApiModel) this.h.l().invoke();
        if (accountApiModel == null || (guid = accountApiModel.getGuid()) == null) {
            return "anonymous";
        }
        return guid;
    }
}
