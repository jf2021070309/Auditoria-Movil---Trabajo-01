package com.amazon.aps.iva.sv;
/* compiled from: StorageInteractor.kt */
/* loaded from: classes2.dex */
public final class a {
    public final long a;

    public a(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && this.a == ((a) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return com.amazon.aps.iva.c.b.b(new StringBuilder("DiskSpace(availableBytes="), this.a, ")");
    }
}
