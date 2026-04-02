package com.amazon.aps.iva.zn;

import com.amazon.aps.iva.js.b0;
import com.amazon.aps.iva.yb0.d0;
/* compiled from: Buttons.kt */
/* loaded from: classes2.dex */
public final class b extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<com.amazon.aps.iva.fs.b, com.amazon.aps.iva.kb0.q> h;
    public final /* synthetic */ d0<b0> i;
    public final /* synthetic */ String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(com.amazon.aps.iva.xb0.l<? super com.amazon.aps.iva.fs.b, com.amazon.aps.iva.kb0.q> lVar, d0<b0> d0Var, String str) {
        super(0);
        this.h = lVar;
        this.i = d0Var;
        this.j = str;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        this.h.invoke(new com.amazon.aps.iva.fs.b(this.i.b, this.j));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
