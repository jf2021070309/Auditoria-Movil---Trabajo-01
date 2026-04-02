package com.amazon.aps.iva.y30;

import com.ellation.crunchyroll.api.etp.account.model.AccountApiModel;
/* compiled from: SettingsListPresenter.kt */
/* loaded from: classes2.dex */
public final class a0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<AccountApiModel, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ w h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(w wVar) {
        super(1);
        this.h = wVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final com.amazon.aps.iva.kb0.q invoke(AccountApiModel accountApiModel) {
        AccountApiModel accountApiModel2 = accountApiModel;
        com.amazon.aps.iva.yb0.j.f(accountApiModel2, "accountID");
        w wVar = this.h;
        w.q6(wVar).Ha(c.CHANGE_EMAIL, accountApiModel2.getEmail());
        if (wVar.t && (!com.amazon.aps.iva.oe0.m.b0(accountApiModel2.getPhoneNumber()))) {
            wVar.getView().R5();
            wVar.getView().La();
            wVar.getView().Ha(c.CHANGE_PHONE, accountApiModel2.getPhoneNumber());
        } else {
            wVar.getView().me();
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
