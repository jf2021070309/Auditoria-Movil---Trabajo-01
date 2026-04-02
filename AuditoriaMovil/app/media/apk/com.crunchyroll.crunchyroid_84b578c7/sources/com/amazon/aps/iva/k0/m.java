package com.amazon.aps.iva.k0;

import com.amazon.aps.iva.c2.y;
/* compiled from: SelectionController.kt */
/* loaded from: classes.dex */
public final class m {
    public static final m c = new m(null, null);
    public final com.amazon.aps.iva.s1.q a;
    public final y b;

    public m(com.amazon.aps.iva.s1.q qVar, y yVar) {
        this.a = qVar;
        this.b = yVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.amazon.aps.iva.s1.q] */
    public static m a(m mVar, androidx.compose.ui.node.o oVar, y yVar, int i) {
        androidx.compose.ui.node.o oVar2 = oVar;
        if ((i & 1) != 0) {
            oVar2 = mVar.a;
        }
        if ((i & 2) != 0) {
            yVar = mVar.b;
        }
        mVar.getClass();
        return new m(oVar2, yVar);
    }
}
