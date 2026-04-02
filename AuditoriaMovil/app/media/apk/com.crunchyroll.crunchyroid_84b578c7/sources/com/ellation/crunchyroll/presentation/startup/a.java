package com.ellation.crunchyroll.presentation.startup;

import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
import com.crunchyroll.auth.c;
/* compiled from: StartupActivity.kt */
/* loaded from: classes2.dex */
public final class a extends l implements p<com.amazon.aps.iva.i.a<c, Integer>, com.amazon.aps.iva.h.b<Integer>, com.amazon.aps.iva.h.c<c>> {
    public final /* synthetic */ StartupActivity h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(StartupActivity startupActivity) {
        super(2);
        this.h = startupActivity;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.h.c<c> invoke(com.amazon.aps.iva.i.a<c, Integer> aVar, com.amazon.aps.iva.h.b<Integer> bVar) {
        com.amazon.aps.iva.i.a<c, Integer> aVar2 = aVar;
        com.amazon.aps.iva.h.b<Integer> bVar2 = bVar;
        j.f(aVar2, "contract");
        j.f(bVar2, "result");
        com.amazon.aps.iva.h.c<c> registerForActivityResult = this.h.registerForActivityResult(aVar2, bVar2);
        j.e(registerForActivityResult, "registerForActivityResult(contract, result)");
        return registerForActivityResult;
    }
}
