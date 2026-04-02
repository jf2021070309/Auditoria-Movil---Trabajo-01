package com.amazon.aps.iva.zg;

import java.io.IOException;
/* compiled from: EmailAlreadyVerifiedException.kt */
/* loaded from: classes.dex */
public final class b extends IOException {
    public final Throwable b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(IOException iOException) {
        super(iOException);
        com.amazon.aps.iva.yb0.j.f(iOException, "throwable");
        this.b = iOException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b) && com.amazon.aps.iva.yb0.j.a(this.b, ((b) obj).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "EmailAlreadyVerifiedException(throwable=" + this.b + ")";
    }
}
