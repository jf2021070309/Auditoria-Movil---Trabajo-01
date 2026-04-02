package com.amazon.aps.iva.se0;

import com.amazon.aps.iva.ob0.g;
/* compiled from: CoroutineContext.kt */
/* loaded from: classes4.dex */
public final class c0 extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.p<Boolean, g.b, Boolean> {
    public static final c0 h = new c0();

    public c0() {
        super(2);
    }

    @Override // com.amazon.aps.iva.xb0.p
    public final Boolean invoke(Boolean bool, g.b bVar) {
        boolean z;
        g.b bVar2 = bVar;
        if (!bool.booleanValue() && !(bVar2 instanceof a0)) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
