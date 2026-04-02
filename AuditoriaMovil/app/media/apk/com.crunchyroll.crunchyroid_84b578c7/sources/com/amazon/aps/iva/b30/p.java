package com.amazon.aps.iva.b30;

import com.amazon.aps.iva.i5.w;
/* compiled from: UnverifiedPurchaseMonitor.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class p implements w, com.amazon.aps.iva.yb0.f {
    public final /* synthetic */ com.amazon.aps.iva.xb0.l a;

    public p(n nVar) {
        this.a = nVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w) || !(obj instanceof com.amazon.aps.iva.yb0.f)) {
            return false;
        }
        return com.amazon.aps.iva.yb0.j.a(this.a, ((com.amazon.aps.iva.yb0.f) obj).getFunctionDelegate());
    }

    @Override // com.amazon.aps.iva.yb0.f
    public final com.amazon.aps.iva.kb0.a<?> getFunctionDelegate() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // com.amazon.aps.iva.i5.w
    public final /* synthetic */ void onChanged(Object obj) {
        this.a.invoke(obj);
    }
}
