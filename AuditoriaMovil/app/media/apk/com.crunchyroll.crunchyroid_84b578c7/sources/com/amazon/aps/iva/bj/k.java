package com.amazon.aps.iva.bj;

import com.amazon.aps.iva.yg.c;
import com.ellation.crunchyroll.api.AccountStateProvider;
/* compiled from: AccountPendingStatePresenter.kt */
/* loaded from: classes.dex */
public final class k {
    public static l a(m mVar, com.amazon.aps.iva.zg.n nVar, n nVar2, AccountStateProvider accountStateProvider, o oVar, b bVar) {
        com.amazon.aps.iva.yg.d dVar = c.a.b;
        if (dVar != null) {
            com.amazon.aps.iva.yb0.j.f(mVar, "view");
            return new l(mVar, nVar, nVar2, accountStateProvider, oVar, dVar.g().invoke(), bVar);
        }
        com.amazon.aps.iva.yb0.j.m("dependencies");
        throw null;
    }
}
