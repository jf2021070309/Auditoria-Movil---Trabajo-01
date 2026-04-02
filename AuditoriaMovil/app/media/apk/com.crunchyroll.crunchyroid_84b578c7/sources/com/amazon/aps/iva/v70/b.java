package com.amazon.aps.iva.v70;
/* compiled from: SwitcherUiModel.kt */
/* loaded from: classes2.dex */
public final class b {
    public final int a;

    public b(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b) && this.a == ((b) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return defpackage.e.f(new StringBuilder("SwitcherItem(title="), this.a, ")");
    }
}
