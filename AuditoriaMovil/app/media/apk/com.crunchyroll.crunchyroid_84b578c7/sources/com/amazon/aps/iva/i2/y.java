package com.amazon.aps.iva.i2;

import com.amazon.aps.iva.i2.x;
import com.amazon.aps.iva.o0.w1;
/* compiled from: PlatformTextInputAdapter.kt */
/* loaded from: classes.dex */
public final class y extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.a<Boolean> {
    public final /* synthetic */ x.b<Object> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(x.b<Object> bVar) {
        super(0);
        this.h = bVar;
    }

    @Override // com.amazon.aps.iva.xb0.a
    public final Boolean invoke() {
        boolean z;
        x.b<Object> bVar = this.h;
        w1 w1Var = bVar.b;
        w1Var.e(bVar.b.t() - 1);
        boolean z2 = true;
        if (w1Var.t() >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (w1Var.t() == 0) {
                x.this.getClass();
            } else {
                z2 = false;
            }
            return Boolean.valueOf(z2);
        }
        throw new IllegalStateException(("AdapterWithRefCount.decrementRefCount called too many times (refCount=" + w1Var.t() + ')').toString());
    }
}
