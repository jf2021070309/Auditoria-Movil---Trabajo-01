package com.amazon.aps.iva.nl;

import com.amazon.aps.iva.o0.e0;
/* compiled from: AudioSettingsFragment.kt */
/* loaded from: classes2.dex */
public final class c extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ e h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar) {
        super(2);
        this.h = eVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            e eVar = this.h;
            n.a((q) eVar.e.getValue(), new b((l) eVar.f.getValue()), iVar2, 0, 0);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
