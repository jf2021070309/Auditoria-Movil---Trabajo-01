package com.amazon.aps.iva.g70;

import com.amazon.aps.iva.c2.a0;
import com.amazon.aps.iva.d0.x1;
import com.amazon.aps.iva.m0.a4;
import com.amazon.aps.iva.o0.e0;
import com.amazon.aps.iva.xb0.q;
import com.amazon.aps.iva.yb0.l;
import java.util.Locale;
/* compiled from: ComposeAlertDialog.kt */
/* loaded from: classes2.dex */
public final class e extends l implements q<x1, com.amazon.aps.iva.o0.i, Integer, com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str) {
        super(3);
        this.h = str;
    }

    @Override // com.amazon.aps.iva.xb0.q
    public final com.amazon.aps.iva.kb0.q invoke(x1 x1Var, com.amazon.aps.iva.o0.i iVar, Integer num) {
        com.amazon.aps.iva.o0.i iVar2 = iVar;
        int intValue = num.intValue();
        com.amazon.aps.iva.yb0.j.f(x1Var, "$this$TextButton");
        if ((intValue & 81) == 16 && iVar2.h()) {
            iVar2.A();
        } else {
            e0.b bVar = e0.a;
            a0 a0Var = com.amazon.aps.iva.ao.b.p;
            String upperCase = this.h.toUpperCase(Locale.ROOT);
            com.amazon.aps.iva.yb0.j.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            a4.b(upperCase, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, a0Var, iVar2, 0, 0, 65534);
        }
        return com.amazon.aps.iva.kb0.q.a;
    }
}
