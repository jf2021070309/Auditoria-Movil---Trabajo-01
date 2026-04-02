package com.amazon.aps.iva.x50;
/* compiled from: NoNetworkException.kt */
/* loaded from: classes2.dex */
public final class s extends RuntimeException {
    public final String b;

    public s(String str) {
        super(str);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof s) && com.amazon.aps.iva.yb0.j.a(this.b, ((s) obj).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return defpackage.b.c(new StringBuilder("NoNetworkException(source="), this.b, ")");
    }
}
