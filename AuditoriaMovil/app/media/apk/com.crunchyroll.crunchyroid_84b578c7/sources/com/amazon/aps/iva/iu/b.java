package com.amazon.aps.iva.iu;

import com.amazon.aps.iva.i5.v;
import com.amazon.aps.iva.yb0.j;
import com.ellation.crunchyroll.api.AccountPendingRestrictions;
import com.ellation.crunchyroll.api.AccountStateProvider;
import java.util.List;
/* compiled from: PendingStateHandlerImpl.kt */
/* loaded from: classes2.dex */
public final class b implements c {
    public final v<com.amazon.aps.iva.ju.c> a;

    public b(AccountStateProvider accountStateProvider) {
        List<AccountPendingRestrictions> pendingRestrictions = accountStateProvider.getPendingRestrictions();
        this.a = new v<>(new com.amazon.aps.iva.ju.c(!pendingRestrictions.contains(AccountPendingRestrictions.SET_USERNAME), !pendingRestrictions.contains(AccountPendingRestrictions.VERIFY_EMAIL)));
    }

    @Override // com.amazon.aps.iva.p001if.a
    public final void a(List<? extends AccountPendingRestrictions> list) {
        j.f(list, "userAccountState");
        this.a.i(new com.amazon.aps.iva.ju.c(!list.contains(AccountPendingRestrictions.SET_USERNAME), !list.contains(AccountPendingRestrictions.VERIFY_EMAIL)));
    }

    @Override // com.amazon.aps.iva.iu.c
    public final v b() {
        return this.a;
    }
}
