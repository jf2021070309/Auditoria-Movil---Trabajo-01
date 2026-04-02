package com.amazon.aps.iva.je0;

import com.amazon.aps.iva.ee0.c1;
import com.amazon.aps.iva.ee0.e1;
import com.amazon.aps.iva.ee0.j1;
import com.amazon.aps.iva.ee0.l1;
import com.amazon.aps.iva.ee0.v1;
import com.amazon.aps.iva.yb0.j;
/* compiled from: CapturedTypeApproximation.kt */
/* loaded from: classes4.dex */
public final class d extends e1 {
    @Override // com.amazon.aps.iva.ee0.e1
    public final j1 g(c1 c1Var) {
        com.amazon.aps.iva.rd0.b bVar;
        j.f(c1Var, "key");
        if (c1Var instanceof com.amazon.aps.iva.rd0.b) {
            bVar = (com.amazon.aps.iva.rd0.b) c1Var;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            return null;
        }
        if (bVar.b().b()) {
            return new l1(bVar.b().getType(), v1.OUT_VARIANCE);
        }
        return bVar.b();
    }
}
