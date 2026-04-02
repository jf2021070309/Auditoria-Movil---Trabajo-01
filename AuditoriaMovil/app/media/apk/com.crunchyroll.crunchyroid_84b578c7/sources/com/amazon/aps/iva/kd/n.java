package com.amazon.aps.iva.kd;
/* compiled from: ChangeEmailState.kt */
/* loaded from: classes.dex */
public final class n {
    public final m a;
    public final String b;

    public n(m mVar, String str) {
        com.amazon.aps.iva.yb0.j.f(mVar, "state");
        this.a = mVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.a == nVar.a && com.amazon.aps.iva.yb0.j.a(this.b, nVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChangeEmailUiModel(state=" + this.a + ", currentEmail=" + this.b + ")";
    }
}
