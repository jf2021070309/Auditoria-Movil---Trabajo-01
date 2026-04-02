package com.amazon.aps.iva.x0;

import com.amazon.aps.iva.o0.u0;
import com.amazon.aps.iva.x0.i;
/* compiled from: Effects.kt */
/* loaded from: classes.dex */
public final class b implements u0 {
    public final /* synthetic */ i.a a;

    public b(i.a aVar) {
        this.a = aVar;
    }

    @Override // com.amazon.aps.iva.o0.u0
    public final void dispose() {
        this.a.unregister();
    }
}
