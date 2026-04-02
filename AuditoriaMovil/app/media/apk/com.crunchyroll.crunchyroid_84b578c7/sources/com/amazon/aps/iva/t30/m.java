package com.amazon.aps.iva.t30;

import com.amazon.aps.iva.o0.e0;
/* compiled from: MusicSearchResultItemDelegate.kt */
/* loaded from: classes2.dex */
public final class m extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.s30.j h;
    public final /* synthetic */ o i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.amazon.aps.iva.s30.j jVar, o oVar) {
        super(2);
        this.h = jVar;
        this.i = oVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final com.amazon.aps.iva.kb0.q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            com.amazon.aps.iva.s30.j jVar = this.h;
            o oVar = this.i;
            s.c(jVar, oVar.c, new l(jVar, oVar), oVar.b, null, iVar2, 4168, 16);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
