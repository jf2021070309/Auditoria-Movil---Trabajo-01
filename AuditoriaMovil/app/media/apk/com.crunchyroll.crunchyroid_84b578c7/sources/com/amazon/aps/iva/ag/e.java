package com.amazon.aps.iva.ag;

import com.amazon.aps.iva.yb0.j;
import java.util.LinkedHashMap;
/* compiled from: NoOpDatadogWrapperImpl.kt */
/* loaded from: classes.dex */
public final class e implements b {
    @Override // com.amazon.aps.iva.ag.b
    public final void c(String str) {
        j.f(str, "userId");
    }

    @Override // com.amazon.aps.iva.ag.b
    public final void e(String str, String str2) {
        j.f(str, "key");
        j.f(str2, "value");
    }

    @Override // com.amazon.aps.iva.ag.b
    public final void a() {
    }

    @Override // com.amazon.aps.iva.ag.b
    public final void d() {
    }

    @Override // com.amazon.aps.iva.ag.b
    public final void b(Throwable th, LinkedHashMap linkedHashMap) {
    }
}
