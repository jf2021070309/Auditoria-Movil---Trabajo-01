package com.amazon.aps.iva.md;

import android.os.Bundle;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.xb0.p;
import com.amazon.aps.iva.yb0.l;
/* compiled from: DeleteAccountFragment.kt */
/* loaded from: classes.dex */
public final class b extends l implements p<com.amazon.aps.iva.o0.i, Integer, q> {
    public final /* synthetic */ c h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(2);
        this.h = cVar;
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final q invoke(com.amazon.aps.iva.o0.i iVar, Integer num) {
        String str;
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        if ((num.intValue() & 11) == 2 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            Bundle arguments = this.h.getArguments();
            if (arguments != null) {
                str = arguments.getString("external_url");
            } else {
                str = null;
            }
            com.amazon.aps.iva.ao.c.a(com.amazon.aps.iva.v0.b.b(iVar2, 1813057300, new a(str)), iVar2, 6);
        }
        return q.a;
    }
}
