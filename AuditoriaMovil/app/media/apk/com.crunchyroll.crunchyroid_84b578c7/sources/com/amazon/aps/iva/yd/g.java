package com.amazon.aps.iva.yd;
/* compiled from: EmailMandatoryFlowInput.kt */
/* loaded from: classes.dex */
public final class g {
    public final boolean a;

    public g(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof g) && this.a == ((g) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        boolean z = this.a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "EmailMandatoryFlowInput(isSignUp=" + this.a + ")";
    }
}
