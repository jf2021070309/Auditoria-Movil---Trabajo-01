package com.amazon.aps.iva.q2;

import com.amazon.aps.iva.o0.u0;
/* compiled from: Effects.kt */
/* loaded from: classes.dex */
public final class a implements u0 {
    public final /* synthetic */ r a;

    public a(r rVar) {
        this.a = rVar;
    }

    @Override // com.amazon.aps.iva.o0.u0
    public final void dispose() {
        r rVar = this.a;
        rVar.dismiss();
        rVar.e.d();
    }
}
