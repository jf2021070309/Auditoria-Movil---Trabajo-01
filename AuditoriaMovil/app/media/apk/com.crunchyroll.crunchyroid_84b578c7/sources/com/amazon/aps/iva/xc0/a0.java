package com.amazon.aps.iva.xc0;

import com.amazon.aps.iva.ee0.f1;
import java.util.Map;
/* compiled from: Jsr305Settings.kt */
/* loaded from: classes4.dex */
public final class a0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<String[]> {
    public final /* synthetic */ b0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var) {
        super(0);
        this.h = b0Var;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final String[] invoke() {
        com.amazon.aps.iva.mb0.a aVar = new com.amazon.aps.iva.mb0.a();
        b0 b0Var = this.h;
        aVar.add(b0Var.a.getDescription());
        h0 h0Var = b0Var.b;
        if (h0Var != null) {
            aVar.add("under-migration:" + h0Var.getDescription());
        }
        for (Map.Entry<com.amazon.aps.iva.nd0.c, h0> entry : b0Var.c.entrySet()) {
            aVar.add("@" + entry.getKey() + ':' + entry.getValue().getDescription());
        }
        return (String[]) f1.l(aVar).toArray(new String[0]);
    }
}
