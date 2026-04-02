package com.amazon.aps.iva.aq;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: DefaultAppVersionProvider.kt */
/* loaded from: classes2.dex */
public final class g implements b {
    public final AtomicReference<String> a;

    public g(String str) {
        this.a = new AtomicReference<>(str);
    }

    @Override // com.amazon.aps.iva.aq.b
    public final void a(String str) {
        this.a.set(str);
    }

    @Override // com.amazon.aps.iva.aq.b
    public final String getVersion() {
        String str = this.a.get();
        com.amazon.aps.iva.yb0.j.e(str, "value.get()");
        return str;
    }
}
