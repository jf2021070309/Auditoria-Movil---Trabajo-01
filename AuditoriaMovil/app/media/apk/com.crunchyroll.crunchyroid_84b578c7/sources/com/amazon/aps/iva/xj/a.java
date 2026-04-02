package com.amazon.aps.iva.xj;

import com.amazon.aps.iva.yb0.j;
/* compiled from: UseCaseModule_ProvideGetDrmLicenseUseCaseFactory.java */
/* loaded from: classes.dex */
public final class a implements com.amazon.aps.iva.jb0.a {
    public final com.amazon.aps.iva.jb0.a<com.amazon.aps.iva.zj.a> a;

    public a(com.amazon.aps.iva.vj.a aVar) {
        this.a = aVar;
    }

    @Override // com.amazon.aps.iva.jb0.a
    public final Object get() {
        com.amazon.aps.iva.zj.a aVar = this.a.get();
        j.f(aVar, "drmLicenseGateway");
        return new com.amazon.aps.iva.ak.a(aVar);
    }
}
