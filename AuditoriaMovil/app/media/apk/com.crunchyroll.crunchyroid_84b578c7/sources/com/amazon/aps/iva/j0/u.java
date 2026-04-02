package com.amazon.aps.iva.j0;

import com.amazon.aps.iva.j0.p2;
import java.util.List;
/* compiled from: CoreTextField.kt */
/* loaded from: classes.dex */
public final class u extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.c2.b, Boolean> {
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ p2 j;
    public final /* synthetic */ com.amazon.aps.iva.a2.c0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(boolean z, boolean z2, p2 p2Var, com.amazon.aps.iva.a2.c0 c0Var) {
        super(1);
        this.h = z;
        this.i = z2;
        this.j = p2Var;
        this.k = c0Var;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Boolean invoke(com.amazon.aps.iva.c2.b bVar) {
        com.amazon.aps.iva.c2.b bVar2 = bVar;
        com.amazon.aps.iva.yb0.j.f(bVar2, "text");
        if (!this.h && this.i) {
            p2 p2Var = this.j;
            com.amazon.aps.iva.i2.n0 n0Var = p2Var.d;
            p2.b bVar3 = p2Var.r;
            com.amazon.aps.iva.kb0.q qVar = null;
            if (n0Var != null) {
                List<? extends com.amazon.aps.iva.i2.f> K = com.amazon.aps.iva.ee0.f1.K(new com.amazon.aps.iva.i2.c(), new com.amazon.aps.iva.i2.b(bVar2, 1));
                com.amazon.aps.iva.i2.h hVar = p2Var.c;
                com.amazon.aps.iva.yb0.j.f(hVar, "editProcessor");
                com.amazon.aps.iva.yb0.j.f(bVar3, "onValueChange");
                com.amazon.aps.iva.i2.e0 a = hVar.a(K);
                n0Var.b(null, a);
                bVar3.invoke(a);
                qVar = com.amazon.aps.iva.kb0.q.a;
            }
            if (qVar == null) {
                String str = bVar2.b;
                int length = str.length();
                bVar3.invoke(new com.amazon.aps.iva.i2.e0(str, com.amazon.aps.iva.ab.x.f(length, length), 4));
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
