package com.amazon.aps.iva.f;

import com.amazon.aps.iva.f.a;
import com.amazon.aps.iva.o0.u0;
/* compiled from: Effects.kt */
/* loaded from: classes.dex */
public final class b implements u0 {
    public final /* synthetic */ a.d a;

    public b(a.d dVar) {
        this.a = dVar;
    }

    @Override // com.amazon.aps.iva.o0.u0
    public final void dispose() {
        this.a.remove();
    }
}
