package com.amazon.aps.iva.f0;
/* compiled from: Effects.kt */
/* loaded from: classes.dex */
public final class z implements com.amazon.aps.iva.o0.u0 {
    public final /* synthetic */ y a;

    public z(y yVar) {
        this.a = yVar;
    }

    @Override // com.amazon.aps.iva.o0.u0
    public final void dispose() {
        y yVar = this.a;
        int b = yVar.b();
        for (int i = 0; i < b; i++) {
            yVar.release();
        }
    }
}
