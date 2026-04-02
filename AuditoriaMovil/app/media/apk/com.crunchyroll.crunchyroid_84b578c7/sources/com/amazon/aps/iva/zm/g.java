package com.amazon.aps.iva.zm;

import com.amazon.aps.iva.yb0.j;
/* compiled from: WelcomeScreen.kt */
/* loaded from: classes2.dex */
public final class g {
    public final h a;

    public g(h hVar) {
        this.a = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof g) && j.a(this.a, ((g) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "WelcomeScreenState(inputData=" + this.a + ")";
    }
}
