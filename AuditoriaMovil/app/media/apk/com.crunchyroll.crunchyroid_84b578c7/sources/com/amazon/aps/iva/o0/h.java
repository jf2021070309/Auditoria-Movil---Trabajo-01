package com.amazon.aps.iva.o0;
/* compiled from: Composer.kt */
/* loaded from: classes.dex */
public final class h extends IllegalStateException {
    public final String b;

    public h(String str) {
        com.amazon.aps.iva.yb0.j.f(str, "message");
        this.b = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.b;
    }
}
