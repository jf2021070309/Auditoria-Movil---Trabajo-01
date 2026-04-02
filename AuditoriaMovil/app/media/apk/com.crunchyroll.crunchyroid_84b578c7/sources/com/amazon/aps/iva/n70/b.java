package com.amazon.aps.iva.n70;

import android.view.View;
import com.amazon.aps.iva.kb0.q;
import com.amazon.aps.iva.xb0.l;
import com.amazon.aps.iva.yb0.j;
/* compiled from: OverflowMenuItem.kt */
/* loaded from: classes2.dex */
public final class b {
    public final com.amazon.aps.iva.a70.b a;
    public final l<View, q> b;

    /* JADX WARN: Multi-variable type inference failed */
    public b(com.amazon.aps.iva.a70.b bVar, l<? super View, q> lVar) {
        j.f(bVar, "item");
        j.f(lVar, "onClick");
        this.a = bVar;
        this.b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (j.a(this.a, bVar.a) && j.a(this.b, bVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a * 31);
    }

    public final String toString() {
        return "OverflowMenuItem(item=" + this.a + ", onClick=" + this.b + ")";
    }
}
