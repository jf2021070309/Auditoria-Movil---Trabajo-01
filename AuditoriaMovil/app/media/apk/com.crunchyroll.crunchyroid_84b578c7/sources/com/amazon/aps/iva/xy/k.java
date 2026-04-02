package com.amazon.aps.iva.xy;

import java.io.IOException;
/* compiled from: FlowExtensions.kt */
/* loaded from: classes2.dex */
public final class k extends com.amazon.aps.iva.yb0.l implements com.amazon.aps.iva.xb0.l<Throwable, Boolean> {
    public static final k h = new k();

    public k() {
        super(1);
    }

    @Override // com.amazon.aps.iva.xb0.l
    public final Boolean invoke(Throwable th) {
        Throwable th2 = th;
        com.amazon.aps.iva.yb0.j.f(th2, "it");
        return Boolean.valueOf(th2 instanceof IOException);
    }
}
