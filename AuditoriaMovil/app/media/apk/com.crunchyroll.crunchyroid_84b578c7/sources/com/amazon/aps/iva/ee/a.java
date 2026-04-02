package com.amazon.aps.iva.ee;

import com.amazon.aps.iva.yb0.j;
/* compiled from: OtpFlowInput.kt */
/* loaded from: classes.dex */
public final class a {
    public final String a;
    public final boolean b;

    public a(String str, boolean z) {
        j.f(str, "phoneNumber");
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (j.a(this.a, aVar.a) && this.b == aVar.b) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        return "OtpFlowInput(phoneNumber=" + this.a + ", isSignUp=" + this.b + ")";
    }
}
