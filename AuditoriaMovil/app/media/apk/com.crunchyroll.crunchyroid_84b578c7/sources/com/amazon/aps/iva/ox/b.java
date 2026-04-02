package com.amazon.aps.iva.ox;

import androidx.fragment.app.Fragment;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: ProfileActivationRouterFactory.kt */
/* loaded from: classes2.dex */
public final class b extends l implements p<com.amazon.aps.iva.i.a<q, Integer>, com.amazon.aps.iva.h.b<Integer>, com.amazon.aps.iva.h.c<q>> {
    public final /* synthetic */ Fragment h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Fragment fragment) {
        super(2);
        this.h = fragment;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.h.c<q> invoke(com.amazon.aps.iva.i.a<q, Integer> aVar, com.amazon.aps.iva.h.b<Integer> bVar) {
        com.amazon.aps.iva.i.a<q, Integer> aVar2 = aVar;
        com.amazon.aps.iva.h.b<Integer> bVar2 = bVar;
        j.f(aVar2, "contract");
        j.f(bVar2, "result");
        com.amazon.aps.iva.h.c<q> registerForActivityResult = this.h.registerForActivityResult(aVar2, bVar2);
        j.e(registerForActivityResult, "fragment.registerForActi…yResult(contract, result)");
        return registerForActivityResult;
    }
}
