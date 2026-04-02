package com.amazon.aps.iva.r4;

import android.widget.RemoteViews;
/* compiled from: LayoutSelection.kt */
/* loaded from: classes.dex */
public final class s1 {
    public final RemoteViews a;
    public final n0 b;

    public s1(RemoteViews remoteViews, n0 n0Var) {
        this.a = remoteViews;
        this.b = n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        if (com.amazon.aps.iva.yb0.j.a(this.a, s1Var.a) && com.amazon.aps.iva.yb0.j.a(this.b, s1Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RemoteViewsInfo(remoteViews=" + this.a + ", view=" + this.b + ')';
    }
}
