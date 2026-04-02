package com.amazon.aps.iva.u10;

import com.amazon.aps.iva.wy.j;
import com.amazon.aps.iva.ys.e;
import com.amazon.aps.iva.ys.f;
/* compiled from: AppLegalInfoPresenter.kt */
/* loaded from: classes2.dex */
public final class a extends com.amazon.aps.iva.wy.b<b> {
    public final e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, b bVar) {
        super(bVar, new j[0]);
        com.amazon.aps.iva.yb0.j.f(bVar, "view");
        this.b = fVar;
    }

    @Override // com.amazon.aps.iva.wy.b, com.amazon.aps.iva.wy.k
    public final void onCreate() {
        getView().setAppVersionText(this.b.a());
    }
}
