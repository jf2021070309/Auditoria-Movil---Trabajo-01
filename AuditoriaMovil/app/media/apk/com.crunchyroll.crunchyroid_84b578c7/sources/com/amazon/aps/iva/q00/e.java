package com.amazon.aps.iva.q00;

import com.amazon.aps.iva.x50.q;
import com.amazon.aps.iva.x50.r;
import com.amazon.aps.iva.yb0.n;
/* compiled from: SyncAvailabilityProvider.kt */
/* loaded from: classes2.dex */
public final class e implements d {
    public final q a;
    public final com.amazon.aps.iva.xb0.a<Boolean> b;

    public e(r rVar, n nVar) {
        this.a = rVar;
        this.b = nVar;
    }

    @Override // com.amazon.aps.iva.q00.d
    public final boolean a() {
        if (this.a.b() && !this.b.invoke().booleanValue()) {
            return true;
        }
        return false;
    }
}
