package com.amazon.aps.iva.oz;

import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.jd.d;
import com.ellation.crunchyroll.api.etp.account.model.AccountApiModel;
import com.ellation.crunchyroll.application.e;
/* compiled from: AccountDataStoreImpl.kt */
/* loaded from: classes2.dex */
public final class a implements d {
    public static final a a = new a();
    public static final v<AccountApiModel> b = new v<>(e.d().m0());

    @Override // com.amazon.aps.iva.jd.d
    public final void a() {
        b.i(null);
    }

    @Override // com.amazon.aps.iva.jd.d
    public final void b(AccountApiModel accountApiModel) {
        e.d().l0(accountApiModel);
        b.k(accountApiModel);
    }

    @Override // com.amazon.aps.iva.jd.d
    public final v c() {
        return b;
    }
}
