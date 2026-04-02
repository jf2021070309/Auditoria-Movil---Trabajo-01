package com.amazon.aps.iva.ib;

import android.graphics.Rect;
/* compiled from: Item.java */
/* loaded from: classes.dex */
public final class n {
    public final Rect a;
    public final int b;

    public n(int i, Rect rect) {
        this.a = rect;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass() && this.b == ((n) obj).b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }
}
