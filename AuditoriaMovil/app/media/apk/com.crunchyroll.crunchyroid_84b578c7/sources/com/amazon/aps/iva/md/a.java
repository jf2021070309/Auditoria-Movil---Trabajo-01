package com.amazon.aps.iva.md;

import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
/* compiled from: DeleteAccountFragment.kt */
/* loaded from: classes.dex */
public final class a extends l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
    public final /* synthetic */ String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str) {
        super(2);
        this.h = str;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            String str = this.h;
            if (str != null) {
                k.a(0, iVar2, str);
            }
        }
        return q.a;
    }
}
