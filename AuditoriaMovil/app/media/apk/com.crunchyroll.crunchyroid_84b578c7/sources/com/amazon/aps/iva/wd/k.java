package com.amazon.aps.iva.wd;

import com.amazon.aps.iva.js.b0;
import com.amazon.aps.iva.wd.u;
/* compiled from: CreatePasswordScreenContent.kt */
/* loaded from: classes.dex */
public final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.kb0.q> {
    public final /* synthetic */ com.amazon.aps.iva.xb0.l<u, com.amazon.aps.iva.kb0.q> h;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, com.amazon.aps.iva.xb0.l lVar) {
        super(0);
        this.h = lVar;
        this.i = str;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.kb0.q invoke() {
        this.h.invoke(new u.e(new com.amazon.aps.iva.fs.b(b0.TOP, this.i)));
        return com.amazon.aps.iva.kb0.q.a;
    }
}
