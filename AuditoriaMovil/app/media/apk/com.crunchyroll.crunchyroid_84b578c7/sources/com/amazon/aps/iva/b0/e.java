package com.amazon.aps.iva.b0;

import androidx.compose.foundation.gestures.a;
import com.amazon.aps.iva.b0.v0;
/* compiled from: Scrollable.kt */
/* loaded from: classes.dex */
public final class e implements b0 {
    public final com.amazon.aps.iva.z.u<Float> a;
    public final com.amazon.aps.iva.a1.h b;

    public e() {
        throw null;
    }

    public e(com.amazon.aps.iva.z.u uVar) {
        a.C0012a c0012a = androidx.compose.foundation.gestures.a.d;
        com.amazon.aps.iva.yb0.j.f(uVar, "flingDecay");
        com.amazon.aps.iva.yb0.j.f(c0012a, "motionDurationScale");
        this.a = uVar;
        this.b = c0012a;
    }

    @Override // com.amazon.aps.iva.b0.b0
    public final Object a(v0.c.b bVar, float f, com.amazon.aps.iva.ob0.d dVar) {
        return com.amazon.aps.iva.se0.i.g(dVar, this.b, new d(f, this, bVar, null));
    }
}
