package com.amazon.aps.iva.ue;
/* compiled from: RenewNotificationInput.kt */
/* loaded from: classes.dex */
public final class a extends g {
    public final long c;

    public a(long j) {
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
        if ((obj instanceof a) && this.c == ((a) obj).c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return com.amazon.aps.iva.c.b.b(new StringBuilder("RenewFinalNotificationInput(timeLeft="), this.c, ")");
    }
}
