package com.amazon.aps.iva.ya0;

import android.view.LayoutInflater;
import com.amazon.aps.iva.yb0.j;
import com.amazon.aps.iva.yb0.l;
/* compiled from: ViewPumpContextWrapper.kt */
/* loaded from: classes4.dex */
public final class g extends l implements com.amazon.aps.iva.xb0.a<com.amazon.aps.iva.za0.c> {
    public final /* synthetic */ f h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar) {
        super(0);
        this.h = fVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final com.amazon.aps.iva.za0.c invoke() {
        f fVar = this.h;
        LayoutInflater from = LayoutInflater.from(fVar.getBaseContext());
        j.b(from, "LayoutInflater.from(baseContext)");
        return new com.amazon.aps.iva.za0.c(from, fVar, false);
    }
}
