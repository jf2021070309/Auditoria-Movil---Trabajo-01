package com.amazon.aps.iva.x0;

import com.amazon.aps.iva.o0.u0;
import com.amazon.aps.iva.x0.f;
/* compiled from: Effects.kt */
/* loaded from: classes.dex */
public final class g implements u0 {
    public final /* synthetic */ f.c a;
    public final /* synthetic */ f b;
    public final /* synthetic */ Object c;

    public g(f.c cVar, f fVar, Object obj) {
        this.a = cVar;
        this.b = fVar;
        this.c = obj;
    }

    @Override // com.amazon.aps.iva.o0.u0
    public final void dispose() {
        f fVar = this.b;
        this.a.a(fVar.a);
        fVar.b.remove(this.c);
    }
}
