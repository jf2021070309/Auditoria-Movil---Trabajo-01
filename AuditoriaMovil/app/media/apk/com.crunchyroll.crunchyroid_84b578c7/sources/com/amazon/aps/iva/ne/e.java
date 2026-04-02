package com.amazon.aps.iva.ne;

import com.amazon.aps.iva.yb0.j;
import java.io.Serializable;
/* compiled from: CancellationCompleteInput.kt */
/* loaded from: classes.dex */
public final class e implements Serializable {
    public final String b;
    public final long c;

    public e(String str, long j) {
        this.b = str;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (j.a(this.b, eVar.b) && this.c == eVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Long.hashCode(this.c) + (hashCode * 31);
    }

    public final String toString() {
        return "CancellationCompleteInput(sku=" + this.b + ", timeLeft=" + this.c + ")";
    }
}
