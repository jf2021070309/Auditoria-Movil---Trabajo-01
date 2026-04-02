package com.amazon.aps.iva.md;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
/* compiled from: DeleteAccountScreen.kt */
/* loaded from: classes.dex */
public final class j extends l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
    public final /* synthetic */ String h;
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, int i) {
        super(2);
        this.h = str;
        this.i = i;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        num.intValue();
        k.a(com.amazon.aps.iva.ff0.b.I(this.i | 1), iVar, this.h);
        return q.a;
    }
}
