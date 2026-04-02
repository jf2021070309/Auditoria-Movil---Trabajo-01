package com.amazon.aps.iva.fs;

import com.amazon.aps.iva.js.b0;
import com.amazon.aps.iva.yb0.j;
/* compiled from: AnalyticsClickedView.kt */
/* loaded from: classes2.dex */
public final class b {
    public final b0 a;
    public final String b;

    public /* synthetic */ b(b0 b0Var) {
        this(b0Var, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.a == bVar.a && j.a(this.b, bVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AnalyticsClickedView(position=" + this.a + ", text=" + this.b + ")";
    }

    public b(b0 b0Var, String str) {
        j.f(b0Var, "position");
        j.f(str, "text");
        this.a = b0Var;
        this.b = str;
    }
}
