package com.amazon.aps.iva.j0;

import java.util.List;
/* compiled from: CoreTextField.kt */
/* loaded from: classes.dex */
public final class t extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<com.amazon.aps.iva.c2.y>, Boolean> {
    public final /* synthetic */ p2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(p2 p2Var) {
        super(1);
        this.h = p2Var;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Boolean invoke(List<com.amazon.aps.iva.c2.y> list) {
        boolean z;
        List<com.amazon.aps.iva.c2.y> list2 = list;
        com.amazon.aps.iva.yb0.j.f(list2, "it");
        p2 p2Var = this.h;
        if (p2Var.c() != null) {
            q2 c = p2Var.c();
            com.amazon.aps.iva.yb0.j.c(c);
            list2.add(c.a);
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
