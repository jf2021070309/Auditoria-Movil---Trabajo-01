package com.amazon.aps.iva.ue;
/* compiled from: RenewNotificationInput.kt */
/* loaded from: classes.dex */
public final class b extends g {
    public final long c;

    public b(long j) {
        super(j);
        this.c = j;
    }

    @Override // com.amazon.aps.iva.ue.g
    public final long a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b) && this.c == ((b) obj).c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return com.amazon.aps.iva.c.b.b(new StringBuilder("RenewInitialNotificationInput(timeLeft="), this.c, ")");
    }
}
