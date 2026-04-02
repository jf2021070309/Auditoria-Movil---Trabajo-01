package com.amazon.aps.iva.k0;

import com.amazon.aps.iva.c2.y;
import java.util.List;
/* compiled from: TextAnnotatedStringNode.kt */
/* loaded from: classes.dex */
public final class n extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<List<y>, Boolean> {
    public final /* synthetic */ o h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar) {
        super(1);
        this.h = oVar;
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Boolean invoke(List<y> list) {
        boolean z;
        List<y> list2 = list;
        com.amazon.aps.iva.yb0.j.f(list2, "textLayoutResult");
        y yVar = this.h.u1().n;
        if (yVar != null) {
            list2.add(yVar);
        } else {
            yVar = null;
        }
        if (yVar != null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
