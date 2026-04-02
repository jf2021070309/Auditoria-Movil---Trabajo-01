package com.amazon.aps.iva.rc0;

import com.amazon.aps.iva.ee0.c1;
import com.amazon.aps.iva.rc0.k;
/* compiled from: AbstractTypeParameterDescriptor.java */
/* loaded from: classes4.dex */
public final class h implements com.amazon.aps.iva.xb0.a<c1> {
    public final /* synthetic */ com.amazon.aps.iva.de0.l b;
    public final /* synthetic */ com.amazon.aps.iva.oc0.w0 c;
    public final /* synthetic */ k d;

    public h(k kVar, com.amazon.aps.iva.de0.l lVar, com.amazon.aps.iva.oc0.w0 w0Var) {
        this.d = kVar;
        this.b = lVar;
        this.c = w0Var;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final c1 invoke() {
        return new k.a(this.d, this.b, this.c);
    }
}
